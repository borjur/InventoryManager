package springmvc.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import springmvc.application.inventory.DVDDetails;
import springmvc.application.inventory.DVDInfo;
import springmvc.application.inventory.InventoryManager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collection;


@Controller

public class ViewDVDController extends MultiActionController {
public ViewDVDController(){
	System.out.println("In ViewDVDController");
}
  @Autowired
  private InventoryManager manager;

  public InventoryManager getManager() {
    return manager;
  }

  public void setManager(InventoryManager manager) {
    this.manager = manager;
  }

  /*todo in the first task, add a viewAll method that displays all DVDs
    it uses the InventoryManager to get all the dvds, and passes that on a as model
    to the view named DVDlist (letting the ViewResolver take care of the rest)
  */
  @RequestMapping(value="viewAll.view", method=RequestMethod.GET)
  public ModelAndView viewAll() throws Exception {
    Collection<DVDInfo> all = manager.getAll();
    return new ModelAndView("ListAll", "catalog", all);
  }

  /*todo in the second task, add a  method that displays the detais of a single DVD
    it uses the InventoryManager to get all the details of dvd identified with the request parameter
    dvdID. Next it passes that on a as model
    to view named  DVDDetail (letting the ViewResolver take care of the rest)

   */
  @RequestMapping(value="details.view")
  public ModelAndView details(  @RequestParam(value="dvdID", defaultValue="1") String dvdID){
    DVDDetails details = manager.getDetails(dvdID);
    return new ModelAndView("Detail", "dvd", details);
  }
}
