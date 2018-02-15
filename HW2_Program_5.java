


	import java.util.Scanner;

	public class HW2_Program_5 {
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);
			input.useDelimiter("[,\n]");//http://www.dreamincode.net/forums/topic/140317-java-scanner-delimiter-comma/
			
			System.out.println("Enter your number separated by comma(,): ");
			while(input.hasNext()){
				System.out.println(input.next());
			}
			input.close();
		}
	}
