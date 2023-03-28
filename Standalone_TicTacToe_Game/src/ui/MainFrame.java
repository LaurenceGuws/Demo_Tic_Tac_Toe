package ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class MainFrame extends JFrame{

	/**
	 *  The UI for 3x3 tic tac toe
	 */
	private static final long serialVersionUID = -8808883923263763897L;
	private JPanel pnl_main;
	private JPanel pnl_1_1;
	private JPanel pnl_1_2;
	private JPanel pnl_1_3;
	private JPanel pnl_2_1;
	private JPanel pnl_2_2;
	private JPanel pnl_2_3;
	private JPanel pnl_3_1;
	private JPanel pnl_3_2;
	private JPanel pnl_3_3;
	private JButton btn_1_1;
	private JButton btn_1_2;
	private JButton btn_1_3;
	private JButton btn_2_1;
	private JButton btn_2_2;
	private JButton btn_2_3;
	private JButton btn_3_1;
	private JButton btn_3_2;
	private JButton btn_3_3;
	private int whoStarts; // 1 = X, 2 = 0
	private int nextTurn;
	private int [][] gridResults;
	
	public MainFrame(int whoStarts){
		this.whoStarts = whoStarts;
		nextTurn = this.whoStarts;
		initializeComponents();
			
		setBounds(650, 300, 400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	// Method to populate 3x3 buttons to a 3x3 grid for playing tic tac toe
	private void initializeComponents() {
		pnl_main = new JPanel();
		getContentPane().add(pnl_main, BorderLayout.CENTER);
		pnl_main.setLayout(new GridLayout(3, 3, 0, 0));
		
		pnl_1_1 = new JPanel();
		pnl_main.add(pnl_1_1);
		pnl_1_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		btn_1_1 = new JButton("");
		btn_1_1.setFont(new Font("Tahoma", Font.BOLD, 99));
		btn_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_1_1_clicked();
			}
		});
		pnl_1_1.add(btn_1_1);
		
		pnl_1_2 = new JPanel();
		pnl_main.add(pnl_1_2);
		pnl_1_2.setLayout(new GridLayout(1, 0, 0, 0));
		
		btn_1_2 = new JButton("");
		btn_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_1_2_clicked();
			}
		});
		btn_1_2.setFont(new Font("Tahoma", Font.BOLD, 99));
		pnl_1_2.add(btn_1_2);
		
		pnl_1_3 = new JPanel();
		pnl_main.add(pnl_1_3);
		pnl_1_3.setLayout(new GridLayout(1, 0, 0, 0));
		
		btn_1_3 = new JButton("");
		btn_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_1_3_clicked();
			}
		});
		btn_1_3.setFont(new Font("Tahoma", Font.BOLD, 99));
		pnl_1_3.add(btn_1_3);
		
		pnl_2_1 = new JPanel();
		pnl_main.add(pnl_2_1);
		pnl_2_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		btn_2_1 = new JButton("");
		btn_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_2_1_clicked();
			}
		});
		btn_2_1.setFont(new Font("Tahoma", Font.BOLD, 99));
		pnl_2_1.add(btn_2_1);
		
		pnl_2_2 = new JPanel();
		pnl_main.add(pnl_2_2);
		pnl_2_2.setLayout(new GridLayout(1, 0, 0, 0));
		
		btn_2_2 = new JButton("");
		btn_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_2_2_clicked();
			}
		});
		btn_2_2.setFont(new Font("Tahoma", Font.BOLD, 99));
		pnl_2_2.add(btn_2_2);
		
		pnl_2_3 = new JPanel();
		pnl_main.add(pnl_2_3);
		pnl_2_3.setLayout(new GridLayout(1, 0, 0, 0));
		
		btn_2_3 = new JButton("");
		btn_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_2_3_clicked();
			}
		});
		btn_2_3.setFont(new Font("Tahoma", Font.BOLD, 99));
		pnl_2_3.add(btn_2_3);
		
		pnl_3_1 = new JPanel();
		pnl_main.add(pnl_3_1);
		pnl_3_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		btn_3_1 = new JButton("");
		btn_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_3_1_clicked();
			}
		});
		btn_3_1.setFont(new Font("Tahoma", Font.BOLD, 99));
		pnl_3_1.add(btn_3_1);
		
		pnl_3_2 = new JPanel();
		pnl_main.add(pnl_3_2);
		pnl_3_2.setLayout(new GridLayout(1, 0, 0, 0));
		
		btn_3_2 = new JButton("");
		btn_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_3_2_clicked();
			}
		});
		btn_3_2.setFont(new Font("Tahoma", Font.BOLD, 99));
		pnl_3_2.add(btn_3_2);
		
		pnl_3_3 = new JPanel();
		pnl_main.add(pnl_3_3);
		pnl_3_3.setLayout(new GridLayout(1, 0, 0, 0));
		
		btn_3_3 = new JButton("");
		btn_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_3_3_clicked();
			}
		});
		btn_3_3.setFont(new Font("Tahoma", Font.BOLD, 99));
		pnl_3_3.add(btn_3_3);
	}

	// returns a 2D array of the grid.
	public int [][] getGrid() {
	    gridResults = new int [3][3];
		if(btn_1_1.getText().equals("X")) {
			gridResults[0][0] = 0;
		}else {
			if(btn_1_1.getText().equals("O")) {
				gridResults[0][0] = 1;
			}else {
				gridResults[0][0] = 3;
			}
		}
		
		if(btn_1_2.getText().equals("X")) {
			gridResults[0][1] = 0;
		}else {
			if(btn_1_2.getText().equals("O")) {
				gridResults[0][1] = 1;
			}else {
				gridResults[0][1] = 3;
			}
		}
		
		if(btn_1_3.getText().equals("X")) {
			gridResults[0][2] = 0;
		}else {
			if(btn_1_3.getText().equals("O")) {
				gridResults[0][2] = 1;
			}else {
				gridResults[0][2] = 3;
			}
		}
		
		if(btn_2_1.getText().equals("X")) {
			gridResults[1][0] = 0;
		}else {
			if(btn_2_1.getText().equals("O")) {
				gridResults[1][0] = 1;
			}else {
				gridResults[1][0] = 3;
			}
		}
		
		if(btn_2_2.getText().equals("X")) {
			gridResults[1][1] = 0;
		}else {
			if(btn_2_2.getText().equals("O")) {
				gridResults[1][1] = 1;
			}else {
				gridResults[1][1] = 3;
			}
		}
		
		if(btn_2_3.getText().equals("X")) {
			gridResults[1][2] = 0;
		}else {
			if(btn_2_3.getText().equals("O")) {
				gridResults[1][2] = 1;
			}else {
				gridResults[1][2] = 3;
			}
		}
		
		if(btn_3_1.getText().equals("X")) {
			gridResults[2][0] = 0;
		}else {
			if(btn_3_1.getText().equals("O")) {
				gridResults[2][0] = 1;
			}else {
				gridResults[2][0] = 3;
			}
		}
		
		if(btn_3_2.getText().equals("X")) {
			gridResults[2][1] = 0;
		}else {
			if(btn_3_2.getText().equals("O")) {
				gridResults[2][1] = 1;
			}else {
				gridResults[2][1] = 3;
			}
		}
		
		if(btn_3_3.getText().equals("X")) {
			gridResults[2][2] = 0;
		}else {
			if(btn_3_3.getText().equals("O")) {
				gridResults[2][2] = 1;
			}else {
				gridResults[2][2] = 3;
			}
		}
		return gridResults;
	}
	
	private void btn_1_1_clicked() {
		if(nextTurn == 1) {
			btn_1_1.setText("X");
			btn_1_1.setEnabled(false);
			nextTurn = 0;
		}else {
			btn_1_1.setText("O");
			btn_1_1.setEnabled(false);
			nextTurn = 1;
		}
		if(checkWin()) {
			System.out.println("Winner");
			System.exit(0);
		}
	}
	
	private void btn_1_2_clicked() {
		if(nextTurn == 1) {
			btn_1_2.setText("X");
			btn_1_2.setEnabled(false);
			nextTurn = 0;
		}else {
			btn_1_2.setText("O");
			btn_1_2.setEnabled(false);
			nextTurn = 1;
		}
		if(checkWin()) {
			System.out.println("Winner");
			System.exit(0);
		}
	}
	
	private void btn_1_3_clicked() {
		if(nextTurn == 1) {
			btn_1_3.setText("X");
			btn_1_3.setEnabled(false);
			nextTurn = 0;
		}else {
			btn_1_3.setText("O");
			btn_1_3.setEnabled(false);
			nextTurn = 1;
		}
		if(checkWin()) {
			System.out.println("Winner");
			System.exit(0);
		}
	}
	
	private void btn_2_1_clicked() {
		if(nextTurn == 1) {
			btn_2_1.setText("X");
			btn_2_1.setEnabled(false);
			nextTurn = 0;
		}else {
			btn_2_1.setText("O");
			btn_2_1.setEnabled(false);
			nextTurn = 1;
		}
		if(checkWin()) {
			System.out.println("Winner");
			System.exit(0);
		}
	}
	
	private void btn_2_2_clicked() {
		if(nextTurn == 1) {
			btn_2_2.setText("X");
			btn_2_2.setEnabled(false);
			nextTurn = 0;
		}else {
			btn_2_2.setText("O");
			btn_2_2.setEnabled(false);
			nextTurn = 1;
		}
		if(checkWin()) {
			System.out.println("Winner");
			System.exit(0);
		}
	}
	
	private void btn_2_3_clicked() {
		if(nextTurn == 1) {
			btn_2_3.setText("X");
			btn_2_3.setEnabled(false);
			nextTurn = 0;
		}else {
			btn_2_3.setText("O");
			btn_2_3.setEnabled(false);
			nextTurn = 1;
		}
		if(checkWin()) {
			System.out.println("Winner");
			System.exit(0);
		}
	}
	
	private void btn_3_1_clicked() {
		if(nextTurn == 1) {
			btn_3_1.setText("X");
			btn_3_1.setEnabled(false);
			nextTurn = 0;
		}else {
			btn_3_1.setText("O");
			btn_3_1.setEnabled(false);
			nextTurn = 1;
		}
		if(checkWin()) {
			System.out.println("Winner");
			System.exit(0);
		}
	}
	
	private void btn_3_2_clicked() {
		if(nextTurn == 1) {
			btn_3_2.setText("X");
			btn_3_2.setEnabled(false);
			nextTurn = 0;
		}else {
			btn_3_2.setText("O");
			btn_3_2.setEnabled(false);
			nextTurn = 1;
		}
		if(checkWin()) {
			System.out.println("Winner");
			System.exit(0);
		}
	}
	
	private void btn_3_3_clicked() {
		if(nextTurn == 1) {
			btn_3_3.setText("X");
			btn_3_3.setEnabled(false);
			nextTurn = 0;
		}else {
			btn_3_3.setText("O");
			btn_3_3.setEnabled(false);
			nextTurn = 1;
		}
		if(checkWin()) {
			System.out.println("Winner");
			System.exit(0);
		}
	}
	
	// checks if a player has won
	private boolean checkWin() {
		int [][] currentGrid = getGrid();
		/*
		 * X--
		 * -X-
		 * --X
		 */
		if(currentGrid[0][0] == 0 && currentGrid[1][1] == 0 && currentGrid[2][2] == 0) {
			return true;
		}
		
		
		/*
		 * O--
		 * -O-
		 * --O
		 */
		if(currentGrid[0][0] == 1 && currentGrid[1][1] == 1 && currentGrid[2][2] == 1) {
			return true;
		}
		
		
		/*
		 * --X
		 * -X-
		 * X--
		 */
		if(currentGrid[2][0] == 0 && currentGrid[1][1] == 0 && currentGrid[0][2] == 0) {
			return true;
		}
		
		
		/*
		 * --O
		 * -O-
		 * O--
		 */
		if(currentGrid[2][0] == 1 && currentGrid[1][1] == 1 && currentGrid[0][2] == 1) {
			return true;
		}
		
		
		/*
		 * X--
		 * X--
		 * X--
		 */
		if(currentGrid[0][0] == 0 && currentGrid[1][0] == 0 && currentGrid[2][0] == 0) {
			return true;
		}
		
		
		/*
		 * O--
		 * O--
		 * O--
		 */
		if(currentGrid[0][0] == 1 && currentGrid[1][0] == 1 && currentGrid[2][0] == 1) {
			return true;
		}
		
		/*
		 * -x-
		 * -x-
		 * -x-
		 */
		if(currentGrid[0][1] == 0 && currentGrid[1][1] == 0 && currentGrid[2][1] == 0) {
			return true;
		}
		
		
		/*
		 * -O-
		 * -O-
		 * -O-
		 */
		if(currentGrid[0][1] == 1 && currentGrid[1][1] == 1 && currentGrid[2][1] == 1) {
			return true;
		}
		
		
		/*
		 * --X
		 * --X
		 * --X
		 */
		if(currentGrid[0][2] == 0 && currentGrid[1][2] == 0 && currentGrid[2][2] == 0) {
			return true;
		}
		
		
		/*
		 * --O
		 * --O
		 * --O
		 */
		if(currentGrid[0][2] == 1 && currentGrid[1][2] == 1 && currentGrid[2][2] == 1) {
			return true;
		}

		
		/*
		 * xxx 
		 * ---
		 * ---
		 */
		if(currentGrid[0][0] == 0 && currentGrid[0][1] == 0 && currentGrid[0][2] == 0) {
			return true;
		}
		
		
		/*
		 * OOO
		 * ---
		 * ---
		 */
		if(currentGrid[0][0] == 1 && currentGrid[0][1] == 1 && currentGrid[0][2] == 1) {
			return true;
		}
		

		/*
		 * ---
		 * xxx
		 * ---
		 */
		if(currentGrid[1][0] == 0 && currentGrid[1][1] == 0 && currentGrid[1][2] == 0) {
			return true;
		}
		
		
		/*
		 * ---
		 * OOO
		 * ---
		 */
		if(currentGrid[1][0] == 1 && currentGrid[1][1] == 1 && currentGrid[1][2] == 1) {
			return true;
		}
		
		
		/*
		 * ---
		 * ---
		 * xxx
		 */
		if(currentGrid[2][0] == 0 && currentGrid[2][1] == 0 && currentGrid[2][2] == 0) {
			return true;
		}
		
		
		/*
		 * ---
		 * ---
		 * OOO
		 */
		if(currentGrid[2][0] == 1 && currentGrid[2][1] == 1 && currentGrid[2][2] == 1) {
			return true;
		}
		
		return false;
	}
}
