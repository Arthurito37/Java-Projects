package introducao;
import java.util.Scanner;
import java.util.Locale;

public class estruturaCondicional {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do estudante: ");
        String nome = sc.next();
        System.out.println("Digite o RA do estudante: ");
        String RA = sc.next();
        System.out.println("Digite o primeira nota do estudante: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite o segunda nota do estudante: ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite o terceira nota do estudante: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Digite seu nome para cadastro: " + nome);
        System.out.println("por favor, digite seu RA: " + RA);
        System.out.println("Digite a primeira nota: " + nota1);
        System.out.println("Digite a segunda nota: " + nota2);
        System.out.println("Digite a terceira nota: " + nota3);
        System.out.println("Querido estudante " + nome + " do RA " + RA + " sua média é igual a " + media + ".");

        sc.close();
    }
}
