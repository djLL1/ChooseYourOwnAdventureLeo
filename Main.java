package Story;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);

		System.out.println("Please enter your first name: ");

		String name= input.next();

		Story coolStory = new Story(name);

		String shouldCountinue = "yes";

		//While loop to keep playing the game until user ends
		while(shouldCountinue.toLowerCase().equals("yes")) {

			//Beginning	of story
			coolStory.Intro();
			System.out.println("A.You listen to the monitor\n" 
					+"B.Quickly stand on your grubby feet and run towards the monitor\n"
					+"C.Ignore the monitor\n"
					+"D.Go out…….FIGHTING");

			String Answer = input.next();

			//Option A first route
			//All replay input must be yes or no exactly!
			if(Answer.toLowerCase().equals("a")){
				coolStory.Option1A();
				System.out.println("A.Enter the red rusty door\n" 
						+"B.Enter a squeaky clean blue door\n"
						+"C.Enter a wet, gross, yellow door\n"
						+"D.Wait within the sandpaper treadmill");
				Answer = input.next();

				//Option A Second route
				if(Answer.toLowerCase().equals("a")) {
					coolStory.Option2A();
					System.out.println("Do you want to play again? (yes/no)");
					shouldCountinue = input.next();
					if(shouldCountinue.equals("no")) {
						System.out.println("Adios forever");
						input.close();
					}

					//Option B Second Route
				}else if(Answer.toLowerCase().equals("b")) {
					coolStory.Option2B();
					System.out.println("Do you want to play again?");
					shouldCountinue = input.next();
					if(shouldCountinue.equals("no")) {
						System.out.println("Do you want to play again?(yes/no)");
						shouldCountinue = input.next();

						if(shouldCountinue.equals("no")) {
							System.out.println("Adios forever");
							input.close();
						}
					}

					//Option C Second route
				}else if(Answer.toLowerCase().equals("c")) {
					coolStory.Option2C();
					System.out.println("Do you want to play again?(yes/no)");
					shouldCountinue = input.next();
					if(shouldCountinue.equals("no")) {
						System.out.println("Adios forever");
						input.close();
					}

				}
				//Option D Second route	
				else if(Answer.toLowerCase().equals("d")) {
					coolStory.Option2D();
					System.out.println("You won!");
					System.out.println("Do you want to play again?(yes/no)");
					shouldCountinue = input.next();
					if(shouldCountinue.equals("no")) {
						System.out.println("Adios forever");
						input.close();
					}
				}
				//Option B first route	
			}else if(Answer.toLowerCase().equals("b")) {
				coolStory.Option1B();
				System.out.println("Do you want to play again?(yes/no)");
				shouldCountinue = input.next();
				if(shouldCountinue.equals("no")) {
					System.out.println("Adios forever");
					input.close();
				}

				//Option C first route
			}else if(Answer.toLowerCase().equals("c")) {
				coolStory.Option1C();
				System.out.println("Do you want to play again?(yes/no)");
				shouldCountinue = input.next();
				if(shouldCountinue.equals("no")) {
					System.out.println("Adios forever");
					input.close();
				}
				//Option D first route
			}else if(Answer.toLowerCase().equals("d")) {
				coolStory.Option1D();
				System.out.println("Do you want to play again(yes/no)?");
				shouldCountinue = input.next();
				if(shouldCountinue.toLowerCase().equals("no")) {
					System.out.println("Adios forever");
					input.close();
				}

			}
		}
	}
}
