import java.util.HashMap;
import java.util.Collection;
import java.util.Map;

public class FirstUniqueChar {
  public HashMap<Character, Integer> placementChar = new HashMap<Character, Integer>();
  public String word = "AtemaJacT";
  
  public void findUniqChar(){
    
    int minimo = Integer.MAX_VALUE;
    word = word.toLowerCase();
    char tempArray[] = word.toCharArray();
    int charPos = 0;
    Collection<Integer> valores = placementChar.values();
    
    for(char letter: tempArray){
      
      if(placementChar.containsKey(letter)){
        placementChar.remove(letter);
      }
      else{
        placementChar.put(letter, charPos);
      }
      charPos++;
    }

    for (int valor : valores) {
        if (valor < minimo) {
            minimo = valor;
        }
    }

    int valorBuscado = minimo;

    char charBuscado = '_';
    for (Map.Entry<Character, Integer> entry : placementChar.entrySet()) {
        if (entry.getValue() == valorBuscado) {
              charBuscado = entry.getKey();
            break;
        }
    }

    System.out.println("First Unique Char : " + charBuscado);
   
  }
}