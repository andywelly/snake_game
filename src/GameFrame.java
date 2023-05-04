import javax.swing.JFrame;

public class GameFrame extends JFrame {
    GameFrame(){
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack(); // pack function takes jframe fit it snugly around componenets added to frame
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

}
