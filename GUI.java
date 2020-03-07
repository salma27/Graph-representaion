import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

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
  }
	public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.add(new GUI());
        jFrame.setSize(500, 500);
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

