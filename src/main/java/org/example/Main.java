package org.example;

import org.example.Grid;

public class Main {
    public static void main(String[] args) {

        char[][] grid = new char[6][7];

        for (int row = 0; row < grid.length; row++){
            for (int col = 0; col < grid[0].length; col++){
                grid[row][col] = '⚪';
            }
        }

        Grid display = new Grid();
        display.display(grid);
        //System.out.println(display);





    }
}