import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner cin = new Scanner (System.in);
        int[] array = {5,8,12,19,23,56,78,81,89,92,113,167,204,278,313,319,444,449,489,570,590,604,782};
        int tamanioArreglo = array.length;

        System.out.println("Ingrese el numero que desea buscar en el arreglo: ");
        int numero = cin.nextInt();

        //primero descartamos los extremos del arreglo
        if (array[0] == numero || array[tamanioArreglo-1] == numero){
            System.out.println("El numero se encunetra dentro del arreglo");
        }

    }
}
