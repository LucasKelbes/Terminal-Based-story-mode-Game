import java.util.Scanner;

class Main {

  static boolean fightSequence() {
    int wins = 0;
    int losses = 0;
    System.out.println("\n\n\n\n\n How fighting works:\n A fight is a game of rock paper scissors, best out of 3\n Rock beats scissors, \n scissors beats paper\n paper beats rock \n Lets begin the fight!");
    Scanner newObj = new Scanner(System.in);
    String[] random = { "Rock", "Paper", "Scissors" };
    for (int round = 1; round <= 3; round++) {
      System.out.println("Round " + round + "/3! \n Choose Rock, Paper, or Scissors");
      String userChoice = newObj.nextLine();
      String randomChoice = random[(int) (Math.random() * random.length)];
      System.out.println("Bowser's Plumbing has chosen: " + randomChoice);
      if (userChoice.equalsIgnoreCase(randomChoice)) {
        System.out.println("It's a tie!");
        round--;
      } else if ((userChoice.equalsIgnoreCase("Rock") && randomChoice.equalsIgnoreCase("Scissors"))
          || (userChoice.equalsIgnoreCase("Paper") && randomChoice.equalsIgnoreCase("Rock"))
          || (userChoice.equalsIgnoreCase("Scissors") && randomChoice.equalsIgnoreCase("Paper"))) {
        System.out.println("You won this round!\n");
        wins++;
      } else {
        System.out.println("Bowser won this round!\n");
        losses++;
      }
      if (wins == 2) {
        System.out.println("GOOD JOB YOU DEFEATED BOWSER PLUMBING! \n Your company is going to strive forever. \n\n\n ...The end");
        newObj.close();
        return true;
      }
      if (losses == 2) {
        System.out.println("BOWSER PLUMBING DEFEATED YOU! \n Your game ends here.");
        newObj.close();
        return true;
      }
    }
    newObj.close();
    return false;
  }

  public static void main(String[] args) {
    System.out.println("Hello welcome to the world of Mario and Luigi, \nHere you will build your own upcoming. Let's Get Started!\n");
    System.out.println("Type your favorite color: Red or Green");

    String characterChoice = null;

    Scanner myObj = new Scanner(System.in);
    String MarioOrLuigi = myObj.nextLine().toLowerCase();  // Read user input
    while (!MarioOrLuigi.equalsIgnoreCase("Red") && !MarioOrLuigi.equalsIgnoreCase("Green")) {
      System.out.println(MarioOrLuigi + " is not a valid color. Please enter Red or Green.");
      MarioOrLuigi = myObj.nextLine().toLowerCase();  // Read user input
    }
    characterChoice = MarioOrLuigi.equalsIgnoreCase("Red") ? "Mario" : "Luigi";
    System.out.println("\nNice! Your Mother and Father decided to name you " + characterChoice + "\n");

    System.out.println("Some time passes by now.\n\n");
    System.out.println("You and your brother have grown up some and you want to start your own plumbing business!\n");
    System.out.println("What do you want your company to be called? ");
    String companyName = myObj.nextLine();
    System.out.println("\nPerfect, " + companyName + " is now yours and under an LLC");

    System.out.println("\n\n\n\nIt's been 6 months and your business is booming!");

    while (true) {
      System.out.println("\nA new plumbing company has entered the town: Bowser Plumbing. Should you confront them? (Y or N)");
      String confrontThem = myObj.nextLine();

      if (confrontThem.equalsIgnoreCase("Y")) {
        System.out.println("\nYou walk into Bowser's Plumbing and introduce yourself");
        System.out.println("Now knowing who you are, the secretary immediately wants to fight");
        System.out.println("LETS FIGHT!!!\n");
        if (fightSequence()) {
          break;  // Game ends if player wins or loses
        }
      } else if (confrontThem.equalsIgnoreCase("N")) {
        System.out.println("\nOh no! The secretary of Bowser's Plumbing walked into your office while you were talking about going over there.");
        System.out.println("She is mad. A fight is about to break loose");
        System.out.println("LETS FIGHT!!!\n");
        if (fightSequence()) {
          break;  // Game ends if player wins or loses
        }
      } else {
        System.out.println("Invalid input. Please enter Y or N");
      }
    }

    System.out.println("\n\n\n\nGame over!");

    myObj.close();
  }
}
