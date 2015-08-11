package com.wordpress.castspell.equals_hashcode.model;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class SomeClass_null_Behaviours {

	@Test
	public void shouldFindInHashSet_IdNullAndNotNull() {
		// given
		SomeClass one = new SomeClass(1, "one");
		SomeClass three = new SomeClass(null, "three");

		// when
		Set<SomeClass> set = new HashSet<SomeClass>();
		set.add(one);
		set.add(three);

		// then
		assertTrue(set.contains(one));
		assertTrue(set.contains(three));
		assertEquals(set.size(), 2);
	}

	@Test
	public void shouldFindInHashMap_IdNullAndNotNull() {
		// given
		SomeClass one = new SomeClass(1, "one");
		SomeClass three = new SomeClass(null, "three");

		// when
		Map<SomeClass, String> set = new HashMap<SomeClass, String>();
		set.put(one, one.getName());
		set.put(three, three.getName());

		// then
		assertTrue(set.containsKey(one));
		assertTrue(set.containsKey(three));
		assertEquals(set.size(), 2);
	}

	@Test
	public void shouldDistinguish_IdNullAndNotNull() {
		// given
		SomeClass one = new SomeClass(1, "one");
		SomeClass three = new SomeClass(null, "three");

		assertNotEquals(three, one);
	}

	@Test
	public void shouldNotDistinguish_SameId() {
		// given
		SomeClass one = new SomeClass(1, "one");
		SomeClass other = new SomeClass(1, "other");

		// then
		assertTrue(one.equals(other));
		assertTrue(other.equals(one));
	}

	@Test
	public void shoulDistinguish_twoNullId() {
		// given
		SomeClass one = new SomeClass(null, "one");
		SomeClass two = new SomeClass(null, "two");

		// then
		assertFalse(one.equals(two));
	}

	@Test
	public void shouldFindInHashSet_twoNullId() {
		// given
		SomeClass one = new SomeClass(null, "one");
		SomeClass three = new SomeClass(null, "three");

		// when
		Set<SomeClass> set = new HashSet<SomeClass>();
		set.add(one);
		set.add(three);

		// then
		assertTrue(set.contains(one));
		assertTrue(set.contains(three));
		assertEquals(set.size(), 2);
	}

	@Test
	public void shouldFindInHashMap_twoNullId() {
		// given
		SomeClass one = new SomeClass(null, "one");
		SomeClass three = new SomeClass(null, "three");

		// when
		Map<SomeClass, String> set = new HashMap<SomeClass, String>();
		set.put(one, one.getName());
		set.put(three, three.getName());

		// then
		assertTrue(set.containsKey(one));
		assertTrue(set.containsKey(three));
		assertEquals(set.size(), 2);
	}

}
