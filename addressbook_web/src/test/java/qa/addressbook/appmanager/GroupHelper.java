package qa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import qa.addressbook.model.GroupData;

public class GroupHelper extends HelperBase{

    public GroupHelper(WebDriver driver) {
        super(driver);
    }

    public void returnToGroupPage() {
        driver.findElement(By.linkText("group page")).click();
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void fillGroupForm(GroupData groupData) {
        type(groupData.getName(), By.name("group_name"));
        type(groupData.getHeader(), By.name("group_header"));
        type(groupData.getFooter(), By.name("group_footer"));
    }

    public void initGroupCreation() {
        click(By.name("new"));
    }

    public void deleteSelectedGroup() {
        click(By.name("delete"));
    }

    public void selectGroup() {
        click(By.name("selected[]"));
    }

    public void initGroupModification() {
        click(By.name("edit"));
    }

    public void submitGroupModification() {
        click(By.name("update"));
    }
}
