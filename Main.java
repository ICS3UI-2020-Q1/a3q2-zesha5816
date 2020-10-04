import java.util.Scanner;
/**
 * a program that will correctly name the animal based on the choices
 * @author Ahmad Zeshan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
  	Scanner input = new Scanner(System.in);
		//asks the user if the animal has feathers
		System.out.println("Does the animal have feathers?");
		//gets the input from user
		String animalFeather = input.nextLine();
		//if the animal has feathers
		if (animalFeather.equals("yes")){
			//prompts user for wether it swims or not
			System.out.println("Does the animal swim?");
			String animalSwim = input.nextLine();
			if (animalSwim.equals("yes")){
				//if it swims its a duck
				System.out.println("This is a duck");
			}else {
				//if not a hen
				System.out.println("This is a hen");
			}	
		}else {//if the animal dont have feathers
		//does it have legs
			System.out.println("Does the animal have legs?");
			String animalLegs = input.nextLine();
			if (animalLegs.equals("yes")){
				System.out.println("This is a lizard");
			}else {
				System.out.println("This is a snake");
			}
		}
  }
}
