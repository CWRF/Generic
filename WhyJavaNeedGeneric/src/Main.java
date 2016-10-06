
/*
 * 这个例子用来说明为什么需要“泛型”
 * */
import java.util.ArrayList;

public class Main{

	public static void main(String[] args) {
		/*
		 * a1[0]是一个字符串，获取它的值：
		 * 第一种赋值形式：定义一个Object对象接收赋值
		 * 第二种赋值形式：在调用对应对象的方法时，进行强制类型转换
		 * */
		ArrayList a1 = new ArrayList();
		a1.add("yeah");
		a1.add(1);
		a1.add(new Object());
		
		Object first = a1.get(0);//第一种赋值形式
		String second = (String) a1.get(0);//第二种赋值形式
		System.out.println("first:"+first+" , "+"second:"+second);
		
		/*
		 * 由上一个例子引发的问题：
		 * 前面ArrayList对象add（）方法，任何类型都可以添加
		 * 向一个集合存值就是为了后期取出，在取出的时候就要面对“强制类型转换”的问题
		 * 编译器无法检测强制类型转换是否出错（因为一个集合，任何类型数据都可以添加）
		 * 在“强制类型转换”的过程中，如果“类型转换错误”，程序就会运行出错
		 * 
		 * 为了解决上述问题
		 * java5提出泛型：类型参数
		 * 
		 * 好处不言而喻，程序的可读性，安全性都提高了
		 * */
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("yeah");
		//a2.addAll(3);//定义了String类型参数，添加int类型数据，会报错
		String third = a2.get(0);
		System.out.println("third:"+third);
		
		/*
		 * 使用泛型类是一件很轻松的事情，集合框架中的类都是泛型类
		 * 
		 * 但在实际中，实现一个泛型并不是那么容易
		 * 
		 * 那么我们为什么不直接用数组呢？
		 * 这就像在问：为什么集合优于数组？
		 * 因为：数组是固定的，集合是自动扩展的
		 * 
		 * Manager is a Employee，是一个继承关系
		 * 创建一个员工集合，使用起来没有问题，但是创建一个经理集合，使用起来就不那么方便。但是我们有这种需求怎么办？
		 * 为了解决上面的问题，有了“通配符类型”
		 * */
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee());//可以添加员工
		employees.add(new Manager());//可以添加经理
		
		ArrayList<Manager> managers = new ArrayList<Manager>();
		//managers.add(new Employee());//不可以添加员工
		managers.add(new Manager());//可以添加经理
		
	}

}

class Employee{
	//..........
}

class Manager extends Employee{
	//..........
}
