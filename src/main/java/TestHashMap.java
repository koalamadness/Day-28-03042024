import java.util.HashMap;
import java.util.ArrayList;
public class TestHashMap {
  public ArrayList<String> nombres = new ArrayList<String>();
  public HashMap<String, Integer> nameCounter = new HashMap<String, Integer>();
  
  // Agregar nombres al ArrayList con repeticiones
  public TestHashMap() {
    nombres.add("Manuel");
    nombres.add("Manuel");
    nombres.add("Manuel");
    nombres.add("Maria");
    nombres.add("Maria");
    nombres.add("Maria");
    nombres.add("Maria");
    nombres.add("Maria");
    nombres.add("Juan");
    nombres.add("Ana");
    nombres.add("Luis");
  }

  public void countNames(){
    for(String name: nombres){
      if(nameCounter.containsKey(name)){
        int currentValue = nameCounter.get(name);
        nameCounter.put(name, currentValue + 1);
      } else {
        nameCounter.put(name, 1);
      }
    }

     System.out.println(nameCounter);
  }
  
}