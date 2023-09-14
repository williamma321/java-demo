package org.demo.bankapp;

public class ScreenMenu {
    String menu_text;

    String menu_text2;

    ScreenMenu(){
        this.menu_text =
        """
                ************Welcome to Demo Bank App*****************

                ********  Please type in the follow selection *******

                           1.  For account balance - Enter - 1      \s
                           2.  To  deposit         - Enter - 2      \s
                           3.  To  withdraw        - Enter - 3      \s
                        To Exit the application    - Enter - 4      \s

                +++++++++++++++++++++++++++++++++++++++++++++++++++++

               """;
        this.menu_text2 = "  Please enter your selection (1, 2, 3, 4) -->";
    }
}
