
/*
 * �����������˵��Ϊʲô��Ҫ�����͡�
 * */
import java.util.ArrayList;

public class Main{

	public static void main(String[] args) {
		/*
		 * a1[0]��һ���ַ�������ȡ����ֵ��
		 * ��һ�ָ�ֵ��ʽ������һ��Object������ո�ֵ
		 * �ڶ��ָ�ֵ��ʽ���ڵ��ö�Ӧ����ķ���ʱ������ǿ������ת��
		 * */
		ArrayList a1 = new ArrayList();
		a1.add("yeah");
		a1.add(1);
		a1.add(new Object());
		
		Object first = a1.get(0);//��һ�ָ�ֵ��ʽ
		String second = (String) a1.get(0);//�ڶ��ָ�ֵ��ʽ
		System.out.println("first:"+first+" , "+"second:"+second);
		
		/*
		 * ����һ���������������⣺
		 * ǰ��ArrayList����add�����������κ����Ͷ��������
		 * ��һ�����ϴ�ֵ����Ϊ�˺���ȡ������ȡ����ʱ���Ҫ��ԡ�ǿ������ת����������
		 * �������޷����ǿ������ת���Ƿ������Ϊһ�����ϣ��κ��������ݶ�������ӣ�
		 * �ڡ�ǿ������ת�����Ĺ����У����������ת�����󡱣�����ͻ����г���
		 * 
		 * Ϊ�˽����������
		 * java5������ͣ����Ͳ���
		 * 
		 * �ô����Զ���������Ŀɶ��ԣ���ȫ�Զ������
		 * */
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("yeah");
		//a2.addAll(3);//������String���Ͳ��������int�������ݣ��ᱨ��
		String third = a2.get(0);
		System.out.println("third:"+third);
		
		/*
		 * ʹ�÷�������һ�������ɵ����飬���Ͽ���е��඼�Ƿ�����
		 * 
		 * ����ʵ���У�ʵ��һ�����Ͳ�������ô����
		 * 
		 * ��ô����Ϊʲô��ֱ���������أ�
		 * ��������ʣ�Ϊʲô�����������飿
		 * ��Ϊ�������ǹ̶��ģ��������Զ���չ��
		 * 
		 * Manager is a Employee����һ���̳й�ϵ
		 * ����һ��Ա�����ϣ�ʹ������û�����⣬���Ǵ���һ�������ϣ�ʹ�������Ͳ���ô���㡣��������������������ô�죿
		 * Ϊ�˽����������⣬���ˡ�ͨ������͡�
		 * */
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee());//�������Ա��
		employees.add(new Manager());//������Ӿ���
		
		ArrayList<Manager> managers = new ArrayList<Manager>();
		//managers.add(new Employee());//���������Ա��
		managers.add(new Manager());//������Ӿ���
		
	}

}

class Employee{
	//..........
}

class Manager extends Employee{
	//..........
}
