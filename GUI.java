import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class GUI extends  JPanel {

	private JPanel contentPane;
	public void paintComponent(Graphics g) {
        // Draw Tree Here
        super.paintComponent(g);
        g.drawOval(40, 40, 70, 70);
        GUI panel = new GUI();
        
        panel.setLayout(new GridBagLayout());
        GridBagConstraints cl;
        cl = new GridBagConstraints();
        cl.gridy = 0;
        panel.add(new JLabel("Hello"), cl);
        panel.setVisible(true);
        g.setColor(Color.black);
        Font monoFont = new Font("Monospaced", Font.BOLD
        	      | Font.ITALIC, 36);
       // int w = java2sLogo.getIconWidth();
        //int h = java2sLogo.getIconHeight();
        
        g.setFont(monoFont);
        FontMetrics fm = g.getFontMetrics();
        //w = fm.stringWidth("Java Source");
        //h = fm.getAscent();
        int w = 200, h = 200;
        //g.drawString("Java Source", 120 - (w / 2), 120 + (h / 4));

  }
	public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.add(new GUI());
        jFrame.setSize(500, 500);
        JFrame mainFrame = new JFrame("Graphics demo");
        mainFrame.getContentPane().add(new GUI());
        mainFrame.pack();
        jFrame.setVisible(true);
    }
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	/**
 * Create the frame.
	 */
	public GUI() {
	//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		//setContentPane(contentPane);
	}

}

