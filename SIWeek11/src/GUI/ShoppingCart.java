package GUI;

import java.awt.event.*;
import javax.swing.*; 
import java.awt.*;
import java.util.ArrayList;

public class ShoppingCart implements ActionListener{
	ShoppingCart(){
		
	}
	static JTextArea total = new JTextArea();
	static ArrayList<Integer> cart = new ArrayList<Integer>();
	
	public static void main(String[] args){
		frame();
		
    }
	
	public static void frame() {
		// create frame 
        JFrame frame = new JFrame("Shopping Cart");
        
        // set close operation to when user clicks exit
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // set the look and feel to the computer
        try { 
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); 
        } 
        catch (Exception e) { 
            System.err.println(e.getMessage()); 
        } 
        frame.setSize(600, 700);
        createCart(frame);
        frame.setVisible(true);
	}
	public static void createCart(JFrame frame){
		//create object
		ShoppingCart sc = new ShoppingCart();
		
		// panels to hold contents
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		//result box
		total = new JTextArea();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 100;
        c.gridwidth = 6;
        c.gridx = 0;
        c.gridy = 0;
        total.setEditable(false);
        total.setBackground(new Color(255,255,255));
        panel.add(total, c);
		
        //buttons
		JButton shirt, pants, shoes, sub, empty;
		
		shirt = new JButton("Shirt: $10");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 40;
        c.gridwidth = 2;
        c.gridx = 0;
        c.gridy = 1;
        panel.add(shirt, c);
        
        pants = new JButton("Pants: $40");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 2;
	    c.gridx = 2;
	    c.gridy = 1;
	    panel.add(pants, c);
	    
        shoes = new JButton("Shoes: $90");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 2;
	    c.gridx = 4;
	    c.gridy = 1;
	    panel.add(shoes, c);
	    
	    sub = new JButton("Subtotal");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 3;
	    c.gridx = 1;
	    c.gridy = 2;
	    panel.add(sub, c);
	    
        empty = new JButton("Empty");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 1;
        c.gridx = 5;
        c.gridy = 2;
        panel.add(empty, c); 
	    
	    frame.add(panel);
 
	    //listeners
	    shirt.addActionListener(sc);
        pants.addActionListener(sc);
        shoes.addActionListener(sc);
        sub.addActionListener(sc);
        empty.addActionListener(sc);
	 }
	@Override
	public void actionPerformed(ActionEvent e) {
		String n = e.getActionCommand();
		if (n.equals("Subtotal")) {
			total.setText(total.getText() + "\n\nSUBTOTAL: $" + findTotal(cart));
	    }
		else if (n.equals("Empty")){                                
			cart.clear();
			total.setText("");
	    }
		else if (n.equals("Shirt: $10")){                                
	         cart.add(10);
	         total.setText(total.getText() + "\nShirt     QTY: 1");
	    }
		else if (n.equals("Pants: $40")){                                
			cart.add(40);
			total.setText(total.getText() + "\nPants    QTY: 1");
	    }
		else if (n.equals("Shoes: $90")){                                
			cart.add(90);
			total.setText(total.getText() + "\nShoes   QTY: 1");
	    }
	  }
	public static String findTotal(ArrayList<Integer> c) {
		int sum = 0;
		for (int i = 0; i < cart.size(); i++) {
			sum = sum + cart.get(i);
		}
		return Integer.toString(sum);
		
	}
	
	
}