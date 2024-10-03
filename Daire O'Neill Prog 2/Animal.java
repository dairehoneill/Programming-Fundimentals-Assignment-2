public class Animal//public, all classes can see this class
{
    // instance variables
    private String animalId;
    private String animalType;
    private String animalOwner;
    private String animalName;
    private int animalAge;
    private boolean animalVac;
    private int animalReg;
    private static int lenTimeClient;
   
   //the methods 
   //constructor
   public Animal( String animalIdIn, String animalTypeIn, int animalAgeIn, String animalNameIn, String animalOwnerIn, int animalRegIn)
   {
        animalId = animalIdIn;
        animalType = animalTypeIn;
        animalName = animalNameIn;
        animalAge = animalAgeIn;
        animalOwner = animalOwnerIn;
        animalReg = animalRegIn;
        animalVac = false;
        Animal.lenTimeClient = 0;
   }
   
   // methods to set/call animal id
   public String getAnimalId()
   {
       return animalId;
   }
   
   public void setAnimalId(String animalIdIn)
   {
        animalId = animalIdIn;
   }
      
   public String getAnimalType()
   {
       return animalType;
   }
   
   public void setAnimalType(String animalTypeIn)
   {
       animalType = animalTypeIn;
   }
    
   public String getAnimalName()
   {
       return animalName;
   }
   
   public void setAnimalName(String animalNameIn)
   {
       animalName = "";//sets to empty
       animalName = animalNameIn;
   }
    
   public String getAnimalOwner()
   {
       return animalOwner;
   }
   
   public void setAnimalOwner(String animalOwnerIn)
   {
       animalOwner = "";
       animalOwner = animalOwnerIn;
   }
   
   public int getAnimalAge()
   {
       return animalAge;
   }
   
   public void setAnimalAge(int animalAgeIn)
   {
       animalAge = 0;//sets to zero
       animalAge = animalAgeIn;
   }
   
   public boolean getVaccinations()
   {
       return animalVac;
   }
    
   public void setAnimalVac(boolean animalVacIn)
   {
       animalVac = false; //sets to false
       animalVac = animalVacIn;
   }
   
   public int getAnimalReg()
   {
       return animalReg;
   }
    
   public void setAnimalReg(int animalRegIn)
   {
       animalReg = animalRegIn;
   }
   
   public static int getLenTimeClient()
   {
       return Animal.lenTimeClient;
   }
    
   public static void setLenTimeClient()
   {
       ++Animal.lenTimeClient;//adds time everytime its set
   }   
   
}//class ends