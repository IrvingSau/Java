
public class ObjectArrayAndForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ʹ��int��һ�������ݾ����ʹ���һ������a
		int[] a = new int[5];
		
		//ʹ�������½���Value�๹��һ����������array
		Value[] array = new Value[5];
		
		//��ʱ���ǹ�����array�����ǻ�����������,���Ǻ�Stringһ���Ķ�������
		String[] demo = new String[5];
		
		//////////////////////////////
		
		//��for-eachѭ���������������ͽ��в���//
		
		//////////////////////////////
		
			//1. ��Int
				//���
		for(int k: a) {
			System.out.println(k);
		}//���5��0����ʼֵ��
		
				//�༭
		for(int k: a) {
			k = 1;
		}
		System.out.println(a[0]);//�����ȻΪ0
		//ÿһ��for�еĲ����൱����k = a[0]�� �����ܸı�a������Ԫ�صĴ�С
		
		
			//2. ��Value�ͺ������������ͣ�
		
		for(int i = 0; i < array.length; i++) {
			array[i] = new Value();//��������array��ÿһ��Value��Ķ���, a[i]Ϊʵ��ָ���Ӧ�����ָ�루�����ߣ�
			array[i].setValue(i);//ͨ��array[i]�Զ�����и�ֵ����
		}
		
		for(Value k: array) {
			System.out.println(k.getValue());//ע�⣬�˴���kҲΪ�������ֱ�����k�����õ�����Value@5f8ed237�ĵ�ַ����Ŷ���ĵ�ַ�����������Ҫ���array��������k��Ϊ������к����ĵ���
		}//���Ϊ0��4
		
		for(Value k: array) {
			k.setValue(1);
			//ʵ���ϣ�ÿһ���½�һ������ʵ�������½���һ��ָ���������������ݵ�ָ��
			//for-each�У����ǽ�array[0][1][2]...�ֱ𸳸���k���൱��ÿ�ζ���kָ��ʵ�ʴ������ݵĵط�
			//�����ٶ�k���в�����ʵ���Ͼ��Ƕ�k��ָ��ĵط������ݽ��в���
			//�����ڶ��������У����ǿ���ͨ��for-each�Զ������������ֵ�ϵĸı�
		}
		
		for(Value k: array) {
			System.out.println(k.getValue());
		}//���ȫΪ1(�ڵڶ���for-eachѭ��������ͨ��kΪarrayÿһ��Ԫ�ظ�ֵ)
		
	}

}
