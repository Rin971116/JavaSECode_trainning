

class FloatDoubleExer {

//�m��1:�ᤩ��P�v���ܶq3.14�A�T�Ӷꪺ�b�|���O�O1.2 / 2.5 / 6 �A�D�T�Ӷꪺ���n����?

	public static void main(String[] args) {
		
		double pi = 3.14;
		double circle1Radius = 1.2;
		double circle2Radius = 2.5;
		int circle3Radius = 6;//�o��ϥ�double�]��
		double circle1Area = pi*circle1Radius*circle1Radius;
		double circle2Area = pi*circle2Radius*circle2Radius;
		double circle3Area = pi*circle3Radius*circle3Radius;
		
		System.out.println("circle1Area = " + circle1Area);
		System.out.println("circle2Area = " + circle2Area);
		System.out.println("circle3Area = " + circle3Area);
		System.out.println(circle3Area);

/*�m��2:�ഫ�ؤ�ū�(80��)�����ūסA�åB�H�ؤ�ūסB���ū׬������O��ܸӷūסC
		���ū� = (�ؤ�ū� - 32) / 1.8
		
		�X���Ÿ����? ����alt + 0176
*/
		
		double f1 = 80;
		double c1 = (f1 - 32) / 1.8;
		System.out.println("�ؤ�ū� = " + f1 + "�XF");
		System.out.println("���ū� = " + c1 + "�XC");
		
	}
}
