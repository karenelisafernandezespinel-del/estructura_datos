package com.mycompany.mavenproject1;

import java.util.Scanner;
public class Mavenproject1 {

    static Scanner sc = new Scanner(System.in);
    static int opc;
    static int tam;
 
    static int[] vec;
    static String[] nom;
    static String[] ape;
    static double[] sal;
    static int[] dt;
    static double[] tp;
 
    public static void main(String[] args) {
 
        System.out.print("Digite Cantidad de Usuarios: ");
        tam = sc.nextInt();
 
        // Se crean los vectores después de conocer la cantidad de usuarios
        vec = new int[tam];
        nom = new String[tam];
        ape = new String[tam];
        sal = new double[tam];
        dt = new int[tam];
        tp = new double[tam];
 
        System.out.println("");
        System.out.println("");
 
        menu();
    }
 
    static void menu() {
 
        System.out.println("************vectores***********");
        System.out.println("1. capturar");
        System.out.println("2. consultar");
        System.out.println("3. modificar");
        System.out.println("4. eliminar");
        System.out.println("5. salir");
        System.out.println("6. regresar al menu");
        System.out.print("Digite su opcion:  ");
 
        opc = sc.nextInt();
 
        switch (opc) {
 
            case 1:
                capturar();
                break;
 
            case 2:
                consultar();
                break;
 
            default:
                System.out.println("Opcion no valida");
                menu();
                break;
        }
    }
 
    static void capturar() {
 
        for (int i = 0; i < tam; i++) {
 
            System.out.println("Digite el Nombre " + i);
            nom[i] = sc.next();
 
            System.out.println("Digite el Apellido " + i);
            ape[i] = sc.next();
 
            System.out.println("Digite el Salario " + i);
            sal[i] = sc.nextDouble();
 
            System.out.println("Digite Días Trabajados " + i);
            dt[i] = sc.nextInt();
 
            /////operacion /////
            tp[i] = (sal[i] / 30) * dt[i];
        }
 
        menu();
    }
 
    static void consultar() {
 
        ///menu consulta
        System.out.println("******************************");
        System.out.println("     MENU CONSULTA    ");
        System.out.println("******************************");
        System.out.println("1. Consulta General");
        System.out.println("2. Consulta Individual");
        System.out.println("3. Regresar al Menu");
        System.out.print("Digite su opcion ");
 
        opc = sc.nextInt();
 
        switch (opc) {
 
            case 1:
 
                ///consulta general////
                System.out.println("------------------------------------------------------------");
                System.out.println("Empleado\tNombre\tApellido\tSalario\tDias\tTotal Pagar");
                System.out.println("------------------------------------------------------------");
 
                for (int i = 0; i < tam; i++) {
 
                    System.out.println(
                            i + "\t"
                            + nom[i] + "\t"
                            + ape[i] + "\t"
                            + sal[i] + "\t"
                            + dt[i] + "\t"
                            + tp[i]
                    );
                }
 
                System.out.println("------------------------------------------------------------");
 
                consultar();
                break;
 
            case 2:
 
                int des;  ///inicio
 
                do {
 
                    System.out.println("digite la posición a consultar: ");
                    int pos = sc.nextInt();
 
                    System.out.println("Empleado: " + pos);
                    System.out.println("Nombre: " + nom[pos]);
                    System.out.println("Apellido: " + ape[pos]);
                    System.out.println("Salario: " + sal[pos]);
                    System.out.println("Dias trabajados: " + dt[pos]);
                    System.out.println("Total a Pagar: " + tp[pos]);
                    System.out.println("");
 
                    System.out.println("otra consulta?  1= si   0 = no");
                    des = sc.nextInt();
 
                } while (des != 0); ///condicion
 
                consultar();
                break;
 
            case 3:
 
                menu();
                break;
            default:
 
                System.out.println("Opcion no valida");
                consultar();
                break;
        }
    }
}
