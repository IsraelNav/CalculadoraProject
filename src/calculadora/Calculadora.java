/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Israel Navarrete
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opt = 0;
        int[] array_numeros = null;
        int cantidad_numeros_ingresados = 0;
        int contador = 0;
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Bienvenido a la calculadora");
            System.out.println("Ingrese una de las siguientes opciones para realizar la operacion deseada");
            System.out.println("1.- Suma");
            System.out.println("2.- Promedio numeros impares");
            System.out.println("3.- Numero minimo y maximo");
            System.out.println("4.- Contar cantidad de numeros primos y cuales son");
            System.out.println("5.- Ordenar lista de numeros ingresados  en forma ascendente");
            System.out.println("6.- Ordenar lista de numeros ingresados  en forma descendente");
            System.out.println("0.- Salir");
            opt = scanner.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Ha ingresado a la operacion sumar");
                    System.out.println("Ingrese la cantidad de numeros que desea sumar");
                    cantidad_numeros_ingresados = scanner.nextInt();
                    System.out.println("La cantidad de numeros ingresados es: " + cantidad_numeros_ingresados);
                    array_numeros = new int[cantidad_numeros_ingresados];
                    System.out.println("Ingrese los valores para los " + array_numeros.length + " numeros que desea calcular");
                    for (int i = 0; i < array_numeros.length; i++) {
                        array_numeros[i] = scanner.nextInt();
                    }
                    contador = 1;
                    for (int i = 0; i < array_numeros.length; i++) {
                        System.out.println("Los valores ingresados para el numero " + contador + " es : " + array_numeros[i]);
                        contador++;
                    }
                    int suma = 0;
                    for (int i = 0; i < array_numeros.length; i++) {
                        suma += array_numeros[i];
                    }
                    System.out.println("La suma de los numeros es: " + suma + "\n");

                    break;
                case 2:
                    System.out.println("Ha ingresado a la operacion obtener promedio de numeros impares");
                    System.out.println("Ingrese la cantidad de numeros que desea operar");
                    cantidad_numeros_ingresados = scanner.nextInt();
                    System.out.println("La cantidad de numeros ingresados es: " + cantidad_numeros_ingresados);
                    array_numeros = new int[cantidad_numeros_ingresados];
                    System.out.println("Ingrese los valores para los " + array_numeros.length + " numeros que desea calcular");
                    for (int i = 0; i < array_numeros.length; i++) {
                        array_numeros[i] = scanner.nextInt();
                    }
                    contador = 1;
                    for (int i = 0; i < array_numeros.length; i++) {
                        System.out.println("Los valores ingresados para el numero " + contador + " es : " + array_numeros[i]);
                        contador++;
                    }
                    int contador_impares = 0;
                    int suma_impares = 0;
                    int promedio = 0;
                    for (int i = 0; i < array_numeros.length; i++) {
                        if (esImpar(array_numeros[i]) && !esNegativo(array_numeros[i])) {
                            suma_impares += array_numeros[i];
                            contador_impares++;
                        }
                    }
                    promedio = suma_impares / contador_impares;
                    System.out.println("El promedio de impares es: " + promedio + "\n");
                    break;
                case 3:
                    System.out.println("Ha ingresado a la operacion obtener minimo y maximo");
                    System.out.println("Ingrese la cantidad de numeros que desea operar");
                    cantidad_numeros_ingresados = scanner.nextInt();
                    System.out.println("La cantidad de numeros ingresados es: " + cantidad_numeros_ingresados);
                    array_numeros = new int[cantidad_numeros_ingresados];
                    System.out.println("Ingrese los valores para los " + array_numeros.length + " numeros que desea calcular");
                    for (int i = 0; i < array_numeros.length; i++) {
                        array_numeros[i] = scanner.nextInt();
                    }
                    contador = 1;
                    for (int i = 0; i < array_numeros.length; i++) {
                        System.out.println("Los valores ingresados para el numero " + contador + " es : " + array_numeros[i]);
                        contador++;
                    }

                    int numMax = Integer.MIN_VALUE;
                    int numMin = Integer.MAX_VALUE;
                    for (int i = 0; i < array_numeros.length; i++) {

                        if (!esNegativo(array_numeros[i])) {
                            if (array_numeros[i] > numMax) {
                                numMax = array_numeros[i];
                            }

                            if (array_numeros[i] < numMin) {
                                numMin = array_numeros[i];
                            }
                        }
                    }

                    System.out.println("El numero maximo es: " + numMax + " y el minimo es: " + numMin + "\n");
                    break;
                case 4:
                    System.out.println("Ha ingresado a la operacion contar cantidad de numeros primos");
                    System.out.println("Ingrese la cantidad de numeros que desea operar");
                    cantidad_numeros_ingresados = scanner.nextInt();
                    System.out.println("La cantidad de numeros ingresados es: " + cantidad_numeros_ingresados);
                    array_numeros = new int[cantidad_numeros_ingresados];
                    System.out.println("Ingrese los valores para los " + array_numeros.length + " numeros que desea calcular");
                    for (int i = 0; i < array_numeros.length; i++) {
                        array_numeros[i] = scanner.nextInt();
                    }
                    contador = 1;
                    for (int i = 0; i < array_numeros.length; i++) {
                        System.out.println("Los valores ingresados para el numero " + contador + " es : " + array_numeros[i]);
                        contador++;
                    }

                    int contador_primos = 0;
                    for (int i = 0; i < array_numeros.length; i++) {
                        if (esPrimo(array_numeros[i])) {
                            contador_primos++;
                        }
                    }
                    System.out.println("La cantidad de numeros primos es: " + contador_primos + "\n");
                    break;
                case 5:
                    System.out.println("Ha ingresado a la operacion ordenar numeros ingresados ascendentemente");
                    System.out.println("Ingrese la cantidad de numeros que desea operar");
                    cantidad_numeros_ingresados = scanner.nextInt();
                    System.out.println("La cantidad de numeros ingresados es: " + cantidad_numeros_ingresados);
                    array_numeros = new int[cantidad_numeros_ingresados];
                    System.out.println("Ingrese los valores para los " + array_numeros.length + " numeros que desea calcular");
                    for (int i = 0; i < array_numeros.length; i++) {
                        array_numeros[i] = scanner.nextInt();
                    }
                    contador = 1;
                    for (int i = 0; i < array_numeros.length; i++) {
                        System.out.println("Los valores ingresados para el numero " + contador + " es : " + array_numeros[i]);
                        contador++;
                    }

                    Arrays.sort(array_numeros);
                    System.out.println("Lista ordenada ascendentemente: " + Arrays.toString(array_numeros) + "\n");
                    break;
                case 6:
                    System.out.println("Ha ingresado a la operacion ordenar numeros ingresados descendentemente");
                    System.out.println("Ingrese la cantidad de numeros que desea operar");
                    cantidad_numeros_ingresados = scanner.nextInt();
                    System.out.println("La cantidad de numeros ingresados es: " + cantidad_numeros_ingresados);
                    array_numeros = new int[cantidad_numeros_ingresados];
                    System.out.println("Ingrese los valores para los " + array_numeros.length + " numeros que desea calcular");
                    for (int i = 0; i < array_numeros.length; i++) {
                        array_numeros[i] = scanner.nextInt();
                    }
                    contador = 1;
                    for (int i = 0; i < array_numeros.length; i++) {
                        System.out.println("Los valores ingresados para el numero " + contador + " es : " + array_numeros[i]);
                        contador++;
                    }

                    Arrays.sort(array_numeros);
                    int[] orden_descendente = new int[array_numeros.length];
                    int j = 0;
                    for (int i = array_numeros.length - 1; i >= 0; i--) {
                        orden_descendente[j] = array_numeros[i];
                        j++;
                    }
                    System.out.println("Lista ordenada descendentemente " + Arrays.toString(orden_descendente) + "\n");
                    break;
                default:
                    opt = 0;
                    System.out.println("Ha finalizado la ejecucion de la calculadora, vuelva a correr el programa");
            };

        } while (opt != 0);
    }

    private static boolean esImpar(int iNumero) {
        if (iNumero % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean esNegativo(int iNumero) {
        if (iNumero < 0) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean esPrimo(int iNumero) {
        if (iNumero == 0 || iNumero == 1 || iNumero == 4) {
            return false;
        }

        for (int i = 2; i < iNumero / 2; i++) {
            if (iNumero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
