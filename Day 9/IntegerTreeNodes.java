class IntegerTreeNodes{
	int number; 
	IntegerTreeNodes left;
	IntegerTreeNodes right;
	
	public IntegerTreeNodes(int number) {
		this.number = number;
	}
	
	public void add(int n) {
		if(n < number) {
			if(left == null) {
				left = new IntegerTreeNodes(n);
			}else{
				left.add(n);
			}
		}else if(number < n) {
			if(right == null) {
				right = new IntegerTreeNodes(n);
			}else{
				right.add(n);
			}
		}
	}
	
	public boolean contain(int n) {
		if(n == number) {
			return true;
		}
		if(n < number && left != null) {
			return left.contain(n);
		}
		else if(number < n && right != null) {
			return right.contain(n);
		}else{
			return false;
		}
	}
	
	public int getMax(){
		if(right == null) {
			return number;
		}else{
			return right.getMax();
		}
	}
	
	public int getMin(){
		if(left == null) {
			return number;
		}else{
			return left.getMin();
		}
	}
	
	@Override
	public String toString() {
		String leftText = "[]";
		String rightText = "[]";
		
		if(left != null) {
			leftText = "[" + left.toString() + "]";
		}
		if(right != null) {
			rightText = "[" + right.toString() + "]";
		}
		return "<L" + leftText + "><" + number + "><R" + rightText + ">";
	}
	
	public int depth() {
		int leftDepth = 0;
		int rightDepth = 0;
		
		if(left != null) {
			leftDepth = left.depth() + 1;
		}
		if(right != null) {
			rightDepth = right.depth() + 1;
		}
		return deeperSide(leftDepth, rightDepth);
	}
	
	private int deeperSide(int leftDepth, int rightDepth) {
		if(leftDepth > rightDepth) {
			return leftDepth;
		} else {
			return rightDepth;
		}
	}	
}