/* Autor: Alma Dimas Sanchez
Materia: Computación en Java*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBook {
    //Se usa un hashmap para que almacene los contactos
    public static HashMap<String, Contacto> contactos = new HashMap<String, Contacto>();


        public static void Create(){
            Scanner sc = new Scanner(System.in);
            String nombre, telefono;
            System.out.println("Cual es el nombre completo del nuevo contacto?");
            nombre = sc.nextLine();
            System.out.println("Cual es el telefono de casa del contacto?");
            telefono = sc.nextLine();
            contactos.put(telefono, new Contacto(nombre, telefono));
            System.out.println("Se ha creado nuevo contacto");

        }
            //metodo List para para mostrar los contactos del AddressBook
    public static void List() {
        for (Map.Entry<String, Contacto> item : contactos.entrySet()) {
            System.out.println("Nombre: " + item.getValue().getNombre());
            System.out.println("Telefono: " + item.getValue().getTelefono() + "\n");

        }
    }
            //metodo Delete para eliminar un contacto del AddressBook
    public static void Delete() {
        Scanner sc = new Scanner(System.in);
        String telefono;
        System.out.println("Cual es el telefono del contacto que desea borrar?");
        telefono = sc.nextLine();
        if(contactos.containsKey(telefono)){
            contactos.remove(telefono);
            System.out.println("Contacto borrado");
        }else{
            System.out.println("El contacto con ese numero no existe");
        }
    }
                //metodo main con el menu de elección
         public static void main (String [] args){
             boolean salir=false;
            String opcion;
            Scanner sc = new Scanner(System.in);

            //Se crea while loop hasta que se seleccione la opcion de salir del programa (salir = true).
             while(!salir) {
            System.out.println("Escriba el numero de acuerdo al menu");
            System.out.println("1   Crear contacto");
            System.out.println("2   Mostrar lista de contactos");
            System.out.println("3   Borrar contacto");
            System.out.println("4   Salir");
                opcion = sc.nextLine();

                //se crea condicional para las opciones del menu
                    if (opcion.equals("1")) {
                        System.out.println("1  Crear Contacto");
                        Create();
                    }else if (opcion.equals("2")) {
                        System.out.println("2   Mostrar lista de contactos");
                        List();
                    }else if (opcion.equals("3")) {
                        System.out.println("3  Borrar contacto");
                        Delete();
                    }else if (opcion.equals("4")) {
                        System.out.println("4  Salir del programa");
                        salir = true;
                    }else{
                        System.out.println("Opcion no valida");
                    }
                }
            }
        }



