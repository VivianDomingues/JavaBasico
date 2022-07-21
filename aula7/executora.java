package aula7;

import java.util.Scanner;

public class executora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Delta delta = new Delta();
        EqXn x = new EqXn();

        System.out.println("Informe 3 valores consideradno a seguinte equação: ax^2 bx c");
        System.out.println("Digite o valor de A");
        delta.setA(entrada.nextDouble());
        System.out.println("Digite o valor de B");
        delta.setB(entrada.nextDouble());
        System.out.println("Digite o valor de C");
        delta.setC(entrada.nextDouble());

        delta.calculaDelta();
        System.out.println(" --- Equação ---");
        System.out.println("Delta: " + delta.getDelta());
        if (delta.getDelta() < 0){
            System.out.println("Delta menor que 0(zero). Não é possivel continuar a operação ");
        } else {
            System.out.println("X |  : " + x.calculaX1(delta));
            System.out.println("X || : " + x.calculaX2(delta));
        }
    }
}
