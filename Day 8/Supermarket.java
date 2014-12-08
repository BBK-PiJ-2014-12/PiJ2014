class Supermarket{
	public static void main(String[] args){
		Person adam = new Person("Adam");
		Person bill = new Person("Bill");
		Person frank = new Person("Frank");
		Person tom = new Person("Tom");
		Person will = new Person("Will");
		
		PersonQueue PSQ = new PersonStoreQueue();
		PSQ.insertPerson(adam);
		PSQ.insertPerson(bill);
		PSQ.insertPerson(frank);
		PSQ.insertPerson(tom);
		PSQ.insertPerson(will);
		
		PSQ.printQueue();
		
		System.out.println("Person retrieved from the front of the list is " + PSQ.retrieve().getName());
		
		PSQ.printQueue();
	}
}