import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner cin = new Scanner (System.in);
        int[] array = {5,8,12,19,23,56,78,81,89,92,113,167,204,278,313,319,444,449,489,570,590,604,782};
        int tamanioArreglo = array.length;

        System.out.print("Ingrese el numero que desea buscar en el arreglo: ");
        int numero = cin.nextInt();
        cin.nextLine();

        //primero descartamos los extremos del arreglo
        if (array[0] == numero || array[tamanioArreglo-1] == numero){
            System.out.println("El numero se encuentra dentro del arreglo");
        }
        else{
            int m = 0;
            int n = tamanioArreglo;
            while (true){
                
                m = n/2;
                if (n % 2 == 1){ //se toma la decision de subir al proximo numero en residuo igual a 1
                    m++; 
                }
                System.out.printf("Valor de m = %d",m);
                if (array[m] == numero) {
                    System.out.println("\nEl numero se encuentra en el arreglo");
                    break;
                } else {
                    n = m;
                    if(array[m] < numero) {

                        int j = 0;
                        System.out.println("\nSe recorre el inicio del arreglo");
                        for (int i = m; i < tamanioArreglo;i++){
                            array[j] = array[i];
                            j++;
                        }


                    } else if (array[m] > numero) {
                        System.out.println("\nSe recorrio el final del arreglo");
                    }
                }
                System.out.println("Presione enter para continuar...");
                String enter = cin.nextLine();
            }
        }
    }
}

