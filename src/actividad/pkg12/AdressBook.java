package actividad.pkg12;
import java.util.*;
public class AdressBook {
    HashMap <String,String> agenda = new HashMap <>(); 
    String name, phone;
        Scanner n = new Scanner(System.in);
        Scanner t = new Scanner(System.in);
   
    public void List(){
        
        for(Map.Entry<String, String> entry:agenda.entrySet() ){
        System.out.println("Contactos\n");
        System.out.println("{" + entry.getKey()+ "}"+ "{"+ entry.getValue() +"}");
        }
    }
    
    
    public void Create(){
                

        System.out.println("Escribe el nombre");
        name = n.next();
        System.out.println("Escribe el numero de telefono");
        phone = t.next();

        if(!agenda.containsKey(name)){
        agenda.put(name, phone);
        System.out.println("Se guardo el contacto");
        }else {
        System.out.println("Ya existe el contacto\n");
        }
    }
    
    public void Delete(){
               
        System.out.println("Ingresa el numero de telefono");
        phone = t.next();
        if (agenda.containsKey(phone)){
        agenda.remove(phone);
        System.out.println("Ya se borro el contacto");
        }else{
        System.out.println("El contacto no existe\n");
        }
        }
    
        public void Load(){
        
    }
    
    public void Save(){
        
    }Z
}

