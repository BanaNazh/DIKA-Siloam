Feature: Dashboard Admin

@tag1
Scenario: Dashboard User Function
			When User on menu dashboard
			And User Admin view and report
			And User Admin click start date
			And User Admin click end date
			And User Admin click button filter
			Then User Admin click button redo 
			And User Admin click start date
			And User Admin click button filter
#			Then Alert on end date credentials
			Then User Admin click button redo 
			And User Admin click end date
			And User Admin click button filter
			And User Admin click start date
			And User Admin click end date
			And User Admin click button filter
			Then User click button export
			Then User click button download

@tag2
Scenario: View on Data Table
			When User Admin click View
			Then User Admin click Preview Data
			
@tag3
Scenario: View on Foto Faskes Awal
			Then User Admin click Foto Faskes Awal
			
@tag4
Scenario: View on Foto Faskes Tujuan
			Then User Admin click Foto Faskes Tujuan
			
@tag5
Scenario: View on Foto PDF Agreement
			Then User Admin click scan PDF Agreement