package framenegocioapp;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import negocioapp.Controlador;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextPane;
import javax.swing.JTextField;

public class MainApp{
	private static JTextField textField;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controlador miControlador;
		
		JFrame fMain = new JFrame("NegocioApp"); 
		fMain.getContentPane().setLayout(new BoxLayout(fMain.getContentPane(), BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(173, 255, 47));
		panel.setForeground(new Color(0, 0, 139));
		fMain.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(200, 57, 158, 179);
		panel.add(textPane);
		
		textField = new JTextField();
		textField.setBackground(new Color(102, 205, 170));
		textField.setBounds(85, 103, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		JPanel fondo = new JPanel();
		
		fondo.setBackground(Color.blue);

	}
}
























/*import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class MainApp extends JFrame {

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainApp frame = new MainApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 
	public MainApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
	}
}
*/