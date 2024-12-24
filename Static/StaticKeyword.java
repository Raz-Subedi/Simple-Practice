class Test{

int a =10;

}

//void m1(){
// static int b=20;  Error because it is local variable cannot be static.
//}



class StaticKeyword{


int a=10;

public static void main(String[] args){

StaticKeyword s = new StaticKeyword();
System.out.println(s.a);  // only printing a gives error

}
}  // Instance Variable can be called through static method through object
  
