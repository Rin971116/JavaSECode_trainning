import java.util.*;


class AccountCalculator{

	int allMoney = 0;
	//�H�U���ŧi�ʺA�}�C���覡
	ArrayList<Integer> details = new ArrayList<Integer>();

	void addMoney(int money){
		allMoney += money;
		details.add(money);
		System.out.println("�w�s�J"+ money +"���A�ثe�b��l�B��:"+ allMoney +"��");
	}

	void minusMoney(int money){
		allMoney -= money;
		details.add(-money);
		System.out.println("�w����"+ money +"���A�ثe�b��l�B��:"+ allMoney +"��");
	}
	
	void showDetails(){
		for(int money : details){
			/*���~�g�k�C�ݨD��
			if(details.length == 0){
				System.out.println("�L����");
			}else*/ System.out.println(money);
		}
	}
}


class GoAccountCalculator{

	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);

	AccountCalculator ac1 = new AccountCalculator();
	
	loopOption:while(true){					
					System.out.println("-------------------------------");
					System.out.println("1.�������");
					System.out.println("2.�n�O���J");
					System.out.println("3.�n�O��X");
					System.out.println("4.�h�X");
					System.out.println();
					System.out.println("�п�J1-4:");
					
					String option = sc.next();
					
					switch(option){
						case "1": 
							System.out.println("------�b�����------");
							ac1.showDetails();
							break;
						case "2":
							System.out.println("�п�J�A���J�����B:");
							ac1.addMoney(sc.nextInt());
							break;
						case "3": 
							System.out.println("�п�J�A��X�����B:");
							ac1.minusMoney(sc.nextInt());
							break;
						case "4": 
							System.out.println("���b�h�X...");
							break loopOption;
						default: System.out.print("��J���~");
							break;
					}
				}
	}
}