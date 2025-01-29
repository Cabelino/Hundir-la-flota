import java.lang.reflect.Array;
import java.util.ArrayList;

public class Funciones {

    public static void Disparo(Jugador jugador, Integer x, Integer y) {

        ArrayList<ArrayList<Integer>> matriz = jugador.getCampoContrario();
        ArrayList<Integer> fila = matriz.get(x);

        if (fila.get(y) == 0) {
            fila.set(y,3);
        }
        else if (fila.get(y) == 1) {
            fila.set(y,2);
            jugador.setBarcosDestruidos(jugador.getBarcosDestruidos() + 1);
        }
        jugador.setCampoContrario(matriz);
    }

    public static void imprimirMatriz(ArrayList<ArrayList<Integer>> matriz) {
        System.out.println("    Campo de batalla");
        for (ArrayList<Integer> fila : matriz) {
            for (Integer num : fila) {
                System.out.printf("%2d ", num);
            }
            System.out.println();
        }
    }

    public static void comprobarVictoria(Intermediario servidor) {
        if(servidor.getJugador1().getBarcosDestruidos() == 20){
            servidor.setVictoria(true);
            System.out.println("El jugador " + servidor.getJugador1().getNombre() +" ha ganado");
        }
        else if(servidor.getJugador2().getBarcosDestruidos() == 20){
            servidor.setVictoria(true);
            System.out.println("El jugador " + servidor.getJugador2().getNombre() +" ha ganado");
        }

    }

    public static ArrayList<ArrayList<Integer>> crearMatriz() {

        // Crea la matriz
        ArrayList<ArrayList<Integer>> matriz = new ArrayList<>();

        for(int i = 0; i < 8; i++){
            ArrayList<Integer> fila = new ArrayList<>();
            for(int j = 0; j < 8; j++){
                fila.add(0);
            }
            matriz.add(fila);
        }
        return matriz;
    }

}