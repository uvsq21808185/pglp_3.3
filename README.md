# pglp_3.3 Illustration du principe de substitution de Liskov (LSP)

1) Cette solution ne respecte pas le principe LSP, car si on remplace une instance de Robot par RobotStatique il va y avoir une erreur(un comportement innatendu pour l'utilisateur), donc dans ce cas là le principe LSP n'est pas respecté.
Un RobotStatique ne bouge pas (il est immobile) donc on a lancé une exception dans la méthode avance() dans la classe RobotStatique :

		public void avance() {
		throw new UnsupportedOperationException();
	}

ou bien on implémente une autre méthode avance2() vide dans la classe RobotStatique :

		public void avance2() {
	}

Ce qui entraine qu'on ne peut pas remplacer une instance de robot par robotStatique sans altérer le comportement.

2) Implémentons la méthode avancerTous qui fait avancer/voler tous les robots:

        
	public void avancerTous()
	{
		System.out.println("Le robot avance/vole plus vite :) !");
		
	}
        
              
3) Proposons une solution respectant LSP:

  -Créons d'abord une la classe Robot (on peut utiliser une interface aussi) : 
                                                                                                        
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
        
   -Créons la classe robotStatique :

   
        public class RobotStatique {
	/* La position de robot
	 * 
	 */
	private int position;
	/* Le constructeur de la classe RobotStatique
	 * 
	 */
	public RobotStatique(int position) {
		this.setPosition(position);
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
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
}

-Puis créons une classe Robot_Lent (un type de robot) qui hérite de la classe ou l'interface Robot :

public class Robot_Lent extends Robot {
	/*
	 * Le Constructeur de la classe Robot_Lent
	 */
	public Robot_Lent(int position) {
		super(position);
	}
	
	/*
	 * Une méthode pour que le robot avance lentement ( 2 au lieu de 100)
	 */

	public void avance()
	{
		super.position+=2;
	}

	}

-Ensuite créons une deuxième classe classe Robot_volant (un autre type de robot) qui hérite aussi de la classe ou l'interface Robot :


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

 