import java.util.Scanner;
public class Reto3 {
    public static void main(String[] args){
        int [][]tamañoSudoku;
        int cantidadFilas;
        int cantidadColumnas;
        int suma;
        Scanner leerDato=new Scanner (System.in);

        System.out.println("De cuantas filas deseas crear tu sudoku?");
        cantidadFilas=leerDato.nextInt();

        System.out.println("De cuantas columnas deseas crear tu sudoku?");
        cantidadColumnas=leerDato.nextInt();

        tamañoSudoku = new int[cantidadFilas][cantidadColumnas];
        for (int i = 0; i < cantidadFilas; i++) {
            for (int j = 0; j < cantidadColumnas; j++) {
                System.out.println("ingresa el valor para la fila "+(i+1)+" columna "+(j+1));
                tamañoSudoku[i][j]=leerDato.nextInt();
            }
        }


        for (int i = 0; i < cantidadFilas; i++) {
            for (int j = 0; j < cantidadColumnas; j++) {
                System.out.println(tamañoSudoku[i][j]);
            }
            System.out.println("");
        }


        System.out.println("--------");

        for (int i = 0; i < cantidadFilas; i++) {
            for (int j = 0; j < cantidadColumnas; j++) {
                suma =tamañoSudoku[i][j]+tamañoSudoku[i][j];
                System.out.println("la suma es "+ suma);
            }
            System.out.println("");
        }

        leerDato.close();
    }  
}