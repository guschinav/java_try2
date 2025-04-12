package ru.srqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.srqa.pft.addressbook.modle.ContactData;

public class ContactCreationTests extends TestBase {




  @Test
  public void testContactCreation()  {
    app.initContactCreation();
    app.fillContactForm(new ContactData("Rob", "Smirnoff", "Saintursberg", "79111111111", "Test@test.ru"));
    app.enterContactForm();
    app.goToHomePage();

  }


}

