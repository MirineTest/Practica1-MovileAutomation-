package Activity;

import appiumControl.*;
import org.openqa.selenium.By;

public class MainLista {

    public Button AddNewTarea;

    public MainLista(){

       AddNewTarea =new Button(By.id("com.vrproductiveapps.whendo:id/fab"));

    }
    public boolean isDisplayedTarea(String tituloLista){
        String locator="//android.widget.TextView[@text='"+tituloLista+"']";
        Label contact = new Label(By.xpath(locator));
        return contact.isDisplayed();
    }


}
