package qa.addressbook.tests;

import org.junit.Test;
import qa.addressbook.model.GroupData;

public class TestAddressTest extends TestBase {

    @Test
    public void testAddress() {
        app.getNavigationHelper().goToGroup();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("Test1", "Test2", "Test3"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage();

    }

}
