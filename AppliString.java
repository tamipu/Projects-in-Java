//This application allows us to export the result of charAt(int i), substring(i), substring(i, j) of a string s typing by human.

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class AppliString extends JFrame implements ActionListener {

	private int currenti, currentj;
	private String s;

	private JFrame frame;
	private JTextField textFieldString;
	JPanel panelChaine, panelResultats, panelParametres;
	JLabel labelResultat, labelSubi, labelSubij, labelParam, labelIntj, labelChaine, labelString;
	JButton btnDecreaseInt, btnIncreaseInt, btnDecreaseIntj, btnIncreaseIntj;
	JTextField textFieldChar;
	private JLabel labelCharAt, lblNewLabel, lblNewLabel_1, lblNewLabel_2, lblNewLabel_3, lblNewLabel_4, lblNewLabel_5;
	private JLabel labelInti_1, lblNewLabel_6, lblNewLabel_7, lblNewLabel_8, lblNewLabel_9, lblNewLabel_10;
	private JTextField textFieldinti, textFieldintj, textFieldSubi, textFieldsubij;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppliString window = new AppliString();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppliString() {
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().setLayout(new BorderLayout());
		frame.setTitle("Opérations sur une String");
		frame.setVisible(true);

		panelChaine = new JPanel();
		panelChaine.setBorder(new LineBorder(new Color(0, 0, 0)));
		frame.getContentPane().add(panelChaine, BorderLayout.NORTH);
		panelChaine.setLayout(new GridLayout(2, 1, 0, 0));

		panelResultats = new JPanel();
		panelResultats.setBorder(new LineBorder(new Color(0, 0, 0)));
		frame.getContentPane().add(panelResultats, BorderLayout.SOUTH);
		panelResultats.setLayout(new GridLayout(0, 2, 0, 0));

		labelResultat = new JLabel("Resultats : ");
		labelResultat.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		panelResultats.add(labelResultat);

		lblNewLabel_10 = new JLabel("");
		panelResultats.add(lblNewLabel_10);

		labelCharAt = new JLabel("s.charAt(i) vaut : ");
		panelResultats.add(labelCharAt);
		textFieldChar = new JTextField();
		panelResultats.add(textFieldChar);

		lblNewLabel_8 = new JLabel("s.substring(i) vaut : ");
		panelResultats.add(lblNewLabel_8);

		textFieldSubi = new JTextField();
		panelResultats.add(textFieldSubi);

		lblNewLabel_9 = new JLabel("s.substring(i, j) vaut : ");
		panelResultats.add(lblNewLabel_9);

		textFieldsubij = new JTextField();
		panelResultats.add(textFieldsubij);

		labelSubi = new JLabel("s.substring(i) vaut : ");

		labelSubij = new JLabel("s.substring(i,j) vaut : ");

		panelParametres = new JPanel();
		frame.getContentPane().add(panelParametres, BorderLayout.CENTER);
		panelParametres.setLayout(new GridLayout(4, 4, 0, 0));

		labelParam = new JLabel("Parametres : ");
		labelParam.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		panelParametres.add(labelParam);

		lblNewLabel_1 = new JLabel("");
		panelParametres.add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("");
		panelParametres.add(lblNewLabel_2);

		lblNewLabel_3 = new JLabel("");
		panelParametres.add(lblNewLabel_3);

		lblNewLabel_6 = new JLabel("");
		panelParametres.add(lblNewLabel_6);

		btnIncreaseInt = new JButton("+");
		btnIncreaseInt.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btnIncreaseInt.setFocusable(false);
		btnIncreaseInt.addActionListener(this);
		panelParametres.add(btnIncreaseInt);

		lblNewLabel_7 = new JLabel("");
		panelParametres.add(lblNewLabel_7);

		btnIncreaseIntj = new JButton("+");
		btnIncreaseIntj.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btnIncreaseIntj.setFocusable(false);
		btnIncreaseIntj.addActionListener(this);

		panelParametres.add(btnIncreaseIntj);

		labelIntj = new JLabel("int i = ");
		labelIntj.setHorizontalAlignment(SwingConstants.TRAILING);
		panelParametres.add(labelIntj);

		labelChaine = new JLabel();
		labelChaine.setText("Chaine : ");
		labelChaine.setFont(new Font("Dialog", Font.BOLD, 13));
		labelChaine.setBounds(0, 0, 150, 200);
		panelChaine.add(labelChaine);

		lblNewLabel = new JLabel("");
		panelChaine.add(lblNewLabel);

		labelString = new JLabel("String s =");
		panelChaine.add(labelString);

		textFieldString = new JTextField();
		panelChaine.add(textFieldString);

		textFieldinti = new JTextField();
		textFieldinti.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldinti.setText("0");
		panelParametres.add(textFieldinti);

		labelInti_1 = new JLabel("int j = ");
		labelInti_1.setHorizontalAlignment(SwingConstants.TRAILING);
		panelParametres.add(labelInti_1);

		textFieldintj = new JTextField();
		textFieldintj.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldintj.setText("0");
		panelParametres.add(textFieldintj);

		lblNewLabel_4 = new JLabel("");
		panelParametres.add(lblNewLabel_4);

		btnDecreaseInt = new JButton("-");
		btnDecreaseInt.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		btnDecreaseInt.setFocusable(false);
		btnDecreaseInt.addActionListener(this);
		panelParametres.add(btnDecreaseInt);

		lblNewLabel_5 = new JLabel("");
		panelParametres.add(lblNewLabel_5);

		btnDecreaseIntj = new JButton("-");
		btnDecreaseIntj.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		btnDecreaseIntj.setFocusable(false);
		btnDecreaseIntj.addActionListener(this);
		panelParametres.add(btnDecreaseIntj);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnIncreaseInt) {
			s = textFieldString.getText();
			currenti = Integer.parseInt(textFieldinti.getText());

			if (currenti >= 0 && currenti < s.length()) {
				textFieldinti.setText(String.valueOf(currenti + 1));
				textFieldChar.setText(String.valueOf(s.charAt(currenti)));
				textFieldSubi.setText(s.substring(currenti));
			}

		}

		if (e.getSource() == btnDecreaseInt) {
			s = textFieldString.getText();
			currenti = Integer.parseInt(textFieldinti.getText());

			if (currenti > 0 && currenti < s.length()) {
				textFieldinti.setText(String.valueOf(currenti - 1));
				textFieldChar.setText(String.valueOf(s.charAt(currenti)));
				textFieldSubi.setText(s.substring(currenti));
			}
		}
		if (e.getSource() == btnIncreaseIntj) {
			s = textFieldString.getText();
			currenti = Integer.parseInt(textFieldinti.getText());
			currentj = Integer.parseInt(textFieldintj.getText());
			textFieldintj.setText(String.valueOf(currentj + 1));

			if (currenti >= 0 && currenti < s.length() && currentj >= 0 && currentj < s.length()
					&& currenti <= currentj) {
				textFieldChar.setText(String.valueOf(s.charAt(currenti)));
				textFieldSubi.setText(s.substring(currenti));
				textFieldsubij.setText(s.substring(currenti, currentj));
			}
		}

		if (e.getSource() == btnDecreaseIntj) {
			s = textFieldString.getText();
			currenti = Integer.parseInt(textFieldinti.getText());
			currentj = Integer.parseInt(textFieldintj.getText());

			if (currenti >= 0 && currenti < s.length() && currentj >= 0 && currentj < s.length()
					&& currenti <= currentj) {
				textFieldintj.setText(String.valueOf(currentj - 1));
				textFieldChar.setText(String.valueOf(s.charAt(currenti)));
				textFieldSubi.setText(s.substring(currenti));
				textFieldsubij.setText(s.substring(currenti, currentj));
			}
		}
	}
}
