 package DSA.LL;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class linkedlist implements ActionListener {
    JFrame f;
    JTextField t1, t2;
    JLabel l1, l2;
    JTextArea a1;
    JButton b1, b2, b3, b4, b5, b6, b7, clear;

    linkedlist() throws Exception{
        f=new JFrame();
        f.setSize(500, 500);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setTitle("Linked List Implementation");
        initialize();
        f.setVisible(true);
        
    }


    void initialize(){
        l1= new JLabel("Enter Position:- ");
        l1.setBounds(50, 10, 150, 30);
        l1.setFont(new Font("Ink Free",Font.BOLD, 18));
        f.add(l1);

        l2= new JLabel("Enter Data:- ");
        l2.setBounds(50, 50, 150, 30);
        l2.setFont(new Font("Ink Free",Font.BOLD, 18));
        f.add(l2);

        t1 = new JTextField();
        t1.setBounds(250, 10, 200, 30);
        f.add(t1);

        t2 = new JTextField();
        t2.setBounds(250, 50, 200, 30);
        f.add(t2);

        b1=new JButton("Insert First");
        b1.setBounds(50, 100, 110, 30);
        f.add(b1);

        
        b2=new JButton("Insert Last");
        b2.setBounds(195, 100, 110, 30);
        f.add(b2);

        
        b3=new JButton("Insert at Pos");
        b3.setBounds(335, 100, 110, 30);
        f.add(b3);

        b4=new JButton("Delete First");
        b4.setBounds(50, 150, 110, 30);
        f.add(b4);

        
        b5=new JButton("Delete Last");
        b5.setBounds(195, 150, 110, 30);
        f.add(b5);

        
        b6=new JButton("Delete at Pos");
        b6.setBounds(335, 150, 110, 30);
        f.add(b6);

        clear=new JButton("Clear all");
        clear.setBounds(200, 410, 100, 30);
        f.add(clear);
        


        a1=new JTextArea();
        a1.setBounds(50, 200, 400, 200);
        a1.setFont(new Font("century",Font.BOLD, 20));
        f.add(a1);
        a1.setLineWrap(true);
        a1.setBackground(new Color(150,250,250));
        a1.setEditable(false);


        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        clear.addActionListener(this);
        
    }

    Node first=null;
    class Node{
        String info;
        Node next;
        Node(String data){
            info=data;
            next=null;
        }
    }


    public static void main(String[] args) throws Exception {
        
        new linkedlist();
    }


    @Override
    public void actionPerformed(ActionEvent e)  {
        String t=t2.getText();
        
        Node temp;
        if(e.getSource()==b1){
            if(t.equals(" " )){
                a1.setText(" ");
                return;
            }
            
            Node newnode=new Node(t);
              if(first==null)
                     first=newnode;
              else{
                     newnode.next=first;
                    first=newnode;
                  }
             a1.setText("");
             temp=first;
             do{
                  a1.append(temp.info+" -> ");
                   temp=temp.next;
             }while(temp!=null);
             t2.setText(" ");

        }

        if(e.getSource()==b2){
            if(t.equals(" ")){
                a1.setText(" ");
                return;
            }
            Node newnode=new Node(t);
            if(first==null)
                first=newnode;
                
             else{
                 temp=first;
                  while(temp.next!=null){
                     temp=temp.next;
                  }
              temp.next=newnode;
                }
              a1.setText("");
              temp=first;
              do{
              a1.append(temp.info+" -> ");
                 temp=temp.next;
              }while(temp!=null);
             
             t2.setText(" ");
            }


        if(e.getSource()==b3){
            String te=t1.getText();
            if(t.equals(" ") && ((te).equals(null))){
                a1.setText(" ");
                return;
            }
            Node newnode= new Node(t);
            int pos=Integer.parseInt(t1.getText());
            if(first==null){
            a1.setText("Void Insertion");
            return;
        }

            else if(pos==1){
                newnode.next=first;
                    first=newnode;
            }
              else{
            temp=first;
            for(int i=1;i<pos-1;i++){
                    temp=temp.next;
            }
            newnode.next=temp.next;
            temp.next=newnode;
        }
        a1.setText("");
        temp=first;
        do{
            a1.append(temp.info+" -> ");
                temp=temp.next;
        }while(temp!=null);
        t2.setText(" ");
        t1.setText("");
        }

        if(e.getSource()==b4){
            temp=first;
            if(first.next==null){
                first=null;
                a1.setText("Linked List is Empty");
                return;
            }
            if(first==null){
                a1.setText("Linked List banaye po Delete garnu");
            }
            else if(temp.next==null)
                a1.setText("Nothing to Delete here");

            else{
                first=temp.next;

            }
            a1.setText("");
            temp=first;

            do{
                a1.append(temp.info+" -> ");
                 temp=temp.next;
           }while(temp!=null);
        }
        
        if(e.getSource()==b5){
            temp=first;
            if(first.next==null){
                first=null;
                a1.setText("Linked List is Empty");
                return;
            }
            if(first==null){
                a1.setText("Linked List banaye po Delete garnu");
            }
            else if(first.next==null)
                a1.setText("Nothing to Delete here");

            else{
                
                while(temp.next.next != null){
                    temp=temp.next;
                }
                temp.next=null;

            }
            a1.setText("");
            temp=first;

            do{
                a1.append(temp.info+" -> ");
                 temp=temp.next;
           }while(temp!=null);
        }


        if(e.getSource()==b6){
            temp=first;
            if(t1.getText()==null)
                a1.setText("Enter the Position To Delete");
            else{
                int pos1=Integer.parseInt(t1.getText());
                
                if((t1.getText().equals("1"))){
                    first=null;
                    a1.setText("Linked List is Empty");
                    t1.setText("");
                    return;
                    }
                else{
                for(int i=1;i<pos1-1;i++){
                    temp=temp.next;
                }
                temp.next=temp.next.next;
            }
         }
            a1.setText("");
            temp=first;
            do{
                a1.append(temp.info+" -> ");
                 temp=temp.next;
           }while(temp!=null);
           t1.setText("");
        }
        

        if(e.getSource()==clear){
            JOptionPane.showMessageDialog(f,"Are You Sure to Delete Linked List", "Question", JOptionPane.QUESTION_MESSAGE);
            a1.setText("");
            temp=null;
            first=null;
        }
    }
}

