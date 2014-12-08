public interface PersonQueue{
	/**
	 * Add person to the queue.
	 */
	void insertPerson(Person person);
	
	/**
	 * Removes a person from the queue.
	 */
	 Person retrieve();
	 
	/**
	 * Prints the whole queue.
	 */
	 void printQueue();
}