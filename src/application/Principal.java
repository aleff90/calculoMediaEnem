package application;

import entities.CalculoMedia;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CalculoMedia calculoMedia = new CalculoMedia();
        String question;
        int anoExame;

        do {

            System.out.println();
            System.out.print("Ano da realização do exame: ");
            anoExame = sc.nextInt();

            System.out.println();
            System.out.print("Ciencias da Natureza nota: ");
            calculoMedia.cn = sc.nextDouble();

            System.out.print("Ciencias Humanas nota: ");
            calculoMedia.ch = sc.nextDouble();

            System.out.print("Linguagens, Codigos nota: ");
            calculoMedia.lc = sc.nextDouble();

            System.out.print("Matematica nota: ");
            calculoMedia.m = sc.nextDouble();

            System.out.println();
            System.out.print("No exame do ano " + anoExame);
            System.out.printf(" a média foi: %.1f%n", calculoMedia.mediaTotal());

            System.out.println();
            System.out.print("Deseja calcular a média de outro ano (y/n)? ");
            question = sc.next();

        } while (question.equals("y"));

        sc.close();
    }
}
