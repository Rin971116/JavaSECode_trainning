import java.util.*;


class AccountCalculator{

	int allMoney;
	int[] details = new int[];
	int i = 0;

	void setIncome(int income){
		allMoney += income;
		storeDetails(income);
	}

	void setExpend(int expend){
		allMoney += expend;
		storeDetails(expend);
	}

	void storeDetails(int money){
		details[i] = money;
		i++;
	}
	
	void showDetails(){
		for(int money : details){
			System.out.println(money);
		}
	}
}


class goAccountCalculator{

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
							System.out.println("you chose 1");
							showDetails();
							break;
						case "2":
							System.out.println("�п�J�A���J�����B:");
							setIncome(sc.nextInt());
							break;
						case "3": 
							System.out.println("�п�J�A��X�����B(���B���[�W-��):");
							setExpend(sc.nextInt());
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