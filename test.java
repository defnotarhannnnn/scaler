import java.util.*;
public class test{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=Math.abs(in.nextInt());
        int b=Math.abs(in.nextInt());
        if(Math.min(a,b)==0){
        System.out.println(Math.max(a,b));
        System.exit(0); 
        }
        for(int i=Math.min(a,b);i>=1;i--){
             if(a%i==0 && b%i==0){
                System.out.println(i);
                break;
            }
        }
    }
}