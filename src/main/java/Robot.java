import javax.swing.text.Position;

public class Robot {
	
	public int position;
	
	public Robot(int position) {
		this.position=position;
	}
	
	public void avance()
	{
		this.position+=100;
		
	}
	
	public void avancerTous()
	{
		System.out.println("Le robot avance/vole plus vite :) !");
		
	}
	

}
