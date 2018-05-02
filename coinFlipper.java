import java.util.*;

class coinFlipper{

    public static String flipCoin(){
        Random rand = new Random();
        int n = rand.nextInt(2) + 1;
        String face;
        if(n == 1){
            face = "heads";
        }
        else{
            face = "tails";
        }
        return face;
    }


    public static void main(String args[]){
        boolean keepFlipping = true;
        while(keepFlipping == true){
            System.out.print("How many times would you like to flip?: ");
            Scanner userInput = new Scanner(System.in);
            int timesToFlip = userInput.nextInt();
            
            int heads, tails;
            heads = tails = 0;
            for(int i = 0 ; i < timesToFlip ; i++){
                if(flipCoin() == "heads"){
                    heads++;
                }
                else{
                    tails++;
                }
            }
            System.out.println("You chose to flip " + timesToFlip + " times");
            System.out.println("You have " + heads + " heads and " + tails + " tails.");

            
            System.out.print("\nWould you like to flip again? (Y/N): ");
            
            boolean validInput = false;
            while(validInput == false){
                userInput = new Scanner(System.in);
                char inputChar = userInput.next().charAt(0);
                
                if((inputChar == 'n') || (inputChar == 'N')){
                    keepFlipping = false;
                    System.out.println("your input was N");
                    validInput = true;
                }
                else if((inputChar == 'y') || (inputChar == 'Y')){
                    System.out.println("your input was Y\n");
                    validInput = true;
                }
                else{
                    System.out.println("Please enter a valid input (Y/N): ");
                }
            }
        }
        
    }

}
