import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class onlineTestNEW extends JFrame implements ActionListener {
	JLabel l;
	JRadioButton jb[] = new JRadioButton[6];
	JButton b1, b2;
	ButtonGroup bg;
	int count = 0, current = 0, x = 1, y = 1, now = 0;
	int m[] = new int[10];

	onlineTestNEW(String s) {
		super(s);
		l = new JLabel();
		add(l);
		bg = new ButtonGroup();
		for (int i = 0; i < 6; i++) {
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
		l.setBounds(50, 40, 950, 50);
		jb[0].setBounds(70, 90, 400, 40);
		jb[1].setBounds(70, 120, 400, 40);
		jb[2].setBounds(70, 150, 400, 40);
		jb[3].setBounds(70, 180, 400, 40);
		jb[4].setBounds(70, 210, 400, 40);
		b1.setBounds(100, 260, 100, 30);
		b2.setBounds(270, 260, 100, 30);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setLocation(250, 100);
		setVisible(true);
		setSize(1000, 400);
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
//System.out.println("correct ans="+count);
			JOptionPane.showMessageDialog(this, "correct ans=" + count);
			System.exit(0);
		}
	}

	void set() {
		jb[5].setSelected(true);
		if (current == 0) {
			l.setText(
					"<html>Que1: What will be the println statment in the <br>following program segment display? (Int x = 5; System.out.print(x++);");
			jb[0].setText("6");
			jb[1].setText("5");
			jb[2].setText("0");
			jb[3].setText("None of these");
			jb[4].setText("hello");
		}
		if (current == 1) {
			l.setText(
					"<html>Que2:What will be the println statment in the <br>following program segment display? (Int x = 5; System.out.print(++x);");
			jb[0].setText("0");
			jb[1].setText("5");
			jb[2].setText("6");
			jb[3].setText("None of these");
		}
		if (current == 2) {
			l.setText("Que3: Which of the following is used to create a line comment?");
			jb[0].setText("=");
			jb[1].setText("-");
			jb[2].setText("+");
			jb[3].setText("//");
		}
		if (current == 3) {
			l.setText("Que4: The while loop is this type of loop?");
			jb[0].setText("Pretest");
			jb[1].setText("Posttest");
			jb[2].setText("Prefix");
			jb[3].setText("Postfix");
		}
		if (current == 4) {
			l.setText("Que5: What is each repetition of a loop known as?");
			jb[0].setText("cycle");
			jb[1].setText("Revolution");
			jb[2].setText("iteration");
			jb[3].setText("orbit");
		}
		if (current == 5) {
			l.setText("Que6: To open a file for writing, you use the following class.");
			jb[0].setText("FileOpen");
			jb[1].setText("OutputFile");
			jb[2].setText("PrintWriter");
			jb[3].setText("FileReader");
		}
		if (current == 6) {
			l.setText("Que7: If you were to look at a machine language program you would see ____ .");
			jb[0].setText("Java source code");
			jb[1].setText("Binary Numbers");
			jb[2].setText("English Words");
			jb[3].setText("Circuits");
		}
		if (current == 7) {
			l.setText("Que8: Which method can be defined only once in a program?");
			jb[0].setText("Parameter");
			jb[1].setText("void method");
			jb[2].setText("Value returning");
			jb[3].setText("Main Method");
		}
		if (current == 8) {
			l.setText("Que9: Each Byte is assigned a unique.");
			jb[0].setText("CPU");
			jb[1].setText("Address");
			jb[2].setText("Variable");
			jb[3].setText("Bit");
		}
		if (current == 9) {
			l.setText("Que10: What is a floating point number, or a decimal?");
			jb[0].setText("int");
			jb[1].setText("String");
			jb[2].setText("Double");
			jb[3].setText("CHar");
		}
		l.setBounds(50, 40, 950, 50);
		for (int i = 90, j = 0; i <= 210; i += 30, j++)
			jb[j].setBounds(50, i, 200, 20);
	}

	boolean check() {
		if (current == 0)
			return (jb[1].isSelected());
		if (current == 1)
			return (jb[2].isSelected());
		if (current == 2)
			return (jb[3].isSelected());
		if (current == 3)
			return (jb[0].isSelected());
		if (current == 4)
			return (jb[2].isSelected());
		if (current == 5)
			return (jb[2].isSelected());
		if (current == 6)
			return (jb[1].isSelected());
		if (current == 7)
			return (jb[3].isSelected());
		if (current == 8)
			return (jb[1].isSelected());
		if (current == 9)
			return (jb[2].isSelected());
		return false;
	}

	public static void main(String s[]) {
		new onlineTestNEW("Online Test Of Java");
	}

}
