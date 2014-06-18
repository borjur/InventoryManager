package springmvc.application.inventory.impl;

import springmvc.application.inventory.InventoryManager;
import springmvc.application.inventory.DVDDetails;
import springmvc.application.inventory.DVDInfo;
import springmvc.application.inventory.InvalidDvdIdException;

import java.util.*;


public class InventoryManagerMock implements InventoryManager {

   // This class has been completed for you

   // for the mock implementation store DVDDetails as aposed to DVD objects
   Map<String,DVDDetails> catalog = new HashMap<String,DVDDetails>();


  public Map<String, DVDDetails> getCatalog() {
    return catalog;
  }

  public void setCatalog(Map<String, DVDDetails> catalog) {
    this.catalog = catalog;
  }

  public void addDvd(DVDDetails details) throws InvalidDvdIdException{
    String id = details.getId();
    if (catalog.containsKey(id))
      throw new InvalidDvdIdException(id + " is in use");
    catalog.put(id,details);
  }

  public DVDDetails getDetails(String dvdID)  {
    return catalog.get(dvdID);
  }

  public Collection<DVDInfo> getAll() {
    Collection<DVDDetails> collection = catalog.values();
    List<DVDInfo> result = new ArrayList<DVDInfo>(collection.size());
    for (DVDDetails details : collection) {
      result.add(new DVDInfo(details.getId(),details.getTitle()));
    }
    return result;
  }
}
