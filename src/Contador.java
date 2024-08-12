import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int parametro1;
        int parametro2;

        System.out.println("Digite o paramentro 1: ");
        parametro1 = sc.nextInt();
        System.out.println("Digite o paramentro 2: ");
        parametro2 = sc.nextInt();

        try {
            contar(parametro1, parametro2);

        } catch (ParametrosInvalidosExeception exeception) {
            System.out.println(exeception.getMessage());
        }

    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosExeception {

        if (parametro1 > parametro2) {
            throw new ParametrosInvalidosExeception("O segundo parâmetro deve ser maior que o primeiro.");

        }
        int contagem = parametro2 - parametro1;
        for (int x = 1; x <= contagem; x++) {
            System.out.println("Contagem: " + x);
        }

    }

}
