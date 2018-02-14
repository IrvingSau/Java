package shapes;

import java.awt.Graphics;

public class Circle/*建立一个叫做Circle的类*/ extends Shape {
	//对象的属性，内部的数据
	private int x;//Circle的类中有三个数据
	private int y;
	private int radius;
	public Circle(int x, int y, int radius)
	{
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	//对象的操作：这个圆可以被画出来
	@Override
	public void draw(Graphics g) {//外部公开的
		g.drawOval(x-radius, y-radius, radius*2, radius*2);
	}
}

/* 类是规范，可以根据类的定义来创建对象
 * 可以说对象是类的一个实体
 * 而类是定义了对象的一个规范
 */
 