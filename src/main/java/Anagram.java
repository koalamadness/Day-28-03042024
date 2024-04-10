import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

public class Anagram{
   public HashMap<String, ArrayList<String>> anagrams = new HashMap<String, ArrayList<String>>();
   public ArrayList<String> words = new ArrayList<String>();

  public Anagram(){
    words.add("eaet");
    words.add("words");
    words.add("sword");
    words.add("principe");
    words.add("teae");
    words.add("ordws");
    words.add("aeet");
  }

  public static String sortString(String inputString)
    {
        // Converting input string to character array
        char tempArray[] = inputString.toCharArray();

        // Sorting temp array using
        Arrays.sort(tempArray);

        // Returning new sorted string
        return new String(tempArray);
    }
  
  public void findAnagram(){

    for(String word: words){

      String sortedWord = sortString(word);

      if(anagrams.containsKey(sortedWord)){
        
         ArrayList<String> anagramList = anagrams.get(sortedWord);
         anagramList.add(word);
        
      } else{
        
        ArrayList<String> anagramList2 = new ArrayList<String>();
        anagramList2.add(word);
        anagrams.put(sortedWord, anagramList2);
        
      }
      
    }


    System.out.println(anagrams);
    
  }
  
 }