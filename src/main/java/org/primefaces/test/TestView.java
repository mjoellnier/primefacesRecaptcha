package org.primefaces.test;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "testView")
@ViewScoped
public class TestView implements Serializable {

	private String testString;

	@PostConstruct
	public void init() {
		testString = "Welcome to PrimeFaces!!!";
	}

	/**
	 * Method to show that the button is fully working
	 */
	public void testMethod() {
		System.out.println("I'm working!");
	}

	public String getTestString() {
		return testString;
	}

	public void setTestString(String testString) {
		this.testString = testString;
	}
}
