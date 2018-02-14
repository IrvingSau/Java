package shapes;

public class MyPic {
	public static void main(String[] args) 
	{
		Picture pic = new Picture(420,300);
		Circle c1 = new Circle(320,40,20);//用Circle这个类创建了一个c1的对象，对象的具体参数是c1位于x轴320，y轴40，半径20
		Rectangle r1 = new Rectangle(100, 100, 100, 100);
		Triangle t1 = new Triangle(100, 100, 200, 100, 150, 50);
		Line l1 = new Line(0,205,400,205);
		Circle c2 = new Circle(200,200,50);
		pic.add(c1);
		pic.add(r1);
		pic.add(t1);
		pic.add(l1);
		pic.add(c2);
		pic.draw();	//画出所有的东西
	}
}

/* 对象是实体，需要被创建，可以为我们做很多事情
 * 对象 = 属性+服务；
 * 属性： 一些数据，这些数据足以表达这个对象是什么样的，比如圆心和半径
 * 操作：紧密包围着内部的数据，操作可以是函数等，对于圆来说，操作就是利用圆心和半径这样的数据，在图片上画出这个圆
 */
