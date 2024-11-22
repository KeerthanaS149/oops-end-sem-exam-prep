import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Program executing...");
        ArrayList<String> a1=new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            a1.add(sc.nextLine());
        }
        a1.removeIf(str->str.length()<5);
        System.out.println(a1);
        
    }
}
