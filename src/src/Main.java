import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int numerosprimos(int[] matriz){
        int contador = 0;
        int[] primos = new int[matriz.length];
        for(int i = 0; i < matriz.length; i++){
            for (int j = 2; j < matriz[i]-1; j++){
                if(matriz[i] % j == 0){
                    contador++;
                }

            }
        }
        return contador;
    }



    public static void main(String[] args) {

        int primos = 0;

        Scanner sc = new Scanner(System.in);

        Random random = new Random();

        int[] arraynumeros = new int[20];

        for(int i = 0; i < arraynumeros.length; i++){
            arraynumeros[i]= random.nextInt(20)+1;
            System.out.print(arraynumeros[i] + " ");
        }
        System.out.println();
        primos = numerosprimos(arraynumeros);


        System.out.println("Los números primos son: " + primos);



    }


}



