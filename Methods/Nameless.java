class A{

public void show(){
System.out.println("I am in A");
}
}



public class Nameless{

public static void main(String[] args){

A ob = new A()
	{

	public void show(){
	System.out.println("I am in Object before a semicolon");
	}

	};

ob.show();
}

}
