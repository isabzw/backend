package aula3;

import java.util.Scanner;

public class ifElse {
    static void main() {
        Scanner aluno = new Scanner(System.in);
        IO.println("digite a primeira nota");
        double nota1 = aluno.nextDouble();
        IO.println("digite a segunda nota");
        double nota2 = aluno.nextDouble();
        IO.println("digite a terceira nota");
        double nota3 = aluno.nextDouble();

        double somarNotas = (nota1+nota2+nota3)/3;

        if (somarNotas < 4){
            IO.println("reprovado");
            return;
        }
        if (somarNotas <= 6){
            IO.println("recuperacao");
            return;
        }
        if (somarNotas > 6){
            IO.println("aprovado");
            return;
        } else{
            System.out.println("voce foi aprovado");
            IO.println("liberado");
        }
    }
}
