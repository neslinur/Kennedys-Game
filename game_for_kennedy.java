import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    System.out.println(
        "Hello Kennedy Dennedy! Today you will play a game to see if your day will be good or not. Let's get started.");

    System.out.println("");

    // breakfast

    System.out.println(
        "You wake up in the morning and now have to decide if you will eat breakfast or not. Remember your actions have consequences.");

    System.out.println("");

    System.out.println("Will you eat breakfast? Yes or no.");

    // if yes she will not faint during p.e if no she will

    String breakfast = scan.nextLine();

    System.out.println("");

    while ((!breakfast.toLowerCase().equals("yes") && !breakfast.toLowerCase().equals("no"))) {
      System.out.println("Please retype your answer. Remember to write either yes or no with no other characters.");
      breakfast = scan.nextLine();
    }

    System.out.println("Your decision will be remembered");

    System.out.println("");

    // rings
    System.out
        .println("You get into your car and realize you forgot your rings. Do you go back to get them? Yes or no.");

    String rings = scan.nextLine();

    System.out.println("");

    while (!rings.toLowerCase().equals("yes") && !rings.toLowerCase().equals("no")) {
      System.out.println("Please retype your answer. Remember to write either yes or no with no other characters.");
      rings = scan.nextLine();
    }

  

    if (rings.toLowerCase().equals("yes")) {
      System.out.println(
          "Oh no! When you arrived to school you were just ONE minute late. If you hadn't gone to get your rings, you wouldn't have been late. Now your day is ruined :(");
      System.exit(0);
    }

    System.out.println("You made it just on time because you didn't get your rings! Well done.");

    System.out.println("");

    // ms.messman

    System.out.println(
        "It's an A day! Your first class is Ms. Messman. Pick a number between 1 or 2 to see if Ms. Messman will make an unsolicited comment about you almost being late.");

    int messman = scan.nextInt();

    System.out.println("");

    int mess[] = { 1, 2 };
    int ms = rand.nextInt(mess.length);

    if (ms == messman) {
      System.out.println(
          "Wrong choice! Ms. Messman makes an unfunny joke about your arrival that pisses you off. Now your day is ruined... Why is she like this?");
      System.exit(0);
    }

    System.out.println(
        "You picked the right one! She lets you off and you get situated in your seat after a breeze of a morning.");

    System.out.println("");

    // thomspon
    System.out.println(
        "After the bell rings, you go to Ms. Thompsons class where she announces that she has graded your recent assignments");

    System.out.println("");

    System.out.println("Do you check your grade?");
    String thompson = scan.nextLine();

    System.out.println("");

    while (!thompson.toLowerCase().equals("yes") && !thompson.toLowerCase().equals("no")) {
      System.out.println("Please retype your answer. Remember to write either yes or no with no other characters.");
      thompson = scan.nextLine();
    }

    System.out.println("");

    if (thompson.toLowerCase().equals("yes")) {
      System.out.println(
          "You choose to check your grade and see that she has given you a 43 for a stupid assignment! Now your day is ruined :(");
      System.exit(0);
    }

    System.out.println("You choose not to check your grade and enjoy your day because ignorance is bliss.");

    System.out.println("");
    System.out.println("");

    System.out.println(
        "You go to your P.E class and are faced with a request from Coach Weiver. She wants you to run today!");

    System.out.println("");

    

    if (breakfast.toLowerCase().equals("no")) {
      System.out.println(
          "Your choice to not eat breakfast made you faint because you ran out of energy while running! Now you have to go to the hospital and your day is ruined :(");
      System.exit(0);
    }

    System.out.println(
        "Thank god you ate breakfast today because you felt full of energy as you ran! Your day was going smoothly.");

    System.out.println("");
    System.out.println("");

    System.out.println("You go onto your last class, med micro, and see a question on the board you need to answer.");

    System.out.println("");

    System.out.println("'Which word in the dictionary is spelled incorrectly?' The answer will be only one word.");
    String answer = scan.nextLine();

    System.out.println("");

    int chances = 3;

    while (chances != 0 && !answer.toLowerCase().equals("incorrectly")) {
      System.out.println(
          "Try again. You either spelled it wrong or got the question wrong. Make sure its right next time. You have "
              + chances + " chances left.");
      answer = scan.nextLine();
      chances--;
    }

    if (chances == 0) {
      System.out.println("You ran out of tries and she gave you a bad score :( what a terrible way to end the day...");
      System.exit(0);
    }

    System.out.println("");

    System.out.println("Good job! You passed and got through Ms. Clarks class without her creating trouble.");

    System.out.println("");

    System.out.println(
        "After school, you want to hang out with Nesli but she can't decide if she should skip gym to do so. You decide to play rock paper scissors to settle it.");

    System.out.println("");

    System.out.println("What do you pick? Rock paper or scissors?");

    String game = scan.nextLine();

    while (!game.toLowerCase().equals("rock") && !game.toLowerCase().equals("paper")
        && !game.toLowerCase().equals("scissors") && !game.toLowerCase().equals("scissor")) {
      System.out.println(
          "Please retype your answer. Remember to write either rock, paper or scissors with no other characters.");
      game = scan.nextLine();
    }

    int three[] = { 1, 2, 3 };

    int omg = rand.nextInt(three.length);

    String shoot = "";

    if (omg == 1) {
      shoot = "rock";
    } else if (omg == 2) {
      shoot = "paper";
    } else {
      shoot = "scissors";
    }

    int tie = 1;

    while (tie != 0) {
      if (shoot.equals("scissors")) {
        System.out.println("Nesli picked scissors!");
        if (game.equals("scissors")) {
          System.out.println("Theres a tie! Try again.");
          game = scan.nextLine();
        } else if (game.equals("rock")) {
          System.out.println("You won! Good job");
          tie = 0;
        } else if (game.equals("paper")) {
          System.out.println("You lost! Oh noo, now you aren't able to hang out with Nesli and it ruins your day :(");
          System.exit(0);
        }
      } else if (shoot.equals("rock")) {
        System.out.println("Nesli picked rock!");
        if (game.equals("rock")) {
          System.out.println("Theres a tie! Try again.");
          game = scan.nextLine();
        } else if (game.equals("paper")) {
          System.out.println("You won! Good job");
          tie = 0;
        } else if (game.equals("scissors")) {
          System.out.println("You lost! Oh noo, now you aren't able to hang out with Nesli and it ruins your day :(");
          System.exit(0);
        }
      } else {
        System.out.println("Nesli picked paper!");
        if (game.equals("paper")) {
          System.out.println("Theres a tie! Try again.");
          game = scan.nextLine();
        } else if (game.equals("scissors")) {
          System.out.println("You won! Good job");
          tie = 0;
        } else if (game.equals("rock")) {
          System.out.println("You lost! Oh noo, now you aren't able to hang out with Nesli and it ruins your day :(");
          System.exit(0);
        }
      }
    }

    System.out.println("");

    System.out.println("After hanging out with Nesli, you go to your room and have a niiice sleep. Good job on your day today! You had a great one :D ");
    System.out.println("");
    System.out.println("Nesli loves you <3");

  }
}