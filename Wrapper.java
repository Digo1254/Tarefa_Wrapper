import java.io.InputStream;
import java.util.Scanner;

public class Wrapper {

    public static void main(String args[]){
        System.out.println("Digite o número");
        Scanner num = new Scanner(System.in);
        int num1 = num.nextInt();
        Integer num2 = num1;
        System.out.println("Aqui está o número em tipo wrapper: " + num2);
    }
}
