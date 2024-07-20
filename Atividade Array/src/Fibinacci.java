//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Fibinacci {
    public static void main(String[] args) {
        int fibo[];
        int qtd = 30;
        fibo = new int[qtd];
        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 2; i < fibo.length ; i++) {

            fibo[i] = fibo[i-1] + fibo[i-2];
            System.out.print(", "+ fibo[i]);
        }
        System.out.println("Fim");
    }
}