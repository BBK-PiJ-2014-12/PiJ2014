public class Comparator {
	public <T extends Comparable<T>> T getMax(T elementOne, T elementTwo) {
		if(elementOne.compareTo(elementTwo) > 0) {
			return elementOne;
		} else {
			return elementTwo;
		}
	}
}	 