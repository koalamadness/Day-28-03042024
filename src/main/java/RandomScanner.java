import java.util.Scanner; 
import java.util.Random;

public class RandomScanner {

  Scanner scanner = new Scanner(System.in);
  private Random rand = new Random();
  
  public void guessGame() {

    int lives = 10;
    String answer = "";
    while(lives>0) {
    try {
    int randInt = rand.nextInt(4);

    switch(randInt){
      case 0: //  Integer 
        System.out.println("Enter something: ");
        scanner.nextInt();
        answer = "Integer";
        break;
      case 1: //  Float 
        System.out.println("Enter something: ");
        scanner.nextFloat();
        answer = "Float";
        break;
      case 2: //  Boolean 
        System.out.println("Enter something: ");
        scanner.nextBoolean();
        answer = "Boolean";
        break;
      case 3: //  String 
        System.out.println("Enter something: ");
        scanner.nextLine();
        answer = "String";
        break;
        }
      }catch(Exception e){
        System.out.println("Wrong Input, jajaja te humillastes solito");
        System.out.println("Correct answer was: " + answer);
        lives--;
        System.out.println("Lost a life, you have " + lives + " left");
      
      }
    }
  }

  
  

  
}