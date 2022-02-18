/*Autor: Alma Dimas Sanchez
Materia: Computación en Java
 */

//Se crea clase contacto para guardar los datos del contacto (nombre y telefono)

public class Contacto {
    private String nombre;
    private String telefono;

    public Contacto(String n, String t){
        this.nombre=n;
        this.telefono=t;

    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
}