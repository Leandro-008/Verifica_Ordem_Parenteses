import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        StackDinamica lista =new StackDinamica();
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite uma expressão: ");
        String expressao = entrada.nextLine();
        entrada.close(); 

        if (lista.verificarParametrizacao(expressao)) {
            System.out.println("A expressão possui a parametrização correta.");
        } else {
            System.out.println("A expressão não possui a parametrização correta.");
        }
    }

}







