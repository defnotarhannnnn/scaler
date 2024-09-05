import java.util.*;
public class palindrome{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        StringBuffer str=new StringBuffer(Integer.toString(in.nextInt()));
        if(str.reverse()==str)
        System.out.println("True");
        else
        System.out.println("False");
    }
}

