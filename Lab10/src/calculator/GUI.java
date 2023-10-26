package calculator;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;


public class GUI {

	// add variables if needed
	private double n1, n2, ans;
	private boolean addBool, subBool, multBool, divBool;
	private String temp = "";

	public GUI() {
		// you can leave this constructor empty
		n1 = 0;
		n2 = 0;
		addBool = false;
		subBool = false;
		multBool = false;
		divBool = false;
	}

	/**
	 * start() is a method starts the GUI by creating the
	 * frame and panels needed to show this Java App.
	 * Feel free to configure the settings to match
	 * your intended output!
	 */
	public void start() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame frame = new JFrame();

					// configure your frame's size, title, and close operation
					frame.setSize(800, 1000);
					frame.setTitle("Lab 10 Calculator");
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

					try {
						UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					} catch (Exception e) {
						e.printStackTrace();
					}

					// add the main JPanel into your JFrame
					// call createMainPanel and add it to your JFrame
					frame.add(createMainPanel(), BorderLayout.CENTER);

					// uncomment if you want to pack all components closely together
					// frame.pack();

					// for some reason, a JFrame defaults to false for visibility
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * createMainPanel() creates all of the necessary components
	 * needed to be added into a main JPanel object.
	 * You will need to add more panels and components
	 * to make complete your Java App!
	 * @return a main JPanel object to be added into the JFrame
	 */
	public JPanel createMainPanel() {

		// this is our main panel to house other panels or components
		JPanel mainPanel = new JPanel();


		// TODO change layout if needed
		// this BoxLayout will line its components vertically on the y axis
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

		// TODO add more panels and components here!
		JPanel topPanel = new JPanel();

		JTextField output = new JTextField(12);
		output.setMaximumSize(new Dimension(800, 200));
		output.setFont(new Font(Font.SERIF, Font.PLAIN, 84));
		output.setHorizontalAlignment(JTextField.RIGHT);
		output.setEditable(false);

		topPanel.setMaximumSize(new Dimension(800, 200));
		topPanel.add(output);

		JPanel bottomPanel = new JPanel();
		bottomPanel.setLayout(new GridLayout(0, 3));
		JButton clear = new JButton("C");
		JButton delete = new JButton("DEL");
		JButton sqrt = new JButton("SQRT");
		JButton one = new JButton("1");
		JButton two = new JButton("2");
		JButton three = new JButton("3");
		JButton four = new JButton("4");
		JButton five = new JButton("5");
		JButton six = new JButton("6");
		JButton seven = new JButton("7");
		JButton eight = new JButton("8");
		JButton nine = new JButton("9");
		JButton decimal = new JButton(".");
		JButton zero = new JButton("0");
		JButton add = new JButton("+");
		JButton subtract = new JButton("-");
		JButton multiply = new JButton("*");
		JButton divide = new JButton("/");
		JButton equals = new JButton("=");

		bottomPanel.add(clear);
		bottomPanel.add(delete);
		bottomPanel.add(sqrt);
		bottomPanel.add(one);
		bottomPanel.add(two);
		bottomPanel.add(three);
		bottomPanel.add(four);
		bottomPanel.add(five);
		bottomPanel.add(six);
		bottomPanel.add(seven);
		bottomPanel.add(eight);
		bottomPanel.add(nine);
		bottomPanel.add(decimal);
		bottomPanel.add(zero);
		bottomPanel.add(equals);
		bottomPanel.add(add);
		bottomPanel.add(subtract);
		bottomPanel.add(multiply);
		bottomPanel.add(divide);
		for (Component c : bottomPanel.getComponents()){
			c.setFont(new Font(Font.SERIF, Font.PLAIN, 42));
		}

//		JButton[] functionBtn = new JButton[8];
//
//		functionBtn[0] = add;
//		functionBtn[1] = subtract;
//		functionBtn[2] = multiply;
//		functionBtn[3] = divide;
//		functionBtn[4] = equals;
//		functionBtn[5] = delete;
//		functionBtn[6] = clear;
//		functionBtn[7] = decimal;

		one.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//output.setText(output.getText()+"1");
				output.setText(output.getText()+"1");
				temp += "1";
			}
		});
		two.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//output.setText(output.getText()+"2");
				output.setText(output.getText()+"2");
				temp += "2";
			}
		});
		three.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//output.setText(output.getText()+"3");
				output.setText(output.getText()+"3");
				temp += "3";
			}
		});
		four.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//output.setText(output.getText()+"4");
				output.setText(output.getText()+"4");
				temp += "4";
			}
		});
		five.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//output.setText(output.getText()+"5");
				output.setText(output.getText()+"5");
				temp += "5";
			}
		});
		six.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//output.setText(output.getText()+"6");
				output.setText(output.getText()+"6");
				temp += "6";
			}
		});
		seven.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				output.setText(output.getText()+"7");
				temp += "7";
			}
		});
		eight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				output.setText(output.getText()+"8");
				temp += "8";
			}
		});
		nine.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				output.setText(output.getText()+"9");
				temp += "9";
			}
		});
		zero.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				output.setText(output.getText()+"0");
				temp += "0";
			}
		});
		decimal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!(temp.charAt(temp.length()-1)=='.')){
					output.setText(output.getText()+".");
					temp += ".";
				}
			}
		});
		add.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				output.setText(output.getText()+"+");
				n1 = Double.parseDouble(temp);
				temp = "";
				addBool = true;
			}
		});
		subtract.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				output.setText(output.getText()+"-");
				n1 = Double.parseDouble(temp);
				temp = "";
				subBool = true;
			}
		});
		multiply.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				output.setText(output.getText()+"*");
				n1 = Double.parseDouble(temp);
				temp = "";
				multBool = true;
			}
		});
		divide.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				output.setText(output.getText()+"/");
				n1 = Double.parseDouble(temp);
				temp = "";
				divBool = true;
			}
		});
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				output.setText("");
				temp = "";
				multBool = false;
				addBool = false;
				subBool = false;
				divBool = false;
			}
		});
		delete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (output.getText().length() > 0) {
					output.setText(output.getText().substring(0, output.getText().length()-1));
				}
				if (temp.length()>0){
					temp = temp.substring(0, temp.length()-1);
				}

			}
		});

		sqrt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ans = Math.sqrt(Double.parseDouble(temp));
				DecimalFormat df = new DecimalFormat("#.##");
				temp = df.format(ans);
				output.setText(temp);
			}
		});
		equals.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				n2 = Double.parseDouble(temp);
				if (addBool)
					ans = n2 + n1;
				else if (subBool)
					ans = n1 - n2;
				else if (multBool)
					ans = n2 * n1;
				else if (divBool && n2 != 0) {
					ans = (n1 / n2);
				} else if (divBool && n2 == 0){
					temp = "absolutely not";
					output.setText(temp);
					addBool = false;
					subBool = false;
					multBool = false;
					divBool = false;
					return;
				}
				DecimalFormat df = new DecimalFormat("#.##");
				temp = df.format(ans);
				output.setText(temp);

				addBool = false;
				subBool = false;
				multBool = false;
				divBool = false;
			}
		});





		// return the entire calculator panel as a JPanel object

		mainPanel.add(topPanel);
		mainPanel.add(bottomPanel);
		return mainPanel;


	}

}
