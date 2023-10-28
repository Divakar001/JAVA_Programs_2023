package StringHandling;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "Hi Divakar, You are doing Good Job";

		String[] Result=	s1.split(",");
		System.out.println(Result[0]);//To Print the first split
		for (String string : Result) {
			System.out.println(string);//To Print the entire split one by one
		}

	}

}
