package de.masch.webstarter.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import de.masch.webstarter.model.Person;

@Controller
@RequestMapping("form")
public class FormController {
	private static final String MODEL_ATTRIBUTE_PERSON_LIST = "testPersonList";
	private static final String MODEL_ATTRIBUTE_NEW_PERSON = "newPerson";

	private static List<Person> personList = new ArrayList<>();

	@ModelAttribute(MODEL_ATTRIBUTE_NEW_PERSON)
	public Person newPerson() {
		return new Person();
	}

	@RequestMapping(method = RequestMethod.GET)
	public String getPage(final Model model) {
		model.addAttribute(MODEL_ATTRIBUTE_PERSON_LIST, personList);

		return "form";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String postPerson(final Model model, final Person person) {
		personList.add(person);
		model.addAttribute(MODEL_ATTRIBUTE_PERSON_LIST, personList);

		// We use redirect to avoid sending multiple persons with page reload
		return "redirect:form";
	}

	@RequestMapping(method = RequestMethod.DELETE)
	public String removePerson(final Model model, @RequestParam("index") final int index) {
		personList.remove(index);

		return "redirect:form";
	}
}
