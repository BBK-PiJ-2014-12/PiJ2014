class QueueTest{
	public static void main(String[] args){
		Person adam = new Person("Adam");
		Person bill = new Person("Bill");
		Person frank = new Person("Frank");
		Person tom = new Person("Tom");
		Person will = new Person("Will");
		
		PersonQueue PSQ = new PersonStoreQueue();
		PSQ.insertPerson(adam);
	}
}