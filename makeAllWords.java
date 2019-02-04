
import java.util.*;
public class makeAllWords{

  public static ArrayList<String> makeAllWords(int k){
    ArrayList<String> T = new ArrayList<String>();
    return mHelper(k, "", T);
  }

  private static ArrayList<String> mHelper(int k, String s, ArrayList<String> T){

    String a = "abcdefghijklmnopqrstuvwxyz";
    if(k == 0) T.add(s);
    for(int i = 0; i < k; i++){
      mHelper(k-1, s + a.charAt(i), T);
    }
    return T;
  }

  public static void main(String[] args){
    System.out.println(makeAllWords(3).toString());
  }

}
