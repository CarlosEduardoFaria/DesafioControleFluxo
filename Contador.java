import exceptions.ParametrosInvalidosException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        try {

            final Scanner terminal = new Scanner(System.in);

            mensagem("primeiro");
            final int parametroUm = terminal.nextInt();
            mensagem("segundo");
            final int parametroDois = terminal.nextInt();

            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida, são permitidos apenas números inteiros!");
        }
    }

    private static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois)
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");

        final int contagem = parametroDois - parametroUm;
        //realizar o for para imprimir os números com base na variável contagem
        if (contagem > 0) {
            for (int i = 0; i < contagem; i++) {
                System.out.print("Imprimindo o número: " + i + "\n");
            }
        } else {
            System.out.print("Sem interações, a diferença dos valores é zero.");
        }
    }
    private static void mensagem(String var) {
        System.out.println("Digite o "+var+" parâmetro:");
    }
}
