Feature: Feature to test login functionality
  Scenario: Check login is successful with valid credentials
    Given Sayfayi ac
    When Sayfanin acildigini dogrula
    Then Min kismina 0 yaz
    And Olustur butonuna tikla
    And Sayiyi al
    And Yeni sekmede youtube ac
    And Kosula gore arama yap
    And Video ac
    And Birinci dk tikla
