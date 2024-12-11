package training.test;

import org.testng.annotations.Test;
import training.pages.PracticeFormPage;

import static training.constants.MenuKeys.FORMS_MENU;
import static training.constants.SubMenuKeys.PRACTICE_FORM_SUBMENU;

public class PracticeFormTest extends BaseTest {

    @Test
    public void PracticeFormTest(){
        homePage.isPageLoaded();
        homePage.selectMenu(FORMS_MENU);
        commonPage.isPageLoaded();
        commonPage.selectSubMenu(PRACTICE_FORM_SUBMENU);
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
        practiceFormPage.fillEntireForm();
//        practiceFormPage.fillFirstAndLastName();

    }
}
