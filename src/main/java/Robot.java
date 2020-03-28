import javax.swing.text.Position;

public class Robot {
	/* La position initiale de robot
	 * 
	 */
	public int position;
	
	/* Le Constructeur de Robot
	 * 
	 */
	public Robot(int position) {
		this.position=position;
	}
	/* Une méthode pour faire avancer le Robot
	 * 
	 */
	public void avance()
	{
		this.position+=100;
		
	}
	/* Une méthode pour faire avancer Robot tout type de robot
	 * 
	 */
	public void avancerTous()
	{
		System.out.println("Le robot avance/vole plus vite :) !");
		
	}
	

}
