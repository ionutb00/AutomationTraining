package training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import training.helpers.ElementsHelper;

public abstract class BasePage {
    //variabla driver o sa fie folosita in toate paginile care o sa mosteneasca basePage
    public WebDriver driver;
    public ElementsHelper elementsHelper;
    //facem un constructor care sa initializeze driver-ul
    public BasePage(WebDriver driver) {
        this.driver = driver;
        elementsHelper=new ElementsHelper(driver);
        PageFactory.initElements(driver,this);
    }
    //Facem o metoda abstracta pe care fiecare pagina trebuie sa o implementeze pentru a verifica daca pagina este incarcata corect
    abstract void isPageLoaded();
}
