import java.util.*;

public class ListaCoches {

    private HashSet<Coche> misCoches;

    public ListaCoches() {
        misCoches = new HashSet<>();
    }

    public void baseDatoCoches() {
        misCoches.add(new Coche("Subaru", 456035.45));
        misCoches.add(new Coche("Chevrolet", 326165.86));
        misCoches.add(new Coche("Ford", 245237.6));
        misCoches.add(new Coche("Dodge", 135476.24));
        misCoches.add(new Coche("Ferrari", 87536.9));
        misCoches.add(new Coche("Fiat", 67000.3));
        misCoches.add(new Coche("Toyota", 97457.45));
    }

    public void ingresarCoches() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa Marca del Coche: ");
        String coche = entrada.nextLine();
        System.out.print("Ingresa el Kilometraje delCoche: ");
        double kilometros = entrada.nextDouble();

        misCoches.add(new Coche(coche, kilometros));
    }

    //Muestra todos los coches introducidos.
    public void mostrarCoches() {
        Iterator<Coche> miIt = misCoches.iterator();

        while (miIt.hasNext()) {
            System.out.println(miIt.next());
        }
    }

    //Muestra todos los coches de una marca determinada.
    public void mostrarCochesPorMarca() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la Marca del Coche: ");
        String marca = entrada.nextLine();

        List<Coche> miLista = new ArrayList<>(misCoches);

        Iterator<Coche> cocheIterator=miLista.iterator();

        Collections.sort(miLista);
        Iterator<Coche> it = miLista.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }

    //Muestra todos los coches con menos de un número determinado de Kilómetros.
    public void mostrarCochesConMenosDeUnKmDeterminado() {

    }

    //Muestra el coche con mayor número de Kilómetros.
    public void mostrarCochesConMayorKilometraje() {

    }

    //

}
