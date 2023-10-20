/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_alejandrosussman;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Lab2P1_AlejandroSussman {

    public static void main(String[] args) {
        int opcion;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una opcion sea 1,2,3 o 4");
        opcion = leer.nextInt();
        while (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4) {

            if (opcion == 1) {
                int lado1;
                int lado2;
                int lado3;
                System.out.println("Creacion de Triangulos");
                System.out.println("Ingrese la primera longitud");
                lado1 = leer.nextInt();
                System.out.println("Ingrese la segunda longitud");
                lado2 = leer.nextInt();
                System.out.println("Ingrese la tercera longitud");
                lado3 = leer.nextInt();
                if (lado1 > lado2 + lado3) {
                    System.out.println("Las longitudes ingresadas forman un triangulo");
                } else {
                    System.out.println("Las longitudes ingresadas no forman un triangulo");
                }

            }
            if (opcion == 2) {
                System.out.println("Area de Figuras");
                int opcion2;
                char resp;
                System.out.println("Elija cual figura desea calcular");
                System.out.println("1. Rectangulo");
                System.out.println("2. Triangulo");
                System.out.println("3. Circulo");
                opcion2 = leer.nextInt();
                resp = leer.next().charAt(0);
                while (resp == 's') {
                    if (opcion2 == 1) {
                        System.out.println("Area de Rectangulo");
                        int base;
                        int altura;
                        System.out.println("Ingrese la base: ");
                        base = leer.nextInt();
                        System.out.println("Ingrese la altura: ");
                        altura = leer.nextInt();
                        System.out.println("El area del rectangulo es de:" + base * altura);
                    } else if (opcion2 == 2) {
                        System.out.println("Area de Triangulo");
                        int base_t;
                        int alt_t;
                        System.out.println("Ingrese la base de su triangulo");
                        base_t = leer.nextInt();
                        System.out.println("Ingrese la altura de su triangulo");
                        alt_t = leer.nextInt();
                        System.out.println("El area de su triangulo es de: " + base_t * alt_t * 0.5);
                    } else if (opcion == 3) {
                        System.out.println("Area de un Circulo");
                        int radio;
                        System.out.println("Ingrese el radio del circulo: ");
                        radio = leer.nextInt();
                        System.out.println("El area de su circulo es de: " + radio * radio * Math.PI);

                    }
                    System.out.println("Desea calcular el area de otra figura s/n?");
                    resp = leer.next().charAt(0);

                }

            }
            if (opcion == 3) {
                int num;
                System.out.println("Ingrese un numero entero para evaluar: ");
                num = leer.nextInt();
                if (num % 2 = 0) {
                    System.out.println("El numero ingresado es par");
                } else {
                    System.out.println("El numero ingresado es impar");
                }
            }
            if (opcion==4){
                System.out.println("Ha salido del menu");
            }
        }

    }

}


