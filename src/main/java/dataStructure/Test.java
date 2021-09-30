package dataStructure;

public class Test {
	public static void main(String[] args) {
		OrderedList<Integer> list = new OrderedList();
		list.add(48);
		System.out.println(list);
		list.add(44);
		System.out.println(list);
		list.add(42);
		System.out.println("tail is "+list.tail.data);
		System.out.println(list);
		list.add(46);
		System.out.println(list);
		list.add(45);
		list.add(50);
		list.remove(50);
		System.out.println(list);
		System.out.println("tail is "+list.tail.data);

		/*
		 * Dequeue<Integer> qq = new Dequeue<>(); qq.addfront(6); qq.addfront(7);
		 * System.out.println(qq); qq.removeFront(); //qq.removeFront();
		 * System.out.println(qq); System.out.println(qq); //
		 * System.out.println(qq.capacity);
		 */ }

}
