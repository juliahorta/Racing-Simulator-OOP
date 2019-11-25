import java.util.Scanner;
import java.util.Random;
public class Game{
    
    public static void main(String[] args){
        String cartype = input("What car would you like to race with? MERCEDES | PORSCHE | HONDA");
        
         if (cartype.equalsIgnoreCase("Mercedes")){
            Vehicle Player = new Mercedes(200,1500,220);
            String statsQ = input("Would you like to see your stats? Y | N");
            if (statsQ.equalsIgnoreCase("Y")){
                printStats(Player);
            }
            else if (statsQ.equalsIgnoreCase("N")){
                
            }
            else {
                System.out.println("response not valid");
            }
        }
        
        else if (cartype.equalsIgnoreCase("Porsche")){
            Vehicle Player = new Porsche(200,1500,220);
            String statsQ = input("Would you like to see your stats? Y | N");
            if (statsQ.equalsIgnoreCase("Y")){
                printStats(Player);
            }
            else if (statsQ.equalsIgnoreCase("N")){
                
            }
            else {
                System.out.println("response not valid");
            }  
        }
        
        else if (cartype.equalsIgnoreCase("Honda")){
            Vehicle Player = new Honda(200,1500,220);
            String statsQ = input("Would you like to see your stats? Y | N");
            if (statsQ.equalsIgnoreCase("Y")){
                printStats(Player);
            }
            else if (statsQ.equalsIgnoreCase("N")){
                
            }
            else {
                System.out.println("response not valid");
            }
        }
        
        else{
            System.out.println("That is not an option!");
        }
        
        String racetype = input("What type of race would you like? FORMULA 1 | FORMULA 3");
        if (racetype.equalsIgnoreCase("formula 1")){
            
        }
        else if (racetype.equalsIgnoreCase("formula 3")){
            
        }
        else {
            System.out.println("That is not an option");
        }
    }
    
    // METHOD TO PRINT PLAYER STATS
    public static void printStats(Vehicle p){
        System.out.println("YOUR STATS:");
        System.out.println("SPEED: " + p.getSpeed());
        System.out.println("HORSEPOWER: " + p.getHorsepower());
        System.out.println("WEIGHT: " + p.getWeight());
    } // END OF STATS METHOD
    
    // METHOD TO INPUT STRINGS
    public static String input(String m){
        Scanner scanner = new Scanner(System.in);
        String answer;
        
        System.out.println(m);
        answer = scanner.nextLine();
        
        return answer;
    } // END INPUT METHOD
    
}