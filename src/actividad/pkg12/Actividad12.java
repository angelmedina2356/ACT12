package actividad.pkg12;
import java.util.*;
import java.io.*;

public class Actividad12 {
  
    public static void main(String[] args) {
        int men;
        int contador;
        Scanner sal = new Scanner(System.in);
        String continuar = "Si";
        AdressBook menu = new AdressBook();
        
        while(continuar.equalsIgnoreCase("Si")){
        Scanner key = new Scanner(System.in);
        System.out.println("Bienvenido al sistema Agenda telefonica");
        System.out.println("Por favor selecciona una de las siguientes opciones para comenzar");
        System.out.println("1 = Ver agenda telefonica");
        System.out.println("2 = Añadir un nuevo contacto a la agenda");
        System.out.println("3 = Borrar un contacto de la agenda");
        men = key.nextInt();
        
        switch (men) {
            case 1:
                menu.List();
                break;
            case 2:
                menu.Create();
                break;
            case 3:
                menu.Delete();
                break;
            default:
                System.out.println("Elegiste una opcion erronea");
               break;
        }
        
        System.out.println("¿Quieres continuar con el programa?");
        continuar = sal.next();
        }
        
        System.out.println("El programa a terminado");
    }   
}
