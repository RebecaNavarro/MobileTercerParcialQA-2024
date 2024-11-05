package testSuite;

import activities.EditListScreen;
import activities.ListFormScreen;
import activities.MainScreen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

public class ListTest {

    MainScreen mainScreen = new MainScreen();
    ListFormScreen listFormScreen = new ListFormScreen();
    EditListScreen editListScreen = new EditListScreen();

    @Test
    public void listCRUDTest(){
        mainScreen.menuButton.click();
        mainScreen.editListButton.click();
        editListScreen.addListButton.click();
        listFormScreen.tittleTxtBx.setText("Lista1");
        listFormScreen.colorButton.click();
        listFormScreen.saveButton.click();
        editListScreen.newListButton.click();

        Assertions.assertEquals("Lista1",listFormScreen.tittleTxtBx.getText(),
                "ERROR no se creo la lista");

        listFormScreen.tittleTxtBx.clearSetText("Lista1Updated");
        listFormScreen.saveButton.click();
        editListScreen.newListButton.click();

        Assertions.assertEquals("Lista1Updated",listFormScreen.tittleTxtBx.getText(),
                "ERROR no se actualizo la lista");

        listFormScreen.deleteButton.click();
        listFormScreen.confirmDeleteButton.click();

        Assertions.assertFalse(editListScreen.newListButton.isControlDisplayed(),
                "ERROR no se eliminó la lista");

    }

    @AfterEach
    public void close(){
        Session.getInstance().closeApp();
    }

}
