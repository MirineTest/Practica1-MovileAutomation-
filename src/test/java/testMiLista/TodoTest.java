package testMiLista;

import Activity.AddList;
import Activity.MainLista;
import appiumControl.CheckBox;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import sessionManager.Session;

import java.net.MalformedURLException;


public class TodoTest {

    MainLista mainLista=new MainLista();
    AddList addList= new AddList();

    @Test
    public void AddRegisterLista( ) throws MalformedURLException
    {

        String tituloLista="juan";
     mainLista.AddNewTarea.click();

     addList.tituloLista.type(tituloLista);
     addList.notas.type("new");
     addList.iconAceptar.click();


     Assert.assertTrue("ERROR, el contacto no esta creado",mainLista.isDisplayedTarea(tituloLista));

    }

    @After
    public void after() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
