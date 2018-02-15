
/*
	We have to put empty string("") in the delimiter. so we can separate characters 
*/
	import java.util.Scanner;

	public class HW2_Program_6{
		public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);
			
			
				
			

		keyboard.useDelimiter("");//https://stackoverflow.com/questions/28766377/how-do-i-use-a-delimiter-in-java-scanner
			System.out.println(" Enter  characters");
			while (keyboard.hasNext())
				System.out.println(keyboard.next());
		}
		
		
			}
		
	
