package Driver;
import java.util.Scanner;
import Solution_1.CSolution_1;
import Solution_2.CSolution_2;
import Solution_2.CSolution_2.Node;
public class CDriver {

	public CDriver() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("\nPlease choose the Solution  \n1 for  Solution-1  \n2: for Solution-2\n");
		int check=sc.nextInt();


		switch(check) {
		case 1:
			CSolution_1 cSolution_1=new CSolution_1();
			cSolution_1.balanceString();
			break;
		case 2:
			CSolution_2 sol2=new CSolution_2();
			Node root=null;			
			root=sol2.insert(root, 40);
			root=sol2.insert(root, 20);
			root=sol2.insert(root, 60);
			root=sol2.insert(root, 10);
			root=sol2.insert(root, 30);
			root=sol2.insert(root, 50);
			root=sol2.insert(root, 70);

//			int sum=60;
			System.out.print("\nPlease Enter the sum\n");
			int sum=sc.nextInt();
			sol2.findPairWithGivenSum(root, sum);

			break;
		default:
			System.out.print("Invalid Input! Try Again");
			break;
		}


	}

}
