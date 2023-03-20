package Clase03Ejercicios01c;

public class Main {

    public static void main(String[] args) {
        //1c. Dado un vector de números, y un número X, que sume todos los números > X y retorne el resultado
        //3. Realizar el ejercicio 1 (De esta misma guía) enviando los valores por parámetro.
        int vectorNumeros[] = {25,36,41,97,15,66,11,78,1,28};
        int numeroX = 56;

        System.out.println("Suma de números mayores al número X: "+suma(vectorNumeros,numeroX));
    }

    public static int suma(int vector[], int x){
        int suma = 0;
        for (int i = 0; i < 10; i++) {
            if(vector[i] > x){
                suma += vector[i];}
        }
        return suma;
    }
}
