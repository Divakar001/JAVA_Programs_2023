package otherMiscellenous;



class MethodOverriding_Bank	 {
int getRateOfInterest() {
	return 0;
}}

class SBI extends MethodOverriding_Bank{
	
	int GetRateOfInterest() {
		return 8;
		
	}}

class ICICI extends MethodOverriding_Bank{
	int GetRateOfInterest() {
		return 7;
		
	}}
	
	class AXIS extends MethodOverriding_Bank{
		int GetRateOfInterest() {
			return 7;
			
		}
		
}

	class Test2{
	
	
	public static void main(String [] args) {
		// TODO Auto-generated method stub
		
		SBI sbi=new SBI();
		ICICI icici=new ICICI();
		AXIS axis=new AXIS();
		
		System.out.println("sbi Rate of Interest: "+sbi.GetRateOfInterest());
		System.out.println("ICICI Rate of Interest: "+icici.GetRateOfInterest());
		System.out.println("Axis Rate of Interest: "+axis.GetRateOfInterest());
		
	}
}

