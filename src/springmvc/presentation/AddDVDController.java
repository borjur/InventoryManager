package springmvc.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import springmvc.application.inventory.DVDDetails;
import springmvc.application.inventory.InvalidDvdIdException;
import springmvc.application.inventory.InventoryManager;



@Controller
@RequestMapping(value = "AddDVD.form")
public class AddDVDController {
	
	@Autowired
	private InventoryManager manager;

	public InventoryManager getManager() {
		return manager;
	}

	public void setManager(InventoryManager manager) {
		this.manager = manager;
	}

	// todo complete this method
	@RequestMapping(method = RequestMethod.POST)
	protected ModelAndView onSubmit(@ModelAttribute("command") DVDDetails d)
			{

		/*
		 * todo use the manager to add the dvd and return to the named view
		 * DVDDetail (or another name you used for the view the displays the
		 * details of a single DVD. Set the model so that the view can render
		 * the newly added dvd.
		 */

		
			try {
				manager.addDvd(d);
			} catch (InvalidDvdIdException e) {
				return new ModelAndView("AddDVD", "command", d);
			}

		return new ModelAndView("Detail", "dvd", d);

	}
	
	@RequestMapping(method = RequestMethod.GET)
	protected ModelAndView showForm()
			throws Exception {

		/*
		 * todo use the manager to add the dvd and return to the named view
		 * DVDDetail (or another name you used for the view the displays the
		 * details of a single DVD. Set the model so that the view can render
		 * the newly added dvd.
		 */

		
		return new ModelAndView("AddDVD", "command", new DVDDetails());

	}
	
}
