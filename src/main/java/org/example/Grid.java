package org.example;

public class Grid {

    /*static char[] board;


    static void printGrid(){

        System.out.println("╔════╦════╦════╦════╦════╦════╦════╗");
        System.out.println("║ " + board[0] + "   ║  " + board[1] + "  ║  " + "  ║  " + "  ║ " + "   ║  " + "  ║  " + "  ║");
        System.out.println("║════╬════╬════╬════╬════╬════╬════║");
        System.out.println("║ " + "   ║  " + "  ║  " + "  ║  " + "  ║ " + "   ║  " + "  ║  " + "  ║");
        System.out.println("║════╬════╬════╬════╬════╬════╬════║");
        System.out.println("║ " + "   ║  " + "  ║  " + "  ║  " + "  ║ " + "   ║  " + "  ║  " + "  ║");
        System.out.println("║════╬════╬════╬════╬════╬════╬════║");
        System.out.println("║ " + "   ║  " + "  ║  " + "  ║  " + "  ║ " + "   ║  " + "  ║  " + "  ║");
        System.out.println("║════╬════╬════╬════╬════╬════╬════║");
        System.out.println("║ " + "   ║  " + "  ║  " + "  ║  " + "  ║ " + "   ║  " + "  ║  " + "  ║");
        System.out.println("║════╬════╬════╬════╬════╬════╬════║");
        System.out.println("║ " + "   ║  " + "  ║  " + "  ║  " + "  ║ " + "   ║  " + "  ║  " + "  ║");
        System.out.println("╚════╩════╩════╩════╩════╩════╩════╝");
    }*/

    public static void main(String[] args){

        char[][] grid = new char[6][7];

        for (int row = 0; row < grid.length; row++){
            for (int col = 0; col < grid[0].length; col++){
                grid[row][col] = '⚪';
            }
        }

        display(grid);

    }

    public static void display(char[][] grid){
        System.out.println("   1    2    3    4    5    6    7");
        System.out.println("-------------------------------------");
        for (int row = 0; row < grid.length; row++){
            System.out.print("| ");
            for (int col = 0; col < grid[0].length; col++){
                System.out.print(grid[row][col]);
                System.out.print(" | ");
            }
            System.out.println();
            System.out.println("-------------------------------------");
        }

        System.out.println();
    }
}
