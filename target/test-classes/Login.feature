#Author: ridhotadjudin@gmail.com

Feature: Login ke Dashboard Cicool
	Scenario: Login dengan menggunakan valid credential
    Given User berada di halaman Login Account
    When User memasukan username
    And User memasukan password
    And User menekan tombol login
    Then User dapat masuk kedalam Dashboard utama

Scenario: Login dengan menggunakan credential tidak valid
    Given User berada di halaman Login Account
    When User memasukan username
    And User memasukan password yang salah
    And User menekan tombol login
    Then User tidak  masuk kedalam Dashboard utama dan menampilkan error