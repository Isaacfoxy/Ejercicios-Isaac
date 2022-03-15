import java.util.*;
public class ecuacion{
public static void main(String[]args){
Scanner entrada=new Scanner(System.in);
Scanner entrada1=new Scanner(System.in);
Scanner entrada2=new Scanner(System.in);
int a=entrada.nextInt();
int b=entrada1.nextInt();
int c=entrada2.nextInt();

double calc1=(b*b)-4*a*c;
if(calc1<0){System.out.println("no tiene solución");}
else if(calc1>0){
double raiz=Math.sqrt(calc1);
int bn=-b;
int a2=a*2;
double calculop=(bn+raiz)/a2;
double calculon=(bn-raiz)/a2;
System.out.println(calc1);
System.out.println("la respuesta es :"+calculop+"   "+calculon);
}
}
}