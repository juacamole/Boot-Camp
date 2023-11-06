package org.example.PlayerCharacter;

import java.util.Scanner;

public class PlayerCharacter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[11][11];
        int pX = 5;
        int pY = 5;
        int zs1;
        int zs2;
        while (true) {

            char input = sc.next().charAt(0);
            int move = getX(input);
            zs1 = pY;
            zs2 = pX;
            int finalMove = move(board, move, pY, pX);


            board[pY][pX] = 'O';
            print(board);

        }

    }
    public static void print(char[][]board){

        for (char[] chars : board) {
            for (int x = 0; x < board.length; x++) {
                System.out.print("[" + chars[x] + "]");
            }
            System.out.println(" ");
        }
    }
    public static int getX(char input){
        if (input == 'A'){
            return -1;
        } else if (input == 'D') {
            return 1;
        } else {
            return getY(input);
        }
    }
    public static int getY(char input) {
        if (input == 'W') {
            return 2;
        } else if (input == 'S') {
            return -2;
        } else {
            return 0;
        }
    }
    public static int move (char[][] board, int move, int pY, int pX) {

        switch (move){
            case (-2):
                pY--;
                return pY;
            case (-1):
                pX--;
                return pX;
            case (1):
                pX++;
                return pX;
            case (2):
                pY++;
                return pY;
        }
        return 0;
    }
}
