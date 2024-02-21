

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Llamar la clase carro
        /* COMENTAR
        Carro coche1 = new Carro(); //utilizando constructor 1
        Carro coche2 = new Carro("VIN123123123");
        Carro coche3 = new Carro("nuevoVIn", "Azul"); // utilizando constructor 3

        System.out.println(coche2.getVin(3));
        System.out.println(coche3.getColor());

        coche1.arrancar("Coche 1");
        coche1.avanzar();
        coche2.arrancar("Coche 2");
        coche1.girar();
        coche1.frenar();

        coche3.arrancar("Coche 3");

        coche3 = new Carro("vin2" , "Rojo");
        System.out.println(coche3.getColor());
        */
        // Clase principal es Carro
        Vehiculo deportivo = new AutoDeportivo("El rojo");
        deportivo.arrancar("Mi auto");
        deportivo.nombre("Auto Deportivo");

        // Clase principal es AutoDeportivo
        AutoDeportivo deportivo2 = new AutoDeportivo("la golfa");
        deportivo2.setTurbo(true);
        deportivo2.arrancar();

        deportivo2.nombre();

        Bote bote = new Bote();
        bote.arrancar();

    }
}

// 3 atributos y 2 comportamients(metodo y funcion)
// Libro
// Persona
// Factura
// Animal
// Perro

// Animal
/*
    especie
    reproduccion: oviparo, mamifero,
    esquelto: vertebrado/invertebrado
    alimentacion: carnivoro/herviboro}
    habitat: agua/tierra/aire
    color:
    nombre: Perro, Gato, Pájaro
 */

/* Perro
   ladrar
   raza
   nombre: firulais, benito, juan, zeusAndres
 */