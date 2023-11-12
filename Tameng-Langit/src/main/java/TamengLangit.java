import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 * 
 * @author 
*/

// Class Main untuk menjalankan program
public class TamengLangit extends JFrame implements Commons {

	
	private static final long serialVersionUID = -4905230094675077405L;

	public JButton start, help, restart;
	
	
	private static final String TOP_MESSAGE = "Tameng langit";
	private static final String INITIAL_MESSAGE = "Ewangono lur"
			+ "<br>Alien nyerang bumine kene"
			+ "<br><br><br>Misi panjenengan : "
			+ "<br><br>Patenono Alien sing nyerang sakdurunge dee kabeh nguasai bumi"
			+ "<br>Ojok sampe mati lur!"
			+ "<br><br><br>Mugi slamet kanggo panjenengan";
	
	private static final String HELP_TOP_MESSAGE = "Tulung";
	private static final String HELP_MESSAGE = "Kontrol :  " 
							+ "<br><br>Geser kiri : <br>Petek panah kiri nak keyboard lur"
							+ "<br><br>Geser kanan : <br>Petek panah kanan nak keyboard lur"
							+ "<br><br>Bedil keris : <br>Petek Spasi lur";
	
	// Mengatur Frame
	JFrame frame = new JFrame("Tameng Langit"); //Game
	JFrame frame2 = new JFrame("Tameng Langit"); //Awal
	JFrame frame3 = new JFrame("Pertulungan"); //Tutor
	JFrame frame4 = new JFrame("Restart"); // Restart

	/*
	 * Constructor
	 */
	
	public TamengLangit(int a) {
		
	}
	public TamengLangit() {
		String topmessage = "<html><br><br>" + TOP_MESSAGE + "</html>";
		String message = "<html>" + INITIAL_MESSAGE + "</html>";

		start = new JButton("GASSS!!");
		start.addActionListener(new ButtonListener());
		start.setBounds(800, 800, 200, 100);

		help = new JButton("Tulung");
		help.addActionListener(new HelpButton());

		JLabel text = new JLabel(message, SwingConstants.CENTER);
		JLabel toptext = new JLabel(topmessage, SwingConstants.CENTER);

		Font font = new Font("Helvetica", Font.BOLD, 12);
		text.setFont(font);

		Font font2 = new Font("Helvetica", Font.BOLD, 20);
		toptext.setFont(font2);

		frame2.setTitle("Tameng Langit");

		frame2.add(text);

		frame2.add(toptext, BorderLayout.PAGE_START);
		JPanel notdone = new JPanel();
		notdone.add(help);
		notdone.add(start);

		frame2.add(notdone, BorderLayout.PAGE_END);
		frame2.setSize(500, 500);
		frame2.setLocationRelativeTo(null);
		frame2.setVisible(true);
		frame2.setResizable(false);

	}
	
	// Mengatur Panel Menu awal
	public void startPanel() {
		String topmessage = "<html><br><br>" + TOP_MESSAGE + "</html>";
		String message = "<html>" + INITIAL_MESSAGE + "</html>";

		start = new JButton("GASSS!!");
		start.addActionListener(new ButtonListener());
		start.setBounds(800, 800, 200, 100);

		help = new JButton("Tulung");
		help.addActionListener(new HelpButton());

		JLabel text = new JLabel(message, SwingConstants.CENTER);
		JLabel toptext = new JLabel(topmessage, SwingConstants.CENTER);

		Font font = new Font("Helvetica", Font.BOLD, 12);
		text.setFont(font);

		Font font2 = new Font("Helvetica", Font.BOLD, 20);
		toptext.setFont(font2);

		frame2.setTitle("Tameng Langit");

		frame2.add(text);

		frame2.add(toptext, BorderLayout.PAGE_START);
		JPanel notdone = new JPanel();
		notdone.add(help);
		notdone.add(start);

		frame2.add(notdone, BorderLayout.PAGE_END);
		frame2.setSize(500, 500);
		frame2.setLocationRelativeTo(null);
		frame2.setVisible(true);
		frame2.setResizable(false);
	}
	
	// Mengatur Panel menu restart
	public void restartPanel() {
		restart = new JButton("Njajal neh lur");
		restart.addActionListener(new restartButton());
		restart.setBounds(800, 800, 200, 100);
		
		frame4.setTitle("Restart");
		frame4.add (new JLabel("RESTART LUR", SwingConstants.CENTER));
		
		JPanel PanelRestart = new JPanel();
		PanelRestart.add(restart);
		
		frame4.add(PanelRestart, BorderLayout.PAGE_END);
		frame4.setSize(500, 500);
		frame4.setLocationRelativeTo(null);
		frame4.setVisible(true);
		frame4.setResizable(false);
	}
	
	//Method untuk close panel restart
	public void closeRestart() {
		frame4.dispose();
	}
	
	// Method untuk close panel menu dan bantuan
	public void closeIntro() {
		frame2.dispose();
		frame3.dispose();
	}
	
	//Mehod untuk close panel bantuan
	public void closeHelp() {
		frame3.dispose();
	}
	
	//Method untuk close panel game
	public void closeGame() {
		frame.dispose();
	}

	/*
	 * Main
	 */
	public static void main(String[] args) {
		new TamengLangit();
	}
	
	// Class untuk mengatur tombol restart
	public class restartButton implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame4.setSize(BOARD_WIDTH, BOARD_HEIGTH);
			//frame4.getContentPane().add(new Board());
			frame4.setResizable(false);
			frame4.setLocationRelativeTo(null);
			frame4.setVisible(true);
			
			startPanel();
			closeRestart();

		}
	}
	
	//Class untuk mengatur tombol start
	private class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent event) {

			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(BOARD_WIDTH, BOARD_HEIGTH);
			frame.getContentPane().add(new Board());
			frame.setResizable(false);
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);
			closeIntro();

		}
	}

	private class CloseHelp implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			closeHelp();
		}
	}

	private class HelpButton implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			JButton close = new JButton("Suwun Lur");
			close.addActionListener(new CloseHelp());

			String topmessage = "<html><br>" + HELP_TOP_MESSAGE + "</html>";
			String message = "<html>" + HELP_MESSAGE + "</html> ";
			JLabel text = new JLabel(message, SwingConstants.CENTER);
			JLabel toptext = new JLabel(topmessage, SwingConstants.CENTER);

			Font font = new Font("Helvetica", Font.BOLD, 12);
			text.setFont(font);

			Font font2 = new Font("Helvetica", Font.BOLD, 20);
			toptext.setFont(font2);

			frame3.add(text);

			frame3.add(toptext, BorderLayout.PAGE_START);

			frame3.add(close, BorderLayout.PAGE_END);
			frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame3.setSize(250, 290);
			frame3.setResizable(false);
			frame3.setLocationRelativeTo(null);
			frame3.setVisible(true);
		}
	}
}