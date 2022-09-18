Feature: Return

Scenario: User valid login module Return
    When User go to Web Dika Siloam modul Return
    And User enter valid username and password modul Return
    And User click button login valid modul Return
    Then User enter valid credentials modul Return
    
Scenario: User navigate to return page
		And User click on return button
		Then User landed on return page successfully
 
Scenario: Blank Start Date Ret001 
		And Click on date picker Start Date Ret001
		And Leave Blank on Start Date Ret001
		And Click on date picker End Date Ret001
		And Select a day on End Date Ret001
		And Click Status Dropdown Ret001
		And Select Status Pending Ret001
		And Click Button Filter Ret001
		Then User received error message Blank Start Date Ret001
		
Scenario: Blank End Date Ret002
		And Click on date picker Start Date Ret002
		And Select a day on Start Date Ret002
		And Click on date picker End Date Ret002
		And Leave Blank on End Date Ret002
		And Click Status Dropdown Ret002
		And Select Status Pending Ret002
		And Click Button Filter Ret002
		Then User received error message Blank End Date Ret002
		
Scenario: Set Future day on Start Date Ret003
		And Click on date picker Start Date Ret003
		And Set Future day on Start Date Ret003	
		And Click on date picker End Date Ret003
		And Select a day on End Date Ret003
		And Click Status Dropdown Ret003
		And Select Status Pending Ret003
		And Click Button Filter Ret003
		Then User received No data available in table Ret003
		
Scenario: Set Future day on End Date Ret004
		And Click on date picker Start Date Ret004
		And Select a day on Start Date Ret004
		And Click on date picker End Date Ret004
		And Set Future day on End Date Ret004
		And Click Status Dropdown Ret004
		And Select Status Pending Ret004
		And Click Button Filter Ret004
		Then User received No data available in table Ret004
		
Scenario: Blank Status Ret005
		And Click on date picker Start Date Ret005
		And Select a day on Start Date Ret005
		And Click on date picker End Date Ret005
		And Select a day on End Date Ret005
		And Click Status Dropdown Ret005
		And Select Status Blank Ret005
		And Click Button Filter Ret005
		Then User received error message Blank Status Ret005
			
Scenario: Complete Status Ret006		
		And Click on date picker Start Date Ret006 
		And Select a day on Start Date Ret006
		And Click on date picker End Date Ret006
		And Select a day on End Date Ret006
		And Click Status Dropdown Ret006
		And Select Status Complete Ret006
		And Click Button Filter Ret006
		Then User return Page for status Complete Ret006
		
	Scenario: User return Page for status Pending		
		And User Click Start Date
		And Select a day in Start Date
		And Select a day in End Date
		And Click Status
		And Select status as Pending
		And Click Button Filter
		Then User return Page for status Pending	
		And User select filter with Pending status
		