import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();
        for(int i=0;i<5;i++){
            a1.add(sc.nextInt());
        }
        for(int j=0;j<5;j++){
            a2.add(sc.nextInt());
        }
        a1.addAll(a2);
        Collections.sort(a1);
        Collections.reverse(a1);
        System.out.println(a1);
    }
}
