package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

public class XMLParser {
	
	public static JAXBContext jc;
	static {
		try {
			jc = JAXBContext.newInstance("demo.model");
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public void parseStax() throws FileNotFoundException, XMLStreamException {		
		XMLInputFactory xmlif = XMLInputFactory.newInstance();
		XMLStreamReader xmlStreamReader = xmlif.createXMLStreamReader(new FileInputStream("test.xml"));
		
		while(xmlStreamReader.hasNext()) {
			switch(xmlStreamReader.next()) {		
				case XMLStreamReader.START_ELEMENT: {
					System.out.println(xmlStreamReader.getName());
					break;
				}
				default: break;
			}
		}		
	}
	
	public static void main(String[] args) throws Exception {		
		//new XMLParser().parse();
	}

//	private void parse() throws JAXBException, IOException {	
//		
//		long t1 = System.currentTimeMillis();
//		Unmarshaller unmarshaller = jc.createUnmarshaller();
//		
//		for (int i = 0; i < 10000; i++) {
//			FileInputStream is = new FileInputStream("src/main/resources/test-erdf.xml");		
//			C12 contract = (C12)unmarshaller.unmarshal(is);			
//		}		
//		long t2 = System.currentTimeMillis();
//		
//		XStream xStream = new XStream(new DomDriver());
//		xStream.registerConverter(new MapEntryConverter());
//		xStream.alias("C12", Map.class);
//		for (int i = 0; i < 10000; i++) {
//			FileInputStream is = new FileInputStream("src/main/resources/test-erdf.xml");			
//			Map<String,Object> fromXML = (Map<String,Object>)xStream.fromXML(is);					
//		}
//		long t3 = System.currentTimeMillis();
//		
//		System.out.println(t2-t1);
//		System.out.println(t3-t2);
//	}

	  public static class MapEntryConverter implements Converter {

	        public boolean canConvert(Class clazz) {
	            return AbstractMap.class.isAssignableFrom(clazz);
	        }

	        public void marshal(Object value, HierarchicalStreamWriter writer, MarshallingContext context) {

	            AbstractMap map = (AbstractMap) value;
	            for (Object obj : map.entrySet()) {
	                Map.Entry entry = (Map.Entry) obj;
	                writer.startNode(entry.getKey().toString());
	                writer.setValue(entry.getValue().toString());
	                writer.endNode();
	            }

	        }

	        public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {

	            Map<String, String> map = new HashMap<String, String>();

	            while(reader.hasMoreChildren()) {
	                reader.moveDown();

	                String key = reader.getNodeName(); // nodeName aka element's name
	                String value = reader.getValue();
	                map.put(key, value);

	                reader.moveUp();
	            }

	            return map;
	        }

	    }	
}
