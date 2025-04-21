import Blocks.*;

import javax.swing.*;

public class GameWindow extends JFrame {
    //放置雷、普通方块等图片的panel
    JPanel panel = new JPanel();

    public GameWindow() {
        //初始化
        MinesInit.initMines();

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
                System.out.print(MinesInit.minesState[i][j]+" ");
            }
            System.out.println();
        }
    }
    //生成雷
    public void initMines(){
        panel.setLayout(null);

        //将雷添加到panel里
        for(int y = 1; y <= 10; y++){
            for(int x = 1; x <= 10; x++){
                Mines mines = new Mines();
                NormalBlock normalBlock = new NormalBlock();

                //设置block的x和y
                normalBlock.setXY(x*normalBlock.getWidth(), y*normalBlock.getHeight());
                mines.setXY(x*mines.getWidth(), y*mines.getHeight());
                if(MinesInit.minesState[y][x] == 1){
                    panel.add(mines);
                }else {
                    panel.add(normalBlock);
                }
            }
        }
    }
}
