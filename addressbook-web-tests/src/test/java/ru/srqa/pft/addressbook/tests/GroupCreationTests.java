package ru.srqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.srqa.pft.addressbook.modle.GroupData;

public class GroupCreationTests extends TestBase {


  @Test
  public void testGroupCreation()  {
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("test1", null, "test3"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
  }

}
