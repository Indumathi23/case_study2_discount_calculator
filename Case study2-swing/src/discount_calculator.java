import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class discount_calculator {

	private JFrame frame;
	private JTextField p;
	private JTextField d;
	private JTextField t;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					discount_calculator window = new discount_calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public discount_calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DISCOUNT CALCULATOR");
		lblNewLabel.setBounds(147, 11, 122, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PRINCIPLE AMOUNT");
		lblNewLabel_1.setBounds(72, 53, 98, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("DISCOUNT");
		lblNewLabel_2.setBounds(72, 88, 72, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		p = new JTextField();
		p.setBounds(217, 50, 86, 20);
		frame.getContentPane().add(p);
		p.setColumns(10);
		
		d = new JTextField();
		d.setBounds(217, 81, 86, 20);
		frame.getContentPane().add(d);
		d.setColumns(10);
		
		JButton cal = new JButton("CALCULATE");
		cal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int p1=Integer.parseInt(p.getText());
				int d1=Integer.parseInt(d.getText());
				int x;
				x=(p1*d1)/100;
				int t1=p1-x;
				//t.setText(t1);
				//System.out.println(t1);
				t.setText(String.valueOf(t1));
			}
			
		});
		cal.setBounds(147, 131, 89, 23);
		frame.getContentPane().add(cal);
		
		JLabel lblNewLabel_3 = new JLabel("NET PRICE");
		lblNewLabel_3.setBounds(72, 192, 98, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		t = new JTextField();
		t.setBounds(217, 189, 86, 20);
		frame.getContentPane().add(t);
		t.setColumns(10);
	}
}
