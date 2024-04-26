//1. Primero vamos a crear el "Mapa"
//1.1. Para crear el mapa usaremos una matriz
//1.2. Por el momento el mapa solo se muestra
//2. Despues deberemos agregar a pacman
//3. Posteriormente agregamos los fantasmas
//3.1. Reutilizamos codigo de pacman para estos
//4. Agregaremos los recogibles
//5. Y los puntos raros de poderes
//6. Caracteres: Pacman, Pinky, Blinki,Inky, Clyde
 
public class mapa {
    public static void main(String[] args) {
        char[][] mapa = new char[5][5];
        
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                mapa[i][j] = 'X';
            }
        }
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                System.out.print(mapa[i][j] + " ");
            }
            System.out.println();
        }
    }
}