import java.util.Scanner;

import org.duolingo.lista.Lista;

public class App {
    public static void main(String[] args) throws Exception {
        Boolean salir = false;
        final Scanner SCANNER = new Scanner(System.in);
        String palabra;
        Lista lista = new Lista();
        String opcion = "";

        System.out.println("Bienvenido usuario aqui le dejo con el menu que le explica los que hace cada opcion");

        while (!salir) {

            System.out.println(
                    "1. Añadir palabra :Permite al usuario introducir una palabra que se almacenará en el diccionario. Se mostrará por pantalla un mensaje indicando si la palabra se ha guardado correctamente.");
            System.out.println(
                    "2. Eliminar palabra: Solicita al usuario la palabra que será eliminada del diccionario, mostrando por pantalla un mensaje indicando si la palabra se ha eliminado o si no estaba almacenada.");
            System.out.println(
                    "3. Existe palabra: Solicita al usuario la palabra que se buscará en el diccionario, mostrando por pantalla un mensaje indicando si la palabra se ha encontrado.");
            System.out.println(
                    "4. Mostrar iniciales disponibles: Muestra una lista con todas las iniciales que tienen alguna palabra almacenada.");
            System.out.println(
                    "5. Ver palabras por inicial: Tras solicitar una letra al usuario, muestra todas las palabras almacenadas que empiecen por dicha letra.");
            System.out.println("6. Cerrar programa: Esta opción permite salir del programa.");

            opcion = SCANNER.nextLine();
            switch (opcion) {
                case "1":
                    System.out.println("Que palabra desea añadir?");
                    palabra = SCANNER.nextLine();
                    lista.anadirPalabra(palabra);
                    break;
                case "2":
                    System.out.println("Que palabra desea eliminar");
                    palabra = SCANNER.nextLine();
                    lista.eliminarPalabra(palabra);
                    break;
                case "3":
                    System.out.println("Que palabra necesita ver si existe");
                    palabra = SCANNER.nextLine();
                    lista.encontrarPalabra(palabra);
                    break;
                case "4":
                    System.out.println("Estan son las iniciales que tiene alguna palabra almacenada");
                    lista.mostrarIniciales();
                    break;
                case "5":
                    System.out.println("Por favor escriba la inicial para ver las palabras que contienen");
                    palabra = SCANNER.nextLine();
                    lista.mostrarPalabras(palabra);
                    break;
                case "6":
                    System.out.println("Hasta luego");
                    salir = true;
                    break;
            }
        }
        SCANNER.close();
    }
}
