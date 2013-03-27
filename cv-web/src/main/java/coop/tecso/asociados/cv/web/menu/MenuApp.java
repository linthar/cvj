package coop.tecso.asociados.cv.web.menu;

import coop.tecso.core.web.vaadin.menu.support.ApplicationMenu;

import org.springframework.stereotype.Component;

@Component("applicationMenu")
public class MenuApp extends ApplicationMenu {
 

	@Override
	protected void init() {
	
		this.addSubMenu(ROOT_MENU, MENU_SECURITY);
		this.addSubMenu(ROOT_MENU, MENU_CRUDS);

	}
}
