
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.nio.file.*;

public class Keyboard extends JFrame {
    static int productID=0;
    public static void main(String[] args){
        new Keyboard();
        
    }
    private JFrame frame;
    Keyboard()
    {
        JTextField textName = new javax.swing.JTextField("Enter product ID");
        JLabel whatname = new javax.swing.JLabel();
        
        frame=new JFrame("Cash Register");
        JButton button = new JButton("Start Purchasing Session");
        button.setBounds(375, 475, 250 , 50 );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(button);
        frame.setSize(1000, 1000);
        frame.setLayout(null);
        frame.setVisible(true);
        button.addActionListener(new ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button.setVisible(false);
                JButton register = new JButton(" Scan products ");
                frame.add(register);
                register.setBounds(375, 475, 250 , 50 );
                register.setVisible(true);
                JPanel panel = new JPanel();
                panel.add(textName);
                register.addActionListener(new ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        register.setVisible(false);
                        frame.add(textName);
                        textName.setVisible(true);
                        textName.setBounds(375, 150, 200, 50);
                        whatname.setVisible(true);
                        whatname.setBounds(420, 500, 200, 50);
                        
                        textName.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent event) {
                                
                                frame.add(whatname);
                                
                                String name = getName();
                                if(name.equalsIgnoreCase("1")||name.equalsIgnoreCase("2")||
                                    name.equalsIgnoreCase("3")||name.equalsIgnoreCase("4")||
                                    name.equalsIgnoreCase("5")){
                                CashRegister obj1 = new CashRegister();
                                                                        
                                        try {
                                            String item = obj1.process(Integer.parseInt(name));
                                            whatname.setText(item);
                                            Files.write(Paths.get("Reciept.txt"), (item+"\n").getBytes(), StandardOpenOption.APPEND);
                                           
                                        } catch (IOException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                    else{
                                        textName.setText("Invalid Input!");
                                    }   
                            }
                        });  
                        JButton finish = new JButton(" End session ");
                        frame.add(finish);
                        finish.setBounds(375, 300, 200, 50);
                        finish.setVisible(true);
                        finish.addActionListener(new ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                Path path = Paths.get("Reciept.txt");
                                String message="";
                                try {
                                    message = new String(Files.readAllBytes(path));
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                JOptionPane.setRootFrame(frame);
                                JOptionPane.showMessageDialog(frame, message,"Reciept", EXIT_ON_CLOSE, null);
                                frame.dispose();
                            }
                        });
                        


            }

        });
    }

    public String getName(){
        return textName.getText();
    }

    
 
});
    }
}