class Test{

static int a =10;

}

//void m1(){
// static int b=20;  Error because it is local variable cannot be static.
//}



class StaticKeyword{

public static void main(String[] args){

System.out.println(Test.a);  // only printing a gives error

}
}