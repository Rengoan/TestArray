/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testarray;

/**
 *
 * @author Alumno Mañana
 */
public class TestMatrices {

    public static void main(String[] args) {
        int edades[][] = new int[3][2]; //3 filas y 2 columnas
        edades[0][0] = 5;
        edades[0][1] = 10;
        edades[1][0] = 15;
        edades[1][1] = 3;
        edades[2][0] = 7;
        edades[2][1] = 9;
//        imprimir.(matriz);

//        System.out.println("edades [0][1] = " + edades[0][1]);
        for (int i = 0; i < edades.length; i++) {
            for (int j = 0; j < edades[i].length; j++) {
                System.out.println("Edades[" + i + "][" + j + "]= " + edades[i][j]);
            }
        }

    }

    public static void imprimir(Object matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Edades[" + i + "][" + j + "]= " + matriz[i][j]);
            }
        }
    }

}
