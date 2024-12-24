class StaticTest3{

int i=10;

	static void display(){
	System.out.println(this.i);
	}

// A static method cannot refer to "this" or "super" keyword anyway.

}