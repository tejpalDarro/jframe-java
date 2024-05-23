import java.awt.Canvas;

import javax.swing.JFrame;

public class Display extends Canvas{
    public static int HEIGHT = 800;
    public static int WIDTH = 600;
    public static final String TITLE = "JframeGame";
    
    public static void main(String[] args) {
        Display game = new Display();
        JFrame frame = new JFrame();
        frame.add(game);
        frame.setTitle(TITLE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.setResizable(true);
        frame.setVisible(true);
    }
}
