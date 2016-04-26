
public class Session5Assignment2 extends Building{
	
	
	public static void main(String[] args) {
		BuildingGen bbg=new BuildingGen();
		bbg.manPower();
				
		Building bb=new Building();
		bb.manPower();
		
		// TODO Auto-generated method stub

	}

}
class BuildingGen
{
	String BuildingColor()
	{return "Blue";}
	
	void manPower()
	{
		System.out.println("Main Class");
	}
	}

class Building extends BuildingGen
{
	void manPower()
	{
		System.out.println("First Derived Class");
	}
	}
