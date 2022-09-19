Feature: Tanda Tangan Digital


Scenario: on menu Dashboard
			When User click menu New ttd
			And User click Search ttd
			Then User click button Aksi ttd
			
Scenario: User edit Tanda Tangan Digital
			When User click button Edit
			And User click button Cancel
			When User click button Edit
			And User input field Nama ttd
			And User input field BPJS ttd
			And User input field KTP ttd
			And User input field Alamat ttd
			And User click button kota KTP ttd
			And User input field Jakarta Barat ttd
			And User input field faskes Awal ttd
			And User click button faskes Tujuan ttd
			And User input field Jakarta Timur ttd
			And User input field Alasan ttd
			Then User click button Update
			Then User click button Submit ttd

#Scenario: User upload ulang foto document
#			When User click button Add File1
#			And User click button Cancel upload ulang
#			When User click button Add File1
#			And User click button Add File Before
#			And User click button Simpan upload ulang
#			And User click button Add File2
#			And User click button Cancel upload ulang
#			And User click button Add File2
#			And User click button Add File After
#			And User click button Simpan upload ulang
#			And User click button Add File3
#			And User click button Cancel upload ulang
#			And User click button Add File3
#			And User click button Add File TTD
#			And User click button Simpan upload ulang
#			Then User click button Submit ttd