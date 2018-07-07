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
		//在窗体的构造方法中设置窗体的各项属性
		super();
		
		this.setSize(400, 300);
		//设置窗体大小
		
		this.getContentPane().setLayout(null);
		//返回此窗体的contentPane 对象，设置其布局
		
		this.setTitle("我的窗口");
		//设置窗口的标题
		
		this.add(getJLabel(),null);
		this.add(getJTextField(), null);
		this.add(getJButton(), null);
		//使用add()方法添加控件
		//add()方法可以将指定组件添加到此容器的给定位置上
		//第一个参数为待添加的组件，这里的组件来自我们的返回值
		//第二个参数为描述组件的布局限制的对象,不加限制，所以填null
		
		
	}
	public JLabel getJLabel() {
		//此处的返回值类型为JLabel
		
		if(myLabel == null) {
			myLabel = new JLabel();
			//实例化myLabel对象
			
			myLabel.setBounds(5,10,250,30);
			//使用setBounds()方法设置尺寸
			//四个参数为x,ywidth,height
			//代表了横向、纵向的位置，以及标签自身的宽和高
			
			myLabel.setText("Hello");
			//使用setText()方法设置要显示的文本
		}
		
		return myLabel;
	}
	private JTextField getJTextField() {
		//此处返回值类型为JTextField
		
		if(myTextField == null) {
			//防止出错
			
			myTextField = new JTextField();
			//实例化对象
			
			myTextField.setBounds(5,45,200,30);
			//设置它的位置和尺寸
			
			myTextField.setText("实验楼");
			//设定他要显示的字符串
		}
		return myTextField;
	}
	private JButton getJButton() {
		//返回值类型为JButton
		
		if(myButton == null) {
			myButton = new JButton();
			//实例化对象
			
			myButton.setBounds(5, 80, 100, 40);
			//设置他的位置和尺寸
			
			myButton.setText("点我");
			//设定他要显示的字符串
			
			myButton.addActionListener(new ActionListener() {
				//为其添加一个事件监听
				//ActionListener用与接受操作事件的侦听器接口
				//可使用组件的addActionListener方法向该组件注册
				//在发生操作事件时，调用该对象的actionPerformed方法.
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					//该方法会在发生操作时被调用
					
					myLabel.setForeground(Color.RED);
					//设置此组件的前景色
					
					myTextField.setBackground(Color.BLUE);
					//设置此组件的背景色
				}
			});
		}
		return myButton;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MySwingWindow window = new MySwingWindow();
		//声明一个窗体对象window
		
		window.setVisible(true);
		//设置这个窗体时可见的
	}

}
