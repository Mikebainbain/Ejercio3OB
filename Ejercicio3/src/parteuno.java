// Ejercicio open  bootcamp  Funciones  ejercicios Tema 3
public class parteuno {
    public static void main(String[] args)
    {
        //Llama a la funcion suma con 3 valores
        int resultado;
        resultado = suma(10,20,30);
        System.out.println("La suma de los tres numeros es de: " );
        System.out.println(resultado);

        //Crea una instancia de la clase coche  y le añade una puerta
        Coche miCoche = new Coche();
        miCoche.añadirpuerta();
        System.out.println("El numero de puertas es: ");
        System.out.println(miCoche.puertas);
    }

    public static int suma(int a, int b, int c)
    {
        return a+b+c;
    }

}
//Se crea la clase coche , una variable que tiene eñ numero de puertas y la funcion de agregarle mas puertas
class Coche{
    public int puertas = 4;
    public void añadirpuerta()
    {
        this.puertas++;
    }
}
