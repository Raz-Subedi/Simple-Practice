class Test{
 
static void display(){
System.out.println(1);
	}

public static void main(String[] args){
  display();
  StaticMethod.show();
  }
}

class StaticMethod {

static void show(){
System.out.println("2");
}

}