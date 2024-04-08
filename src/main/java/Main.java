// import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Scanner; 
// import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Scanner testo = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = testo.nextLine();

    System.out.println("The length of the string is: " + userName.length());
    
    Example exa = new Example();

    exa.addNums(5);
    exa.goList();

    ArrayList<Object> listaObjetos = new ArrayList<Object>();

      listaObjetos.add(true);
      listaObjetos.add(2);
      listaObjetos.add(2.64f);
      listaObjetos.add("Carlos");
      listaObjetos.add(exa);
    

    System.out.println("Contenido del ArrayList:");
    for (Object objeto : listaObjetos) {
      if (objeto instanceof String) {
          System.out.println("The object: " + objeto + " is a String");
      } else if (objeto instanceof Integer) {
        System.out.println("The object: " + objeto + " is an Integer");
      } else if (objeto instanceof Float ) {
        System.out.println("The object: " + objeto + " is a Float");
      } else if (objeto instanceof Boolean){
        System.out.println("The object: " + objeto + " is a Boolean");
      } else {
        System.out.println("The object: " + objeto + " is an unidentified object");
      }
    }
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}