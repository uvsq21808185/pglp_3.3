
public class Robot_Lent extends Robot {
	/*
	 * Le Constructeur de la classe Robot_Lent
	 */
	public Robot_Lent(int position) {
		super(position);
	}
	
	/*
	 * Une m�thode pour que le robot avance lentement ( 2 au lieu de 100)
	 */
public void avance()
{
	super.position+=2;
}

}
