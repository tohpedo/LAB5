package ws;
 
import javax.jws.WebService;
 
//Service Implementation
@WebService(endpointInterface = "ws.Converter")
public class ConverterImpl implements Converter{

	@Override
	public double inchesToFeet(int n) {
		double result = (float) n / 12;
		return result;
	}

	@Override
	public double feetToInches(int n) {
		double result = (float) n * 12;
		return result;
	}

	@Override
	public double inchesToCM(int n) {
		double result =  (float) n * 2.54;
		return result;
	}

	@Override
	public double cmToInches(int n) {
		double result =  (float) n / 2.54;
		return result;
	}

	@Override
	public double ftToMiles(int n) {
		double result =  (float) n * 0.000189394;
		return result;
	}

	@Override
	public double milesToFeet(int n) {
		double result =  (float) n * 5280;
		return result;
	}

	@Override
	public double milesToKM(int n) {
		double result =  (float) n / 0.621371;
		return result;
	}

	@Override
	public double kmToMiles(int n) {
		double result =  (float) n * 0.621371;
		return result;
	}

	@Override
	public double daysToMonths(int n) {
		double result =  (float) n / 31;
		return result;
	}

	@Override
	public double monthsToDays(int n) {
		double result =  (float) n * 31;
		return result;
	}

	@Override
	public double weeksToYears(int n) {
		double result = (float)  n / 52.1429;
		return result;
	}

	@Override
	public double yearsToWeeks(int n) {
		double result = (float)  n * 52.1429;
		return result;
	}
 


}