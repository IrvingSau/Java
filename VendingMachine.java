/*
 * Date: 2018/2/16
 * Author: IrvingSau
 * Purpose: Create a system of vending machine
 */

import java.util.Scanner;

public class VendingMachine {
	//成员变量
	int price = 80;
	int total;
	int balance;
	
	VendingMachine()//构造函数，创建对象的时候会自动调用这个函数
	{
		total = 0;
	}
	
	VendingMachine(int a)
	{
		this.price = a;//在这个函数中，this.price从原本的成员变量80重新装载为100，叫做函数的重载
	}
	
	void showPromote()
	{
		System.out.println("Welcome to this vending mechine");
	}
	
	void inputMoney(int amount)
	{
		balance = balance + amount;
		showBalance();//在成员函数内部调用其他的成员函数，不需要加对象变量名
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
		VendingMachine vm = new VendingMachine();//为VendingMachine这个类创建一个对象vm
		vm.showPromote();
		vm.inputMoney(in.nextInt());
		vm.showBalance();
		vm.getFood();
		vm.showBalance();
		VendingMachine vm2 = new VendingMachine(100);//为VendingMachine这个类创建一个对象vm1，参数表中有100，将会匹配到VendingMachine(int a)这一构建函数
	}
}


/*
 * Java 在每次执行成员函数时会构建一个特殊的本地成员变量this；
 * 这个this变量和类的规范是完全一致的，用于作为一个中间的媒介值储存某一对象运行到这一成员函数时的各个值
 * 例如当vm运行showBalance()时，this的balancez此时就是vm这一对象的balance值
 * Java通过这个中间对象变量this实现准确找出每一个参与成员函数运算的对象
 */
