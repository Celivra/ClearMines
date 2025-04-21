package Blocks;

import java.util.Random;

public class MinesInit {
    //雷区，0为无雷，1为又雷
    public static int[][] minesState = new int[15][15];
    //有没有访问过地图， 0为未访问过
    public static int[][] TouchMap= new int[15][15];
    //附近雷的数量数组
    public static int[][] minesNum= new int[15][15];

    public static void initMines(){
        int[] dx = {0, 1, 0, -1, -1, 1, -1, 1},
              dy = {1, 0, -1, 0, -1, 1, 1, -1};
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                Random rand = new Random();
                int randNum = rand.nextInt(101);
                if(randNum >= 95) {
                    minesState[i][j] = 1;
                    //更新这个雷的周围
                    for(int k = 0; k < 8; k++){
                        minesNum[i+dx[k]][j+dy[k]]++;
                    }
                }else{
                    minesState[i][j] = 0;
                }
            }
        }
    }
}
