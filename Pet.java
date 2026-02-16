public class Pet 
{

    private String type;
    private String name;
    private int age;

    public Pet() 
    {
        this.type = "Animal";
        this.name = "Pet Name";
        this.age = 1;
    }

    public Pet(String type, String name, int age) 
    {
        this.type = type;
        this.name = name;
        this.age = age;
    }

    public void setType(String type) 
    {
        this.type = type;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public void setAge(int age) 
    {
        this.age = age;
    }

    public String getType() 
    {
        return type;
    }

    public String getName() 
    {
        return name;
    }

    public int getAge() 
    {
        return age;
    }
    
    public String speak() 
    {
        if (type.equalsIgnoreCase("dog")) 
        {
            return "Woof";
        } 
        else if (type.equalsIgnoreCase("cat")) 
        {
            return "Meow";
        } 
        else 
        {
            return "noise";
        }
    }
    public String toString() 
    {
        return "Pet information:\n" +
               "Type: " + type + "\n" +
               "Name: " + name + "\n" +
               "Sound: " + speak() + "\n" +
               "Age:  " + age + "\n";
    }
}