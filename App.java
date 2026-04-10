
import java.util.Scanner;

public class App {
    
    public static Boolean ehPar(int numero) {

        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
        public static void main(String[]args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Informe o número");
            int numero = input.nextInt();

            Boolean resultado =  ehPar(numero);
            System.out.println(resultado);
      }
  }
    
    