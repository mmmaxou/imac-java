/**
 * 
 */
package td10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author mpluchar
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Exercice 1
		
		// 1.
		System.out.println("Exercice 1");
		List<String> list = List.of("hello", "world", "hello", "lambda");
		System.out.println("Liste : " + count(list, "hello"));  // 2

		// 2.
		// Pour obtenir un stream, on utilise list.stream();
		System.out.println("Stream : " + count2(list, "hello"));
		

		// Exercice 2
		System.out.println("\nExercice 2");
		
		// 1.
		System.out.println(upperCase(list));  // [HELLO, WORLD, HELLO, LAMBDA]
		System.out.println(upperCase2(list));  // [HELLO, WORLD, HELLO, LAMBDA]
		System.out.println(upperCase3(list));  // [HELLO, WORLD, HELLO, LAMBDA]
		System.out.println(upperCase4(list));  // [HELLO, WORLD, HELLO, LAMBDA]
		

		// Exercice 3
		System.out.println("\nExercice 3");
		System.out.println("Filter + Map + Reduce : " + count3(list, "hello"));
		

		// Exercice 4
		System.out.println("\nExercice 4");
		List<String> list2 = new Random(0)
				.ints(1_000_000, 0, 100)
				.mapToObj(Integer::toString)
				.collect(Collectors.toList());
		// 1.
		// La variable list2 contient un milliard d'entiers entre 0 et 100
		printAndTime(list2);
	}

	private static void printAndTime(List<String> list2) {
		long start = System.nanoTime();
		// faire le calcul
		long result = count(list2, "33");
		long end = System.nanoTime();
		System.out.println("result " + result);
		System.out.println(" elapsed time " + (end - start));
	}

	private static long count(List<String> list, String string) {
		long count = 0;
		for(String str : list) {
			count += string.equals(str) ? 1 : 0;
		}
		return count;
	}

	private static long count2(List<String> list, String string) {
		// Pour filtrer un stream on utilise la méthode .filter()
		// Pour compter le nombre d'éléments on utilise .count()
		// Pour écrire une lambda on utilise prédicat : <variable itérée> -> <(boolean) expression>
		return list.stream()
				.filter(str -> string.equals(str))
				.count();
	}
	
	private static long count3(List<String> list, String string) {
		// On utilise mapToLong afin de recevoir un Long, car la méthode reduce utilise des Long
		return list.stream()
				.filter(str -> string.equals(str))
				.mapToLong(str -> { return 1; })
				.reduce(0, Long::sum);
	}
	
	private static List<String> upperCase(List<String> list) {
		List<String> uppercases = new ArrayList<>();
		for(String str : list) {
			uppercases.add(str.toUpperCase());
		}
		return uppercases;
	}
	
	private static List<String> upperCase2(List<String> list) {
		List<String> uppercases = new ArrayList<>();
		list.stream()
			.map(str -> str.toUpperCase())
			.forEach(upper -> uppercases.add(upper));
		return uppercases;
	}
	
	private static List<String> upperCase3(List<String> list) {
		List<String> uppercases = new ArrayList<>();
		list.stream()
			.map(String::toUpperCase)
			.forEach(upper -> uppercases.add(upper));
		return uppercases;
	}
	
	private static List<String> upperCase4(List<String> list) {
		return list.stream()
			.map(String::toUpperCase)
			.collect(Collectors.toList());
	}

}
