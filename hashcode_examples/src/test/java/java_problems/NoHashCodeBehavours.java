package java_problems;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class NoHashCodeBehavours {

	@Test
	public void shouldBeTheSame_ClassNoEqualsNoHashCode() {
		// given
		ClassNoEqualsNoHashCode one = new ClassNoEqualsNoHashCode(1, "one");
		ClassNoEqualsNoHashCode three = new ClassNoEqualsNoHashCode(1, "three");

		// then
		assertTrue(one.equals(three));
		assertTrue(three.equals(one));
	}
	
	@Test
	public void hashCodeForeEqualObjectIsEqual_ClassNoHashCode() {
		// given
		ClassNoHashCode one = new ClassNoHashCode(1, "one");
		ClassNoHashCode two = new ClassNoHashCode(1, "two");

		// then
		assertHashCodeTheSameWhenEquals(one, two);
	}
	
	private void assertHashCodeTheSameWhenEquals(Object one, Object two) {
		if (one.equals(two))
			assertTrue(one.hashCode() == two.hashCode());
	}
	
	@Test
	public void hashCodeForeEqualObjectIsEqual_ClassNoEqualsNoHashCode() {
		// given
		ClassNoEqualsNoHashCode one = new ClassNoEqualsNoHashCode(1, "one");
		ClassNoEqualsNoHashCode two = new ClassNoEqualsNoHashCode(1, "two");

		// then
		assertHashCodeTheSameWhenEquals(one, two);
	}
	
	@Test
	public void twoNullIdShouldBeDifferent_EclipseDefaultEqualsId() {
		// given
		EclipseDefaultEqualsId one = new EclipseDefaultEqualsId(null, "one");
		EclipseDefaultEqualsId two = new EclipseDefaultEqualsId(null, "two");

		// then
		assertFalse(one.equals(two));
	}

	@Test
	public void twoNullIdshouldFindInHashSet_EclipseDefaultEqualsId() {
		// given
		EclipseDefaultEqualsId one = new EclipseDefaultEqualsId(null, "one");
		EclipseDefaultEqualsId three = new EclipseDefaultEqualsId(null, "three");

		// when
		Set<EclipseDefaultEqualsId> set = new HashSet<EclipseDefaultEqualsId>();
		set.add(one);
		set.add(three);

		// then
		assertTrue(set.contains(one));
		assertTrue(set.contains(three));
		assertEquals(set.size(), 2);
	}

	@Test
	public void twoNullIdsShouldFindInHashMap_EclipseDefaultEqualsId() {
		// given
		EclipseDefaultEqualsId one = new EclipseDefaultEqualsId(null, "one");
		EclipseDefaultEqualsId three = new EclipseDefaultEqualsId(null, "three");

		// when
		Map<EclipseDefaultEqualsId, String> set = new HashMap<EclipseDefaultEqualsId, String>();
		set.put(one, one.name);
		set.put(three, three.name);

		// then
		assertTrue(set.containsKey(one));
		assertTrue(set.containsKey(three));
		assertEquals(set.size(), 2);
	}
	
	@Test
	public void twoNullIdShouldBeDifferent_EclipseDefaultEqualsIdAndNoHashCode() {
		// given
		EclipseDefaultEqualsIdAndNoHashCode one = new EclipseDefaultEqualsIdAndNoHashCode(null, "one");
		EclipseDefaultEqualsIdAndNoHashCode two = new EclipseDefaultEqualsIdAndNoHashCode(null, "two");

		// then
		assertFalse(one.equals(two));
	}

	@Test
	public void twoNullIdshouldFindInHashSet_EclipseDefaultEqualsIdAndNoHashCode() {
		// given
		EclipseDefaultEqualsIdAndNoHashCode one = new EclipseDefaultEqualsIdAndNoHashCode(null, "one");
		EclipseDefaultEqualsIdAndNoHashCode three = new EclipseDefaultEqualsIdAndNoHashCode(null, "three");

		// when
		Set<EclipseDefaultEqualsIdAndNoHashCode> set = new HashSet<EclipseDefaultEqualsIdAndNoHashCode>();
		set.add(one);
		set.add(three);

		// then
		assertTrue(set.contains(one));
		assertTrue(set.contains(three));
		assertEquals(set.size(), 2);
	}

	@Test
	public void twoNullIdsShouldFindInHashMap_EclipseDefaultEqualsIdAndNoHashCode() {
		// given
		EclipseDefaultEqualsIdAndNoHashCode one = new EclipseDefaultEqualsIdAndNoHashCode(null, "one");
		EclipseDefaultEqualsIdAndNoHashCode three = new EclipseDefaultEqualsIdAndNoHashCode(null, "three");

		// when
		Map<EclipseDefaultEqualsIdAndNoHashCode, String> set = new HashMap<EclipseDefaultEqualsIdAndNoHashCode, String>();
		set.put(one, one.name);
		set.put(three, three.name);

		// then
		assertTrue(set.containsKey(one));
		assertTrue(set.containsKey(three));
		assertEquals(set.size(), 2);
	}
	
	@Test
	public void shouldFindInHashSetAferIdChanged_ClassNoHashCode() {
		// given
		ClassNoHashCode one = new ClassNoHashCode(null, "one");
		Set<ClassNoHashCode> set = new HashSet<ClassNoHashCode>();
		set.add(one);
		
		// when		
		one.id = 42; // e.g. persist this class

		// then
		assertTrue(set.contains(one));
		assertEquals(set.size(), 1);
	}

	@Test
	public void shouldFindInHashMapAferIdChanged_ClassNoHashCode() {
		// given
		ClassNoHashCode one = new ClassNoHashCode(null, "one");
		ClassNoHashCode three = new ClassNoHashCode(null, "three");
		Map<ClassNoHashCode, String> set = new HashMap<ClassNoHashCode, String>();
		set.put(one, one.name);
		set.put(three, three.name);
		
		// when		
		one.id = 42;  // e.g. persist this class

		// then
		assertTrue(set.containsKey(one));
		assertTrue(set.containsKey(three));
		assertEquals(set.size(), 2);
	}

}

class EclipseDefaultEqualsIdAndNoHashCode {
	
	public Integer id;
	public String name;
	
	public EclipseDefaultEqualsIdAndNoHashCode(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EclipseDefaultEqualsIdAndNoHashCode other = (EclipseDefaultEqualsIdAndNoHashCode) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}	

}

class EclipseDefaultEqualsId {
	
	public Integer id;
	public String name;
	
	public EclipseDefaultEqualsId(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EclipseDefaultEqualsId other = (EclipseDefaultEqualsId) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}	

}

class ClassNoEqualsNoHashCode {

	public Integer id;
	public String name;

	public ClassNoEqualsNoHashCode(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

}

class ClassNoHashCode {
	
	public Integer id;
	public String name;
	
	public ClassNoHashCode(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClassNoHashCode other = (ClassNoHashCode) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}	

}


