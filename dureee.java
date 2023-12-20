package Cryptage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class dureee extends JFrame implements ActionListener {

	private JFrame frmProgrammation;

	private JButton btnIncreaseHours, btnDecreaseHours, btnDecreaseMinutes, btnIncreaseMinutes, btnIncreaseSecondes,
			btnDecreaseSeconds;
	private JButton btnIncreaseTSeconds, btnDecreaseTSeconds;
	private JTextField txtHours, txtMinutes, txtTSecondes;
	private int currentHeure, currentMin, currentSec, currentTSec;
	dure Dure;
	private JTextField txtSeconds;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dureee window = new dureee();
					window.frmProgrammation.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public dureee() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmProgrammation = new JFrame();
		frmProgrammation.setTitle("Transformer Temps");
		frmProgrammation.setBounds(100, 100, 450, 300);
		frmProgrammation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmProgrammation.setSize(400, 300);
		frmProgrammation.setVisible(true);
		frmProgrammation.setResizable(false);
		frmProgrammation.getContentPane().setLayout(null);
		// frmProgrammation.pack( );
		// frmProgrammation.getContentPane().setBackground();

		JLabel labelH = new JLabel();
		labelH.setText("h");
		labelH.setFont(new Font("MV Boli", Font.PLAIN, 30));
		// labelH.setVerticalAlignment(JLabel.CENTER);
		// labelH.setHorizontalAlignment(JLabel.LEFT);
		labelH.setBounds(97, 6, 35, 200);
		frmProgrammation.getContentPane().add(labelH);

		JLabel labelM = new JLabel();
		labelM.setFont(new Font("MV Boli", Font.PLAIN, 30));
		labelM.setText("m");
		labelM.setBounds(227, 6, 35, 200);
		frmProgrammation.getContentPane().add(labelM);

		JPanel hPanel = new JPanel();
		hPanel.setBounds(0, 0, 85, 217);
		hPanel.setBackground(Color.LIGHT_GRAY);
		frmProgrammation.getContentPane().add(hPanel);

		btnIncreaseHours = new JButton("+");

		btnIncreaseHours.setFont(new Font("Lucida Grande", Font.PLAIN, 55));
		btnIncreaseHours.setFocusable(false);
		hPanel.add(btnIncreaseHours);
		btnIncreaseHours.addActionListener(this);

		txtHours = new JTextField();
		txtHours.setHorizontalAlignment(SwingConstants.TRAILING);
		txtHours.setBackground(Color.LIGHT_GRAY);
		txtHours.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		txtHours.setText("0");
		txtHours.setEditable(false);
		hPanel.add(txtHours);
		txtHours.setPreferredSize(new Dimension(50, 50));

		btnDecreaseHours = new JButton("-");
		btnDecreaseHours.setFont(new Font("Lucida Grande", Font.PLAIN, 60));
		btnDecreaseHours.setFocusable(false);
		btnDecreaseHours.addActionListener(this);
		hPanel.add(btnDecreaseHours);

		JPanel sPanel = new JPanel();
		sPanel.setBounds(130, 0, 85, 217);
		sPanel.setBackground(Color.LIGHT_GRAY);
		frmProgrammation.getContentPane().add(sPanel);

		btnIncreaseMinutes = new JButton("+");
		btnIncreaseMinutes.setFont(new Font("Lucida Grande", Font.PLAIN, 55));
		btnIncreaseMinutes.setFocusable(false);
		btnIncreaseMinutes.addActionListener(this);
		sPanel.add(btnIncreaseMinutes);

		txtMinutes = new JTextField();
		txtMinutes.setHorizontalAlignment(SwingConstants.TRAILING);
		txtMinutes.setEditable(false);
		txtMinutes.setBackground(Color.LIGHT_GRAY);
		txtMinutes.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		txtMinutes.setText("0");
		sPanel.add(txtMinutes);
		txtMinutes.setPreferredSize(new Dimension(50, 50));

		btnDecreaseMinutes = new JButton("-");
		btnDecreaseMinutes.setFont(new Font("Lucida Grande", Font.PLAIN, 60));
		btnDecreaseMinutes.setFocusable(false);
		btnDecreaseMinutes.addActionListener(this);
		sPanel.add(btnDecreaseMinutes);

		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 216, 400, 56);
		frmProgrammation.getContentPane().add(panel);

		btnDecreaseTSeconds = new JButton("-");
		btnDecreaseTSeconds.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		btnDecreaseTSeconds.setFocusable(false);
		btnDecreaseTSeconds.addActionListener(this);
		panel.add(btnDecreaseTSeconds);

		txtTSecondes = new JTextField();
		txtTSecondes.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		txtTSecondes.setBackground(Color.LIGHT_GRAY);
		txtTSecondes.setEditable(false);
		txtTSecondes.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTSecondes.setText(currentHeure * 3600 + currentMin * 60 + currentSec + " secondes");
		panel.add(txtTSecondes);
		txtTSecondes.setColumns(10);

		btnIncreaseTSeconds = new JButton("+");
		btnIncreaseTSeconds.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		btnIncreaseTSeconds.setFocusable(false);
		btnIncreaseTSeconds.addActionListener(this);
		panel.add(btnIncreaseTSeconds);

		JLabel labelS = new JLabel();
		labelS.setText("s");
		labelS.setFont(new Font("Dialog", Font.PLAIN, 30));
		labelS.setBounds(348, 6, 35, 200);
		frmProgrammation.getContentPane().add(labelS);

		JPanel mPanel = new JPanel();
		mPanel.setBackground(Color.LIGHT_GRAY);
		mPanel.setBounds(261, 0, 85, 217);
		frmProgrammation.getContentPane().add(mPanel);

		btnIncreaseSecondes = new JButton("+");
		btnIncreaseSecondes.setFont(new Font("Lucida Grande", Font.PLAIN, 55));
		btnIncreaseSecondes.setFocusable(false);
		btnIncreaseSecondes.addActionListener(this);
		;
		mPanel.add(btnIncreaseSecondes);

		txtSeconds = new JTextField();
		txtSeconds.setHorizontalAlignment(SwingConstants.TRAILING);
		txtSeconds.setText("0");
		txtSeconds.setPreferredSize(new Dimension(50, 50));
		txtSeconds.setFont(new Font("Lucida Grande", Font.PLAIN, 28));
		txtSeconds.setEditable(false);
		txtSeconds.setBackground(Color.LIGHT_GRAY);
		mPanel.add(txtSeconds);

		btnDecreaseSeconds = new JButton("-");
		btnDecreaseSeconds.setFont(new Font("Lucida Grande", Font.PLAIN, 60));
		btnDecreaseSeconds.setFocusable(false);
		btnDecreaseSeconds.addActionListener(this);
		mPanel.add(btnDecreaseSeconds);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnIncreaseHours) {
			currentHeure = Integer.parseInt(txtHours.getText());

			if (currentHeure < 23)
				txtHours.setText(String.valueOf(currentHeure + 1));
			else
				txtHours.setText(String.valueOf(0));
			currentTSec = Integer.parseInt(txtHours.getText()) * 3600 + Integer.parseInt(txtMinutes.getText()) * 60
					+ Integer.parseInt(txtSeconds.getText());
			txtTSecondes.setText(String.valueOf(currentTSec) + " secondes");

		}

		if (e.getSource() == btnDecreaseHours) {
			currentHeure = Integer.parseInt(txtHours.getText());

			if (currentHeure > 0)
				txtHours.setText(String.valueOf(currentHeure - 1));
			else
				txtHours.setText(String.valueOf(23));

			// update currentTSec after adjusting txtHours
			currentTSec = Integer.parseInt(txtHours.getText()) * 3600 + Integer.parseInt(txtMinutes.getText()) * 60
					+ Integer.parseInt(txtSeconds.getText());

			txtTSecondes.setText(String.valueOf(currentTSec) + " secondes");
		}

		if (e.getSource() == btnIncreaseMinutes) {
			currentMin = Integer.parseInt(txtMinutes.getText());

			if (currentMin < 59)
				txtMinutes.setText(String.valueOf(currentMin + 1));
			else
				txtMinutes.setText(String.valueOf(0));
			currentTSec = Integer.parseInt(txtHours.getText()) * 3600 + Integer.parseInt(txtMinutes.getText()) * 60
					+ Integer.parseInt(txtSeconds.getText());
			txtTSecondes.setText(String.valueOf(currentTSec) + " secondes");
		}

		if (e.getSource() == btnDecreaseMinutes) {
			currentMin = Integer.parseInt(txtMinutes.getText());

			if (currentMin > 0)
				txtMinutes.setText(String.valueOf(currentMin - 1));
			else
				txtMinutes.setText(String.valueOf(59));

			currentTSec = Integer.parseInt(txtHours.getText()) * 3600 + Integer.parseInt(txtMinutes.getText()) * 60
					+ Integer.parseInt(txtSeconds.getText());
			txtTSecondes.setText(String.valueOf(currentTSec) + " secondes");
		}

		if (e.getSource() == btnIncreaseSecondes) {
			currentSec = Integer.parseInt(txtSeconds.getText());

			if (currentSec < 59)
				txtSeconds.setText(String.valueOf(currentSec + 1));
			else
				txtSeconds.setText(String.valueOf(0));
			currentTSec = Integer.parseInt(txtHours.getText()) * 3600 + Integer.parseInt(txtMinutes.getText()) * 60
					+ Integer.parseInt(txtSeconds.getText());
			txtTSecondes.setText(String.valueOf(currentTSec) + " secondes");

		}

		if (e.getSource() == btnDecreaseSeconds) {
			currentSec = Integer.parseInt(txtSeconds.getText());

			if (currentSec > 0)
				txtSeconds.setText(String.valueOf(currentSec - 1));
			else
				txtSeconds.setText(String.valueOf(59));
			currentTSec = Integer.parseInt(txtHours.getText()) * 3600 + Integer.parseInt(txtMinutes.getText()) * 60
					+ Integer.parseInt(txtSeconds.getText());
			txtTSecondes.setText(String.valueOf(currentTSec) + " secondes");

		}

		if (e.getSource() == btnIncreaseTSeconds) {
			currentSec = Integer.parseInt(txtSeconds.getText());
			currentTSec = Integer.parseInt(txtHours.getText()) * 3600 + Integer.parseInt(txtMinutes.getText()) * 60
					+ Integer.parseInt(txtSeconds.getText());
			txtTSecondes.setText(String.valueOf(currentTSec + 1) + " secondes");
			txtSeconds.setText(String.valueOf(currentSec + 1));

		}

		if (e.getSource() == btnDecreaseTSeconds) {
			currentSec = Integer.parseInt(txtSeconds.getText());
			currentTSec = Integer.parseInt(txtHours.getText()) * 3600 + Integer.parseInt(txtMinutes.getText()) * 60
					+ Integer.parseInt(txtSeconds.getText());
			txtTSecondes.setText(String.valueOf(currentTSec - 1) + " secondes");
			txtSeconds.setText(String.valueOf(currentSec - 1));
		}

	}
}
