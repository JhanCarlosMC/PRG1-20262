package co.edu.uniquindio;

public class Main {
    static void main() {
        IO.println(parImpar(10));
        IO.println(parImparV2(10));
        IO.println(parImparV3(10));

        int[] numeros = {1,2,3,4,5};

        int[] resultadoArreglo = revertirArreglo(numeros);

        for (int i = 0; i < numeros.length; i++){
            IO.print(" " + numeros[i] + " ");
        }
        IO.println("");
        for (int i = 0; i < resultadoArreglo.length; i++){
            IO.print(" " + resultadoArreglo[i] + " ");
        }
    }

    public static boolean parImpar(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean parImparV2(int n) {
        boolean resultado = false;
        if (n % 2 == 0) {
            resultado = true;
        }
        return resultado;
    }

    public static boolean parImparV3(int n) {
        return (n % 2 == 0) ? true : false;
    }

    public static int[] revertirArreglo(int[] arregloNumeros){
        int[] arregloInvertido = new int[arregloNumeros.length];
        int finalArreglo = arregloInvertido.length-1;
        for (int i = 0; i < arregloNumeros.length; i++){
            arregloInvertido[i] = arregloNumeros[finalArreglo];
            finalArreglo--;
        }
        return arregloInvertido;
    }
}
