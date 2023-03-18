package Kombinasyon;
import java.util.Scanner;
public class Kombin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean kilit = true; 
        while(kilit){
            System.out.println("Kombinasyon işlemlerine başlayın");
            System.out.println("Toplam eleman sayısını giriniz : ");
            int n = in.nextInt();
            System.out.println("Kaç elemanlı kombinasyon seçmek istiyorsunuz : ");
            int r = in.nextInt();
            int rf=1; 
            int nf =1;
            int af=1;

            for(int i=1;(n-r)>=i;i++){
                af*=i;   
            }
            for(int i=1;n>=i;i++){
                nf*=i;
            } 
            for(int i=1;r>=i;i++){
                rf*=i;
            }
            //C(n,r) = n! / (r! * (n-r)!)
            System.out.println("cevap : "+nf/(rf*(af)));
        }
    }
    
}
