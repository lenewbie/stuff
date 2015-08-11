package com.wordpress.castspell.equals_hashcode.model;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class SomeClass_subclass_Behaviours {
	
	@Test
	public void shouldRecognizeEqualsWhenSameId() {
		// given
		SomeClass one = new SomeClass(1, "one");
		SomeClass three = new SomeClassSpecial(1, "three");

		// then
		assertFalse(three.equals(one));
		assertFalse(one.equals(three));		
	}
	
	@Test
	public void shouldRecognizeDifferWhenDifferentId() {
		// given
		SomeClass one = new SomeClass(1, "one");
		SomeClass three = new SomeClassSpecial(2, "three");

		// then
		assertFalse(one.equals(three));
		assertFalse(three.equals(one));
	}
	
	@Test
	public void shouldRecognizeSameWhenBothNullId() {
		// given
		SomeClass one = new SomeClass(null, "one");
		SomeClass three = new SomeClassSpecial(null, "three");

		// then
		assertFalse(one.equals(three));
		assertFalse(three.equals(one));
	}

}
