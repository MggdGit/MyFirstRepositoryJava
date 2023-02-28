package Step;

import Page.Homepage;
public class FormSteps extends Homepage {

    public void enterFirstName(){
        String FIRST_NAME = "Lupita";
        this.first_name.sendKeys(FIRST_NAME);

    }

    public void click_Highest_level_of_education (){

        this.college.click();
    }

}
