import java.awt.Canvas;

import javax.swing.JFrame;

public class Display extends Canvas implements Runnable{
    public static int HEIGHT = 800;
    public static int WIDTH = 600;
    public static final String TITLE = "JframeGame";
    
    private Thread thread;
    private boolean running = false;

    private void start() {
        if (running) return;
        running = true;
        thread = new Thread(this);
        thread.start();
        System.out.println("start");
    }

    private void stop() {
        if (!running) return;
        running = false;
        try {
            thread.join();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
        System.out.println("stop");
    }

    @Override
    public void run() {
        while (running) {
        }
    }

    public static void main(String[] args) {
        Display game = new Display();
        JFrame frame = new JFrame();
        frame.add(game);
        frame.setTitle(TITLE);
        // close frame when exit
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.setResizable(true);
        frame.setVisible(true);
        game.start();
    }

}
