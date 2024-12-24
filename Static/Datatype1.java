class Datatype1{

public static void main(String [] args){
int a =127;
//char c=a; //Autowidinening


char c = (char) a;
System.out.println(c);
byte d =(byte) a;        //explicit
System.out.println(d);
}
}