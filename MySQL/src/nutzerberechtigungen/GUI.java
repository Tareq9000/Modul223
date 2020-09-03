package nutzerberechtigungen;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class GUI {
	
	  public static int ticketsToSell = 10;
	  
	  public static void main(String[] args) {
	      JPanel formPanel = createFormPanel();
	      JFrame frame = createFrame();
	      frame.add(formPanel);
	      frame.setLocationRelativeTo(null);
	      frame.setVisible(true);
	  }
	  
	  private static JPanel createFormPanel() {
	      //initialize fields
		  JLabel message = new JLabel("");
	      JTextField benutzer = new JTextField(10);
	      JTextField passwort = new JTextField(10);
	      JButton submitBtn = new JButton("Login");
	      
	      
	      DAO dao = new DAO();
	      
	      JPanel panel = new JPanel();
	      panel.setBorder(new EmptyBorder(10, 10, 10, 10));
	      //using FormBuilder
	      FormBuilder.init(panel)
	      			 .add("", message, FormBuilder::spanX3)
	      			 .newRow()
	                 .add("user name", benutzer, FormBuilder::spanX3)
	                 .newRow()
	                 .add("passwort", passwort, FormBuilder::spanX3)
	                 .newRow()
	                 .skipColumns(2).add(submitBtn, FormBuilder::spanX2);
	      
	      submitBtn.addActionListener(new java.awt.event.ActionListener() {
	           public void actionPerformed(java.awt.event.ActionEvent e) {
	        	   
	        	   Nutzer nutzer = new Nutzer();
	        	   
	        	   if(benutzer.getText().equals(dao.getAdminBName()) && passwort.getText().equals(dao.getAdminPWD())) {
	        		   nutzer.setRechte(Nutzer.ADMIN);
	        	   }
	        	   else if(benutzer.getText().equals(dao.getUserBName()) && passwort.getText().equals(dao.getUserPWD())) {
	        		   nutzer.setRechte(Nutzer.USER);
	        	   }
	        	   
	        	   if(nutzer.getRechte().equals(Nutzer.ADMIN)) {
	        		   // Stuff that an admin can do
	        		   message.setText("you are logged in as an admin");
	        	   }
	        	   else if(nutzer.getRechte().equals(Nutzer.USER)) {
	        		   // Stuff that an admin can do
	        		   message.setText("you are logged in as a user");
	        	   }
	        	   
	           }
	      });
	      
	      return panel;
	  }

	  private static JFrame createFrame() {
	      JFrame frame = new JFrame("Benutzerrechte");
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.setSize(new Dimension(400, 300));
	      return frame;
	  }
	}