Feature: Testing the functionality of the jQuery website

Scenario: Checking the jQuery website menu
  Then Verify left menu bar contains the following sections: Interactions, Widgets, Effects, Utilities.

  Scenario: Checking the functionality of the Autocomplete link
    Then Click "Autocomplete" in Widgets left menu section
    Then Type “a” in Tags field
    Then From the list of autocomplete that appears, select the option with the value Asp from the keyboard.
    Then Verify Tags field value is Asp

  Scenario: Checking the functionality of the Spinner link
    Then Click "Spinner" link in Widgets left menu section
    Then Enter any digital value In Select a value textbox
    Then Click Get value button
    Then the popup window contains the entered value.
