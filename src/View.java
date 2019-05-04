import javax.swing.ImageIcon;
import javax.imageio.ImageIO;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

/**
 * Simple harness for testing GUI code.
 * 
 * <P>
 * To use this class, edit the code to suit your needs.
 */
public final class View {
    JFrame frame;

    /**
     * Build and display minimal GUI.
     * 
     * <P>
     * The GUI has a label and an OK button. The OK button launches a simple message
     * dialog. No menu is included.
     */
    public static void main(String... aArgs) {
        View app = new View(new JFrame("Test Frame"));
        app.buildAndDisplayGui();
    }

    public View(JFrame frame) {
        this.frame = frame;
    }

    // PRIVATE

    private void buildAndDisplayGui() {
        buildContent(frame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void buildContent(JFrame aFrame) {
        JPanel panel = new JPanel();
        try {
            BufferedImage myPicture = ImageIO.read(new File("../images/Land0.png"));
            JLabel picLabel = new JLabel(new ImageIcon(myPicture));
            panel.add(picLabel);
        }
        catch (IOException ex) {
            // handle exception...
       }
        aFrame.getContentPane().add(panel);
    }

}
