package tang.referenceApp;

import lombok.Data;

public @Data class Customer {
	
	private long id;
	private String name;
	
	public Customer(Long id, String name) {
		this.id = id;
		this.name = name;
	}
}
