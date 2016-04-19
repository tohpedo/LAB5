package client;

import java.io.BufferedReader;
import java.net.URL;
import java.util.Scanner;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import ws.Converter;

public class ConverterClient{
	
	public static void main(String[] args) throws Exception {
	   
	URL url = new URL("http://localhost:8888/ws/hello?wsdl");
	
        //1st argument service URI, refer to wsdl document above
	//2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://ws/", "ConverterImplService");
        Service service = Service.create(url, qname);
        Converter conv = service.getPort(Converter.class);
        //System.out.println(conv.cmToInches(10));

        Scanner sc = new Scanner(System.in);
        while(true){
        	String command = sc.nextLine();
        	String[] tmp = command.split(" ");
        	try{
        		Integer from = Integer.parseInt(tmp[0]);
        		
        		
        		
        		
        		
        		// INCHES TO ___
        		if(tmp[1].equals("in")){
            		if(tmp[3].equals("cm")){
            			System.out.println(from + " inches = " + conv.inchesToCM(from) + " cm");
            		}
            		if(tmp[3].equals("ft")){
            			System.out.println(from + " inches = " + conv.inchesToFeet(from) + " ft");
            		}
            	}
        		// FEET TO 
        		if(tmp[1].equals("ft")){
            		if(tmp[3].equals("in")){
            			System.out.println(from + " feet = " + conv.feetToInches(from) + " in");
            		}
            		if(tmp[3].equals("mi")  || tmp[3].equals("m") ){
            			System.out.println(from + " feet = " + conv.ftToMiles(from) + " mi");
            		}
            	}
        		//  CM TO 
        		if(tmp[1].equals("cm")){
            		if(tmp[3].equals("in")){
            			System.out.println(from + " cm = " + conv.cmToInches(from) + " in");
            		}
            	}
        		// MILES TO
        		if(tmp[1].equals("mi") || tmp[1].equals("m")  ){
            		if(tmp[3].equals("ft")){
            			System.out.println(from + " mi = " + conv.milesToFeet(from) + " ft");
            		}
            		if(tmp[3].equals("km")){
            			System.out.println(from + " mi = " + conv.milesToKM(from) + " km");
            		}
            	}
        		// KM TO MILES
        		if(tmp[1].equals("km")){
            		if(tmp[3].equals("mi")  || tmp[3].equals("m")){
            			System.out.println(from + " km = " + conv.kmToMiles(from) + " mi");
            		}
            	}
        		if(tmp[1].equals("days")){
            		if(tmp[3].equals("months")){
            			System.out.println(from + " days = " + conv.daysToMonths(from) + " months");
            		}
            	}
        		if(tmp[1].equals("months")){
            		if(tmp[3].equals("days")){
            			System.out.println(from + " months = " + conv.monthsToDays(from) + " days");
            		}
            	}
        		if(tmp[1].equals("weeks")){
            		if(tmp[3].equals("years")){
            			System.out.println(from + " weeks = " + conv.weeksToYears(from) + " years");
            		}
            	}
        		if(tmp[1].equals("years")){
            		if(tmp[3].equals("weeks")){
            			System.out.println(from + " years = " + conv.yearsToWeeks(from) + " weeks");
            		}
            	}
        		
        		
        	}
        	catch(Exception e){
        		System.out.println("Invalid input. Please try again. Accepted units are in, m, ft, cm, km, mi, days, months, years, weeks");
        		sc.close();
        	}
     
        	
        }
        
        
    }

}