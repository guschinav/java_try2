package ru.srqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.srqa.pft.addressbook.modle.ContactData;

public class ContactCreationTests extends TestBase {




  @Test
  public void testContactCreation()  {
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("Wolf", "Smirnoff", "Saintursberg", "79111111111", "Test@test.ru"));
    app.getContactHelper().enterContactForm();
    app.getNavigationHelper().goToHomePage();

  }


}

