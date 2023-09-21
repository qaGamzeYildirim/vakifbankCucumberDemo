Feature: Credit Calculation
@creditCalculation
  Scenario: Credit Calculationing - installment additional account
    Given a web browser is at the Vakifbank page
    When the user clicks the Bireysel tab
    And the user clicks on the Bireysel Krediler tab from the menu that opens
    Then the user checks that the Hesaplama Araçları link exists
    And the user clicks the Hesaplama Araçları link
    Then the user checks that the Kredi Hesaplama Aracı field is on the screen
    And the user clicks the Hesapla button in the Kredi Hesaplama Aracı
    And the user selects Taksitli Ek Hesap option from the credit dropbox
    And the user writes 10 in the maturity field
    Then  200 must be set in the Tutar field
    And the user clicks the Hesapla button in the Kredi Hesaplama Aracı
    Then the user checks field Toplam Ödenecek Tutar
    Then driver close
