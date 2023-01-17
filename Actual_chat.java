import java.util.*;
class Actual_chat
{
public static void wait(int seconds)
{
try
{
Thread.sleep(seconds);    
}
catch(InterruptedException e)
{
e.printStackTrace();
}
}
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
String a="Hello freind!!"; 
System.out.printf("%31s %n",a);
String b="I am Agniva.";
wait(1000);
System.out.printf("%31s %n",b);
String c="What's your name ?";
wait(1500);
System.out.printf("%31s %n",c);
String name=sc.nextLine();
String d="Oo";
wait(1000);
System.out.printf("%31s %n",d);
String e="Nice to meet you ";
wait(1000);
System.out.printf("%31s %n",e+name+"!!");
String f="What were you doing ??";
wait(650);
System.out.printf("%31s %n",f);
String ans=sc.nextLine();
String g="Do you know, what I am doing now ?";
wait(2000);
System.out.printf("%31s %n",g);
String h="I am chatting with you!!";
wait(1500);
System.out.printf("%31s %n",h);
wait(1500);
System.out.printf("%31s %n","🤣🤣");
System.out.println();
wait(2000);
System.out.printf("%31s %n",name+",plz wait for 1min");
wait(1000);
System.out.printf("%31s %n","My mother is calling me.");
wait(1000);
System.out.printf("%31s %n","😅😅");
wait(10000);
System.out.printf("%31s %n","Hey I am back.");
wait(1000);
System.out.printf("%31s %n","By the way, what is your age?");
int age=sc.nextInt();
if(age==15)
{
wait(1000);
System.out.printf("%31s %n","Hey, I am also of 15 years!!");
wait(1000);
System.out.printf("%31s %n","😄😄");
}
if(age>15)
{
wait(1000);
System.out.printf("%31s %n","Oo, you are bigger in age, than me.");
wait(1000);
System.out.printf("%31s %n","😲😲");
}
if(age<15)
{
wait(1000);
System.out.printf("%31s %n","Oo, you are smaller in age than me.");
wait(1000);
System.out.printf("%31s %n","😚😚");
}
wait(1500);
System.out.printf("%31s %n","Ok,"+name+"Bye for today");
wait(1500);
System.out.printf("%31s %n","👋👋");
}
}