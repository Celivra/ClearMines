import Blocks.Mines;
import Blocks.NormalBlock;

import javax.swing.*;
import java.util.Random;

public class GameWindow extends JFrame {
    //雷区，0为无雷，1为又雷
    int[][] minesState = new int[15][15];
    //放置雷、普通方块等图片的panel
    JPanel panel = new JPanel();

    public GameWindow() {
        //初始化
        initMines();
        //将地图放到窗口上
        this.add(panel);

        this.setTitle("Game");
        this.setSize(500, 550);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
    public void printMinesNum(){
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                System.out.print(minesState[i][j]+" ");
            }
            System.out.println();
        }
    }
    //生成雷
    public void initMines(){
        panel.setLayout(null);

        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                Random rand = new Random();
                int randNum = rand.nextInt(101);
                if(randNum >= 95) {
                    minesState[i][j] = 1;
                }else{
                    minesState[i][j] = 0;
                }
            }
        }

        //将雷添加到panel里
        for(int y = 1; y <= 10; y++){
            for(int x = 1; x <= 10; x++){
                Mines mines = new Mines();
                NormalBlock normalBlock = new NormalBlock();

                //设置block的x和y
                normalBlock.setXY(x*normalBlock.getWidth(), y*normalBlock.getHeight());
                mines.setXY(x*mines.getWidth(), y*mines.getHeight());
                if(minesState[y][x] == 1){
                    panel.add(mines);
                }else {
                    panel.add(normalBlock);
                }
            }
        }
    }
}
