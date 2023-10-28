package otherMiscellenous;

public class MultithreadingProgram extends Thread{

	
	public void run() {
		
		System.out.println("Thread is Running ....");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultithreadingProgram t1= new MultithreadingProgram();
		t1.start();
		
	}

}
