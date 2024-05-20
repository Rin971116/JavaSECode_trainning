import java.util.*;



class  OxGame{
	
	int[][] player = new int[3][3];
	
	public boolean isSpace(int x , int y){
		if(player[x][y] == 0){
			return true;
			}else{
			System.out.println("!�A��J���y�Фw�Q�ϥ�!");
			return false;
			}
	}

	public boolean checkWin(int[][] player){
		if( (player[0][0] == player[1][0] && player[1][0] == player[2][0] && player[2][0] != 0) ||
			(player[0][1] == player[1][1] && player[1][1] == player[2][1] && player[2][1] != 0) ||
			(player[0][2] == player[1][2] && player[1][2] == player[2][2] && player[2][2] != 0) ||
			(player[0][0] == player[0][1] && player[0][1] == player[0][2] && player[0][2] != 0) ||
			(player[1][0] == player[1][1] && player[1][1] == player[1][2] && player[1][2] != 0) ||
			(player[2][0] == player[2][1] && player[2][1] == player[2][2] && player[2][2] != 0) ||
			(player[0][2] == player[1][1] && player[1][1] == player[2][0] && player[2][0] != 0) ||
			(player[0][0] == player[1][1] && player[1][1] == player[2][2] && player[2][2] != 0) ){
		return true;
		}else{return false;}
	}
	
	public void runGame(){
		
		Scanner sc = new Scanner(System.in);
		
		int x,y;

		runloop:
			for(int round = 1; round<=5 ; round++){
				// 1. �T�{�O�_���}
				System.out.println("��J���N�Ʀr�~��C���A���}�п�J0");
				int userXIsExit = sc.nextInt();
				if(userXIsExit == 0){
					System.out.println("Now, Y Player turn!!");
					break runloop;
				}
				
				// 2. ��J�y��
				do{ System.out.println("Now, O Player turn!!");
					System.out.println("�п�J�y��(x,y)��x�My:");
					x = sc.nextInt();
					y = sc.nextInt();
				}while(!isSpace(x,y));
				
			
				player[x][y] = 1; //1��ܤUO

				System.out.println(player[0][2]+"\t" +player[1][2]+"\t" +player[2][2]);
				System.out.println(player[0][1]+"\t" +player[1][1]+"\t" +player[2][1]);
				System.out.println(player[0][0]+"\t" +player[1][0]+"\t" +player[2][0]);
				
				if(checkWin(player)){
					System.out.println("O player win.");
					break runloop;
				}if(round == 5){
					System.out.println("Tie.");
					break runloop;
				}
				
				System.out.println("��J���N�Ʀr�~��C���A���}�п�J0");
				int userYIsExit = sc.nextInt();
				if(userYIsExit == 0){
					System.out.println("Now, X Player turn!!");
					break runloop;
				}

				do{ System.out.println("Now, X Player turn!!");
					System.out.println("�п�J�y��(x,y)��x�My:");
					x = sc.nextInt();
					y = sc.nextInt();
				}while(!isSpace(x,y));
				
				player[x][y] = 2; //2��ܤUX

				System.out.println(player[0][2]+"\t" +player[1][2]+"\t" +player[2][2]);
				System.out.println(player[0][1]+"\t" +player[1][1]+"\t" +player[2][1]);
				System.out.println(player[0][0]+"\t" +player[1][0]+"\t" +player[2][0]);
				
				if(checkWin(player)){
					System.out.println("X player win.");
					break runloop;
				}
			}
	}
}

class OxGaming{
		public static void main(String[] args){
			OxGame ox1 = new OxGame();
			ox1.runGame();
			Scanner sc = new Scanner(System.in);
			System.out.println("Game Over! Do you want one more game?(Y or N)");
			String answer = sc.next();
			if(answer.equalsIgnoreCase("Y")){
				ox1 = new OxGame();
				ox1.runGame();
				}else{System.out.println("Game Closing , goodbye~");
					 }
				
		}
}
