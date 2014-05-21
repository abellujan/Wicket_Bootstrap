package com.abel;

import org.apache.wicket.markup.html.WebPage;
import com.abel.panels.HomePanel;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;
	
	public HomePage(){
		add(new HomePanel("panel"));
	}
}
