import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemListener;
import java.awt.event.*;

public class unitconverter implements ItemListener, ActionListener{
    JFrame f;
    Font f1, f2;
    JLabel title,l1, l2, l3, l4,l5;
    Container c;
    JTextField t1;
    JTextArea a1;
    JComboBox<String> c1, c2, c3;
    JButton b;

    JRadioButton r1, r2;
    String currency[] = {"USD","NPR","INR"};
    String length[] = { "Metre", "KiloMetre", "Mile"};
    //String mass[] = {"Gram", "KiloGram","Pound"};
   // String Numeral [] = {"Binary","Decimal", "Octal","hexa-Decimal"};
    unitconverter(){
        f=new JFrame();
        f.setSize(460, 550);
        f.setResizable(true);
        
        f.setTitle("Babish's Unit Converter");
        f.setResizable(false);
       
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c=f.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        initialize();
        
        addcomp();
        f.setVisible(true);

    }
    void addcomp(){
        c.add(title);
        c.add(l1);
        c.add(r1);
        c.add(r2);
        r1.addItemListener(this);
        r2.addItemListener(this);
        c.add(l2);
        c.add(t1);
        c.add(l3);
        c.add(c2);
       // c2.addItemListener(this);
        c.add(l4);
        c.add(c3);
     //   c3.addItemListener(this);
        c.add(l5);
        c.add(a1);
        c.add(b);
        b.addActionListener(this);


    }
    
    void initialize(){
        f1=new Font("Cascadia Code SemiBold", Font.BOLD, 40);
        f2=new Font("Bahnschrift SemiBold", Font.BOLD, 16);


        title= new JLabel("Unit Converter",SwingConstants.CENTER);
        title.setBounds(20, 30, 400, 50);
        title.setFont(f1);

        l1=new JLabel("Choose the Converter:");
        l1.setBounds(50, 80, 300, 30 );
        l1.setFont(new Font("Bahnschrift SemiBold", Font.BOLD, 20));

        r1=new JRadioButton("Currency");
        r1.setBounds(50,120, 150,30);
        r1.setFont(f2);
        r1.setBackground(Color.CYAN);
        r1.setSelected(true);


        r2=new JRadioButton("Length");
        r2.setBounds(200,120,80,30);
        r2.setFont(f2);
        r2.setBackground(Color.CYAN);


        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        l2=new JLabel("Enter the value:");
        l2.setBounds(50, 150, 200, 30);
        l2.setFont(f2);

        t1=new JTextField();
        t1.setBounds(50,180,200, 30);
        t1.setFont(new Font("Bahnschrift SemiBold", Font.BOLD, 14));
        t1.setBackground(Color.BLACK);
        t1.setForeground(Color.WHITE);


        l3=new JLabel("From:");
        l3.setBounds(50, 220, 200, 30 );
        l3.setFont(f2);
        
        c2=new JComboBox<>(currency);
        c2.setBounds(50,250, 100, 30);
        c2.setFont(f2);
    
        l4=new JLabel("To:");
        l4.setBounds(50, 290, 200, 30 );
        l4.setFont(f2);

        c3=new JComboBox<>(currency);
        c3.setBounds(50,320, 100, 30);
        c3.setFont(f2);

        
        l5=new JLabel("Result");
        l5.setBounds(50, 360, 100, 30);
        l5.setFont(f2);


        a1=new JTextArea("");
        a1.setBackground(Color.CYAN);
        a1.setForeground(Color.BLACK);
        a1.setBounds(50,390,150,30);
        a1.setFont(f2);
        

        b=new JButton("Calculate");
        b.setBounds(50, 440,100,30);
        b.setFont(new Font("Bahnschrift SemiBold", Font.BOLD, 14));
        

        



    }
    public void itemStateChanged(ItemEvent e){
    	if(r2.isSelected()) {
            c2.removeAllItems();
            c2.addItem("meter");
            c2.addItem("Kilometer");
            c2.addItem("Mile");
    	
            c3.removeAllItems();
            c3.addItem("meter");
            c3.addItem("Kilometer");
            c3.addItem("Mile");

    	}
         if(r1.isSelected()) {
            c2.removeAllItems();
            c2.addItem("USD");
            c2.addItem("NPR");
            c2.addItem("INR");

            c3.removeAllItems();
            c3.addItem("USD");
            c3.addItem("NPR");
            c3.addItem("INR");

           
            }
 }

    
    public static void main(String[] args){
        unitconverter uc=new unitconverter();

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Double temp=Double.parseDouble(t1.getText());
       if(e.getSource()==b){
            if(r1.isSelected()){
                if(c2.getSelectedIndex()==0){
                    if(c3.getSelectedIndex()==0)
                        a1.setText(t1.getText());
                    else if(c3.getSelectedIndex()==1)
                        a1.setText(String.valueOf(temp*132));
                    else  if(c3.getSelectedIndex()==2)
                    a1.setText(String.valueOf(temp*82));
                }
                else if(c2.getSelectedIndex()==1){
                    if(c3.getSelectedIndex()==0)
                        a1.setText(String.valueOf(temp/132));
                    else if(c3.getSelectedIndex()==1)
                        a1.setText(t1.getText());
                    else  if(c3.getSelectedIndex()==2)
                    a1.setText(String.valueOf(temp/1.6));

                }
                else if(c2.getSelectedIndex()==2){
                    if(c3.getSelectedIndex()==0)
                        a1.setText(String.valueOf(temp*0.01));
                    else if(c3.getSelectedIndex()==1)
                        a1.setText(String.valueOf(temp*1.6));
                    else  if(c3.getSelectedIndex()==2)
                    a1.setText(t1.getText());
                }
            }
            else if(r2.isSelected()){
                
                 if(c2.getSelectedIndex()==0){
                    if(c3.getSelectedIndex()==0)
                        a1.setText(t1.getText());
                    else if(c3.getSelectedIndex()==1)
                        a1.setText(String.valueOf(temp/1000));
                    else  if(c3.getSelectedIndex()==2)
                    a1.setText(String.valueOf(temp/0.000621));
                }
                else if(c2.getSelectedIndex()==1){
                   if(c3.getSelectedIndex()==0)
                       a1.setText(String.valueOf(temp/1000));
                   else if(c3.getSelectedIndex()==1)
                       a1.setText(t1.getText());
                   else  if(c3.getSelectedIndex()==2)
                   a1.setText(String.valueOf(temp*0.621371));
               }
               else if(c2.getSelectedIndex()==2){
                if(c3.getSelectedIndex()==0)
                    a1.setText(String.valueOf(temp*1609.344));
                else if(c3.getSelectedIndex()==1)
                    a1.setText(String.valueOf(temp*1.6093));
                else  if(c3.getSelectedIndex()==2)
                a1.setText(t1.getText());
    }
}
}
    }
}
