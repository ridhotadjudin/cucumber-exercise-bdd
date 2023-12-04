#Author: ridhotadjudin@gmail.com

Feature: CRUD Feature
Scenario Outline: Input Data Absensi
    Given User berada di halaman Login Account
    When User memasukan uname ridhotadjudin@gmail.com
    And User memasukan pass 123456
    And User menekan tombol login
    And User menekan tombol CRUD
    And User menekan tombol See Tabel Absensi
    And User mengisi data absensi baru <username> <email> <location>
    Then Data baru disimpan
    
    
    Examples:
    	|username	| email						|location  |
    	|ridho		| ridho@gmail.com	|bandung   |
    	|udin			|udin@gmail.com		|majalengka|
    	|rahman		|rahman@gmail.com	|lumajang	 |
    
    
    
    
