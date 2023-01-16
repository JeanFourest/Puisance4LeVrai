package org.example.jeu2;

public class JeuPour2 {

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
