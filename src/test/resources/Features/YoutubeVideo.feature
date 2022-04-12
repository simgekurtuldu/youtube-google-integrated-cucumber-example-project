Feature: Random alınan sayıya göre youtube'da ilgili videonun birinci dk'sına gitme

  Scenario: Google'da random sayi aratma
    Given Chrome tarayicisi acilmis olmali
    When Random number arattigimda
    Then Random number sayfasi acilmis olmali

  Scenario: Aralik kisitlamasi ile yeni sayi alma
    When Min alanina 0 yazdigim zaman
    And Olustur butonuna tikladigimda
    Then Sayi guncellenmis olmali

  Scenario: Youtube'u acma
    Given Random sayi alinmis olmali
    When Yeni sekmede youtube'a gidilmeli
    Then Youtube acilmis olmalidir

  Scenario: Sayi araliginin 0-5 olma durumunda youtube arama
    When  Sayi 0-5 araliginda ise Matematik konu anlatimi arat
    Then Matematik konu anlatimi videolari gelmis olmalidir

  Scenario: Sayi araliginin  5-10 olma durumunda youtube arama
    When Sayi 5-10 araliginda ise Turkce konu anlatimi arat
    Then Turkce konu anlatimi videolari gelmis olmalidir

  Scenario: Uygun videonun acilmasi
    When  Basligi tyt, Tyt ya da TYT kelimesini iceren ve playlist olmayan ilk sonuca tiklandiginda
    Then Video acilmis olmalidir


  Scenario: Videodaki reklami gecme
    When Reklam ile baslayan videoda reklami gec butonuna basildiginda
    Then Reklam atlanmis olmalidir

  Scenario: Videoda birinci dk'ya gitme
    When Birinci dk'ya gidildiginde
    Then Video suresi birinci dk'da olmalidir







