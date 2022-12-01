
public class SecAndMinMethods {

	public static String getDurationString(long minutes, long seconds) {
		if((minutes<0) || ((seconds<0) && (seconds>59))) {
			return "Invalid value";
		}
		else {
			long minToHr = minutes/60;
			long remainMin = minutes%60;
			
			return minToHr+"h "+remainMin+"m "+seconds+"s";
		}
	}
	
	public static String getDurationString(long seconds) {
		if(seconds<0) {
			return "Invalid value";
		}
		else {
			long secToMin = seconds/60;
			long remainSec = seconds%60;
			return getDurationString(secToMin, remainSec);
		}
	}
	

}
