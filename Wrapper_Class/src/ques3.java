import java.util.*;
public class ques3 {
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        String s = Integer.toBinaryString(n);
        int l = s.length();
        if(l<8){
            int temp = 8-l;
            while(temp>0){
                System.out.print("0");
                temp--;
            }
            System.out.print(s);
        }
        else{
            System.out.println(s);
        }
    }
}
