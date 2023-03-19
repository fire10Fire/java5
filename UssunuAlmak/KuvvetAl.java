package UssunuAlmak;
import java.util.Scanner;
public class KuvvetAl {
    public static void main(String[] args) {
        boolean anahtar = true;
        Scanner in = new Scanner(System.in);
        int n, k;

        while(anahtar){
        System.out.print("kuvvetini almak istediğiniz sayıyı giriniz : ");
        n = in.nextInt();
        System.out.print("kaçıncı kuvvetini almak istersiniz : ");
        k= in.nextInt();
        double toplam =1;

        for(int i=1; k>=i;i++){
            toplam*= n;
        }
        System.out.println(toplam);

            }
        }
}
