import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Masukkan Angka: ");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " adalah ganjil");
        else
            System.out.println(num + " adalah genap");
    }
}