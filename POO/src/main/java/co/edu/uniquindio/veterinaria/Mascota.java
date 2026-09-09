package co.edu.uniquindio.veterinaria;

public class Mascota {
    //Atributos
    private String id;
    private String nombre;
    private String raza;
    private String especie;
    private int edad;
    private String nombrePropierario;
    private String numContacto;

    //Constructor
    public Mascota(String id, String nombre, String raza,
                   String especie, int edad, String nombrePropierario,
                   String numContacto){
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.especie = especie;
        this.edad = edad;
        this.nombrePropierario = nombrePropierario;
        this.numContacto = numContacto;
    }

    //Getters and Setters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombrePropierario() {
        return nombrePropierario;
    }

    public void setNombrePropierario(String nombrePropierario) {
        this.nombrePropierario = nombrePropierario;
    }

    public String getNumContacto() {
        return numContacto;
    }

    public void setNumContacto(String numContacto) {
        this.numContacto = numContacto;
    }
}
