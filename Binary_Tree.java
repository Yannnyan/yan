package Data_Structures;

public class Binary_Tree {
	Node root;
	
	public Binary_Tree(Node root) {
		this.root = root;
	}
	public void Connect(Node node, Node inspect) {
		if(!isFather(inspect)) {
			Node temp = new Node(node.GetData());
			temp.SetRight(node.GetRight());
			temp.SetLeft(node.GetLeft());
			if(node.GetData() >= inspect.GetData()) {
				inspect.SetRight(temp);
			}
			else {
				inspect.SetLeft(temp);
			}
		}
		else {
			if(node.GetData() >= inspect.GetData()) {
				Connect(node, inspect.GetRight());
			}
			else {
				Connect(node, inspect.GetLeft());
			}
		}
	}
	public boolean isFather(Node s) {
		if(s.GetLeft() == null && s.GetLeft() == null) {return false;}
		return true;
	}
	public boolean ContainsPreorder(Node n, int data) {
		if(n.equals(null)) return false;
		return (n.GetData() == data || ContainsPreorder(n.GetLeft(), data) || ContainsPreorder(n.GetRight(), data) );
	}
	public boolean ContainsInorder(Node n, int data) {
		if(n.equals(null))return false;
		if(n.GetData() == data) return true;
		else if(n.GetData() <= data) {
			return ContainsInorder(n.GetRight(), data);
		}
		else {
			return ContainsInorder(n.GetLeft(), data);
		}
	}
	public int Min(Node current) {
		if(current.GetLeft() == null) return current.GetData();
		else return Min(current.GetLeft());
	}
	public int Max(Node current) {
		if(current.GetRight() == null) return current.GetData();
		else return Max(current.GetRight());
	}
	public void Remove(int data) {
		Remove(this.root,data);
	}
	
	public Node Remove(Node current, int data) { // the last else done without thinking...
		if(current == null) return null;
		if(current.GetData() > data) Remove(current.GetLeft(),data);
		else if(current.GetData() < data) Remove(current.GetRight(),data);
		else {
			if(current.GetLeft() == null) return Remove(current.GetRight(), data);
			else if(current.GetRight() == null) return current.GetLeft();
			current.SetData(Min(current.GetRight()));
			current.SetRight(Remove(current.GetRight(), current.GetData())); 
		}
		return current;
	}
	
}
