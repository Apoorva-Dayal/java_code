public class OperatorExample{  
public static void main(String args[]){  
int x=10;  
System.out.println(x++);//10 (11)  
System.out.println(++x);//12  
System.out.println(x--);//12 (11)  
System.out.println(--x);//10  
}} 


Java Unary Operator Example 2: ++ and --
public class OperatorExample{  
public static void main(String args[]){  
int a=10;  
int b=10;  
System.out.println(a++ + ++a);//10+12=22  
System.out.println(b++ + b++);//10+11=21  
  
}}  

Java Unary Operator Example: ~ and !
public class OperatorExample{  
public static void main(String args[]){  
int a=10;  
int b=-10;  
boolean c=true;  
boolean d=false;  
System.out.println(~a);//-11 (minus of total positive value which starts from 0)  
System.out.println(~b);//9 (positive of total minus, positive starts from 0)  
System.out.println(!c);//false (opposite of boolean value)  
System.out.println(!d);//true  
}}  

Java Arithmetic Operator Example
public class OperatorExample{  
public static void main(String args[]){  
int a=10;  
int b=5;  
System.out.println(a+b);//15  
System.out.println(a-b);//5  
System.out.println(a*b);//50  
System.out.println(a/b);//2  
System.out.println(a%b);//0  
}}  
