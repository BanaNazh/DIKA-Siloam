Feature: Upload Document
	
Scenario: User on form Upload Document
			When User click menu New
			And User click Search
			Then User click button Aksi
			
Scenario: Upload foto faskes Awal
			When User click button foto Faskes Awal
			And User click button Cancel upload
			When User click button foto Faskes Awal
			And User click button choose file Faskes Awal
			Then User click button Simpan upload
			And User click button Confirm
			
Scenario: Upload foto faskes Tujuan
			When User click button foto Faskes Tujuan
			And User click button Cancel upload
			When User click button foto Faskes Tujuan
			And User click button choose file Faskes Tujuan
			Then User click button Simpan upload
			And User click button Confirm
			
Scenario: Upload foto faskes Awal
			When User click button foto TTD Digital
			And User click button Cancel upload
			When User click button foto TTD Digital
			And User click button choose file TTD Digital
			Then User click button Simpan upload
			And User click button Confirm
			And User click button Selanjutnya
			Then User click button OK