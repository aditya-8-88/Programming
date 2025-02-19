class Mobile{
	String brand;
	int price;
	static String network;
	static String name;

	static{
		name="";
		network="";
		System.out.println("static is been called");
	}

	Mobile(){
		brand="";
		price=0;
		System.out.println("constructor is been called");
	}
	
	public void show() {
		System.out.println(brand+" : "+price+" : "+name+" : "+network);
	}
	
	public static void show1(Mobile obj)
	{
		// System.out.println("in static method");
		System.out.println(obj.brand+" : "+obj.price+" : "+Mobile.name+" : "+Mobile.network);
		// System.out.println(obj.brand+" : "+ obj.price +" : "+obj.name);
	}
}

public class ClassObject {
	public static void main(String[] args) throws ClassNotFoundException
	{
		// Class.forName("Mobile"); // just to call the static block of Mobile class alone
		Mobile.name="Aditya Pratap Singh";
		Mobile.network="Indian subcontinent";
		
		Mobile item1=new Mobile();
		item1.brand="Vivo";
		item1.price=15000;
		
		Mobile item2 =new Mobile();
		item2.brand="Samsung";
		item2.price=17000;


		item1.show();
		item2.show();

		Mobile.show1(item1);
		Mobile.show1(item2);
	
	}
}


