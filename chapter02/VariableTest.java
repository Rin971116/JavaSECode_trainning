/*
�����ܶq���򥻨ϥ�
 
1.�ܶq���z��:���s�����@�Ӧs�x�ϰ�A�Ӱϰ쪺�ƾڥi�H�b�P�@�����d��U���_�ܤ�

2.�ܶq���c���]�t�T�ӭn��:�ƾ�����(�Y����)�B�ܶq�W�B�s�x����

3.java���ܶq�n�����榡: �ƾ�����(�Y����) �ܶq�W = �ܶq��

4.java�����ܶq���Ӽƾ���������:
	
	�򥻼ƾ�����(8��):
		�㫬: byte \ short \ int \ long
		�B�I��: float \ double
		�r�ū�: char
		������: boolean

	�ޥμƾ�����:
		��(class)
		�Ʋ�(array)
		���f(interface)

		�T�|(enum)
		�`��(annotation)
		����(record)

5.�w�q�ܶq�W�ɡA�n��u�ХܲŪ��R�W�W�h�M�W�d

6.����:
	> �ܶq������@�ΰϰ�C�ܶq�u�b�@�ΰ줺�O���Ī��A�X�F�@�ΰ�N���ĤF�C�ҿק@�ΰϰ�N�O�ܶq�Ҧb�̪�{ }
	> �b�P�@�ӧ@�ΰϰ줺�A���i�H�n����ӦP�W���ܶq
	> �w�q�n�ܶq����A�N�i�H�q�L�ܶq�W���覡���ܶq�i��եΩM�B��
	> �ܶq�Ȧb��ȮɡA���������ܶq���ƾ������A�åB�b�ƾ��������Ľd���ܤ� 

*/
class VariableTest {
	public static void main(String[] args) {
		char gender;
			gender = '�k'; //�Ĥ@���n�����ܶq�Ȭ���l�ơA�w�]��
			gender = '�k'; 
			
			//char�O�@�ؼƾ������Agender���ܶq�W�A�k�B�k�O�ܶq��
			//char��Ȩϥ�''
		int age = 10;

		byte b1 = 127;
		// �Yb1=128 �h�W�L�Fbyte���d��A���sĶ���q�L

		System.out.println("age = "+age);
		//System.out.println("age = "age); �o�˽sĶ���L�A�nprint��ӥH�W���F�誺�ܡA�����n�g+�A�@���s�����C
	}

	public static void main123(String[] args){
		int age = 12;
		System.out.println(age);
	}
}
