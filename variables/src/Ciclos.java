/***
 * Clase ciclos / Loops / Bucle
 */
public class Ciclos {
    public static void main(String[] args) {

        // for, whiles, do-while
        /*
            for(iniciador; condicion; incremento/decremento) {
                logica;
            }
         */
        // contar del 1 al 10
        // ++  ; 1++  2, 3

        for(int i = 1; i <= 10; i++) { // 1a: 1 , 2da: 2, 3a=3, 4ta: i=4 -- NO
            System.out.println("Contador " + i);

            if(i == 10)
                System.out.println("llegué al final");
        }

        for(int i = 10; i >= 5; i--) { // operador -- significa decremenetar en 1.
            System.out.println("Temporizador: " + i);
        }
        System.out.println("AFUERA DEL FOR");


        // while: mientras
        /* while(condicion) {
            lógica;
            hacer algo para cumplir la conición;
        }
         */
        int init = 1;
        while(init <= 10) { // mientras el contador sea menor o igual a 10
            System.out.println("Soy el número " + init);
            init++; //2da vuelta init = 2; 3ra vuelta init=3; ... init=11;
            // init = init + 1;
        }


        System.out.println("Ahora Soy el número " + init);



        // do - while
        /*
            do {
                //hacer algo, lógica
            } while (condición);
         */
        int contador = 1;
        do {
            System.out.println("Soy el número " + contador);
            contador ++; // contador = contador + 1;
        } while(contador <= 5); //1era vez es 1


    }
}
