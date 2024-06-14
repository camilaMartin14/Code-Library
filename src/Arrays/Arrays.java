package Arrays;

public class Arrays {
    //sumar dos arrays
    int[] a = {1,2,3,4,5};
    int[] b = {6,7,8,9,10};
    
    int[] c = new int [a.length+b.length];

    //mostrar mapa de array
    static void showMap(char seats[][]) {
        for(int r = 0; r < seats.length; r++) {
            System.out.print(r + " ");
            
            for(int c = 0; c < seats[0].length; c++) {
                System.out.print("[" + seats[r][c] + "]");
            }
            
            System.out.println("");
        }
    }
}
