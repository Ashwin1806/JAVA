/*1)Create abstract base class "Game" with 'play()' as abstract method.
From that derive following classes.
Football,Cricket,Tennis
Create a class called as "GamesDemo" (public class)
inside a main method create an array of "Game" (3 elements)
Store objects of Football,Cricket and Tennis respectively.
Now traverse the array and call that Cricket's play() method.
*/
package Assignment;

abstract class Game {
	abstract void play();
}

class Football extends Game {
	void play() {
		System.out.println("Playing Foootball");
	}
}

class Cricket extends Game {
	void play() {
		System.out.println("Playing Cricket");
	}
}

class Tenis extends Game {
	void play() {
		System.out.println("Playing Tenis");
	}
}

public class GameDemo {

	public static void main(String[] args) {
		Game game[] = new Game[3];
		game[0] = new Football();
		game[1] = new Cricket();
		game[2] = new Tenis();
		for (int i = 0; i < game.length; i++) {
			game[i].play();
		}

	}

}
