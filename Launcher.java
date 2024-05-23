import javax.swing.SwingUtilities;

public class Launcher {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
               // BorderLayouts frame2 = new BorderLayouts();
               cricketScoreBoard frame1 = new cricketScoreBoard();
                //Label frame2 = new Label();

               
            }
        });
    }
    
}
