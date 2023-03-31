import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        // Cantidad de notas a evalular en una materia

        double[] notas;
        int cantidadNotas;
        double total = 0;
        Scanner leerDato = new Scanner(System.in);

        System.out.println("Digite la cantidad de notas que necesite para calcular su promedio");
        cantidadNotas = leerDato.nextInt();

        notas = new double[cantidadNotas];
        for (int i = 0; i < cantidadNotas; i++) {
            System.out.println("digite el valor de la nota #" + (i + 1));
            notas[i] = leerDato.nextDouble();
            total += (notas[i]) / cantidadNotas;
        }

        System.out.println("El promedio es: " + total);

        if (total < 3.0) {
            System.out.println("Reprobaste");

        } else if (total >= 3 && total <= 4.0) {
            System.out.println("Pasaste raspando");

        } else if (total > 4.0) {
            System.out.println("aprobaste con buenos resultados");
        }

        leerDato.close();

    }
}
