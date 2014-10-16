package demo;

import org.springframework.batch.item.ItemProcessor;

import demo.model.CorpsDeFichierParPDL;

public class PersonItemProcessor implements ItemProcessor<CorpsDeFichierParPDL, Message> {

    @Override
    public Message process(final CorpsDeFichierParPDL obj) throws Exception {    	
        final Message transformedPerson = new Message();
        transformedPerson.setIdentifiant_Stable_PDL(obj.getIdentifiantStablePDL());
        transformedPerson.setMatricule_Compteur("foo");
        return transformedPerson;
    }

}