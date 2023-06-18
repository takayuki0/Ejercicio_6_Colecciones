import java.util.Scanner;

/**
 * Escribir un programa Java que crea un HashSet de Objetos de tipo Coche.
 * El programa pide por teclado los datos de los coches y los guarda en el HashSet.
 * A continuación utilizará un iterator para mostrar por pantalla lo siguiente:
 *
 * •Todos los coches introducidos.
 * •Todos los coches de una marca determinada.
 * •Todos los coches con menos de un número determinado de Kilómetros.
 * •El coche con mayor número de Kilómetros.
 * •Todos los coches ordenados por número de kilómetros de menor a mayor.
 */
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ListaCoches misCoches = new ListaCoches();
        misCoches.baseDatoCoches();
        boolean seguir = true;

        System.out.println("************************************************************");
        System.out.println("** Menú:                                                  **");
        System.out.println("** Opción 1: Ingresar Coches.                             **");
        System.out.println("** Opción 2: Mostrar Todos los Coches Introducidos.       **");
        System.out.println("** Opción 3: Buscar Coches por Marca.                     **");
        System.out.println("** Opción 4: Buscar Coches por Kilometros.                **");
        System.out.println("** Opción 5: Buscar el/los Coche/s con Mayor Kilometraje. **");
        System.out.println("** Opción 6: Salir.                                       **");
        System.out.println("** Ingrese una Opción:                                    **");
        System.out.println("************************************************************");

        while (seguir) {
            int opcion = entrada.nextInt();

            if (opcion == 1) {
                misCoches.ingresarCoches();
                System.out.println("Coche Ingresado con éxito!");
                System.out.print("Ingrese una Opción: ");
            } else if (opcion == 2) {
                misCoches.mostrarCoches();
                System.out.print("Ingrese una Opción: ");
            } else if (opcion == 3) {
                misCoches.mostrarCochesPorMarca();

            } else if (opcion == 4) {

            } else if (opcion == 5) {

            } else {
                System.out.println("Programa Finalizado!");
                seguir = false;
            }
        }

    }
}