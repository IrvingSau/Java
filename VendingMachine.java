/*
 * Date: 2018/2/16
 * Author: IrvingSau
 * Purpose: Create a system of vending machine
 */

import java.util.Scanner;

public class VendingMachine {
	//��Ա����
	int price = 80;
	int total;
	int balance;
	
	VendingMachine()//���캯�������������ʱ����Զ������������
	{
		total = 0;
	}
	
	VendingMachine(int a)
	{
		this.price = a;//����������У�this.price��ԭ���ĳ�Ա����80����װ��Ϊ100����������������
	}
	
	void showPromote()
	{
		System.out.println("Welcome to this vending mechine");
	}
	
	void inputMoney(int amount)
	{
		balance = balance + amount;
		showBalance();//�ڳ�Ա�����ڲ����������ĳ�Ա����������Ҫ�Ӷ��������
	}
	
	void showBalance()
	{
		System.out.println(balance);
	}
	
	void getFood()
	{
		if(balance >= price)
		{
			System.out.println("Here you are!");
			balance = balance - price;
			total = total + price;
		}else
		{
			System.out.println("Not enough money");
		}
			
	}
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		VendingMachine vm = new VendingMachine();//ΪVendingMachine����ഴ��һ������vm
		vm.showPromote();
		vm.inputMoney(in.nextInt());
		vm.showBalance();
		vm.getFood();
		vm.showBalance();
		VendingMachine vm2 = new VendingMachine(100);//ΪVendingMachine����ഴ��һ������vm1������������100������ƥ�䵽VendingMachine(int a)��һ��������
	}
}


/*
 * Java ��ÿ��ִ�г�Ա����ʱ�ṹ��һ������ı��س�Ա����this��
 * ���this��������Ĺ淶����ȫһ�µģ�������Ϊһ���м��ý��ֵ����ĳһ�������е���һ��Ա����ʱ�ĸ���ֵ
 * ���統vm����showBalance()ʱ��this��balancez��ʱ����vm��һ�����balanceֵ
 * Javaͨ������м�������thisʵ��׼ȷ�ҳ�ÿһ�������Ա��������Ķ���
 */
