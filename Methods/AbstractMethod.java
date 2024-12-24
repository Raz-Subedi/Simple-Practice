abstract class Programming{

 public abstract void Developer();

}


class HTML extends Programming{

public void Developer(){
 System.out.println("Tim Berners Lee");
}
}

class Java extends Programming{

public void Developer(){
 System.out.println("James Gosling");
}
}

public class AbstractMethod{

public static void main(String[] args){
HTML ob = new HTML();   //Programming ob = new HTML();
ob.Developer();
				
Java oc= new Java();    //Programming oc = new Java();
oc.Developer();
}
}
