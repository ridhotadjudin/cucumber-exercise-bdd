#Author: ridhotadjudin@gmail.com

Feature: Login ke Dashboard Cicool
#	Scenario: Login dengan menggunakan valid credential
#    Given User berada di halaman Login Account
#    When User memasukan username
#    And User memasukan password
#    And User menekan tombol login
#   Then User dapat masuk kedalam Dashboard utama
	
	Scenario Outline: Login dengan menggunakan credential tidak valid
    Given User berada di halaman Login Account
    When User memasukan uname <username>
    And User memasukan pass <password>
    And User menekan tombol login
    Then User tidak  masuk kedalam Dashboard utama dan menampilkan error
	
    Examples:
    	|username								|password|
    	|ridhotadjudin@gmail.com|123456	 |
    	|ridhotadjudin@gmail.com|123	   |