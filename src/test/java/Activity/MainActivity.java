package Activity;
import appiumControl.Label;
import appiumControl.CheckBox;
import org.openqa.selenium.By;

public class MainActivity {
    public List noteList;
    public CheckBox FirstElement;



    public MainActivity(){
        noteList= new List(By.id("com.vrproductiveapps.whendo:id/swiperefresh"));
         FirstElement= new CheckBox(By.id("com.vrproductiveapps.whendo:id/home_list_item_marked"));

    }
    public boolean isDisplayedCheck(String titleList){
        String locator="//android.widget.TextView[@text='"+titleList+"']";
        Label contact = new Label(By.xpath(locator));
        return contact.isDisplayed();
    }

}
