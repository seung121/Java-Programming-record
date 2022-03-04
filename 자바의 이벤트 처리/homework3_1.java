import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ToZero extends JFrame {
	
	int val = (int)(Math.random() * 58 + 1);
	int count = 0;
	Container c = getContentPane();
	JLabel value = new JLabel(Integer.toString(val));
	JButton two = new JButton("+2");
	JButton one = new JButton("-1");
	JButton four = new JButton("%4");
	
	
	public ToZero() {

		setTitle("0으로 만들기"); // 프레임의 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

		//value.setLocation(150,5);
		
		c.setLayout(null); 

		
		two.addActionListener(new T());
		one.addActionListener(new O());
		four.addActionListener(new F());

		value.setSize(80,20);
		two.setSize(80,20);
		one.setSize(80,20);
		four.setSize(80,20);
		value.setLocation(250,10);
		two.setLocation(50,100);
		one.setLocation(200,100);
		four.setLocation(350,100);
		
		c.add(value);
		c.add(two);
		c.add(one);
		c.add(four);
		
		setSize(500, 300);
		setVisible(true); 

	}
	void Reset()
	{
		setTitle("성공!");
		count = 0;
		two.setEnabled(true);
		one.setEnabled(true);
		four.setEnabled(true);
	    val = (int)(Math.random() * 58 + 1);
	    value.setText(Integer.toString(val));
	}
	
	class T implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			val += 2;
			count +=1;
			value.setText(Integer.toString(val));
		     b.setEnabled(false);
		     c.add(value);	
				if (val == 0)
				{	
					Reset();
				}
				if(count == 3)
					setTitle("실패");
				
		     
		}
	}
	class O implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			val -= 1;
			count +=1;
			value.setText(Integer.toString(val));
		     b.setEnabled(false);
		     c.add(value);
				if (val == 0)
				{	
					Reset();
				}
				if(count == 3)
					setTitle("실패");
				
		}
	}
	class F implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			val %= 4;
			count +=1;
			value.setText(Integer.toString(val));
		     b.setEnabled(false);
		     c.add(value);
				if (val == 0)
				{	
					Reset();
				}
				if(count == 3)
					setTitle("실패");
		}
	}

	public static void main(String[] args) {
	
		new ToZero();
	} 
}



