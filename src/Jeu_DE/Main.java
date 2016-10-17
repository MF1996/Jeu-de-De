package Jeu_DE;

public class Main {
	public static void main(String[] args) {

		De d = new De();

		Joueur jo[] = new Joueur[4];
		int indice = 0;
		for (int count = 0; count <= 3; count++) {

			jo[count] = new Joueur();

		}
		for (int tour = 1; tour <= 10; tour++) {

			System.out.println("tour n°:" + tour);
			int count = 0;
			for (; count <= 3; count++) {

				jo[count].cluScor(d.lancerDe());
				System.out.println("joueur" + (count + 1) + " a   " + jo[count].getScore());
			}
			int max = jo[0].getScore();
			count--;
			while (count > 0) {
				if (jo[count].getScore() > max) {
					max = jo[count].getScore();
					indice = count;
				}
				count--;
			}

		}
		System.out.println("================");
		System.out.println("le gangant est " + (indice + 1) + " joueur  avec un score de " + jo[indice].getScore());
	}

}
