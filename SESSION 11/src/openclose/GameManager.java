package openclose;

import java.util.ArrayList;

public class GameManager {
	private ArrayList<Enemy> enemies;
	public GameManager() {
		enemies = new ArrayList<>();
		enemies.add(new Ferdy_Sambo());
		enemies.add(new Jurike());
	}
	public void startGame() {
		for(Enemy enemy : enemies) {
			enemy.roam();
//			if(enemy instanceof Bahlil) {
//				enemy.x = enemy.x + 1;
//			}
//			else if(enemy instanceof Ferdy_Sambo) {
//				enemy.x = enemy.x + 4;
//			}
//			else if(enemy instanceof Jurike) {
//				enemy.x = enemy.x + 2;
//				enemy.y = enemy.y + 4;
//			}
		}
	}
}
