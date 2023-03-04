import java.util.*;
public class TempConvert {
    public static void main (String args[])  
    {  
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            float Fahrenheit, Celsius;  
            Celsius=sc.nextFloat(); 
            Fahrenheit =((Celsius*9)/5)+32;  
            System.out.format("%.2f",Fahrenheit);  
            t--;
        }
           
        
    }
} 
