import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class newChapter extends JFrame implements ActionListener {
	JLabel l;
	JRadioButton jb[] = new JRadioButton[6];
	JButton b1, b2;
	ButtonGroup bg;
	int count = 0, current = 0, x = 1, y = 1, now = 0;
	int m[] = new int[10];

	newChapter(String s) {
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
					"<html>Que1: What is the most efficient loop <br> for reading through an array?");
			jb[0].setText("While");
			jb[1].setText("do-While");
			jb[2].setText("for");
			jb[3].setText("enhanced for");
			jb[4].setText("continue");
		}
		if (current == 1) {
			l.setText(
					"<html>Que2: What is the first element in an array?");
			jb[0].setText("-1");
			jb[1].setText("0");
			jb[2].setText("1");
			jb[3].setText("10");
			jb[4].setText("None of the above");
		}
		if (current == 2) {
			l.setText("Que3: Can you pass an array through a method?");
			jb[0].setText("Yes, as a void method");
			jb[1].setText("<html>Yes, as a value-return method");
			jb[2].setText("No");
			jb[3].setText("<html>Yes, as a void or value return method");
			jb[4].setText("<html>Yes, as an array-returning <br> method");
		}
		if (current == 3) {
			l.setText("Que4: With Swing, you use this class to create a frame.");
			jb[0].setText("Frame");
			jb[1].setText("SwingFrame");
			jb[2].setText("JFrame");
			jb[3].setText("JavaFrame");
			jb[4].setText("PictureFrame");
		}
		if (current == 4) {
			l.setText("Que5: This is a object’s default layout manager");
			jb[0].setText("Border layout");
			jb[1].setText("Grid Layout");
			jb[2].setText("Flow Layout");
			jb[3].setText("Chart Layout");
			jb[4].setText("None");
		}
		if (current == 5) {
			l.setText("Que6: An object is a(n)_____.");
			jb[0].setText("Primitive data type");
			jb[1].setText("Instance of a class");
			jb[2].setText("Variable");
			jb[3].setText("Blueprint");
			jb[4].setText("Parameter");
		}
		if (current == 6) {
			l.setText("Que7: This is a class member that holds data.");
			jb[0].setText("Instance");
			jb[1].setText("Method");
			jb[2].setText("blueprint");
			jb[3].setText("Constructer");
			jb[4].setText("Field");
		}
		if (current == 7) {
			l.setText("Que8: This key word causes an object to be created in memory.");
			jb[0].setText("New");
			jb[1].setText("Create");
			jb[2].setText("Construct");
			jb[3].setText("Object");
			jb[4].setText("Access");
		}
		if (current == 8) {
			l.setText("Que9: A ______ reference is a reference variable that points to nothing.");
			jb[0].setText("Method");
			jb[1].setText("Void");
			jb[2].setText("Null");
			jb[3].setText("None of these");
			jb[4].setText("Calling");
		}
		if (current == 9) {
			l.setText("Que10: What is the representations of the third element in an array called?");
			jb[0].setText("a[2]");
			jb[1].setText("a(2)");
			jb[2].setText("a[3]");
			jb[3].setText("a(3)");
			jb[4].setText("a(4)");
		l.setBounds(50, 40, 950, 50);
		for (int i = 90, j = 0; i <= 210; i += 30, j++)
			jb[j].setBounds(50, i, 200, 40);
		}
	}

	boolean check() {
		if (current == 0)
			return (jb[3].isSelected());
		if (current == 1)
			return (jb[1].isSelected());
		if (current == 2)
			return (jb[3].isSelected());
		if (current == 3)
			return (jb[2].isSelected());
		if (current == 4)
			return (jb[2].isSelected());
		if (current == 5)
			return (jb[1].isSelected());
		if (current == 6)
			return (jb[4].isSelected());
		if (current == 7)
			return (jb[0].isSelected());
		if (current == 8)
			return (jb[2].isSelected());
		if (current == 9)
			return (jb[0].isSelected());
		return false;
	}

	public static void main(String s[]) {
		new newChapter("Chaper 6 & 7 Quiz");
	}

}