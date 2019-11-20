package qa.addressbook.tests;

import org.junit.Test;

public class DeleteGroup extends TestBase{

  @Test
  public void testDeleteGroup() {
    app.getNavigationHelper().goToGroup();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroup();
    app.getGroupHelper().returnToGroupPage();
  }

}
