import java.util.Scanner;

public class I_LOVE_GAMBLING { 
	
	public static void main(String[] args) {
		
// initialization
		float money = 100;
		System.out.println("You have $" + money + " currently.");
		final int coin = 0;
		final int dice = 1;
		final int spinner = 2;
		String[] random = new String[3];
		String[] guess = new String[3];
		Scanner input = new Scanner(System.in);
	boolean continuePlaying = true;
		
	while (continuePlaying) {
		// betting
		continuePlaying = false;
		System.out.print("Enter a bet amount: ");
		float bet_amount = (float) input.nextFloat();

		while (bet_amount > money || bet_amount <= 0) {
			System.out.println("You don't have enough money to bet that amount.");
			System.out.print("Enter a valid bet amount: ");
			bet_amount = (float)input.nextFloat();
		}
		
// coinflip
		System.out.print("heads or tails: ");
		input.nextLine(); 
		guess[coin] = input.nextLine(); 
		random[coin] = String.valueOf((int) (Math.random() * 2) + 1);
		random[coin] = random[coin].equals("1") ? "heads" : "tails";
		guess[coin] = guess[coin].toLowerCase();
		
		
		

		boolean win_coin = false;

		win_coin = random[coin].toLowerCase().equals(guess[coin]) ? true : false;
		
		if (win_coin) {
			System.out.println("You win the coinflip!");
			
		}
		else {
			System.out.println("You lose the coinflip!");
		}
		// there is definitely a better way to do this but if it ain't broke dont fix it

// dice

		random[dice] = String.valueOf((int) (Math.random() * 6) + 1); // 1 is the dice
		System.out.print("Guess the dice (1-6): ");
		guess[dice] = input.next();
		
		boolean win_dice = false;

		win_dice = random[dice].equals(guess[dice]) ? true : false;
		
		
		System.out.println(win_dice ? "You win the dice roll!" : "You lose the dice roll!");

		
		
		// spinner
		random[spinner] = String.valueOf((int) (Math.random() * 4) + 1); // 1 is red, 2 is yellow, 3 is blue, 4 is green
		System.out.print("Guess the spiner (red, yellow, blue, green): ");
		guess[spinner] = input.next();

		boolean win_spinner;


		
		

		if (random[spinner].equals("1")) {
			random[spinner] = "red";
		} else if (guess[spinner].equals("2")) {
			random[spinner] = "yellow";
		} else if (guess[spinner].equals("3")) {
			random[spinner] = "blue";
		} else if (guess[spinner].equals("4")) {
			random[spinner] = "green";
		}

		win_spinner = random[spinner].equals(guess[spinner]) ? true : false;


		if (win_spinner) {
			System.out.println("You win the spiner!");
		}
		else {
			System.out.println("You lose the spiner!");
		}
		
		// results
		if (win_coin && win_dice && win_spinner) {
			money += bet_amount * 3;
			System.out.println("You win all of them and your balance is now $" + money);
		} 
		else if (win_coin && win_dice || win_coin && win_spinner || win_dice && win_spinner) {
			money += bet_amount * 2;
			System.out.println("You win two of them and your balance is now $" + money);
		} 
		else if (win_dice) {
			// nothing ig?
		}
		else if (win_spinner) {
			money -= bet_amount / 2;
			System.out.println("You win only the spinner and your balance is now $" + money);
		}
		
		else if (win_coin){
			money -= bet_amount / 4;
			System.out.println("You win only the coinflip and your balance is now $" + money);

		}
		else {
			money -= bet_amount;
			System.out.println("You lose all of them and your balance is now $" + (money));
			
		}
		System.out.println("what would you like to do next? (play, deposit, quit)");
		input.nextLine();
		String action = input.nextLine();

		if (action.equals("play")) {
			continuePlaying = true;
		} else if (action.equals("deposit")) {
			System.out.print("Enter a deposit amount: ");
			float deposit_amount = 0;
			boolean validDeposit = false;
			while (!validDeposit) {
				String depositInput = input.nextLine();
				try {
					deposit_amount = Float.parseFloat(depositInput);
					if (deposit_amount > 0) {
						validDeposit = true;
					} else {
						System.out.println("Enter a valid deposit amount: ");
					}
				} catch (NumberFormatException e) {
					System.out.println("Enter a valid deposit amount: ");
				}
			}
			money += deposit_amount;
			System.out.println("You have deposited $" + deposit_amount);
		} else if (action.equals("quit")) {
			System.out.println("Thanks for playing!");
			continuePlaying = false;
		}
	}



		input.close();
	}

	
}
