package shapes;

import java.awt.Graphics;

public class Circle/*����һ������Circle����*/ extends Shape {
	//��������ԣ��ڲ�������
	private int x;//Circle����������������
	private int y;
	private int radius;
	public Circle(int x, int y, int radius)
	{
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	//����Ĳ��������Բ���Ա�������
	@Override
	public void draw(Graphics g) {//�ⲿ������
		g.drawOval(x-radius, y-radius, radius*2, radius*2);
	}
}

/* ���ǹ淶�����Ը�����Ķ�������������
 * ����˵���������һ��ʵ��
 * �����Ƕ����˶����һ���淶
 */
 