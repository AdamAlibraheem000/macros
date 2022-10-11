package Macros;

import java.util.Scanner;

public class Calc {
    private static int calories = 0;
    private static int protein = 0;
    private static int fats = 0;
    private static int carbs = 0;

    public static void displayMacros(){
        System.out.println("Calories: " + calories);
        System.out.println("Protein: " + protein);
        System.out.println("Fats: " + fats);
        System.out.println("Carbs: " + carbs);
        System.out.println("\n");
    }

    public static void updateMacros(int cals, int pro, int fat, int carb){
        calories += cals;
        protein +=  pro;
        fats += fat;
        carbs += carb;
    }

    public static void manualUpdate(){
        Scanner in = new Scanner(System.in);
        String input = "";
        int newCals = 0;
        int newProtein = 0;
        int newFats = 0;
        int newCarbs = 0;

        do{
            System.out.println("Update macros manually? (y/n)");
            input = in.nextLine();
            if(input.equalsIgnoreCase("y")){
                System.out.print("Calories: ");
                newCals = in.nextInt();
                System.out.print("Protein: ");
                newProtein = in.nextInt();
                System.out.print("Fats: ");
                newFats = in.nextInt();
                System.out.print("Carbs ");
                newCarbs = in.nextInt();

                System.out.println("Macros have been updated!");

                calories += newCals;
                protein += newProtein;
                fats += newFats;
                carbs += newCarbs;

                break;
            }else if(input.equalsIgnoreCase("n")){
                break;
            }else{
                System.out.println("Invalid Input. Try again");
                in.next();
            }
        }while(true);
    }

    public static void clearMacros(){
            String input = " ";
            Scanner in = new Scanner(System.in);

            do{
                System.out.println("Do you wish to clear all macros? (y/n)");
                input = in.nextLine();
                if(input.equalsIgnoreCase("y")){
                    calories = 0;
                    protein = 0;
                    fats = 0;
                    carbs = 0;
                    System.out.println("Macros have been cleared\n\n");
                    break;
                }else if(input.equalsIgnoreCase("n")){
                    break;
                }else{
                    System.out.println("Wrong input. Try again");
                    in.next();
                }

            }while(true);



        
    }

}
