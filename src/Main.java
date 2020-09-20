
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean loop = true;
        int rec = 1;
        Scanner scan = new Scanner(System.in);
        String val = "";
        Validator validador = new Validator();
        boolean v;
        while(loop)
        {
            System.out.println("Entre com a String para ser validada: ");
            val = scan.next();
            v = validador.Validation(val);
            if(v)
            {
                System.out.println("Formato Válido: " + val  );
            }else
            {
                System.out.println("Formato Inválido: " + val  );
            }
            System.out.println("Deseja sair pressione 0");
            rec = scan.nextInt();
            switch(rec)
            {
                case 0:
                    loop = false;
                    break;
                default:
                    break;
            }
        }
    }
}