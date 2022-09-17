Feature: Dashboard Menu

@tag1
Scenario: User on feature input data Field Nama
			When User on menu Dashboard
			And User click menu Input
			And User input field Nama huruf
			And User input field Nama angka
			And User input field Nama simbol

@tag2			
Scenario: User on feature input data Field BPJS
			When User input field BPJS huruf
			And User input field BPJS simbol
			And User input field BPJS angka
			Then User click button Simpan
			And User input field Nama keep
			And User input field BPJS kurang
			Then User click button Simpan
			And User input field BPJS tambah
			
@tag3
Scenario: User on feature input data Field KTP
			When User input field KTP angka
			And User input field KTP huruf
			And User input field KTP simbol
			And User input field KTP kurang
			Then User click button Simpan
			And User input field KTP tambah
			Then User click button Simpan
			
@tag4
Scenario: User on feature input data Field Alamat
			And User input field Alamat angka
			And User input field Alamat simbol
			And User input field Alamat huruf
			Then User click button Simpan
			
@tag5
Scenario: User on feature input data Field Search Kota
			When User click button kota KTP 
			And User input field angka pilih KTP
			And User input field simbol pilih KTP
			And User input field Jakarta Selatan
			And User click Jakarta Selatan
			Then User click button Simpan
						
@tag6
Scenario: User on feature input data Field Faskes Awal
			When User input field faskes Awal simbol
			And User input field faskes Awal angka
			Then User click button Simpan
			And User input field faskes Awal huruf
			Then User click button Simpan

			
@tag7
Scenario: User on feature input data Field Faskes Tujuan
			When User click button faskes Tujuan 
			And User input field angka
			And User input field simbol
			And User input field Jakarta Pusat
			And User clik Jakarta Pusat
			Then User click button Simpan
			And User input field Alasan
			Then User click button Simpan
			
#@tag8
#Scenario: User not input data Field
#			And User input field BPJS angka
#			Then User click button Simpan
#			And User input field Nama huruf
#			Then User click button Simpan
#			And User input field BPJS angkaa
#			Then User click button Simpan
#			And User input field KTP angka
#			Then User click button Simpan
#			And User input field Alamat huruf
#			Then User click button Simpan
#			And User click kota KTP 
#			And User clik Jakarta Selatan
#			Then User click button Simpan
#			And User input field faskes Awal huruf
#			Then User click button Simpan
#			And User click faskes Tujuan 
#			And User clik Jakarta Pusat
#			Then User click button Simpan
#			And User input field Alasan huruf
#			Then User click button Simpan
			

#Scenario: User not click Faskes Alasan
#			And User input field Nama huruf
#			And User input field BPJS angka
#			And User input field KTP angka
#			And User input field Alamat huruf
#			And User click kota KTP
#			And User click Jakarta Selatan
#			And User input field faskes Awal