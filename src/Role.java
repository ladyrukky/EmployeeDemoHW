
public enum Role {
	
	ENGINEER(1),TESTER(2), LEAD(3) , PRESIDENT(4);
	
	private final int value;
    private static Role[] vals = values();

	
	Role(final int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public Role next() {
		return vals[(this.ordinal()+1) % vals.length];
	}

}
