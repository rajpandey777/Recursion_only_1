public class palindrome {

    static boolean palind(String s, int left, int right){
     if(left>=right)
     return true;

     if(s.charAt(left) != s.charAt(right))
     return false;

     return palind(s, left+1, right -1);

    }
  public static void main(String[] args){
    String s = "racecar";
    System.out.println(palind(s,0,s.length()-1));
  }
}
