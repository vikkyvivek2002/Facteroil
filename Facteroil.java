import java.util.Scanner;
public class Facteroil
{
	public static void main(String[] args)
	{
	    int n,i,resul=1;
		System.out.println("enter the number ");
	Scanner s = new Scanner(System.in);
	n = s.nextInt();
	for(i=1;i<=n;i++)
	{
	resul = resul*i;
	}
	System.out.println("the facteroil of the given number is  " +resul); 

}
}
