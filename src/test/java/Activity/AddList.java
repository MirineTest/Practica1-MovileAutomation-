package Activity;

import appiumControl.Button;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class AddList {

   public TextBox tituloLista;
   public TextBox notas;
    public Button iconAceptar;
   public AddList(){
      tituloLista= new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
       notas= new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
      iconAceptar =new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));

   }

}
