// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    Example exa = new Example();

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