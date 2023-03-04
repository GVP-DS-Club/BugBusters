import java.util.Scanner;
public class BinarytoHex {
 public static void main(String[] args) 
 {
	try (Scanner in = new Scanner(System.in)) {
    int t=in.nextInt();
    while(t>0){
    	String s=in.next();
      String ans = convertBinaryToHexadecimal(s);
      System.out.print(ans);
      t--;
    }
  }
 }
 public static String convertBinaryToHexadecimal(String binary) {
  int length = binary.length();
  if (length % 4 != 0) {
     
      int newLength = length + (4 - length % 4);
      binary = String.format("%" + newLength + "s", binary).replace(' ', '0');
  }
  
  StringBuilder hex = new StringBuilder();
  for (int i = 0; i < length; i += 4) {
      
      String fourDigits = binary.substring(i, i + 4);
      int decimal = Integer.parseInt(fourDigits, 2);
      hex.append(Integer.toHexString(decimal));
  }
  
  return hex.toString();
}
}
