package com.wordpress.castspell.equals_hashcode.model;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class SomeClass_equals_Behaviours {

	@Test
	public void equalsIsReflective() {
		// given
		SomeClass one = new SomeClass(1, "one");
		SomeClass three = new SomeClass(null, "other");

		// then
		assertEqualsIsRefelective(one);
		assertEqualsIsRefelective(three);
	}
	
	private void assertEqualsIsRefelective(Object one) {
		assertTrue(one.equals(one));
	}

	@Test
	public void equalsIsSymetric() {
		// given
		SomeClass one = new SomeClass(1, "one");
		SomeClass three = new SomeClass(null, "other");

		// then
		assertEqualsIsSymetric(one, three);
	}
	
	private void assertEqualsIsSymetric(Object one, Object three) {
		boolean isEquals = one.equals(three);
		assertEquals(three.equals(one), isEquals);
	}

	@Test
	public void equalsIsTransitive() {
		// given
		SomeClass one = new SomeClass(1, "one");
		SomeClass two = new SomeClass(1, "two");
		SomeClass three = new SomeClass(1, "other");

		// then
		assertEqualsIsTransitive(one, two, three);
	}
	
	private void assertEqualsIsTransitive(Object one, Object two, Object three) {
		if(one.equals(two) && two.equals(three)) assertTrue(one.equals(three));
	}

	@Test
	public void equalsIsFalseForNull() {
		SomeClass one = new SomeClass(1, "one");
		assertEqualsIsFalseForNulls(one);
	}
	
	private void assertEqualsIsFalseForNulls(Object one) {
		assertFalse(one.equals(null));		
	}

}
