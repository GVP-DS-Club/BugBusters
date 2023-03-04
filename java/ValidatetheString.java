import java.util.*;

public class ValidatetheString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t=sc.nextInt();       
      while(t>0){
      String s=sc.next();
      if(isValid(s))
      System.out.print("Yes");
      else
      System.out.print("No");
      t--;
      }
        }
    }
    public static boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<arr.length;i++){
            char c = s.charAt(i);
            if(c=='['||c=='{'||c=='(')
                stack.push(c);
            else{
                if(stack.isEmpty())
                    return false;
                else if(c==']' && stack.pop()!='[')
                    return false;
                else if(c==')' && stack.pop()!='(')
                    return false;
                else if(c=='}' && stack.pop()!='{')
                    return false;
            }
        }
        return stack.isEmpty();
    }
    
}
