package Exercise03_Inheritance.Animals_06;

import Exercise03_Inheritance.Animals_06.cats.Cat;
import Exercise03_Inheritance.Animals_06.cats.Kitten;
import Exercise03_Inheritance.Animals_06.cats.Tomcat;
import Exercise03_Inheritance.Animals_06.dogs.Dog;
import Exercise03_Inheritance.Animals_06.frogs.Frog;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        while(!"Beast!".equals(line)){
            try{
                switch (line){
                    case "Lab05_Polymorphism.Animals_03.Cat":
                        String[] tokens = scanner.nextLine().split("\\s+");
                        Cat cat = new Cat(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                        System.out.println(cat);
                        break;
                    case "Lab05_Polymorphism.Animals_03.Dog":
                        tokens = scanner.nextLine().split("\\s+");
                        Dog dog = new Dog(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                        System.out.println(dog);
                        break;
                    case "Frog":
                        tokens = scanner.nextLine().split("\\s+");
                        Frog frog = new Frog(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                        System.out.println(frog);
                        break;
                    case "Kitten":
                        tokens = scanner.nextLine().split("\\s+");
                        Kitten kitten = new Kitten(tokens[0], Integer.parseInt(tokens[1]));
                        System.out.println(kitten);
                        break;
                    case "Tomcat":
                        tokens = scanner.nextLine().split("\\s+");
                        Tomcat tomcat = new Tomcat(tokens[0], Integer.parseInt(tokens[1]));
                        System.out.println(tomcat);
                        break;
                }
            } catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }
            line= scanner.nextLine();

        }
    }
}