// import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Scanner; 
// import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    FirstUniqueChar test2 = new FirstUniqueChar();

    test2.findUniqChar();

    Anagram testAnagram = new Anagram();

    testAnagram.findAnagram();

    TestHashMap tester = new TestHashMap();

    tester.countNames();
    
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

    long count = listaObjetos.stream().count();
    System.out.println("Tamano de listaOjetos: " + count);

    System.out.println("Get 2 listaOjetos: " + listaObjetos.get(1));
    listaObjetos.set(0,false);
    System.out.println("Get 1 listaOjetos: " + listaObjetos.get(0));

    Object objremoved = listaObjetos.remove(0);
    System.out.println("Objeto removido: " + objremoved);

  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}