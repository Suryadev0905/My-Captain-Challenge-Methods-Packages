import java.util.*;

public class conversion{

public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Time In Minutes : ");
	int min = sc.nextInt();
	if(min==0)
	{
		System.out.println(" Invalid Input!!!");
	}
	else
	{
		calculate(min);
	}
		sc.close();
	}
	
public static void calculate(int mins){
	
	double d;
	int yrs, x;
	yrs=(int)(mins/525949.2);
	System.out.println("After Converting Into Years : "+yrs);
	d=(mins%525949.2);
	x=(int)(d/1440);
	System.out.println("Number of Days is -> "+x);
	}
	
}