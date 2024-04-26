//1. Primero vamos a crear el "Mapa"
//1.1. Para crear el mapa usaremos una matriz
//1.2. Por el momento el mapa solo se muestra
//2. Despues deberemos agregar a pacman
//3. Posteriormente agregamos los fantasmas
//3.1. Reutilizamos codigo de pacman para estos
//4. Agregaremos los recogibles
//5. Y los puntos raros de poderes
//6. Caracteres: Pacman, Pinky, Blinki,Inky, Clyde
 

public class fantasma() {
	
	//Declaramos las variables
	private int posX;
	private int posY;

	//ahora hacemos elconsttructor
	public Fantasma(int iniPosX, int iniPosY) {
		this.posX = iniPosX;
		this.posY = iniPosY;

	}

	//ahora agregariamos el metodo par que pacman pudiera cambiar su posicion
	//anterior por una nueva.
	
	public void move(int newPosX, int newPosY) {
		this.posX = newPosX;
		this.posY = newPosY;
		//Esto cambia la posicion actual por una nueva "esto se haria tomando
		//el input del teclado"
	}

}
