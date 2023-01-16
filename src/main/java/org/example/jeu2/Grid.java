package org.example.jeu2;

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


    public void display(char[][] grid){
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

    //@Override
    /*public String toString() {
        return display();
    }*/
}
