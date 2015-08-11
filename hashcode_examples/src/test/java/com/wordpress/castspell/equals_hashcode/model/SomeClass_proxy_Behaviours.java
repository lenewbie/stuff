package com.wordpress.castspell.equals_hashcode.model;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.wordpress.castspell.equals_hashcode.proxy.SimpleDelegatingProxyMaker;

public class SomeClass_proxy_Behaviours {

	@Test
	public void shouldRecognizeEqualsWhenSameId() {
		// given
		SomeClass one = new SomeClass(1, "one");
		SomeClass three = SimpleDelegatingProxyMaker.buildSomeClass(new SomeClass(1, "three"));

		// then
		assertTrue(one.equals(three));
		assertTrue(three.equals(one));
	}
	
	@Test
	public void shouldRecognizeDifferWhenDifferentId() {
		// given
		SomeClass one = new SomeClass(1, "one");
		SomeClass three = SimpleDelegatingProxyMaker.buildSomeClass(new SomeClass(2, "three"));

		// then
		assertFalse(one.equals(three));
		assertFalse(three.equals(one));
	}
	
	@Test
	public void shouldRecognizeSameWhenBothNullId() {
		// given
		SomeClass one = new SomeClass(null, "one");
		SomeClass three = SimpleDelegatingProxyMaker.buildSomeClass(new SomeClass(null, "three"));

		// then
		assertFalse(one.equals(three));
		assertFalse(three.equals(one));
	}

}
