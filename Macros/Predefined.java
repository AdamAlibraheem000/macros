package Macros;

public class Predefined {
    public void predefinedMenu(){
        System.out.println("*********Predefined Menu**********");
        int input = 0;
        do{
            System.out.println("1)Chicken 224g");
            System.out.println("2)Cottage Chesse 113g");
            System.out.println("3)Smoothie");
            System.out.println("4)Main Menu");
            System.out.print(">>");

            input = Menu.userInput();

            switch(input){
                case 1: 
                System.out.println("Chicken was added\n\n");
                Calc.updateMacros(280, 50, 0, 0);
                break;
                case 2: 
                System.out.println("Cottage Cheese was added\n\n");
                Calc.updateMacros(110, 13, 5, 5);
                break;
                case 3:
                System.out.println("Smoothie was added\n\n");
                Calc.updateMacros(950, 37, 67, 66);
                break;
                case 4:
                System.out.println("\n\n");
                break;
                default:
                System.out.println("Invalid input\n\n");
                System.out.println("1)Chicken 224g");
                System.out.println("2)Cottage Chesse 113g");
                System.out.println("3)Smoothie");
                System.out.println("4)Main Menu");
                System.out.print(">>");

            }

        }while(input != 4);
    }
}
