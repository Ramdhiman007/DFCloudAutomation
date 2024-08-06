package testCases;

import org.testng.annotations.Test;
import pageObjects.Task_Status_Page;

public class TC17_TaskStatus_Page extends pageObjects.Base_Page {

	@Test(priority=1)
    public void taskstatus() {
		Task_Status_Page tsk = new Task_Status_Page();
        tsk.taskstatus();
    }

   }