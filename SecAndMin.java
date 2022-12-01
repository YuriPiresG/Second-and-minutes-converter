
public class SecAndMin {

	public static void main(String[] args) {
	SecAndMinMethods s = new SecAndMinMethods();
		//First parameter is minutes, second parameter is the seconds.
		System.out.println(s.getDurationString(65,45));
		//The parameter is seconds.
		System.out.println(s.getDurationString(3945L));
	}
}
