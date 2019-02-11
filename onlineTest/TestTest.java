import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
  
class TestTest extends JFrame implements ActionListener  
{  
    JLabel l;  
    JRadioButton jb[]=new JRadioButton[6];  
    JButton b1,b2;  
    ButtonGroup bg;  
    int count=0,current=0,x=1,y=1,now=0;  
    int m[]=new int[10];      
    TestTest(String s)  
    {  
        super(s);  
        l=new JLabel();  
        add(l);  
        bg=new ButtonGroup();  
        for(int i=0;i<6;i++)  
        {  
            jb[i]=new JRadioButton();     
            add(jb[i]);  
            bg.add(jb[i]);  
        }  
        b1=new JButton("Next");  
        b2=new JButton("Bookmark");  
        b1.addActionListener(this);  
        b2.addActionListener(this);  
        add(b1);add(b2);  
        set();  
        l.setBounds(30,90,450,50);  
        jb[0].setBounds(50,180,400,70);  
        jb[1].setBounds(50,210,400,70);  
        jb[2].setBounds(50,240,400,70);  
        jb[3].setBounds(50,270,400,70);
        jb[4].setBounds(50,300,400,70);
        b1.setBounds(100,400,100,30);  
        b2.setBounds(270,400,100,30);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setLayout(null);  
        setLocation(250,100);  
        setVisible(true);  
        setSize(700,500);  
    }  
    public void actionPerformed(ActionEvent e)  
    {  
        if(e.getSource()==b1)  
        {  
            if(check())  
                count=count+1;  
            current++;  
            set();    
            if(current==9)  
            {  
                b1.setEnabled(false);  
                b2.setText("Result");  
            }  
        }  
        if(e.getActionCommand().equals("Bookmark"))  
        {  
            JButton bk=new JButton("Bookmark"+x);  
            bk.setBounds(480,20+30*x,100,30);  
            add(bk);  
            bk.addActionListener(this);  
            m[x]=current;  
            x++;  
            current++;  
            set();    
            if(current==9)  
                b2.setText("Result");  
            setVisible(false);  
            setVisible(true);  
        }  
        for(int i=0,y=1;i<x;i++,y++)  
        {  
        if(e.getActionCommand().equals("Bookmark"+y))  
        {  
            if(check())  
                count=count+1;  
            now=current;  
            current=m[y];  
            set();  
            ((JButton)e.getSource()).setEnabled(false);  
            current=now;  
        }  
        }  
      
        if(e.getActionCommand().equals("Result"))  
        {  
            if(check())  
                count=count+1;  
            current++;  
            //System.out.println("correct ans="+count);  
            JOptionPane.showMessageDialog(this,"correct ans="+count);  
            System.exit(0);  
        }  
    }  
    void set()  
    {  
        jb[5].setSelected(true);  
        if(current==0)  
        {  
            l.setText("<html>What will the println statement in the following program segment display? int x=5; System.out.println(x++);"); 
            jb[0].setText("5");jb[1].setText("6");jb[2].setText("0");jb[3].setText("None"); jb[4].setText("insert");   
        }  
        if(current==1)  
        {  
            l.setText("<html>What will the println statement in the following program segment display? int x = 5; System.out.println(++x);");  
            jb[0].setText("6");jb[1].setText("5");jb[2].setText("0");jb[3].setText("None");jb[4].setText("insert");  
        }  
        if(current==2)  
        {  
            l.setText("This method will executes a group of statements and then terminates.");  
            jb[0].setText("void");jb[1].setText("value-returning");jb[2].setText("argument");jb[3].setText("end");jb[4].setText("insert");  
        }  
        if(current==3)  
        {  
            l.setText("Which method can be defined only once in a program?");  
            jb[0].setText("Main Method");jb[1].setText("Value-Returning method");jb[2].setText("Parameter method");jb[3].setText("void method"); jb[4].setText("insert"); 
        }  
        if(current==4)  
        {  
            l.setText("Each byte is assigned a unique?");  
            jb[0].setText("address");jb[1].setText("CPU");jb[2].setText("bit");jb[3].setText("variable");jb[4].setText("insert"); 
        }  
        if(current==5)  
        {  
            l.setText("If you were to look at a machine lagnuage program you would see?");  
            jb[0].setText("Stream of Binary Numbers");jb[1].setText("Source Code");jb[2].setText("English words");jb[3].setText("Circuits");jb[4].setText("insert");  
        }  
        if(current==6)  
        {  
            l.setText("<html>These are words or names that are used to identify storage locations in memory and parts of the program that are created by the programmer.");  
            jb[0].setText("Programmer defined names");jb[1].setText("punctuation");jb[2].setText("Key Words"); jb[3].setText("Operators");jb[4].setText("insert");  
        }  
        if(current==7)  
        {  
            l.setText("<html>This type of memory can hold data for long periods of time—even when there is no power to the computer.");  
            jb[0].setText("Secondary Storage");jb[1].setText("Primary Storage");jb[2].setText("CPU storage");  
                        jb[3].setText("RAM"); jb[4].setText("insert");        
        }  
        if(current==8)  
        {  
            l.setText("What is a null statement?");  
            jb[0].setText("Holds no info and does nothing");jb[1].setText("tells program to close");jb[2].setText("tells application window");jb[3].setText("tells to skip memory");jb[4].setText("insert");  
        }  
        if(current==9)  
        {  
            l.setText("If there is an If statment inside another If statement what happens?");  
            jb[0].setText("First must be true then second will be checked");jb[1].setText("compiler error");jb[2].setText("ignore first statement");  
                        jb[3].setText("check second automatically");jb[4].setText("insert");  
        }  
        l.setBounds(30,90,450,50);  
        for(int i=180,j=0;i<=300;i+=30,j++)  
            jb[j].setBounds(50,i,400,70);  
    }  
    boolean check()  
    {  
        if(current==0)  
            return(jb[0].isSelected());  
        if(current==1)  
            return(jb[0].isSelected());  
        if(current==2)  
            return(jb[0].isSelected());  
        if(current==3)  
            return(jb[0].isSelected());  
        if(current==4)  
            return(jb[0].isSelected());  
        if(current==5)  
            return(jb[0].isSelected());  
        if(current==6)  
            return(jb[0].isSelected());  
        if(current==7)  
            return(jb[0].isSelected());  
        if(current==8)  
            return(jb[0].isSelected());  
        if(current==9)  
            return(jb[0].isSelected());  
        return false;  
    }  
    public static void main(String s[])  
    {  
        new TestTest("Spring 2019 - CISC 122 - Online Exam");  
    }  
}  
