public class Condiciones {

    public static void main(String[] args) {


        // Condiciones IF-ELSE
        int edad = 19;
        boolean tieneLicencia = true;
        // if(condicion)
        //     acción
        // else
        //    acción

        if(edad >= 18 ) {
            System.out.println("Puede tramitar licencia");

            if(tieneLicencia)
                System.out.println("Puede manejar");
            else
                System.out.println("No debe manejar sin licencia.");
        }
        else
            System.out.println("NO puede tramitar licencia.");



        if(tieneLicencia) {
            System.out.println("Puede manejar");
        } else if (edad >= 18 ) {
            System.out.println("Puede tramitar licencia");
        } else {
            System.out.println("NO puede tramitar licencia, es menor de edad.");
        }

        // calificaciones 7 = C, 8 = B, 9 = B+, 10 = A,  7 < R
        int puntaje = 8;
        char calificacion;

        if(puntaje == 7) {
            System.out.println("D");
        } else if (puntaje == 8 ) {
            System.out.println("C");
        } else if (puntaje == 9 ) {
            System.out.println("B");
        }  else if (puntaje == 10 ) {
            System.out.println("A");
        } else {
            System.out.println("R");
        }

        // condicionador switch
        // switch - case
        /*
        switch(condición) {
            case X:
                statements;
                break;
            case Y:
                statements;
            case Z:
                statements;
             case ...:
                statements;
            default:
                other statements;
        }
         */
        int puntajeChar = 9;
        switch (puntajeChar) { // 10
            case 6:
            case 7:
                calificacion = 'D';
                break;
            case 8:
                calificacion = 'C';
                break;
            case 9:
                calificacion = 'B';
                break;
            case 10:
                calificacion = 'A';
                break;
            default:
                calificacion = 'R';
                break;
        }

        System.out.println("La calificación es de: " + calificacion);
    }
}
