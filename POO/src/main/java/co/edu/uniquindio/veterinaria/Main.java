package co.edu.uniquindio.veterinaria;

import javax.swing.*;

public class Main {

    static Mascota[] listaMascotas = new Mascota[1];

    static void main() {
        int option = 0;
       do{
           option = Integer.parseInt(JOptionPane.showInputDialog("Este es el menu de la veterinaria:" +
                   "\n Seleccione una opcion:" +
                   "\n 1. Registrar mascota." +
                   "\n 0. Salir del sistema"));

            switch (option){
                case 1:
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la mascota:");
                     String raza = JOptionPane.showInputDialog("Ingrese la raza de la mascota: ");
//                     String especie;
//                     int edad;
//                     String nombrePropierario;
//                     String numContacto;
                    Mascota nuevaMascota = new Mascota("1", nombre, raza, "", 12 ,"","");
                    boolean resultado = registrarMascota("1",nuevaMascota);

                    if (resultado){
                        JOptionPane.showMessageDialog(null,"Registro exitoso");
                    }else{
                        JOptionPane.showMessageDialog(null, "No se hizo el registro");
                    }

                    break;

                case 0:
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "La opcion no es valida");
                    break;
            }

       }while (option != 0);

    }

    //Registrar la informacion de las mascotas
    public static boolean registrarMascota(String idNuevaMascota, Mascota nuevaMascota){
        for (int i = 0; i < listaMascotas.length; i++) {
            if(listaMascotas[i] == null){
                listaMascotas[i] = nuevaMascota;
                return true;
            }
        }
        return false;
    }
    //Mostrar la informacion de las mascotas

    //Actualizar la informacion de las mascotas
    //Eliminar la informacion de las mascotas
}
