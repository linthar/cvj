package coop.tecso.asociados.cv.web.layout;

import com.vaadin.terminal.ThemeResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import coop.tecso.core.web.vaadin.menu.support.HomeMenuItemComponent;

@HomeMenuItemComponent(showInMenu = true)
public class HomeWindowComponent extends CustomComponent {
	
	private static final long serialVersionUID = -6551732754568976356L;
	
	private VerticalLayout layout = new VerticalLayout();
	
	public HomeWindowComponent() {
		
		Embedded logo = new Embedded("", new ThemeResource("images/logo.png"));
		layout.addComponent(logo);
		layout.setComponentAlignment(logo, Alignment.MIDDLE_CENTER);
		
		Label title = new Label("Curriculum Vitae");
		title.setStyleName("big-title");
		layout.addComponent(title);
		layout.setComponentAlignment(title, Alignment.MIDDLE_CENTER);
		
		setCompositionRoot(layout);
	}

}
