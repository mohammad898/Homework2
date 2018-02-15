import java.util.Scanner;

public class mainClass_Q2 {
		   
	    	
		    public static void main(String[] args) {
		 
		        Scanner keyboard = new Scanner(System.in);
		 
		        System.out.print("Please Enter a year: ");
		 
		        int year = keyboard.nextInt();
		 
		 
		 
		        System.out.print("\nEnter a number between 0 to 6 for the first day");
		 
		        int day = keyboard.nextInt();
		               
		 
		        for(int i = 0; i < 12; i++) {
		 
		        String nameOfMonth = null;
		       
		        int numOfDays;
		 
		        nameOfMonth = HW2_Program_2.monthName(i);
		 
		        if (!(i == 1)) {
		           numOfDays = HW2_Program_2.monthDays[i];
		        }
		        else {
		           numOfDays = HW2_Program_2.leapYear(year);
		        }
		       
		        HW2_Program_2.HeaderLine(nameOfMonth, year);
		       
		                for (int s=1; s<=day; s++)
		                {System.out.printf("     ");}
		               
		                for (int j=1; j<=numOfDays ; j++)
		                                {  
		                          if (day%7==0 && day!=0)
		                                System.out.println();
		                                                        System.out.printf("%2d   ", j);
		                                                        day+=1;
		                                }
		           
		                        day%=7;    
		            System.out.print("\n\n");
		        }
		        keyboard.close();
		    }
		}