import java.util.*;

public class WordChecker {
  private ArrayList<String> wordList;

  public WordChecker(ArrayList<String> words) {
    wordList = words;
  }

  public boolean isWordChain() {
    for(int i = 0; i < wordList.size()-2; i++) {
      if (wordList.get(i+1).indexOf(wordList.get(i))!=1){
        return true;
      }
    }
      return false;
  }


  public ArrayList<String> createList(String target) {
    ArrayList<String> result = new ArrayList<String>();
    for(int j = 0; j < wordList.size(); j++){
      if (wordList.get(j).indexOf(target)==0) {
        result.add(wordList.get(j).substring(target.length()));
      }
    }
    return result;             
  }
}
