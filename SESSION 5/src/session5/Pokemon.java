package session5;

public class Pokemon {
	private String type;
	private String name;
	private int att;
	private int hp;
	private int exp = 0;
	
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	private int level = 0;
//	public static int numOfPokemon = 0;
	private static int numOfPokemon = 0;
	
	public static void showNumOfPokemonCreated() {
		System.out.println("Number of Pokemon Created = " + numOfPokemon);
	}
	
	// constructor -> set object's attribute values
	public Pokemon() {
//		numOfPokemon++;
		type = "unknown";
		name = "unknown pokemon";
		att = 2;
		hp = 10;
		exp = 0;
		level = 0;
	}

	public Pokemon(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public Pokemon(String name, String type, int hp, int att) {
		this(name, type); // Call method aboves (constructor that has 2 string args)
		this.hp = hp;
		this.att = att;
		numOfPokemon++;
	}
	
	//method attack using currect obj and targeted obj
	public void attack(Pokemon enemyObject) {
		if(this.isAlive() == false) return;
		
		System.out.println(this.name + " attacks " + enemyObject.name);
		enemyObject.hp -= this.att;
		if(enemyObject.isAlive()) {
			System.out.println(enemyObject.hp + " hp left");		
		} else {
			System.out.println(enemyObject.name + " fainted");
		}
	}
	
	public boolean isAlive() {
		return this.hp > 0;
	}
}
