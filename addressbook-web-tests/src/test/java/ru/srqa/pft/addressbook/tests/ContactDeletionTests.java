package ru.srqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.srqa.pft.addressbook.modle.ContactData;

public class ContactDeletionTests extends TestBase {


  @Test
  public void testContactDeletion()  {
    app.getNavigationHelper().goToHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteSelectedContacts();
    app.getNavigationHelper().goToHomePage();
  }
}
