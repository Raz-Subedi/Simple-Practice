class Raz{
static int x = 10;
public static int main(){
return x;
}
}

class Subedi{
public static void main(String[] args){
Raz ob = new Raz();
int a = ob.main();
System.out.println(a);
}
}