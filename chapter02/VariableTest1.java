//1.測試整型和浮點型的變量

class  VariableTest1{
	public static void main(String[] args) {
	
		byte b1 = 12;
		byte b2 = 127;

		short s1 = 1234;
		short s2 = 12345;//最大值約4-5位數

		int i1 = 1234567890;//最大值約9-10位數 (最常用)
		
		//long類型變量賦值時，需要提供後綴，後綴為l或L，print出來的時候不會顯示
		long l1 = 1234567890123456789L;//最大值可超過京

//2.測試浮點類型的變量

//透過測試因浮點型變量的精度不高，如果在開發中需要極高的精度，需要使用BigDecimal類替換浮點型變量。

		double d1 = 12.3; //8個字節 (最常用)
		
		//float類型變量賦值時，需要提供後綴，後綴為f或F，print出來的時候不會顯示
		float f1 = 12.3F; //4個字節

		float f2 = 123123123f;
		float f3 = f2+1;
		
		System.out.println(f2 == f3);// ==為詢問"是否相同"的用法，同時因為float的精度不高，所以這邊運行的結果會得到true，但實則f2不等於f3
	
	}
}
