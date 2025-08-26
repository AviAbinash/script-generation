Feature: action_test_copy1
#Regression Type
#Correct Values = true
#Incorrect Values = false
#Illegal Values = false
#Invalid Values = false
#Boundary Values = false
#Edge Cases Values = false

@verify_copied_text_not_present_copied_text_not_present
@uid535063028
@set21
@test001
Scenario Outline: verify copied text not present_copied text not present
Given I have access to application
When I scroll and click Form Auth link in the internet
And I copied text Elemental Selenium_link in the internet
And I clicked browser back button back in the internet
Then verify copied text not present by index ver_control in the internet as '<ver_control1>'
When I scroll and click Form Auth link in the internet
And I entered Username_tb in the internet as '<Username_tb2>'
And I copied text Username_tb in the internet
And I clicked browser back button back in the internet
Then verify copied text not present by index ver_control in the internet as '<ver_control3>'
When I scroll and click Form Auth link in the internet
And I copied text Login Page_label in the internet
And I clicked browser back button back in the internet
Then verify copied text not present by index ver_control in the internet as '<ver_control4>'
When I scroll and click Form Auth link in the internet
And I copied text Login_ddl in the internet
And I clicked browser back button back in the internet
Then verify copied text not present by index ver_control in the internet as '<ver_control5>'
And verify copied text not present by index ver_control in the internet as '<ver_control6>'
And verify copied text not present by index ver_control in the internet as '<ver_control7>'
And verify copied text not present by index ver_control in the internet as '<ver_control8>'
And verify copied text not present by index ver_control in the internet as '<ver_control9>'
And '<page>' is displayed with '<content>'

Examples:
|SlNo.|ver_control1|Username_tb2|ver_control3|ver_control4|ver_control5|ver_control6|ver_control7|ver_control8|ver_control9|page|content|
|1|1|Vidisha|2|3|4|2|4|1|3|The Internet|NA|

#Total No. of Test Cases : 1

