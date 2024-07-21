import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nota [] = new int [10];
        int soma = 0;
        int notaAcimaDaMedia = 0;
        int notaAbaixoDaMedia = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite a nota do aluno "+ i);
            nota[i] = scanner.nextInt();
            soma = soma + nota[i];
        }

        double media = soma / 10;
        System.out.println("A média da turma foi: " + media);

        for (int i = 0; i < 10; i++ ){
            if (nota[i] >= media){
                notaAcimaDaMedia++;
                System.out.println("a Cima da media " + nota[i]);
            }else {
                notaAbaixoDaMedia++;
                System.out.println("a Baixo da media " + nota[i]);
            }
        }
        System.out.println("São "+ notaAcimaDaMedia +" Aluno acima da Média");
        System.out.println("São "+ notaAbaixoDaMedia +" Aluno abaixo da Média");
    }
}