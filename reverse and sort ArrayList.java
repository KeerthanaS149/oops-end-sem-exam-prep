import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Program executing...");
        ArrayList<Integer> a1=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            a1.add(sc.nextInt());
        }
        Collections.reverse(a1);
        System.out.println(a1);
        Collections.sort(a1);
        System.out.println(a1);
        
    }
}
