import java.util.Scanner;

public class ödev {

    public static void main(String[] args) {
        // Kum saati yapımı
        Scanner scanner=new Scanner(System.in);
        System.out.println("Tek sayı giriniz");
        int sayıGır=scanner.nextInt();
        for(int i=0; i<sayıGır/2; i++){
            for(int b=0; b<i; b++){ //0<0 0<1 0<2
                System.out.print(" ");

            }
            for(int y=1; y<=sayıGır-2*i; y++){
                System.out.print("*");

            }
            System.out.println();
        }
        for(int i=0; i<=sayıGır/2; i++){
            for(int b=sayıGır/2; b>i; b--){
             System.out.print(" ");
            }
            for(int y=sayıGır; y>=sayıGır-2*i; y--){ 
                System.out.print("*");

            }
            System.out.println();

        }

    }
}