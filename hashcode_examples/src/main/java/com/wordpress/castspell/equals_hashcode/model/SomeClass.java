package com.wordpress.castspell.equals_hashcode.model;

public class SomeClass {
	
	private Integer id;
	private String name;

	public SomeClass() {
        this(null, null);
	}
	
	public SomeClass(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
        return id;
	}

	public void setId(Integer id) {
        this.id = id;
	}

	public String getName() {
        return name;
	}

	public void setName(String name) {
        this.name = name;
	}

	@Override
	public int hashCode() {
        return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || obj instanceof SomeClass )
			return false;
		SomeClass other = (SomeClass) obj;
		if (getId() == null) {
				return false;
		} else if (!getId().equals(other.getId()))
			return false;
		return true;
	}
	
//	@Override
//    public boolean equals(Object obj) {
//        final boolean result;
//        if (obj instanceof SomeClass) {
//            return getObject().equals(((SomeClass)obj).getObject());
//        } else {
//            result = false;
//        }
//        return result;
//    }
//   
//	@Override
//    public int hashCode() {
//        return getObject().hashCode();
//    }
//   
//	private volatile Object identyfiObject;
//	private Object getIdentyfiObject() {
//		return identyfiObject;
//	}
//	private void setIdentyfiObject(Object identyfiObject) {
//		this.identyfiObject = identyfiObject;
//	}
//
//	private Object getObject() {
//        if (getIdentyfiObject() != null || getIdentyfiObject() == null && getId() == null) {
//            if (getIdentyfiObject() == null) {
//                synchronized(this) {
//                    if (getIdentyfiObject() == null)
//                    	setIdentyfiObject(new Object());
//                }
//            }
//            return getIdentyfiObject();
//        }
//        return getId();
//    }
	

//	@Override
//	public int hashCode() {
////		final int prime = 31;
////		int result = 1;
////		result = prime * result + ((id == null) ? 0 : id.hashCode());
////		return result;
//		return 1;
//	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//		if (! (obj instanceof SomeClass))
//			return false;
//		SomeClass other = (SomeClass) obj;
//		if (id == null) {
//			if (other.id != null)
//				return false;
//		} else if (!id.equals(other.id))
//			return false;
//		return true;
//	}	
	
//	@Override
//	public boolean equals(Object obj) {
//	// method instead of field acesss http://blog.xebia.com/2008/03/08/advanced-hibernate-proxy-pitfalls/
//		if (this == obj)
//			return true;
//		if (! (obj instanceof SomeClass))
//			return false;
//		SomeClass other = (SomeClass) obj;
//		if (getId() == null) {
////			if (other.getId() != null)
//				return false;
//		} else if (!getId().equals(other.getId()))
//			return false;
//		return true;
//	}	

}