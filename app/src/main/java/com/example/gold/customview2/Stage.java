package com.example.gold.customview2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gold on 2017. 2. 21..
 */

public class Stage {

    int mapOne[][] = {
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,3,0,0,0,0,0},
            {0,0,0,0,2,0,0,0,0,0},
            {0,0,3,0,2,2,0,0,3,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
    };

    int mapTwo[][] = {
            {0,0,1,0,0,0,0,0,0,0},
            {0,0,1,1,0,1,1,0,0,0},
            {0,1,0,0,3,0,0,0,0,0},
            {0,1,0,1,1,1,1,0,1,0},
            {0,1,0,0,0,0,1,0,1,0},
            {0,1,1,1,1,0,1,0,1,0},
            {0,1,0,0,0,0,1,0,1,0},
            {0,1,0,1,0,1,1,0,1,0},
            {0,1,0,1,0,1,0,0,1,0},
            {0,0,0,1,0,0,0,0,1,2},
    };

    static List<int[][]> stageArray = new ArrayList();

    public Stage(){
        stageArray.add(mapOne);
        stageArray.add(mapTwo);
    }

    public int[][] getStage(int stage){
        return stageArray.get(stage-1);
    }

}
