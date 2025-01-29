
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Inicializa el servidor
        Intermediario servidor = new Intermediario();

        // Crea la matriz
//        ArrayList<ArrayList<Integer>> matriz = Funciones.crearMatriz();

        // Campo J1
        ArrayList<ArrayList<Integer>> matrizJ1 = new ArrayList<>(
                Arrays.asList(
                        new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0)),
                        new ArrayList<>(Arrays.asList(0, 0, 1, 1, 1, 1, 0, 0)),
                        new ArrayList<>(Arrays.asList(1, 0, 0, 0, 0, 0, 0, 1)),
                        new ArrayList<>(Arrays.asList(0, 0, 1, 1, 1, 0, 0, 0)),
                        new ArrayList<>(Arrays.asList(0, 1, 0, 0, 0, 0, 1, 1)),
                        new ArrayList<>(Arrays.asList(0, 1, 0, 0, 0, 0, 0, 0)),
                        new ArrayList<>(Arrays.asList(0, 1, 0, 1, 1, 0, 1, 1)),
                        new ArrayList<>(Arrays.asList(0, 0, 1, 0, 0, 1, 0, 0))

                ));

        // Campo J2
        ArrayList<ArrayList<Integer>> matrizJ2 = new ArrayList<>(
                Arrays.asList(
                        new ArrayList<>(Arrays.asList(0, 1, 1, 1, 1, 0, 0, 0)),
                        new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0)),
                        new ArrayList<>(Arrays.asList(0, 1, 1, 1, 0, 1, 1, 0)),
                        new ArrayList<>(Arrays.asList(1, 0, 0, 0, 0, 0, 0, 1)),
                        new ArrayList<>(Arrays.asList(1, 0, 1, 1, 0, 0, 0, 1)),
                        new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 1)),
                        new ArrayList<>(Arrays.asList(0, 1, 0, 0, 0, 1, 0, 0)),
                        new ArrayList<>(Arrays.asList(0, 0, 1, 0, 1, 0, 0, 0))
                ));

        // Crear jugador 1
        Jugador jugador1 = new Jugador("Los xavales");
        jugador1.setCampoContrario(matrizJ2);
        jugador1.setCampoPropio(matrizJ1);

        // Crear Juagador 2
        Jugador jugador2 = new Jugador("Celeste");
        jugador2.setCampoContrario(matrizJ1);
        jugador2.setCampoPropio(matrizJ2);

        // Asignar jugadores al servidor
        servidor.setJugador1(jugador1);
        servidor.setJugador2(jugador2);

        int contador = 0;
        while(!servidor.isVictoria()){

            Random random = new Random();

            int valorXJ1 = random.nextInt(8);
            int valorYJ1 = random.nextInt(8);

            Funciones.Disparo(servidor.getJugador1(), valorXJ1, valorYJ1);

            int valorXJ2 = random.nextInt(8);
            int valorYJ2 = random.nextInt(8);

            Funciones.Disparo(servidor.getJugador2(), valorXJ2, valorYJ2);
            contador++;
            Funciones.comprobarVictoria(servidor);

        }


        Funciones.imprimirMatriz(jugador1.getCampoContrario());
        System.out.println("\n");
        Funciones.imprimirMatriz(jugador2.getCampoContrario());

        System.out.println("\n" + "El numero de jugadas ha sido: " + contador);
    }
}