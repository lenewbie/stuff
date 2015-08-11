package com.wordpress.castspell.equals_hashcode.model;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class SomeClass_hashCode_Behaviours {

	@Test
	public void hashCodeForeEqualObjectIsEqual() {
		// given
		SomeClass one = new SomeClass(1, "one");
		SomeClass two = new SomeClass(1, "two");

		// then
		assertHashCodeTheSameWhenEquals(one, two);
	}

	private void assertHashCodeTheSameWhenEquals(Object one, Object two) {
		if (one.equals(two))
			assertTrue(one.hashCode() == two.hashCode());
	}
	
	@Test
	public void hashCodeDontChangeWhenNotEqualDependentFieldChanges() {
		// given
		SomeClass one = new SomeClass(1, "one");
		int hashCode = one.hashCode();

		// when
		one.setName("other");

		// then
		assertEquals(one.hashCode(), hashCode);
	}

}
