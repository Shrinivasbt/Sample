package SampleTests;

import org.testng.annotations.Test;

public class Sample3 {
	
	@Test
	public void print() {
		System.out.println("Sample3");
		Long id = Thread.currentThread().getId();
        System.out.println("Test method executing on thread with id: " + id);
	}
}
