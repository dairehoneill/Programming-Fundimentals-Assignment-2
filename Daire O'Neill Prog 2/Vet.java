public class Vet
    {
        // initialise instance variables
        private Animal[] animal;
        private int total;
        
        
        //constructors
        public Vet(int sizeIn)
        {
            animal = new Animal[sizeIn];
            total = 0;
        }
        
        //print variable
        public int getTotal()
        {
            return total;
        }
        
        //adds animal to array, provided there's space
        public boolean add(Animal animalIn)
        {
            if (isFull() == false)
            {
                animal[total] = animalIn;//calls method from animal
                total++;
                return true;
            }
            else
            {
                return false;
            }
        }
        
        //searches for animal, removes if found
        public boolean remove(String animalIdIn)
        {
            int index;
            index = search(animalIdIn);
            if (index == -999)
            {
                return false;//failed to find animal
            }
            else
            {
                for (int i = index; i < total - 1; i++)
                {
                    animal[i] = animal[i + 1];
                }
                total--;
                return true;
            }
        }
        
        //return if myVet is empty
        public boolean isEmpty()
        {
            return total == 0;
        }
        
        //return if myVet is full
        public boolean isFull()
        {
            return total == animal.length;
        }
    
        public Animal checkOldestAnimal()
        {
            Animal tempNULLAnimal = null;// creates temperary variable for age check
            if (isEmpty() == false)//check if animals are in myVet
            {
                tempNULLAnimal = animal[0];//copys the first entry to temperary variable
                for(int i = 1; i < total; i++)//loops the animal array
                {
                    if(animal[i].getAnimalAge() > tempNULLAnimal.getAnimalAge())// cpmpares if the animal array is bigger than the temperary variable
                    {
                        tempNULLAnimal = animal[i];// replaces the temperary variable with animal entry
                    }
                }
            }
            return tempNULLAnimal;//returns entry
        }
        
        public Animal checkYoungestAnimal()
        {
            Animal tempNULLAnimal1 = null;
            if (isEmpty() == false)
            {
                tempNULLAnimal1 = animal[0];
                for(int i = 1; i < total; i++)
                {
                    if(animal[i].getAnimalAge() < tempNULLAnimal1.getAnimalAge())
                    {
                        tempNULLAnimal1 = animal[i];
                    }
                }
            }
            return tempNULLAnimal1;
        }
        
        //returns a string containing all the animals in the array
        private int search(String animalIdIn)//private, only this class can see this method
        {
            for(int x = 0; x < total; x++)
                {
                if (animal[x].getAnimalId().equals(animalIdIn))
                    {
                        return x;
                    }
            }
            return -999;
        }
               
        public String animalDetails()
        {
            String theanimal = "";
            
            if(isEmpty() == true)
            {
                return theanimal;
            }
            else
            {
                for(int i = 0; i < total; i++) //goes thorugh arrary and finds all the attributes of each object and adds them to a string to return
                {
                    theanimal = theanimal + "Animal Id: " + animal[i].getAnimalId() + "\nAnimal Name: " + animal[i].getAnimalName() + "\nAnimal Type: " + animal[i].getAnimalType() + "\nOwner Name: " + animal[i].getAnimalOwner() + "\nAnimal Age :" + animal[i].getAnimalAge() + "\nYear Registered: " + animal[i].getAnimalReg() + "\nLength of time client :" + animal[i].getLenTimeClient() + "\nAnimal Vaccinations: " + animal[i].getVaccinations() + "\n\n";
                }
                return theanimal;
            }
        }
        
         public Animal animalOneDetails(String animalId)
        {
            int index;
            index = search(animalId);
            if(index == -999)
            {
                return null;// indicated invalad index
            }
            else
            {
                return animal[index];
            }
        }
        
        public String upDatelenTimeClient()
        {
            Animal.setLenTimeClient();
            return "All information is updated";
        }
        
        public boolean addDetails(String animalId, boolean animalVacIn)
        {
            int index;
            index = search(animalId);
            if (index == -999)
            {
                return false;
            }
            else
            {
                animal[index].setAnimalVac(animalVacIn);//sets vaccine to true or false
                return true;
            }
        }   
        
        public boolean setVac(boolean animalVacIn)           
        {
            boolean vacx;
            vacx = animalVacIn;
            if (vacx = true)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
                
}
    
        
        
        
       
            
    
                    
        
        
        
        
        
        
        
        
