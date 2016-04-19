package endpoint;

import javax.xml.ws.Endpoint;

import ws.ConverterImpl;

//Endpoint publisher
public class ConverterPublisher{
	
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:8888/ws/hello", new ConverterImpl());
    }

}