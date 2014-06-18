package springmvc.application.inventory;

import java.util.Collection;


   public interface InventoryManager {
   // This class has been completed for you

     /**
      * Adds a new DVD to the inventory
      * @param details the DVD to add
      * @throws InvalidDvdIdException when the dvdId is already in use
      */
     public void addDvd(DVDDetails details) throws InvalidDvdIdException;

     /**
      * Obtains details for a single DVD
      * @param dvdID
      * @return a All the DVD Details or null when
      * the dvdID is invalid
      */
     public DVDDetails getDetails(String dvdID);

     /**
      * Returns all DVD
      * @return a DVDInfo for eacht DVD (only contains the id and the title)
      */
     public Collection<DVDInfo> getAll();
   }

