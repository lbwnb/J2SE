package GenericStack;

public class GenericStackTest {
public static void main(String[] args) {
	GenericStack<String> stack = new GenericStack<String>();
	//在创建GenericStack对象时填入了String类型，表明这个栈里面只能存放字符串元素
	//声明了一个GenericStack对象，名字为stack
	System.out.println("添加一些单词到栈里面去");
	stack.push("ShiYanLou");
	System.out.println("ShiYanLou添加进去");
	stack.push("OnlineLearning");
	System.out.println("OnlineLearning添加进去");
	while(!stack.isEmpty()) {
		//主要栈不为空，就取出其中的元素并打印出来
		
		String s = (String)stack.pop();
		//强制类型转换
		
		System.out.println("单词 ：" + s +"已经被取出来了");
	}
}
}
