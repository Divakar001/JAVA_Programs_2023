package calculation;

public class FindFactorialNo {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindFactorialNo fact= new FindFactorialNo();
		
		System.out.println(fact.FindFactorialNo(1));
		System.out.println(fact.FindFactorialNo(5));
		
		System.out.println(fact.FindFactorialNo(6));
		
		
	}
public static int FindFactorialNo(int num) {
	
	int factorial =1;
	
	
	for (int i = 1; i <= num; i++) {
		factorial=factorial*i;
	}
	return factorial;
	
}
}
