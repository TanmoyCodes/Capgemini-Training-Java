class Operator
{
public static void main(String ...ar)
{
int a = 10;
int b = 2;

System.out.println(a+b);
System.out.println(a-b);
System.out.println(a*b);
System.out.println(a/b);
System.out.println(a%b);


/*Rel operator
It is used to perform opetation like>,<,>=,<=,==,!=
The input of relational Operator is always boolean.
The output of relational operator is always boolean.
*/

System.out.println("-----------------Rel Operator-----------------");

System.out.println(a>b);
System.out.println(a<b);
System.out.println(a<=b);
System.out.println(a>=b);
System.out.println(a==b);
System.out.println(a!=b);


System.out.println("-----------------Logical Operator-----------------");

String brand = "Zara";
int price = 5500;
char size = 'M';
String color = "Red";

boolean res = (brand == "Zara" && price >= 5000 && size == 'M' && color == "Red");
System.out.println(res);	


}
}
