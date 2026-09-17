package co.edu.uniquindio.veterinariados;

public class Duenio {
    private String cedula;
    private String nombre;
    private String numContacto;
    private String direccion;

    private Mascota[] listMascotas;

    public Duenio(String cedula, String nombre,
                  String numContacto, String direccion){
        this.cedula = cedula;
        this.nombre = nombre;
        this.numContacto = numContacto;
        this.direccion = direccion;
        listMascotas = new Mascota[10];
    }

    public String getCedula(){
        return cedula;
    }

    public void setCedula(String cedula){
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumContacto() {
        return numContacto;
    }

    public void setNumContacto(String numContacto) {
        this.numContacto = numContacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Mascota[] getListMascotas() {
        return listMascotas;
    }

    public void setListMascotas(Mascota[] listMascotas) {
        this.listMascotas = listMascotas;
    }
}
