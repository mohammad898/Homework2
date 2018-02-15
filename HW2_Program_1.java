import java.util.Scanner;

public class HW2_Program_1 {
	 
	public static void main(String[] args){
	
	 
	Scanner input = new Scanner(System.in);
	int tall;
	  System.out.println("Please Enter: how tall of a pyramid do you want to display on the screen ");
	tall = input.nextInt(); 
	for(int a=1; a<=tall;a++)
	{
        
	       
        for (int b=1;b<=tall-a;b++)
        {
                System.out.printf("   ");
                }
         for (int l=1;l<=a;l++)
         {
                System.out.printf(" "+l+" ");
                }
                   for(int r=a-1; r>=1; r--) 
                   {
                        System.out.printf(" "+r+" ");
                }
                               
                System.out.println();
	}
	
	}

	}