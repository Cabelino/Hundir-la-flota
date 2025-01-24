import java.util.ArrayList;

public class Funciones {

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
