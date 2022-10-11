package Macros;

import java.util.Scanner;

public class Menu {
    public void mainMenu(){
        System.out.println("******MAIN MENU*********");
        int input = 0;

    do{
        System.out.println("1)Display Current Macros");
        System.out.println("2)Predefined List");
        System.out.println("3)Manual Entry");
        System.out.println("4)Clear Macros");
        System.out.println("5)Exit Program");
        System.out.print(">>");
        input = userInput();
        

        switch(input){
            case 1: 
            Calc.displayMacros();
            break;

            case 2:
            Predefined p = new Predefined();
            p.predefinedMenu();
            break;

            case 3:
            Calc.manualUpdate();
            break;

            case 4:
            Calc.clearMacros();
            break;

            case 5:
            System.out.println("Buh-Bye");
            
            break;

            default:
            System.out.println("Error from switch");
        }
    }while(input != 5);
        System.exit(0);
    }



    public static int userInput(){
        Scanner in = new Scanner(System.in);
        int result = 0;
        while(true){
            if(in .hasNextInt()){
                result = in.nextInt();
                break;
            }else{
                System.out.println("Error from userInput()");
                in.next();
            } 
        }
    return result;
    }
}



