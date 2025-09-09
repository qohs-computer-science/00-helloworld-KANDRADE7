/*
 * TODO: Name
 * TODO: Date
 * TODO: Class Period
 * TODO: Program Description
 */
//Katherine Andrade, 9/9/2025, period 7, basic program asking for user input and manipulating their inputs and outputting 
import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		//TODO: Implement Program Requirements Here: 
		/*
		Program requirements 
		1. The first line of output must include the name of the user
		 and a welcome message.  

		2. The second line of output should tell the user either "Congulations"
		for being 18 and being able to vote or it should tell them how many
		more years they will have to wait until they can vote

		3. The third line of output should output to the user one of five different, 
		school appropriate, positive or motivating messages based on their cumulative
		GPA - the breakdown points are  4.5+, 4.0 – 4.49, 3.5 – 3.99, 
		3.0 – 3.49, and anything below a 3.0.  

		4. The last output will be all the multiples of the length of the person’s 
		name up to and possibly  including their favorite number. The multiples should 
		be labeled and appear on a single line  with commas separating them. 
		(If there are so many multiples that they go to an additional  line, that is ok.)  
		*/


		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String userName = input.nextLine();

		System.out.println("Enter your age: ");
		int age = input.nextInt();
		input.nextLine();

		System.out.println("Enter your favorite 3 digit number: ");
		int favNum = input.nextInt();

		System.out.println("Enter your GPA: ");
		double userGPA = input.nextDouble();

	} //end main 

}//end HelloWorld
