/***
 * Esta es la clase principal
 */
public class Main {
    /***
     * Este es nuestro método principal
     * @param args
     */
    public static void main(String[] args) {
        /* En estas lineas se explica el tipo de dato INT entero */
        System.out.println("Hello world!");
        // comentar una línea, no se ejecuta
        // 4 Tipos, que son enteros, decimales, caracteres y booleanos

        // nomenclatura empezar con minúscula.
        // más de 2 palabras primerApellido, nombreDeLaMascota
        // Tipo de dato y nombre la variable
        // ENTERO
        int edad;
        edad = 20;
        System.out.println(edad + " años tengo.");


        int anioDeNacimiento = 1900;
        System.out.println("Mi anio De Nacimiento es " +  anioDeNacimiento);

        edad = 30;
        System.out.println("Mi edad es " +  edad);

        int mes, anio, dia;
        mes= 1;
        anio=2024;
        dia=26;


        long enteroLargo = 1235634234;
        short mesShort = 12;
        byte  bitDia = 12;


        // Caracteres  y se ponen con comillas simples ''
        char femenino = 'f';
        char masculino = 'm';
        System.out.println("Géneros " +  femenino + masculino);

        // boleean: verdadero o falso
        boolean verdadero = true;
        boolean falso = false;

        // Decimales
        double  dinero = 123123123.123; // números grandes
        float estatura = 1.50f; // número decimal




    }
}