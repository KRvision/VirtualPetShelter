package virtual_pet;

import java.util.Scanner;


public class VirtualPetApplication {

    public static void main(String[] args) {
        //Interact with a VirtualPet object in this method

        Scanner scanner = new Scanner(System.in);
        int choice;
        VirtualPet scooby = new VirtualPet ("Scooby");

        System.out.println("My name is " + scooby.getName());



        do {
            
            System.out.println("Hunger: " + scooby.getHunger());
            System.out.println("Thirst: " + scooby.getThirst());
            System.out.println("Waste: " + scooby.getWaste());

            System.out.println("What do you want to do?");
            System.out.println("1. Feed " + scooby.getName() + "?");
            System.out.println("2. Give " + scooby.getName() + " some water?");
            System.out.println("3. Let " + scooby.getName() + " go #1 or #2?");
            System.out.println("4. Cut " + scooby.getName() + " loose?");


            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Feed Scooby some scooby snacks");
                scooby.feed();
            } else if (choice == 2) {
                System.out.println("Give Scooby some water");
                scooby.water();
            } else if (choice == 3) {
                System.out.println("Let Scooby outside because he has to go!");
                scooby.waste();
            } else if (choice != 4) {
                System.out.println("Please choose options 1-3!");
            }
            scooby.tick();       
        }
        
        while (choice != 4);
        
        System.out.println("Bye bye Scoob");
        scanner.close();        
        }
        

}
