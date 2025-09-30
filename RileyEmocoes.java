
import java.util.Scanner;

public class RileyEmocoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alegria = 0;
        int tristeza = 0;

       
        System.out.print("Riley fez novas amizades na cidade? Quantas? ");
        int amizades = sc.nextInt();

        if (amizades > 0) {
            alegria += amizades * 10;
        } else {
            tristeza += 30;
        }

       
        System.out.println("Digite as notas das três provas da Riley (A1, A2, A3), cada uma de 0 a 10:");
        double a1 = sc.nextDouble();
        double a2 = sc.nextDouble();
        double a3 = sc.nextDouble();

        double media = (a1 + a2 + a3) / 3.0;

        if (media >= 7.0) {
            alegria += 50;
        } else {
            tristeza += 50;
        }

        
        System.out.print("Quantos exercícios de programação Riley conseguiu fazer (0 a 10)? ");
        int exerciciosFeitos = sc.nextInt();

        if (exerciciosFeitos >= 0 && exerciciosFeitos <= 10) {
            alegria += exerciciosFeitos * 10;
            tristeza += (10 - exerciciosFeitos) * 10;
        } else {
            System.out.println("Número de exercícios inválido, considerando 0 exercícios feitos.");
            tristeza += 100; 
        }

       
        System.out.println("\nPontos da Alegria: " + alegria);
        System.out.println("Pontos da Tristeza: " + tristeza);

        if (alegria > tristeza) {
            System.out.println("A mudança para a nova cidade foi uma experiência incrível para a Riley.");
        } else if (tristeza > alegria) {
            System.out.println("A mudança para a nova cidade foi uma experiência desagradável para a Riley.");
        } else {
            System.out.println("A mudança para a nova cidade teve momentos equilibrados entre alegria e tristeza para a Riley.");
        }

        sc.close();
    }
}
