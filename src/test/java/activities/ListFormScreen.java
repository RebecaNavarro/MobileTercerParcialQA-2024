package activities;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class ListFormScreen {

    public TextBox tittleTxtBx = new TextBox(By.id("com.vrproductiveapps.whendo:id/categoryTitle"));
    public Button colorButton = new Button(By
            .id("com.vrproductiveapps.whendo:id/color_select6"));
    public Button saveButton = new Button(By
            .id("com.vrproductiveapps.whendo:id/saveItem"));

    public Button deleteButton = new Button(By
            .id("com.vrproductiveapps.whendo:id/deleteItem"));

    public Button confirmDeleteButton = new Button(By.id("android:id/button1"));

}
