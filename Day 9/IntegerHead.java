class IntegerHead{
	public static void main(String[] args) {
		IntegerTreeNodes head = new IntegerTreeNodes(6);
		head.add(9);
		head.add(12);
		head.add(8);
		head.add(1);
		head.add(3);
		head.add(2);
		head.add(4);
		head.add(-5);
		head.add(22);
		head.add(-10);
		head.add(5);
		
		System.out.println(head.number);
		System.out.println(head.contain(2));
		System.out.println(head.contain(8));
		System.out.println(head.contain(11));
		System.out.println(head.right.number);
		System.out.println("");
		
		System.out.println("Max: " + head.getMax());
		System.out.println("Min: " + head.getMin());
		
		System.out.println(head.number);
		System.out.println(head.left.number);
		System.out.println("");
		
		System.out.println(head.toString());
		System.out.println(head.depth());
	}
}