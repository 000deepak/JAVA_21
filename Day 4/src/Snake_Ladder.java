public class Snake_Ladder {

    public static void main(String[] args) {
        int snake = 1,
                ladder = 2,  //Conditions
                player = 0,
                count = 0;

        int player1 = 0,
                player2 = 0; // Players

//********************************************************************************************//
        while (player1 < 100 && player2 < 100) {       //condition check for 100

            int dice = (int) (Math.random() * 7);       //throw dice
            int check = (int) (Math.random() * 4);
//-------------------------------------------------------------------------------------------//
            if (check == ladder) {                      //check for ladder
                player = player + dice;
                if (player > 100)
                    player = player - dice;
            }
//- ------------------------------------------------------------------------------------------//
            else if (check == snake) {                  // check for snake
                player = player - dice;
                if (player < 0)                         //if player < 0
                    player = 0;
                else if (player > 100)                  //if player > 100
                    player = player - dice;
            }
//------------------------------------------------------------------------------------------//
            if (count % 2 == 0) {                   //check for stay condition
                player1 = player;
                System.out.println("Player1 current position : " + player1);
            } else {
                player2 = player;
                System.out.println("Player2 current position : " + player2);
            }
            count++;
        }                                               //game over
 //********************************************************************************************//

        System.out.println("\n" + count + " times the dice was thrown.\n");//Dice thrown
        if (player1 > player2)
            System.out.println("The winner  is Player1");
        else
            System.out.println("The winner  is Player2");                 //Result
    }
}




