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


import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();
        Collections.addAll(a1,1,2,5,6,9);
        Collections.addAll(a2,3,8,5,2,1);
        a1.addAll(a2);
        Collections.sort(a1);
        Collections.reverse(a1);
        System.out.println(a1);
    }
}
