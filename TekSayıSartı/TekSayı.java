package TekSayıSartı;
import java.util.Scanner;
public class TekSayı {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sayı=0;
         int toplam=0;
         
        do{
            System.out.println("Sayı giriniz : "); 
            sayı = in.nextInt();
        
            if((sayı%2==0)){
                toplam+=sayı;
            }
        }while(sayı%2!=1);
        System.out.println("2 ve 4 e bölünen sayıların toplamı : "+toplam);
    }
    
}
