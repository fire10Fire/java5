package HarmonikToplam;
import java.util.Scanner;
public class Harmonik {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double toplam= 0;
        
        System.out.println("sayı giriniz : ");
        int son = in.nextInt();
        
        for(int i = 1;son>=i;i++){
            toplam+=1.0/i;
        } 
        System.out.println(toplam);

    }
}
