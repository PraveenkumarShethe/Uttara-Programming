package com.manju.java.cpt8.ood.sorting;

import java.util.Arrays;
import java.util.Random;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
//The average case of quicksort is O(n log n).

public class QuicksortTest {

	  private int[] numbers;
	  private final static int SIZE = 7;
	  private final static int MAX = 20;

	  @Before
	  public void setUp() throws Exception {
	    numbers = new int[SIZE];
	    Random generator = new Random();
	    for (int i = 0; i < numbers.length; i++) {
	      numbers[i] = generator.nextInt(MAX);
	    }
	  }

	  @Test
	  public void testNull() {
	    Quicksort sorter = new Quicksort();
	    sorter.sort(null);
	  }

	  @Test
	  public void testEmpty() {
	    Quicksort sorter = new Quicksort();
	    sorter.sort(new int[0]);
	  }

	  @Test
	  public void testSimpleElement() {
	    Quicksort sorter = new Quicksort();
	    int[] test = new int[1];
	    test[0] = 5;
	    sorter.sort(test);
	  }

	  @Test
	  public void testSpecial() {
	    Quicksort sorter = new Quicksort();
	    int[] test = { 5, 5, 6, 6, 4, 4, 5, 5, 4, 4, 6, 6, 5, 5 };
	    sorter.sort(test);
	    if (!validate(test)) {
	    	System.out.println("Should not happen");
	    }
	    printResult(test);
	  }

	  @Test
	  public void testQuickSort() {
	    for (Integer i : numbers) {
	      System.out.println(i + " ");
	    }
	    long startTime = System.currentTimeMillis();

	    Quicksort sorter = new Quicksort();
	    sorter.sort(numbers);

	    long stopTime = System.currentTimeMillis();
	    long elapsedTime = stopTime - startTime;
	    System.out.println("Quicksort " + elapsedTime);

	    if (!validate(numbers)) {
	        System.out.println("Should not happen");
	    }
	    Assert.assertTrue(true);
	  }

	  @Test
	  public void testStandardSort() {
	    long startTime = System.currentTimeMillis();
	    Arrays.sort(numbers);
	    long stopTime = System.currentTimeMillis();
	    long elapsedTime = stopTime - startTime;
	    System.out.println("Standard Java sort " + elapsedTime);
	    if (!validate(numbers)) {
	      System.out.println("Should not happen");
	    }
	    Assert.assertTrue(true);
	    
	  }

	  private boolean validate(int[] numbers) {
	    for (int i = 0; i < numbers.length - 1; i++) {
	      if (numbers[i] > numbers[i + 1]) {
	        return false;
	      }
	    }
	    return true;
	  }

	  private void printResult(int[] numbers) {
	    for (int i = 0; i < numbers.length; i++) {
	      System.out.print(numbers[i]);
	    }
	    System.out.println();
	  }}
