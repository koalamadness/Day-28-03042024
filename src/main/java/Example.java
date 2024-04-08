import java.util.ArrayList;
import java.util.Scanner; 
public class Example {
  private ArrayList<Integer> numList = new ArrayList<Integer>();
  
  public void addNums(int leng){

    int i = 0;
    Scanner scanner = new Scanner(System.in); 
    while (i < leng){
      // Create a Scanner object
      System.out.println("Enter number");
      int number = Integer.valueOf(scanner.nextLine());
      numList.add(number);
      i++;
    }
    scanner.close();
    
  }

  public void goList(){
    for(int num:numList){
      System.out.println(num);
    }
  }
}