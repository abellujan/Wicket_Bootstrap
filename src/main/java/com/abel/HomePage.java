package com.abel;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.Model;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;
	
	public HomePage(){
		add(new Label("helloWorld", Model.of("Hello World!")));
	}
}
