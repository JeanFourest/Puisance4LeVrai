package com.coding.puissance.module;

import java.util.List;

public class SortTop{

    public static List tri_insertion(List score) {

        for (int i = 1; i <score.size(); i++) {
            int ligne = (int) score.get(i);
            int j = i-1;
            while (j >= 0 && (int)score.get(j) > ligne) {
                score.set(j+1, score.get(j));
                j = j - 1;
            }
            score.set(j+1, ligne);
        }
        return score;
    }

}