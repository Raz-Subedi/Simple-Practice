public class InstanceMethodExample  
{  

public int add(int a, int b)  
{  
int s;  
s = a+b;  
return s;  
}  

public static void main(String [] args)  
{  

InstanceMethodExample ob = new InstanceMethodExample();  
 
System.out.println("The sum is: "+ob.add(10, 20));  
}  



}  