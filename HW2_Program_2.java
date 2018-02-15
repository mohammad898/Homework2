

public class HW2_Program_2 {
	 
	public static String monthName(int num) {
        String[] months = {"January", "February", "March","April", "May", "June", "July",
                          
                          
        		 "August", "September", "October", "November", "December"};
        return months[num];
 
    }
	    public final static int monthDays[] = {31, 28, 31, 30, 31, 30,
	                                                                                   31, 31, 30, 31, 30, 31 }; // Static number of days per month
	 
	    public static void HeaderLine(String month, int year){
	 
	            System.out.println("\n" + month + " " + year);
	 
	            System.out.println("***********************************");
	 
	            System.out.println("Su   Mo   Tu   We   Th    Fr  Sa");
	 
	    }
	 
	    
	 
	       
	    public static int leapYear(int year) {
	        if ((year%4 == 0 && year%100 != 0) || year%400 == 0 ) { //Leap Yr Formula: https://www.timeanddate.com/date/leapyear.html
	           return 29;
	        } else {
	           return 28;
	        }
	    }
	 
}
	   