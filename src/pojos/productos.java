
package pojos;

public class productos {
    int id_cerveza;
    String nombre;
    int mililitros;
    String cant_alcohol;
    
    
    public productos(){}

    public productos(int id_cerveza, String nombre, int mililitros, String cant_alcohol) {
        this.id_cerveza = id_cerveza;
        this.nombre = nombre;
        this.mililitros = mililitros;
        this.cant_alcohol = cant_alcohol;
    }

    public int getId_cerveza() {
        return id_cerveza;
    }

    public void setId_cerveza(int id_cerveza) {
        this.id_cerveza = id_cerveza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMililitros() {
        return mililitros;
    }

    public void setMililitros(int mililitros) {
        this.mililitros = mililitros;
    }

    public String getCant_alcohol() {
        return cant_alcohol;
    }

    public void setCant_alcohol(String cant_alcohol) {
        this.cant_alcohol = cant_alcohol;
    }
    
    
    
   
    
}
