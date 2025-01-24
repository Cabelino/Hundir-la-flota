import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Crea la matriz
        ArrayList<ArrayList<Integer>> matriz = new ArrayList<>();

        for(int i = 0; i < 8; i++){
            ArrayList<Integer> fila = new ArrayList<>();
            for(int j = 0; j < 8; j++){
                fila.add(0);
            }
            matriz.add(fila);
        }

        String matrizString = matrizString(matriz);
        System.out.println(matrizString);
    }

    public static String matrizString(ArrayList<ArrayList<Integer>> matriz){
        String matrizString = "[A1,A2,A3,A4,A5,A6,A7,A8,A9]\n";
        int contador = 1;
        for(int i = 0; i < matriz.size(); i++){
            matrizString += "B" + contador + matriz.get(i)+"\n";
            contador++;
        }
        return matrizString;
    }



}