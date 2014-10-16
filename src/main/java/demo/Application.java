package demo;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.xml.StaxEventItemReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.oxm.Unmarshaller;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import demo.model.CorpsDeFichierParPDL;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableBatchProcessing
public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
                
        /*List<Message> results = ctx.getBean(JdbcTemplate.class).query("SELECT Identifiant_Stable_PDL, Matricule_Compteur FROM message", new RowMapper<Message>() {        	
            @Override
            public Message mapRow(ResultSet rs, int row) throws SQLException {
                Message message = new Message();
                message.setIdentifiant_Stable_PDL(rs.getString(1));
                message.setMatricule_Compteur(rs.getString(2));
				return message;
            }
        });

        for (Message person : results) {
            System.out.println("Found <" + person + "> in the database.");
        }
        */
        System.out.println();
    }
    
    @Bean
    public ItemReader<CorpsDeFichierParPDL> reader(Unmarshaller unmarshaller) {
    	StaxEventItemReader<CorpsDeFichierParPDL> reader = new StaxEventItemReader<CorpsDeFichierParPDL>();
        reader.setResource(new ClassPathResource("GRD_R04.xml"));         
        reader.setUnmarshaller(unmarshaller);
        reader.setFragmentRootElementName("Corps_de_fichier_par_PDL");
        
        return reader;
    }
    
    @Bean 
    public Unmarshaller unmarshaller() {
    	Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
    	jaxb2Marshaller.setPackagesToScan("demo.model");
    	
    	return jaxb2Marshaller;
    }

    @Bean
    public ItemProcessor<CorpsDeFichierParPDL, Message> processor() {
        return new PersonItemProcessor();
    }

    @Bean
    public ItemWriter<Message> writer(DataSource dataSource) {
        JdbcBatchItemWriter<Message> writer = new JdbcBatchItemWriter<Message>();
        writer.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<Message>());
        writer.setSql("INSERT INTO message (Identifiant_Stable_PDL, Matricule_Compteur) VALUES (:Identifiant_Stable_PDL, :Matricule_Compteur)");
        writer.setDataSource(dataSource);
        return writer;
    }

    @Bean
    public Job importUserJob(JobBuilderFactory jobs, Step s1) {
        return jobs.get("importUserJob")
                .incrementer(new RunIdIncrementer())
                .flow(s1)
                .end()
                .build();
    }

    @Bean
    public Step step1(StepBuilderFactory stepBuilderFactory, ItemReader<CorpsDeFichierParPDL> reader,
            ItemWriter<Message> writer, ItemProcessor<CorpsDeFichierParPDL, Message> processor) {
        return stepBuilderFactory.get("step1")
                .<CorpsDeFichierParPDL, Message> chunk(10)
                .reader(reader)
                .processor(processor)
                .writer(writer)
                .build();
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
