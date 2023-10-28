package otherMiscellenous;

public class GarbageCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		Runtime rs= Runtime.getRuntime();
		
		System.out.println("Free memory in JVM before garbagge collection ="+rs.freeMemory());
		
		rs.gc();
		System.out.println("Free memory is JVM after garbagge collection ="+rs.freeMemory());
	}

}
