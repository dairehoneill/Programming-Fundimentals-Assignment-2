public class VetApplication
{
    //main method
    public static void main(String[]args)
    {
        System.out.print("Enter the maximum number of animals that can be registed in the system: ");
        int size;
        size = EasyScanner.nextInt();//user input max amout of animal in Vet
        Vet myVet = new Vet(size);//calls Vet and sets up object
        int choice;
        do//repeat 1-7 until 8 is chosen
        {
            System.out.println();
            System.out.println("Vet System");
            System.out.println("1. Add an Animal");
            System.out.println("2. Remove an Animal");
            System.out.println("3. Check if Vet System is empty");
            System.out.println("4. Check if Vet System is full");
            System.out.println("5. Add Additional Pet Details");
            System.out.println("6. Animal Details");
            System.out.println("7. Update Animal Length of Time in System");
            System.out.println("8. Exit System");
            System.out.println();
            System.out.println("Please enter choice [1-8 only]: ");
            choice = EasyScanner.nextInt();
            System.out.println();         
            if(choice == 1)
            {
                addAnimal(myVet);//activeates method
            }
            else if (choice == 2)
            {
                removeAnimal(myVet);
            }
            else if (choice == 3)
            {
                checkEmpty(myVet);
            }
            else if (choice == 4)
            {
                checkFull(myVet);
            }
            else if(choice == 5)
            {
                addDetails(myVet);
            }
            else if (choice ==6)
            {
                animalDetails(myVet);
            }

            else if (choice == 7)
            {
                updateLengthTimeClient(myVet);
            }
        }
        while(choice !=8  );//loop ends
        System.out.println("thnk you for using vet system"); 
    }  //main method ends
    
    public static void addAnimal(Vet myVet)
    {
        String aid;
        String atype;
        String aname;
        String oname;
        int aage;
        int areg;
        boolean ok;
        
        System.out.print("Enter animal id: ");
        aid = EasyScanner.nextString();
        
        System.out.print("Enter animal type: ");
        atype = EasyScanner.nextString();
        
        System.out.print("Enter animal name: ");
        aname = EasyScanner.nextString();
        
        System.out.print("Enter owner name: ");
        oname = EasyScanner.nextString();
        
        System.out.print("Enter animal age: ");
        aage = EasyScanner.nextInt();
        
        System.out.print("Enter year animal registered: ");                     
        for(areg = EasyScanner.nextInt(); areg < 1987 || areg > 2019; areg = EasyScanner.nextInt())//user input for int betwen 1987 and 2019
            {
                System.out.print("Please enter a valid year (before 2019 and after 1987)");
            }
        System.out.println();
        
        Animal animal1 = new Animal(aid, atype, aage, aname, oname, areg);
        
        System.out.println(); 
        
        ok = myVet.add(animal1);//object name . method name calls add from Vet
        
        System.out.println();
        
        if (ok == false)//fails if system is full
        {
            System.out.println("Can not add new animal. This system is full");//myVet is full
        }
        else
        {
            System.out.println("New Animal Added");
        }
    }
    
    public static void removeAnimal(Vet myVet)
    {
        boolean ok1;
        
        System.out.print("Enter animal id to remove: ");
        String aidnum = EasyScanner.nextString();
        ok1 = myVet.remove(aidnum);
        if (ok1 == false)
        {
            System.out.println("Cannot delete animal from system - no such animal with id " + aidnum +" exist in the system");//myVet is empty
        }
        else
        {
            System.out.println("Animal with id number " + aidnum + " is removed from the system");
        }
    }
    
    public static void checkEmpty(Vet myVet)
    {
        boolean ok2;
        
        ok2 = myVet.isEmpty();
        
        if(ok2 == true)
        {
            System.out.print("The vet system contains no anmials");
        }
        else
        {
            System.out.print("The vet system is not empty");
        }
    }
    
    public static void checkFull(Vet myVet)
    {
        boolean ok3;
        
        ok3 = myVet.isFull();
        
        if(ok3 == true)
        {
            System.out.print("The vet system is Full and cannot accept new animals");
        }
        else
        {
            System.out.print("The vet system is not full - you can add new animals to the system");
        }
    }
    
    public static void addDetails(Vet myVet)
    {
        String idAD;
        boolean ok4;
        boolean vacAD;
    
        System.out.println();
        System.out.print("Enter animal Id: ");
        idAD = EasyScanner.nextString();  
        
        System.out.print("Enter if vaccinations have been recieved (true or false): ");
        vacAD = EasyScanner.nextBoolean();//user input true/false
        
        ok4 = myVet.addDetails(idAD,vacAD);
        System.out.println();
        
        
        if(ok4 = true)
        {
            myVet.setVac(true);
            System.out.println("Animal details updated");      
        }
        else
        {
            System.out.println("Animal Id " + idAD + " does not exist");
        }
    }
    
    public static void updateLengthTimeClient(Vet myVet)
    {
        String info = myVet.upDatelenTimeClient();
        System.out.println(info);
    }
    
    private static void animalDetails(Vet myVet)
    {
        System.out.println();
        System.out.println("Vet System");
        System.out.println("1. Add an Animal");
        System.out.println("2. Remove an Animal");
        System.out.println("3. Check if Vet System is empty");
        System.out.println("4. Check if Vet System is full");
        System.out.println("5. Add Additional Pet Details");
        System.out.println("6. Animal Details");
        System.out.println("        a. Display Details of an Animal");
        System.out.println("        b. Display All Animals Details");
        System.out.println("        c. Display Oldest Animal");
        System.out.println("        d. Display Youngest Animal");
        System.out.println("7. Update Animal Length of Time in System");
        System.out.println("8. Exit System");
        System.out.println();
        System.out.println("Please enter choice [a,b,c, or d]: ");
        
        char choice2 = EasyScanner.nextChar();//sets up user input based on single letter answers
        
        if(choice2 == 'a')
        {
            listOneDetails(myVet);
        }
        else if(choice2 == 'b')
        {
            listDetails(myVet);
        }
        else if(choice2 == 'c')
        {
            oldestAnimal(myVet);
        }
        else if(choice2 == 'd')
        {
            youngestAnimal(myVet);
        }
    }
    
    private static void listOneDetails(Vet myVet)
    {
        String num1;
        Animal a1;
        
        System.out.println();       
        System.out.println("Enter animal id: ");
        num1 = EasyScanner.nextString();
        System.out.println();
        
        a1 = myVet.animalOneDetails(num1);
        
        if(a1 == null)
        {
            System.out.println("No such animal is in the system");
        }
        else
        {
            System.out.println("Animal id: " +(a1.getAnimalId()));
            System.out.println("Animal name: " +(a1.getAnimalName()));
            System.out.println("Animal type: " +(a1.getAnimalType()));
            System.out.println("Animal owener name: " +(a1.getAnimalOwner()));          
            System.out.println("Animal age: " +(a1.getAnimalAge()));
            System.out.println("Year registered: " +(a1.getAnimalReg()));
            System.out.println("Length of time client: " +(a1.getLenTimeClient()));
            System.out.println("Animal Vaccination: " +(a1.getVaccinations()));
        }
    }
    
    private static void listDetails(Vet myVet)
    {
        String allDetails;
        
        allDetails = myVet.animalDetails();
        
        if(allDetails.equals("") == true)
        {
            System.out.println("There are no Animals registered in the Vets");
        }
        else
        {
            System.out.println(allDetails);// print animal details from Vet
        }
    }
    
    private static void oldestAnimal(Vet myVet)
    {
        Animal temp = myVet.checkOldestAnimal();
        if(temp == null)
        {
            System.out.println("No Animals are added into the system");
        }
        else
        {
            System.out.println((temp.getAnimalName()) + " with animal id " + (temp.getAnimalId()) + "is the oldest animal (" + (temp.getAnimalAge()) + "years)");
        }
    }

    private static void youngestAnimal(Vet myVet)
    {
        Animal temp = myVet.checkYoungestAnimal();
        if(temp == null)
        {
            System.out.println("No Animals are added into the system");
        }
        else
        {
            System.out.println((temp.getAnimalName()) + " with animal id " + (temp.getAnimalId()) + "is the youngest animal (" + (temp.getAnimalAge()) + "years)");
        }
    }                               
}                         