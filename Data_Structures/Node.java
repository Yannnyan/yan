package Data_Structures;

public class Node {
	private int data;
	private Node Right;
	private Node Left;
	
	public Node(int data){
		this.data = data;
	}
	public Node(int data, Node Right, Node Left) {
		this.data = data;
		this.Right = Right;
		this.Left = Left;
	}
	public Node GetRight() {
		return this.Right;
	}
	public Node GetLeft() {
		return this.Left;
	}
	public void SetRight(Node temp) {
		this.Right = temp;
	}
	public void SetLeft(Node temp) {
		this.Left = temp;
	}
	public int GetData() {
		return this.data;
	}
	public void SetData(int data) {
		this.data = data;
	}
	
}
