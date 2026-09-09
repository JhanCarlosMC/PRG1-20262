package co.edu.uniquindio.persona;

public class Persona {
    //Atributos
    private String cedula; //Identificador Unico
    private String nombre;
    private int edad;
    private double altura;

    //Metodo Constructor
    public Persona(String cedula, String nombre,
                   int edad, double altura){
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    //Metodos
    public void respirar(String datoEntrada){
        //Codigo
    }

    public int caminar(){
        //Codigo
        return 0;
    }
    //Metodos Get - Obtener
    public String getCedula(){
        return cedula;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public double getAltura(){
        return altura;
    }

    //Metodos Set - Asignar
    public void setCedula(String cedula){
        this.cedula = cedula;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
}
