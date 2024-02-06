package Strings;

import java.util.Scanner;

class Guesser
{
    int guessNum;

    int guessingNumber()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Guesser! Kindly guess the number");
        guessNum = scan.nextInt();
        return guessNum;
    }
}

class Player
{
    int guessNum;
    int guessingNumber()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player! Kindly guess the number");
        guessNum = scan.nextInt();
        return guessNum;
    }
}

class Umpire
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;

    int numFromPlayer3;
    void collectNumFromGuesser()
    {
        Guesser g = new Guesser();
        numFromGuesser = g.guessingNumber();
    }
    void collectNumFromPlayers()
    {
        Player p1 =new Player();
        Player p2 =new Player();
        Player p3 =new Player();
        numFromPlayer1 = p1.guessingNumber();
        numFromPlayer2 = p2.guessingNumber();
        numFromPlayer3 = p3.guessingNumber();
    }
    void compare()
    {
        if(numFromGuesser == numFromPlayer1)
        {
            if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3)
            {
                System.out.println("All Win the Game");
            }
            else if (numFromGuesser == numFromPlayer2)
            {
                System.out.println("Player 1 and player 2 win the game");
            }
            else if (numFromGuesser == numFromPlayer3)
            {
                System.out.println("Player 1 and player 3 win the game");
            }
            else
            {
                System.out.println("Player1 Won the Game!");
            }
        }
        else if (numFromGuesser == numFromPlayer2)
        {
            if(numFromGuesser == numFromPlayer3)
            {
                System.out.println("Player 2 and player 3 win");
            }
            else
            {
                System.out.println("Player 2 win the game");
            }
        }
        else if (numFromGuesser == numFromPlayer3)
        {
            System.out.println("Player3 Won the Game!");
        }
        else
        {
            System.out.println("All Lost the Game!");
        }
    }

}


public class GuesserGame{
    public static void main(String[] args) {
        System.out.println("Game Started");
        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayers();
        u.compare();
    }
}