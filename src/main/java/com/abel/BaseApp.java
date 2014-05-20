package com.abel;

import java.io.Serializable;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

import de.agilecoders.wicket.core.Bootstrap;
import de.agilecoders.wicket.core.settings.BootstrapSettings;

public class BaseApp extends WebApplication implements Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public Class<? extends Page> getHomePage() {
		// TODO Auto-generated method stub
		init();
		return HomePage.class;
	}
	
	@Override
	protected void init(){
		BootstrapSettings settings = new BootstrapSettings();
		//settings.setXXX(...); no extra settings
		Bootstrap.install(this, settings);
	}
	
}
