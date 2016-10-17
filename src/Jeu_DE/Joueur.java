package Jeu_DE;

public class Joueur {

	private int score;

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int cluScor(int d) {
		score = getScore() + d;
		return score;

	}

}
