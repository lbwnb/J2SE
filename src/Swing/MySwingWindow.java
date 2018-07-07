package Swing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MySwingWindow extends JFrame {
	private JLabel myLabel;
	private JTextField myTextField;
	private JButton myButton;
	
	public MySwingWindow() {
		//�ڴ���Ĺ��췽�������ô���ĸ�������
		super();
		
		this.setSize(400, 300);
		//���ô����С
		
		this.getContentPane().setLayout(null);
		//���ش˴����contentPane ���������䲼��
		
		this.setTitle("�ҵĴ���");
		//���ô��ڵı���
		
		this.add(getJLabel(),null);
		this.add(getJTextField(), null);
		this.add(getJButton(), null);
		//ʹ��add()������ӿؼ�
		//add()�������Խ�ָ�������ӵ��������ĸ���λ����
		//��һ������Ϊ����ӵ���������������������ǵķ���ֵ
		//�ڶ�������Ϊ��������Ĳ������ƵĶ���,�������ƣ�������null
		
		
	}
	public JLabel getJLabel() {
		//�˴��ķ���ֵ����ΪJLabel
		
		if(myLabel == null) {
			myLabel = new JLabel();
			//ʵ����myLabel����
			
			myLabel.setBounds(5,10,250,30);
			//ʹ��setBounds()�������óߴ�
			//�ĸ�����Ϊx,ywidth,height
			//�����˺��������λ�ã��Լ���ǩ����Ŀ�͸�
			
			myLabel.setText("Hello");
			//ʹ��setText()��������Ҫ��ʾ���ı�
		}
		
		return myLabel;
	}
	private JTextField getJTextField() {
		//�˴�����ֵ����ΪJTextField
		
		if(myTextField == null) {
			//��ֹ����
			
			myTextField = new JTextField();
			//ʵ��������
			
			myTextField.setBounds(5,45,200,30);
			//��������λ�úͳߴ�
			
			myTextField.setText("ʵ��¥");
			//�趨��Ҫ��ʾ���ַ���
		}
		return myTextField;
	}
	private JButton getJButton() {
		//����ֵ����ΪJButton
		
		if(myButton == null) {
			myButton = new JButton();
			//ʵ��������
			
			myButton.setBounds(5, 80, 100, 40);
			//��������λ�úͳߴ�
			
			myButton.setText("����");
			//�趨��Ҫ��ʾ���ַ���
			
			myButton.addActionListener(new ActionListener() {
				//Ϊ�����һ���¼�����
				//ActionListener������ܲ����¼����������ӿ�
				//��ʹ�������addActionListener����������ע��
				//�ڷ��������¼�ʱ�����øö����actionPerformed����.
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					//�÷������ڷ�������ʱ������
					
					myLabel.setForeground(Color.RED);
					//���ô������ǰ��ɫ
					
					myTextField.setBackground(Color.BLUE);
					//���ô�����ı���ɫ
				}
			});
		}
		return myButton;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MySwingWindow window = new MySwingWindow();
		//����һ���������window
		
		window.setVisible(true);
		//�����������ʱ�ɼ���
	}

}
