
public class Robot_volant extends Robot{
	/* Constructeur de la classe Robot_volant
	 * 
	 */
	public Robot_volant(int position) {
		super(position);
	}
	/* Le Robot_Volant n'avance pas mais il peut voler donc renvoyer une exception
	 * et créer une autre méthode qui consciste faire bouger le robot
	 */
public void avance()
{
	throw new UnsupportedOperationException();}


/* Méthode Voler pour le robot_volant
 * 
 */

public void Voler()
{
	System.out.println("Le robot vole  :) !");
	
}
}
