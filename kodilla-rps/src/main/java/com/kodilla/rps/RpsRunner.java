package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {
        restartOrExit(game());
    }

    public static boolean restartOrExit(boolean object){
        Scanner scan = new Scanner(System.in);

        boolean process = false;
        while (!process){
            System.out.println("to end press x, to restart press n");
            String choice = scan.nextLine();
            if(choice.equals("x")){
            }
            if(choice.equals("n")){
                game();
            }
        }
        return object;
    }

    public static boolean game(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your name");
        String playerName = scan.nextLine();
        System.out.println(playerName + ", " + " how many rounds won to win?");
        int roundsToWin = scan.nextInt();
        scan.nextLine();
        System.out.println("Hi," + playerName + " :)");
        System.out.println();
        System.out.println("KEYBOARD COMMANDS:" + " \n"+
                "key [1] - play \"rock\"" + " \n"+
                "key [2] - play \"paper\"" + " \n"+
                "key [3] - play \"scissors\"" + " \n"+
                "key [x] - end game" + " \n"+
                "key [n] - restart game");

        System.out.println("please enter command");

        int roundsCounter =0;
        int playerWinsCounter =0;
        int computerWinsCounter =0;
        int drawCounter =0;

        boolean end = false;
        while(!end){

            String lineInt = scan.nextLine();

            String command = commandsGame(lineInt);
            String pcCommand = pcCommand();

            roundsCounter ++;
            System.out.println("round " +roundsCounter);
            System.out.print(playerName + " plays: " + command +"  vs  "+  "computer plays: " + pcCommand);

            System.out.print( "   ==>");
            if(isDraw(command, pcCommand)){
                drawCounter ++;
                System.out.println("    Draw");
            } else if (isWin(command, pcCommand)) {
                playerWinsCounter ++;
                System.out.println("    "+playerName + " win !");
            } else {
                computerWinsCounter ++;
                System.out.println("    computer player win :(");
            }

            System.out.println();
            System.out.println(playerName + " wins :" + playerWinsCounter + "\n" +
                    "computer wins "+computerWinsCounter + "\n" +
                    "draws: " + drawCounter);

            if (playerWinsCounter == roundsToWin || computerWinsCounter == roundsToWin ){
                System.out.println();
                System.out.print("GAME OVER  ");
                System.out.println();
                if (roundsToWin == playerWinsCounter){
                    System.out.println(playerName + " wins the game in " + roundsCounter + " round with score of " + playerWinsCounter + " wins ! " + "\n" +
                            " To restart game press \"n\", to quit game press \"x\" ");
                }else if (roundsToWin == computerWinsCounter) {
                    System.out.println("computer wins the game in " + roundsCounter + " round with score of " + computerWinsCounter + " wins " + "\n" +
                            " To restart game press \"n\", to quit game press \"x\" ");
                }
            }
        }
        return end;
    }

    private static String commandsGame(String value){

        int parsedValue = Integer.parseInt(value);
        return moves().get(parsedValue -1).toString();
    }

    private static boolean isWin(String a, String b) {
        return a == "paper" && b == "rock"
                || a == "rock" && b == "scissors"
                || a == "scissors" && b == "paper";
    }

    private static boolean isDraw(String a, String b) {
        return  a == b;
    }

    private static String pcCommand() {
        String command = moves().get(getRandomNumber(0,3)).toString();

        return command;
    }

    static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static List moves (){
        List<String> moveslist = new ArrayList<>();
        moveslist.add("rock");
        moveslist.add("paper");
        moveslist.add("scissors");

        return moveslist;
    }
}