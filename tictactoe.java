import javax.swing.*;
import java.awt.event.*;
import java.awt.event.MouseListener;
import java.util.Random;
import java.awt.*;
public class tictactoe implements ActionListener {
    JFrame f;
    JPanel t, b, last;
    JTextField l;
    Container c;
    JButton b1, b2, b3, b4, b5, b6,b7, b8,b9, bp, be;
    Font x,o, label;
    int random;
    int bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt1o, bt2o, bt3o, bt4o, bt5o, bt6o, bt7o, bt8o, bt9o;
    int count=0;
     tictactoe(){
        Random r= new Random();
        count=r.nextInt(2);
        
        f=new JFrame();
        t=new JPanel();
        b=new JPanel();
        f.setLocation(810, 300);
        f.setResizable(false);
        last=new JPanel();
        f.setSize(310,490);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("TicTacToe");
        b.setLayout(new GridLayout(3,3));
        b.setBounds(0,70,300,300);
        c=f.getContentPane();
        
        
        label=new Font("Ink Free",Font.BOLD, 40);
        x=new Font("Ink Free",Font.BOLD,60);
        o=new Font("Ink Free",Font.BOLD,80);

        last.setLayout(null);
        last.setBounds(0,370,300,80);
        

        initialize();
        addcomp();
        f.setVisible(true);
    }

    void addcomp(){

       // c.add(t,BorderLayout.NORTH);

        b.add(b1);
        b.add(b2);
        b.add(b3);
        b.add(b4);
        b.add(b5);
        b.add(b6);
        b.add(b7);
        b.add(b8);
        b.add(b9);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);

        c.add(b);
        last.setBackground(Color.BLACK);
        c.add(bp);
        c.add(be);   
        c.add(last);

        bp.addActionListener(this);
        be.addActionListener(this);
        
    }
      

    void initialize(){
        l=new JTextField("Play");
        if(count%2==0)
            l.setText("Player X turn");
        else   
            l.setText("Player O turn");
        l.setEditable(false);
        l.setBounds(0,0,300,70);
        l.setBackground(Color.BLACK);
        l.setForeground(Color.WHITE);
        l.setFont(label);
        l.setHorizontalAlignment(JTextField.CENTER);
        l.setHorizontalAlignment(JLabel.CENTER);


        t.setLayout(new BorderLayout());
        t.setBounds(0,0,300,70);
        c.add(l,BorderLayout.CENTER);

        b1=new JButton("");
        b1.setBackground(Color.CYAN);
        
        b2=new JButton("");
        b3=new JButton("");
        b4=new JButton("");
        b5=new JButton("");
        b6=new JButton("");
        b7=new JButton("");
        b8=new JButton("");
        b9=new JButton("");

        b2.setBackground(Color.CYAN);
        b3.setBackground(Color.CYAN);
        b4.setBackground(Color.CYAN);
        b5.setBackground(Color.CYAN);
        b6.setBackground(Color.CYAN);
        b7.setBackground(Color.CYAN);
        b8.setBackground(Color.CYAN);
        b9.setBackground(Color.CYAN);

        bp=new JButton("Play Again");
        bp.setBackground(Color.YELLOW);
        bp.setForeground(Color.BLACK);   
        bp.setBounds(30,390,100,35);
        bp.setFont(new Font("Ink Free",Font.BOLD, 14));
        

        be=new JButton("  Exit  ");
        be.setBackground(Color.YELLOW);
        be.setForeground(Color.BLACK);  
        be.setBounds(165,390,100,35);
        be.setFont(new Font("Ink Free",Font.BOLD, 14));

        b.setLayout(new GridLayout(3,3));
        b.setBackground(Color.CYAN); 
    
    }
    public static void main(String[] args) {
       tictactoe tt=new tictactoe();
    }

    public void actionPerformed(ActionEvent e) {
        if(count%2==0)
                l.setText("Player O turn");
        else
                l.setText("Player X turn");
        
        if(e.getSource()==b1){
            if(count%2==0){
                b1.setText("X");
                b1.setForeground(Color.BLACK);
              //  b1.setBackground(Color.CYAN);
                b1.setFont(x);
                count++;
                //b1.setEnabled(false);
                b1.removeActionListener( this);
                
            }
           else    {
                b1.setText("O");
                b1.setFont(x);
                count++;
               // b1.setEnabled(false);
                b1.removeActionListener(this);
            }
                
        }


       if(e.getSource()==b2){

           if(count%2==0){
                b2.setText("X");
                b2.setFont(x);
                count++;
                b2.removeActionListener( this);
                b1.setBorderPainted(false);
                }
            else    {
                b2.setText("O");
                b2.setFont(x);
                count++;
                b2.removeActionListener( this);
                b1.setBorderPainted(false);
                }
            }


        if(e.getSource()==b3){
                if(count%2==0){
                    b3.setText("X");
                    b3.setFont(x);
                    count++;
                    b3.removeActionListener( this);
                    
                }
               else    {
                     b3.setText("O");
                     b3.setFont(x);
                    count++;
                    b3.removeActionListener( this);}
                    
            }


        if(e.getSource()==b4){
                if(count%2==0){
                    b4.setText("X");
                    b4.setFont(x);
                    count++;
                    b4.removeActionListener( this);
                    
                }
               else    {
                     b4.setText("O");
                     b4.setFont(x);
                    count++;
                    b4.removeActionListener( this);}
                    
            }


        if(e.getSource()==b5){
                if(count%2==0){
                    b5.setText("X");
                    b5.setFont(x);
                    count++;
                    b5.removeActionListener( this);
                    
                }
               else    {
                     b5.setText("O");
                     b5.setFont(x);
                    count++;
                    b5.removeActionListener( this);}
                    
            }


        if(e.getSource()==b6){
                if(count%2==0){
                    b6.setText("X");
                    b6.setFont(x);
                    count++;
                    b6.removeActionListener( this);
                    
                }
               else    {
                     b6.setText("O");
                     b6.setFont(x);
                    count++;
                    b6.removeActionListener( this);}
                    
            }


        if(e.getSource()==b7){
                if(count%2==0){
                    b7.setText("X");
                    b7.setFont(x);
                    count++;
                    b7.removeActionListener( this);;
                    
                }
               else    {
                     b7.setText("O");
                     b7.setFont(x);
                    count++;
                    b7.removeActionListener( this);}
                    
            }


        if(e.getSource()==b8){
                if(count%2==0){
                    b8.setText("X");
                    b8.setFont(x);
                    count++;
                    b8.removeActionListener( this);;
                    
                }
               else    {
                     b8.setText("O");
                     b8.setFont(x);
                    count++;
                    b8.removeActionListener( this);}
                    
            }


        if(e.getSource()==b9){
                if(count%2==0){
                    b9.setText("X");
                    b9.setFont(x);
                    count++;
                    b9.removeActionListener( this);
                    
                }
               else    {
                     b9.setText("O");
                     b9.setFont(x);
                    count++;
                    b9.removeActionListener( this);}
                    
            }


    if(b3.getText()=="X" && b2.getText()=="X" && b1.getText()=="X"){
            l.setText("Player_X wins");
            b1.setBackground(Color.GREEN);
            b2.setBackground(Color.GREEN);
            b3.setBackground(Color.GREEN);
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
                }
    if(b3.getText()=="O" && b2.getText()=="O" && b1.getText()=="O"){
            l.setText("Player_O wins");
            b1.setBackground(Color.GREEN);
            b2.setBackground(Color.GREEN);
            b3.setBackground(Color.GREEN);
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }

          
    if(b1.getText()=="X" && b4.getText()=="X" && b7.getText()=="X"){
            l.setText("Player_X wins");
            b1.setBackground(Color.GREEN);
            b4.setBackground(Color.GREEN);
            b7.setBackground(Color.GREEN);
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
    if(b1.getText()=="O" && b4.getText()=="O" && b7.getText()=="O"){
            l.setText("Player_O wins");
            b1.setBackground(Color.GREEN);
            b7.setBackground(Color.GREEN);
            b4.setBackground(Color.GREEN);
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }


    if(b1.getText()=="X" && b5.getText()=="X" && b9.getText()=="X"){
            l.setText("Player_X wins");
            b1.setBackground(Color.GREEN);
            b5.setBackground(Color.GREEN);
            b9.setBackground(Color.GREEN);
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
    if(b1.getText()=="O" && b5.getText()=="O" && b9.getText()=="O"){
            l.setText("Player_O wins");
            b1.setBackground(Color.GREEN);
            b5.setBackground(Color.GREEN);
            b9.setBackground(Color.GREEN);
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }


    if(b3.getText()=="X" && b6.getText()=="X" && b9.getText()=="X"){
            l.setText("Player_X wins");
            b3.setBackground(Color.GREEN);
            b6.setBackground(Color.GREEN);
            b9.setBackground(Color.GREEN);
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
    if(b3.getText()=="O" && b6.getText()=="O" && b9.getText()=="O"){
            l.setText("Player_O wins");
            b3.setBackground(Color.GREEN);
            b6.setBackground(Color.GREEN);
            b9.setBackground(Color.GREEN);
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }


    if(b3.getText()=="X" && b5.getText()=="X" && b7.getText()=="X"){
            l.setText("Player_X wins");
            b3.setBackground(Color.GREEN);
            b5.setBackground(Color.GREEN);
            b7.setBackground(Color.GREEN);
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
    if(b3.getText()=="O" && b5.getText()=="O" && b7.getText()=="O"){
            l.setText("Player_O wins");
            b3.setBackground(Color.GREEN);
            b5.setBackground(Color.GREEN);
            b7.setBackground(Color.GREEN);
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }


    if(b7.getText()=="X" && b8.getText()=="X" && b9.getText()=="X"){
            l.setText("Player_X wins");
            b7.setBackground(Color.GREEN);
            b8.setBackground(Color.GREEN);
            b9.setBackground(Color.GREEN);
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
    if(b7.getText()=="O" && b8.getText()=="O" && b9.getText()=="O"){
            l.setText("Player_O wins");
            b7.setBackground(Color.GREEN);
            b8.setBackground(Color.GREEN);
            b9.setBackground(Color.GREEN);
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }


    if(b2.getText()=="X" && b5.getText()=="X" && b8.getText()=="X"){
            l.setText("Player_X wins");
            b2.setBackground(Color.GREEN);
            b5.setBackground(Color.GREEN);
            b8.setBackground(Color.GREEN);
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
    if(b2.getText()=="O" && b5.getText()=="O" && b8.getText()=="O"){
            l.setText("Player_O wins");
            b2.setBackground(Color.GREEN);
            b5.setBackground(Color.GREEN);
            b8.setBackground(Color.GREEN);
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }

    if(b4.getText()=="X" && b5.getText()=="X" && b6.getText()=="X"){
            l.setText("Player_X wins");
            b4.setBackground(Color.GREEN);
            b5.setBackground(Color.GREEN);
            b6.setBackground(Color.GREEN);
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
    if(b4.getText()=="O" && b5.getText()=="O" && b6.getText()=="O"){
            l.setText("Player_O wins");
            b4.setBackground(Color.GREEN);
            b5.setBackground(Color.GREEN);
            b6.setBackground(Color.GREEN);
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }

    if((b1.getText()!="") && (b2.getText()!="") &&  (b3.getText()!="") && (b4.getText()!="") && (b5.getText()!="") && (b6.getText()!="") &&(b7.getText()!="") && (b8.getText()!="") && (b9.getText()!=""))
        l.setText("DRAW");

    
    if(e.getSource()==bp){
           f.dispose();
           new tictactoe();
        }
    else if(e.getSource()==be){
            System.exit(0);
        }
       
        }
    }
 