class StaticTest4{

	void display(){
	show();
	System.out.println("1");
	}

// A static methods can call  call non-static method by object.

 	static void show(){
	System.out.println("2");
	}

public static void main(String[] args){
StaticTest4 ob = new StaticTest4();
ob.display();
}

}