package ir.freeland.collection.personcollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PersonSortApplication {
	    public static void main(String[] args) {
	    	
	        // ایجاد یک Collection از نوع ArrayList
	        ArrayList<Person> people = new ArrayList<>();

	        // اضافه کردن افراد به لیست
	        people.add(new Person("Alice", "Johnson", 30, new Address("New York", "USA", "Broadway Street")));
	        people.add(new Person("Mohammad", "Al-Farsi", 27, new Address("Dubai", "UAE", "Sheikh Zayed Road")));
	        people.add(new Person("Yuki", "Tanaka", 35, new Address("Tokyo", "Japan", "Shibuya District")));
	        people.add(new Person("Carlos", "Ramirez", 42, new Address("Mexico City", "Mexico", "Insurgentes Avenue")));
	        people.add(new Person("Sophia", "López", 33, new Address("Barcelona", "Spain", "La Rambla")));
	        people.add(new Person("John", "Doe", 40, new Address("Sydney", "Australia", "George Street")));
	        people.add(new Person("Maria", "Garcia", 38, new Address("Madrid", "Spain", "Gran Via")));
	       
	        // نمایش لیست اولیه افراد
	        System.out.println("List of People:");
	        printPeople(people);

	        //  آیا شخص خاصی در لیست وجود دارد یا خیر
	        Person searchPerson = new Person("Mohammad", "Al-Farsi", 27, new Address("Dubai", "UAE", "Sheikh Zayed Road"));
	        System.out.println("\nContains 'Mohammad Al-Farsi'? " + people.contains(searchPerson));

	        // حذف شخص از لیست
	        people.remove(searchPerson);
	        System.out.println("\nAfter removing 'Mohammad Al-Farsi':");
	        printPeople(people);

	        // مرتب‌سازی لیست بر اساس نام خانوادگی (last name)
	        Collections.sort(people);
	        System.out.println("\nSorted by last name:");
	        printPeople(people);

	        // جستجوی دودویی برای شخص خاص
	        int index = Collections.binarySearch(people, new Person("Yuki", "Tanaka", 35, null));
	        System.out.println("\nIndex of 'Yuki Tanaka' (using binary search): " + index);

	        // مرتب‌سازی لیست بر اساس سن
	        people.sort(Comparator.comparingInt(Person::getAge));
	        System.out.println("\nSorted by age:");
	        printPeople(people);

	        // مرتب‌سازی لیست بر اساس نام شهر
	        people.sort(Comparator.comparing(p -> p.getAddress().getCity()));
	        System.out.println("\nSorted by city:");
	        printPeople(people);
	    }

	    // متدی برای چاپ لیست افراد
	    private static void printPeople(ArrayList<Person> people) {
	        for (Person person : people) {
	            System.out.println(person);
	        }
	    }
}
