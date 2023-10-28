package StringHandling;

public class StringEndWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Divakar";
		String s2="DivakarRamesh";
		String s3="Dhana";
		System.out.println(s1.endsWith("ar"));//True
		System.out.println(s2.endsWith("Ramesh"));//True
		System.out.println(s1.endsWith("Kari"));//false
	}

}