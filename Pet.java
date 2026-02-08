
public class Pet {
	
private String name;

public Pet()
{
	this.setName("");
}
public void setName(String newName)
{
	this.name = newName;
}
public String getName()
{
	return this.name;
}
public String toString()
{
	String output = "Pet name: ";
	output += this.getName();
	return output;
}

	public static void main(String[] args)
	{
		
		Pet myPet1 = new Pet();
		myPet1.setName("Sookie");
		System.out.println(myPet1.getName());
		System.out.println(myPet1);
		System.out.println("");
		myPet1.setName("Pet Name");
		System.out.println("Pet information:");
		System.out.println(myPet1);
		Pet myPet2 = new Pet();
		myPet2.setName("Thunder");
		System.out.println("Pet information:");
		System.out.println(myPet2);
	}
}
