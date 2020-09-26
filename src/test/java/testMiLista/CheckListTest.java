package testMiLista;

import Activity.AddList;
import Activity.MainActivity;
import Activity.MainLista;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sessionManager.Session;

import java.net.MalformedURLException;

public class CheckListTest {

    MainActivity mainActivity= new MainActivity();
    MainLista mainLista=new MainLista();
    AddList addList= new AddList();
    private String titleList= "juan";

    @Before
    public void before() throws MalformedURLException {


        TodoTest todoTest= new TodoTest();
        todoTest.AddRegisterLista();

    }
    @Test
    public void checkList() throws MalformedURLException {

        mainActivity.FirstElement.check();

        Assert.assertTrue("ERROR, el contacto no esta creado",mainActivity.isDisplayedCheck(titleList));

    }

    @After
    public void after() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
