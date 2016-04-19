package ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
 
//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.RPC)
public interface Converter{
 
	@WebMethod double inchesToFeet(int n);
	@WebMethod double feetToInches(int n);
	@WebMethod double inchesToCM(int n);
	@WebMethod double cmToInches(int n);
	@WebMethod double ftToMiles(int n);
	@WebMethod double milesToFeet(int n);
	@WebMethod double milesToKM(int n);
	@WebMethod double kmToMiles(int n);
	@WebMethod double daysToMonths(int n);
	@WebMethod double monthsToDays(int n);
	@WebMethod double weeksToYears(int n);
	@WebMethod double yearsToWeeks(int n);
}