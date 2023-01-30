package Solution_2;
import java.util.HashSet;
public class CSolution_2 {

	public CSolution_2() {
		// TODO Auto-generated constructor stub
	}

	public static class Node {
		int nodedata;
		Node leftNode,rightNode;
	};
	static Node NewNode(int data) {
		Node temp=new Node();
		temp.nodedata=data;
		temp.leftNode=null;
		temp.rightNode=null;
		return temp;

	}

	public Node insert(Node root,int key) {

		if(root==null)
		{
			return NewNode(key);
		}
		if(key<root.nodedata) {
			root.leftNode=insert(root.leftNode,key);

		}else {
			root.rightNode=insert(root.rightNode,key);
		}   
		return root; 
	}


	static boolean findpairUtil(Node root,int sum,HashSet<Integer> set) {
		if(root==null)
			return false;
		if(findpairUtil( root.leftNode, sum,set))
			return true;
		if(set.contains(sum-root.nodedata))
		{
			System.out.println("Pair is  ( "+(sum-root.nodedata)+" , "+(root.nodedata)+" )");
			return true;
		}else {
			set.add(root.nodedata);
		}

		return findpairUtil( root.rightNode, sum,set);
	}

	public void findPairWithGivenSum(Node root,int sum) {
		HashSet<Integer> set=new HashSet<Integer>();
		if(!findpairUtil( root, sum,set)) {
			System.out.println("nodes are not found.");

		}
	}

}
