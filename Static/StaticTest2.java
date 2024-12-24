class StaticTest2{

	static void display(){
	show();
	System.out.println("1");
	}

// A static methods can call only static member and cannot call non-static method.

 	static void show(){
	System.out.println("2");
	}

public static void main(String [] args){
display();

}
}