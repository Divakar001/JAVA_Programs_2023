package otherMiscellenous;

interface Info{
	static final String Language= "Tamil";
	public void display();
	
}
class CreateInterface implements Info{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreateInterface obj=new CreateInterface();
		obj.display();
		
	}

	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println(Language+" is Awesome");
		
	}

}
