import java.util.*;

public class Reto2 {
    public static void main(String[] args) {
        // competencia de natacion
        String[] participantes;
        int tiempo;
        int cantidad;

        Scanner leerDato = new Scanner(System.in);

        System.out.println("¿Cuantos competidores van a participar?");
        cantidad = leerDato.nextInt();

        participantes = new String[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.println("competidor " + (i + 1));
            participantes[i] = leerDato.next();
        }

        System.out.println("lista de competidores que van a participar: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("competidor #" + (i+1) + ": " + participantes[i]);
        }

    }
}
