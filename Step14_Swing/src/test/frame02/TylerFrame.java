package test.frame02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TylerFrame extends JFrame implements ActionListener{
	//String type 을 인자로 전달 받는 생성자
	public TylerFrame(String ttt) {
		super(ttt);
		// 레이아웃 법칙 지정하기
		this.setLayout(new FlowLayout());
		// 버튼을 만들어서
		JButton runbtn=new JButton("뜀박질");
		// 버튼을 프레임에 추가하
		this.add(runbtn);
		
		runbtn.addActionListener(this);
	}
	
	public static void main(String[] args) {
		TylerFrame tf=new TylerFrame("Choi's Frame");
		tf.setBounds(100,100,500,300);
		tf.setVisible(true);
		tf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this, "Run!!");
	}
	
	
}
