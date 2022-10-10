import java.util.Scanner;
public class sicaklik {
    public static void main(String[] args) {
        int heat ;
        Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklık değerini giriniz: ");
        heat = input.nextInt();
        if (heat < 5){
            System.out.print("Kayak yapabilirsiniz.");
        }else if (heat>=5 && heat<=25){
            if (heat<15){
                System.out.println("Sinemaya gidebilirsiniz");
            }else if (heat <= 25){
                System.out.println("Pikniğe gidebilirsiniz.");
            }
        }else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
