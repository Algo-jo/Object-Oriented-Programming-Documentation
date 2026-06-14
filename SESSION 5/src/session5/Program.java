package session5;

public class Program {

	public static void main(String[] args) {
		// Make 2 Pokemon object from Pokemon Class
		
		Pokemon.showNumOfPokemonCreated();
//		System.out.println("Num of pokemon: " + Pokemon.numOfPokemon);
		Pokemon p1 = new Pokemon("Pikachu", "Electric", 15, 3);
		Pokemon p2 = new Pokemon("Bulbasaur", "Plant", 14, 2);
		Pokemon.showNumOfPokemonCreated();
//		System.out.println("Num of pokemon: " + Pokemon.numOfPokemon);
		
		while(p1.isAlive() && p2.isAlive()) {
			p1.attack(p2);
			System.out.printf("Enemy has %d hp left..\n", p2.getHp());
			p2.attack(p1);
		}
		System.out.println("Game Over...");
	}
}
