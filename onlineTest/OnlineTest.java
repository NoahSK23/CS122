// Noah Klinger, 0934055, Submitted on: 2/6/2019

/*Online Java Paper Test*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class OnlineTest extends JFrame implements ActionListener {
	JLabel l;
	JRadioButton jb[] = new JRadioButton[5];
	JButton b1, b2;
	ButtonGroup bg;
	int count = 0, current = 0, x = 1, y = 1, now = 0;
	int m[] = new int[10];

	OnlineTest(String s) {
		super(s);
		l = new JLabel();
		add(l);
		bg = new ButtonGroup();
		for (int i = 0; i < 5; i++) {
			jb[i] = new JRadioButton();
			add(jb[i]);
			bg.add(jb[i]);
		}
		b1 = new JButton("Next");
		b2 = new JButton("Bookmark");
		b1.addActionListener(this);
		b2.addActionListener(this);
		add(b1);
		add(b2);
		set();
		l.setBounds(20, 10, 450, 50);
		jb[0].setBounds(50, 80, 100, 20);
		jb[1].setBounds(50, 110, 100, 20);
		jb[2].setBounds(50, 140, 100, 20);
		jb[3].setBounds(50, 170, 100, 20);
		b1.setBounds(100, 240, 100, 30);
		b2.setBounds(270, 240, 100, 30);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setLocation(250, 100);
		setVisible(true);
		setSize(600, 350);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			if (check())
				count = count + 1;
			current++;
			set();
			if (current == 9) {
				b1.setEnabled(false);
				b2.setText("Result");
			}
		}
		if (e.getActionCommand().equals("Bookmark")) {
			JButton bk = new JButton("Bookmark" + x);
			bk.setBounds(480, 20 + 30 * x, 100, 30);
			add(bk);
			bk.addActionListener(this);
			m[x] = current;
			x++;
			current++;
			set();
			if (current == 9)
				b2.setText("Result");
			setVisible(false);
			setVisible(true);
		}
		for (int i = 0, y = 1; i < x; i++, y++) {
			if (e.getActionCommand().equals("Bookmark" + y)) {
				if (check())
					count = count + 1;
				now = current;
				current = m[y];
				set();
				((JButton) e.getSource()).setEnabled(false);
				current = now;
			}
		}

		if (e.getActionCommand().equals("Result")) {
			if (check())
				count = count + 1;
			current++;
			// System.out.println("correct ans="+count);
			JOptionPane.showMessageDialog(this, "correct ans=" + count);
			System.exit(0);
		}
	}

	void set() {
		jb[4].setSelected(true);
		if (current == 0) {
			l.setText("<HTML> Que1: What will the println statement in the following program segment display? int x = 5; <br> System.out.println(x++)</HTML>");
			jb[0].setText("5");
			jb[1].setText("6");
			jb[2].setText("0");
			jb[3].setText("<HTML> None of these </HTML>");
		}
		if (current == 1) {
			l.setText("<HTML> Que2: What will the println statement in the following program segment display?int x = 5;<br>System.out.println(++x)</HTML>");
			jb[0].setText("5");
			jb[1].setText("6");
			jb[2].setText("0");
			jb[3].setText("None of these");
		}
		if (current == 2) {
			l.setText("Que3: What is a floating point number, or a decimal?");
			jb[0].setText("Double");
			jb[1].setText("int");
			jb[2].setText("String");
			jb[3].setText("char");
		}
		if (current == 3) {
			l.setText("Que4: Which of the following is used to create a line of comment?");
			jb[0].setText("-");
			jb[1].setText("+");
			jb[2].setText("//");
			jb[3].setText("=");
		}
		if (current == 4) {
			l.setText("Que5: This method will executes a group of statements and then terminates.");
			jb[0].setText("Value-returning");
			jb[1].setText("void");
			jb[2].setText("argument");
			jb[3].setText("end");
		}
		if (current == 5) {
			l.setText("Que6: Which method can be defined only once in a program?");
			jb[0].setText("main-method");
			jb[1].setText("value-returning method");
			jb[2].setText("void method");
			jb[3].setText("parameter method");
		}
		if (current == 6) {
			l.setText("Que7: Each byte is assigned a unique _________.");
			jb[0].setText("CPUs");
			jb[1].setText("address");
			jb[2].setText("bit");
			jb[3].setText("variable");
		}
		if (current == 7) {
			l.setText("Que8: If you were to look at a machine language program, you would see?");
			jb[0].setText("Java source code");
			jb[1].setText("a stream of binary numbers");
			jb[2].setText("English words");
			jb[3].setText("circuits");
		}
		if (current == 8) {
			l.setText("Que9: What is a null statement?");
			jb[0].setText("A statement that tells the program to close.");
			jb[1].setText("A statement that tells an application window when to freeze.");
			jb[2].setText("A statement that tells the program to skip over a section of memory.");
			jb[3].setText("A statement that holds no information and does nothing.");
		}
		if (current == 9) {
			l.setText("Que10: Which of these statements takes the least time to process?");
			jb[0].setText("for");
			jb[1].setText("switch");
			jb[2].setText("while");
			jb[3].setText("if-else");
		}
		l.setBounds(20, 10, 450, 50);
		for (int i = 0, j = 0; i <= 90; i += 30, j++)
			jb[j].setBounds(50, 80 + i, 200, 20);
	}

	boolean check() {
		if (current == 0)
			return (jb[0].isSelected());
		if (current == 1)
			return (jb[1].isSelected());
		if (current == 2)
			return (jb[0].isSelected());
		if (current == 3)
			return (jb[2].isSelected());
		if (current == 4)
			return (jb[1].isSelected());
		if (current == 5)
			return (jb[0].isSelected());
		if (current == 6)
			return (jb[1].isSelected());
		if (current == 7)
			return (jb[1].isSelected());
		if (current == 8)
			return (jb[3].isSelected());
		if (current == 9)
			return (jb[0].isSelected());
		return false;
	}

	public static void main(String s[]) {
		new OnlineTest("Spring 2019 - CISC 122 - Online Exam");
	}

}
