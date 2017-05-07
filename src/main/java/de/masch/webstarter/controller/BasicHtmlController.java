package de.masch.webstarter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("basichtml")
public class BasicHtmlController {

	@RequestMapping(method = RequestMethod.GET)
	public String getPage(final Model model) {
		return "basic-html";
	}
}
