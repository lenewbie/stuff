package com.wordpress.castspell.equals_hashcode.model;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class SomeClass_stateChange_Behaviours {
	
	@Test
	public void shouldFindInHashSet_afterIdChanged() {
		// given
		SomeClass one = new SomeClass(null, "one");

		// when
		Set<SomeClass> set = new HashSet<SomeClass>();
		set.add(one);
		
		one.setId(42); // e.g. persist this object

		// then
		assertTrue(set.contains(one));
		assertEquals(set.size(), 1);
	}

	@Test
	public void shouldFindInHashMap_afterIdChanged() {
		// given
		SomeClass one = new SomeClass(null, "one");

		// when
		Map<SomeClass, String> set = new HashMap<SomeClass, String>();
		set.put(one, one.getName());
		
		one.setId(42); // e.g. persist this object

		// then
		assertTrue(set.containsKey(one));
		assertEquals(set.size(), 1);
	}
	
	@Test
	public void shouldFindInHashSet_afterNameChanged() {
		// given
		SomeClass one = new SomeClass(null, "one");

		// when
		Set<SomeClass> set = new HashSet<SomeClass>();
		set.add(one);
		
		one.setName("other"); // some business logic operation

		// then
		assertTrue(set.contains(one));
		assertEquals(set.size(), 1);
	}

	@Test
	public void shouldFindInHashMap_afterNameChanged() {
		// given
		SomeClass one = new SomeClass(null, "one");

		// when
		Map<SomeClass, String> set = new HashMap<SomeClass, String>();
		set.put(one, one.getName());
		
		one.setName("other"); // some business logic operation

		// then
		assertTrue(set.containsKey(one));
		assertEquals(set.size(), 1);
	}

}
