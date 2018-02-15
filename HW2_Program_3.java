import java.util.Scanner;

public class HW2_Program_3 {
	 
	public static void main(String[] args){
	 
	String p;
	Scanner sc = new Scanner(System.in);
	 
	p = sc.nextLine();
	 
	//Source: http://cs.umw.edu/~finlayson/class/fall15/cpsc220/labs/16-recursion.html
	String reverse = new StringBuffer(p).reverse().toString();
	 
	 
	if (p.equals(reverse))
	        System.out.println("String is a palindrone");
	else
		System.out.println("String is not a palindrone");
	sc.close();
	}
	 
	}
