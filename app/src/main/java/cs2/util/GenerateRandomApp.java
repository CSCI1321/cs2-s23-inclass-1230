package cs2.util;

import java.util.Random;

public class GenerateRandomApp {
	public static void main(String[] args) {
		Random rand = new Random(87637);
		System.out.println(rand.nextDouble());
		System.out.println(rand.nextInt());
		System.out.println(rand.nextInt(5));
		System.out.println(rand.nextBoolean());
		System.out.println(Math.random());
	}
}
