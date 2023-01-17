package com.coding.puissance.module;

public class Grid {

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
    public void draw() {

        char[][] grid = new char[6][7];

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                grid[row][col] = '⚪';
            }
        }

        Grid display = new Grid();
        display.display(grid);
        //System.out.println(display);

    }

}
