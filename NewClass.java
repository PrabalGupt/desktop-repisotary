
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.AbstractButton;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Prabal Gupta
 */
public class NewClass {
    public static void main(String[] args)
    {  
    JFrame f=new JFrame("Button Example");  
    JButton b=new JButton("Log IN");  
    b.setBounds(200,250,100,30);  
    f.add(b);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);  
     JLabel l1,l2,l3;  
    l1=new JLabel("User Id"); 
    l1.setBounds(50,100,100,30);
    l2=new JLabel("Password");  
    l2.setBounds(50,150,100,30); 
    l3=new JLabel("Log IN");
    l3.setBounds(200,50,200,60);
    JMenuBar menuBar = new JMenuBar();  
        // File Menu, F - Mnemonic  
        JMenu fileMenu = new JMenu("File");
       fileMenu.addSeparator();
        fileMenu.setMnemonic(KeyEvent.VK_F);  
        menuBar.add(fileMenu);  
        // File->New, N - Mnemonic  
        JMenuItem menuItem1 = new JMenuItem("Open", KeyEvent.VK_N);  
        fileMenu.add(menuItem1); 
        f.add(l1); f.add(l2); f.add(l3); 
     JTextField t1,t2;  
    t1=new JTextField();  
    t1.setBounds(150,100, 200,30);  
    t2=new JTextField();  
    t2.setBounds(150,150, 200,30);
    
    
    f.add(t1); f.add(t2); 
    
  
        JCheckBoxMenuItem caseMenuItem = new JCheckBoxMenuItem("Option_1");  
        caseMenuItem.setMnemonic(KeyEvent.VK_C);  
        fileMenu.add(caseMenuItem);
         ActionListener aListener = new ActionListener() {  
            public void actionPerformed(ActionEvent event) {  
                AbstractButton aButton = (AbstractButton) event.getSource();  
                boolean selected = aButton.getModel().isSelected();  
                String newLabel;  
                Icon newIcon;  
                if (selected) {  
                    newLabel = "Value-1";  
                } else {  
                    newLabel = "Value-2";  
                }  
                aButton.setText(newLabel);  
            }  
        };  
  
        caseMenuItem.addActionListener(aListener);  
        f.setJMenuBar(menuBar);  
        f.setSize(350, 250);  
        f.setVisible(true);  
      
    
}  
}  

