import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
   // public static void main(String[] args) {
        //1. Contador simple (for): Ingresa un número N y muestra los números del 1 al N.

//        Scanner sc = new Scanner(System.in);
//        System.out.printf("Ingresa un numero: ");
//
//        int numero = sc.nextInt();
//
//        for (int i = 0; i <= numero; i++) {
//
//            System.out.println("Los números son = " + i);
//        }

        //2. Cuenta regresiva (for): Ingresa un número N y muestra una cuenta atrás desde N hasta 1.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingresa un número: ");
//
//        int num = sc.nextInt();
//
//        for (int i = num; i >= 1; i--) {
//            System.out.println("Los números son: "+ i);
//        }

        //3. Tabla de multiplicar (for): Ingresa un número y muestra su tabla de multiplicar del 1 al 10.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingresa un número:");
//
//        int num = sc.nextInt();
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(num + " x " + i + " = " + num * i);
//
//        }
//        //4. Sumatoria (for): Ingresa un número N y calcula la suma de los números del 1 al N.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingresa un número:");
//
//        int num = sc.nextInt();
//
//        for (int i = 1; i <= num; i++) {
//            System.out.println(num + "+" + i + "=" + (num+i);
//        }
        //5. Números pares (while): Ingresa un número N y muestra los números pares desde 1 hasta N.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingresa un número:");
//
//        int num = sc.nextInt();
//        int i = 1;
//
//        while(i<=num){
//            if (i%2==0){
//            System.out.println(i);
//        }
//            i++;
//            }
        //6. Adivinar número (while): Ingresa un número secreto y deja que el usuario adivine hasta
        //acertar.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingresa un número: ");
//
//        int numSecreto = 5;
//        int numUsuario = sc.nextInt();
//
//        while(numSecreto != numUsuario){
//            System.out.println("Intente otra vez:");
//            numUsuario = sc.nextInt();
//        }
//            System.out.println("Número correcto!");

        //7. Menú repetitivo (do-while): Muestra un menú simple con opciones hasta que el usuario elija
        //salir.

//        public class Main {
//            public static void main(String[] args) {
//
//                Scanner sc = new Scanner(System.in);
//                int eleccion;
//                do {
//                    System.out.println("    MENU    ");
//                    System.out.println("1 - Entradas");
//                    System.out.println("2 - Plato principal");
//                    System.out.println("3 - Postre");
//                    System.out.println("0 - Salir");
//
//
//                    System.out.println("Elija una opción: ");
//                    eleccion = sc.nextInt();
//
//
//                } while (eleccion != 0);
//            }
//        }

//public class Main {
//    public static void main(String[] args) {
//
//        //8. Suma hasta cero (do-while): Ingresa números y súmalos hasta que se ingrese un cero.
//
//        Scanner sc = new Scanner(System.in);
//        int num;
//        int soma = 0;
//
//        do {
//            System.out.println("Ingrese el numero: ");
//            num = sc.nextInt();
//            System.out.println(soma += num);
//
//        } while (num != 0);
//            System.out.println("Resultado: " + soma);
//    }
//
//}
//        public class Main {
//            public static void main(String[] args) {
//
//                //9. Validar contraseña (while): Pide una contraseña hasta que el usuario escriba la correcta.
//
//                Scanner sc = new Scanner(System.in);
//
//                String contrasenaValida = "1234@";
//                String contrasenaUsuario;
//
//                do {
//                    System.out.print("Contraseña: ");
//                    contrasenaUsuario = sc.nextLine();
//                    if (!contrasenaUsuario.equals(contrasenaValida)){
//                        System.out.println("Contraseña incorrecta");
//                    }
//                }
//                while (!contrasenaUsuario.equals(contrasenaValida));{
//                }
//                System.out.println("Contraseña correcta");
//            }
//        }
//        public class Main {
//    public static void main(String[] args) {
//
//    //10. Números impares (for): Ingresa un número N y muestra los impares desde 1 hasta N
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingresa un número: ");
//
//        int num = sc.nextInt();
//
//        for (int i = 1; i<=num; i++) {
//            if (i%2!=0) {
//                System.out.println(i);
//            }
//        }
//    }
//}
                                            //LISTA 2 -BUCLES
// Ejercicio 1: Calculadora de Interés Compuesto (for)
//Escenario: Trabajas para un banco y necesitas crear una herramienta que permita a los
//clientes proyectar sus ahorros. La herramienta debe calcular cómo crecerá una inversión
//inicial a lo largo de los años gracias al interés compuesto.
//Tu tarea:
//1. Solicita al usuario tres datos:
//o La cantidad inicial de dinero a invertir (ej: 1000€).
//o La tasa de interés anual en porcentaje (ej: 5%).
//o El número de años que mantendrá la inversión (ej: 10 años).
//2. Usa un bucle for que se ejecute una vez por cada año de la inversión.
//3. En cada iteración, calcula el interés ganado ese año y súmalo al total. La fórmula
//para el interés de un año es: saldo_actual * (tasa_de_interes / 100).
//4. Muestra por pantalla un resumen anual, indicando el año y el saldo total al final
//de ese año.
//Ejemplo de salida:
//Año 1: Saldo de 1050.00€
//Año 2: Saldo de 1102.50€
//...
//Año 10: Saldo de 1628.89€

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Dinero a investir: ");
                double dineroInvestido = sc.nextInt();

            System.out.println("Tiempo de inversion: ");
                int tiempoInversion = sc.nextInt();

            System.out.println("Tasa de interes: ");
                double tasaInteres = sc.nextInt();

           double saldoActual = dineroInvestido;

            for(int i = 1; i <= tiempoInversion; i++){
                double interes = saldoActual * (tasaInteres/100);
                saldoActual += interes;
                System.out.println("Año " + i + ": Saldo de " + interes);
            }
        }
    }

    //Ejercicio 2: El Cajero Automático Interminable (while)
//Escenario: Estás programando el software de un cajero automático. El cajero debe
//permitir al usuario retirar dinero mientras tenga saldo suficiente. El programa no sabe
//cuántas veces el usuario querrá retirar dinero, por lo que debe continuar hasta que el
//usuario decida salir o se quede sin fondos.
//Tu tarea:
//1. Pregunta al usuario su saldo inicial (ej: 2000€).
//2. Crea un bucle while que se ejecute mientras el saldo sea mayor que cero y el
//usuario no haya decidido salir.
//3. Dentro del bucle, pregunta al usuario cuánto dinero desea retirar.
//4. Comprueba si tiene saldo suficiente.
//o Si puede retirarlo, resta la cantidad al saldo y muestra el nuevo saldo.
//o Si no puede, muéstrale un mensaje de "Saldo insuficiente".
//5. Pregúntale si desea realizar otra operación (puedes usar un '1' para sí y un '0'
//para no). El bucle debe terminar si el usuario introduce un '0'.

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Saldo inicial: ");
//        double saldoInicial = sc.nextInt();
//        boolean opcion = true;
//
//        while (saldoInicial>=0 && opcion==true){
//            System.out.println("Valor a retirar: ");
//
//            if
//
//
//        }
//
//
//    }
//}
