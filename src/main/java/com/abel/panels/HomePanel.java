package com.abel.panels;

import java.io.Serializable;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.form.AjaxSubmitLink;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.CompoundPropertyModel;

@SuppressWarnings("serial")
public class HomePanel extends Panel implements Serializable {
	ExampleInputs inputs;
	Form<ExampleInputs> form;
	public HomePanel(String id) {
		super(id);
		init();
	}

	public void init(){
		inputs = new ExampleInputs();
		/** Model **/
		form = new Form<ExampleInputs>("form", new CompoundPropertyModel<ExampleInputs>(this.inputs));		
		
		/** components **/
		form.add(new TextField<String>("input"));
		form.add(new AjaxSubmitLink("submit", form){
			@Override
			protected void onSubmit(AjaxRequestTarget target, Form<?> form) {
				super.onSubmit(target, form);
				target.appendJavaScript("alert('You entered \"" + inputs.getInput() +"\"');");
			}
		});
		add(form);
	}
}
