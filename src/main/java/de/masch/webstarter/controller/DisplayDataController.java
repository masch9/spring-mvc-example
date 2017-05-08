package de.masch.webstarter.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import de.masch.webstarter.model.Person;

@Controller
@RequestMapping("data")
public class DisplayDataController {

	@RequestMapping(method = RequestMethod.GET)
	public String getPage(final Model model) {
		model.addAttribute("testString", "Hier steht ein Beispiel Text");
		model.addAttribute("testNumber", 42);

		Person person = new Person();
		person.setFirstName("Maike");
		person.setLastName("Musterfrau");
		person.setAge(23);

		model.addAttribute("testPerson", person);

		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Barack", "Obama", 55, true));
		persons.add(new Person("Fjodor Michailowitsch", "Dostojewski", 59, false));
		persons.add(new Person("Stephen", "Hawking", 75, true));

		model.addAttribute("testPersonList", persons);

		return "display-data";
	}

}
