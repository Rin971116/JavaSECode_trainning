//1.���վ㫬�M�B�I�����ܶq

class  VariableTest1{
	public static void main(String[] args) {
	
		byte b1 = 12;
		byte b2 = 127;

		short s1 = 1234;
		short s2 = 12345;//�̤j�Ȭ�4-5���

		int i1 = 1234567890;//�̤j�Ȭ�9-10��� (�̱`��)
		
		//long�����ܶq��ȮɡA�ݭn���ѫ��A���l��L�Aprint�X�Ӫ��ɭԤ��|���
		long l1 = 1234567890123456789L;//�̤j�ȥi�W�L��

//2.���կB�I�������ܶq

//�z�L���զ]�B�I���ܶq����פ����A�p�G�b�}�o���ݭn��������סA�ݭn�ϥ�BigDecimal�������B�I���ܶq�C

		double d1 = 12.3; //8�Ӧr�` (�̱`��)
		
		//float�����ܶq��ȮɡA�ݭn���ѫ��A���f��F�Aprint�X�Ӫ��ɭԤ��|���
		float f1 = 12.3F; //4�Ӧr�`

		float f2 = 123123123f;
		float f3 = f2+1;
		
		System.out.println(f2 == f3);// ==���߰�"�O�_�ۦP"���Ϊk�A�P�ɦ]��float����פ����A�ҥH�o��B�檺���G�|�o��true�A����hf2������f3
	
	}
}