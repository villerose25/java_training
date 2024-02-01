import java.util.function.BinaryOperator;

public class Operadores {

    public static void main(String[] args) {
        // Operadores Aritméticos
        // +, -, *, / y %
        int resultado = 5 + 10;
        int numero1, numero2;
        numero1 = 5;
        numero2 = 10;
        System.out.println("suma: " + resultado);

        // - resta
        resultado = numero2 - numero1;
        System.out.println("resta: " + resultado);

        resultado = numero1 * numero2;
        System.out.println("multiplicacion: " + resultado);

        resultado = numero2 / numero1;
        System.out.println("división: " + resultado);

        // Dividir 10 / 5 = 2 -- Sobra 0, el cero es el módulo
        resultado = 10 % 3; // 3 y sobra 1
        System.out.println("resto ó módulo: " + resultado);

        // OPERADORES Comparación
        // Mayor que (>), Menor que (<): >= y el <=
        // == Igualdad
        // != diferente a?
        boolean condicion = true;
        // número 1 es 5 y número 2 es 10
        condicion = numero1 > numero2;
        System.out.println("Es mayor num1 a num2? " + condicion);

        condicion  = numero1 < numero2;
        System.out.println("Es Menor num1 a num2? " + condicion);

        condicion  = numero1 == numero2;
        System.out.println("Es igual num1 a num2? " + condicion);

        condicion  = numero1 != numero2;
        System.out.println("Es diferente num1 a num2? " + condicion);


        // OPERADOES LÓGICOS
        // AND &&
        // OR ||
        // NOT !
        /*  AND && -- TODO DEBE SER CUMPLIRSE
            0 && 0  -- FALSE 0
            1 && 0  -- FALSE 0
            0 && 1  -- FALSE 0
            1 && 1  -- TRUE 1
        */
        /* OR || -- MIENTRAS UNO COINCIDA / ENCENDIDO
            0 || 0  --  FALSE 0
            1 || 0  -- TRUE 1
            0 || 1  --  TRUE 1
            1 || 1  -- TRUE 1
         */

        /* ! NEGACION
            0 --- ! es igual a 1
            1 --- ! es igual a 0
            FALSE --- !FALSE entonces es TRUE
            TRUE --- !TRUE entonces es FALSE
         */
        boolean manejar;
        int edad = 19;
        boolean tieneLicencia = false;
        boolean tieneCoche = false;

        manejar = edad >= 18 && tieneLicencia && tieneCoche; // TRUE && FALSE ? ENTONCES FALSE
        System.out.println("Puede manejar? " + manejar );

        manejar = edad >= 18 || tieneLicencia;
        System.out.println("Puede manejar CON UN REQUISITO? " + manejar );

        boolean licenciaTramitada = !tieneLicencia;// false = al negarse se convierte en TRUE
        System.out.println("YA tiene licencia " + licenciaTramitada );
    }
}
