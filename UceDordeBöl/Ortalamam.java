package UceDordeBöl;
import java.util.Scanner;
public class Ortalamam { 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("sayı giriniz : ");
        int say = in.nextInt();
        int i = 1 ;
        int j = 0; 
        int toplam = 0;
        double ortalama = 0;
        while(say>=i){
            boolean art =(i%3==0)||(i%4==0);
            if(art){
                j++;
                 toplam =i+toplam;
                 System.out.print(i+", ");
                }
                i++;
            }
            ortalama = toplam/j;
        System.out.println(" Ortalama : "+ ortalama);

    }
}
