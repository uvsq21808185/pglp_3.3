
public class RobotStatique {
	/* La position de robot
	 * 
	 */
	private int position;
	/* Le constructeur de la classe RobotStatique
	 * 
	 */
	public RobotStatique(int position) {
		this.position=position;
	}
	/* Le robot statique ne peut pas avancer donc renvoyer une exception
	 * 
	 */
	public void avance() {
		throw new UnsupportedOperationException();
	}
	/* Solution 2 : 
	 * on peut pas implémenter la méthode avance dans la classe RobotStatique
	 * puisque le robet n'avance pas donc on peut créer une méthode vide
	 */
	public void avance2() {
	}
}
