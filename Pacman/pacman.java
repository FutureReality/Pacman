//1. Primero vamos a crear el "Mapa"
//1.1. Para crear el mapa usaremos una matriz
//1.2. Por el momento el mapa solo se muestra
//2. Despues deberemos agregar a pacman
//3. Posteriormente agregamos los fantasmas
//3.1. Reutilizamos codigo de pacman para estos
//4. Agregaremos los recogibles
//5. Y los puntos raros de poderes
//6. Caracteres: Pacman, Pinky, Blinki,Inky, Clyde
 

public class pacman() {
	
	//Declaramos las variables
	private int posX;
	private int posY;
	private int puntuacion;
	private int vida;

	//ahora hacemos elconsttructor
	public Pacman(int iniPosX, int iniPosY) {
		this.posX = iniPosX;
		this.posY = iniPosY;
		this.puntuacion = 0;
		this.vida = 3;
	}

	//ahora agregariamos el metodo par que pacman pudiera cambiar su posicion
	//anterior por una nueva.
	
	public void move(int newPosX, int newPosY) {
		this.posX = newPosX;
		this.posY = newPosY;
		//Esto cambia la posicion actual por una nueva "esto se haria tomando
		//el input del teclado"
	}
	
	//Este seria el metodo para la recoleccion de las bolas
	
	public void pickupBola() {
		
		this.puntuacion += 1;
	}
	
	//La bola especial actua parecido a la normal
	public void pickupBolaEspecial() {
		
		this.puntuacion += 10;
	}
	
	//La fruta tambien actua parecido a las bolas
	public void pickupFruita() {
		
		this.puntuacion += 100;
	}

	//Metodo para que pierda una vida

	public void lostLife() {
		
		this.vida--;
	}
	
	//Se comparan las posiciones X e Y de pacman y de los fantasmas,
	//si coinciden entonces se llama al metodo lostlife
	
	public void detectColisionFantasma(Fantasma fantasma) {
	
		if (this.posX == fantasma.getPosX() && this.PosY == fantasma.getPosY()) {
			
			lostLife();
			
		}
		
	}

}