import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int vet[], numLido ;
        int soma = 0;
        int tam = 100;
        int cont = 0 ;


        System.out.println("Digite positivo para continuar ou negativo para sair do Programa");

        do {
            vet = new int[tam];
            System.out.println("Digite um Numero ");
            vet[cont] = scanner.nextInt();
            soma = soma + vet[cont];
            cont++;
        }while (vet[cont-1] > 0);

        if (cont > 1){
            double media = soma / cont;
            System.out.println("A média foi: " + media);
            System.out.println("O Total de numeros inseridos de foi: " + cont);

        }
    }
}
