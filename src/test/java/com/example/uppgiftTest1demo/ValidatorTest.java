package com.example.uppgiftTest1demo;
import org.junit.jupiter.api.*;

public class ValidatorTest {

    // Validator v= new Validator();
    @Test
    public void mobileNoNotStartWithZero() {

        String c = "123456789";
        Assertions.assertFalse(Validator.isPhoneNumberValid(c));
    }

    @Test
    public void mobileNoStartWithZero() {

        String c = "0123456789";
        Assertions.assertTrue(Validator.isPhoneNumberValid(c));
    }
    @Test
    public void mobileNoLessthanSixDigits(){
        Assertions.assertFalse(Validator.isPhoneNumberValid("02314"));
    }
    @Test
    public void mobileNoMorethanTenDigits(){
        Assertions.assertFalse(Validator.isPhoneNumberValid("023143453656735"));
    }
    @Test
    public void mobileNoStartwithLetters(){
        Assertions.assertFalse(Validator.isPhoneNumberValid("w02314"));
    }
    @Test
    public void mobileNoAsACharacters(){
        Assertions.assertFalse(Validator.isPhoneNumberValid("wedwkldkefdxmv"));
    }
    @Test
    public void mobileNoWithSpecialCharacters(){
        Assertions.assertFalse(Validator.isPhoneNumberValid("02%31#4!"));
    }
    @Test
    public void mobileNoWithArthematicSymbols(){
        Assertions.assertFalse(Validator.isPhoneNumberValid("+02-3*14"));
    }
    @Test
    public void validEmail(){
        Assertions.assertTrue(Validator.isEmailValid(" vijaya.g@gma.se"));
    }
    @Test
    public void givingEmptyString(){
        Assertions.assertFalse(Validator.isEmailValid(" "));
    }
    @Test
    public void missingDot(){
        Assertions.assertFalse(Validator.isEmailValid("vijaya@sdffse"));
    }
    @Test
    public void missingAtTheSymbol(){
        Assertions.assertFalse(Validator.isEmailValid("vijayasdff.se"));
    }
    @Test
    public void givigDigitsOnly(){
        Assertions.assertTrue(Validator.isEmailValid("1234@45446.65"));
    }
    @Test
    public void endingwithDot(){
        Assertions.assertFalse(Validator.isEmailValid("vijaya@sdffse."));
    }
  /*  @Test
    public void missMatchingAtTheSymbolAndDot(){
        Assertions.assertFalse(Validator.isEmailValid("vija.sdff@se"));
    }*/
  @Test
  public void withOtherSymbols(){
      Assertions.assertFalse(Validator.isEmailValid("vijaya#%sdff.se"));
  }
  @BeforeAll
    public static void print(){
      System.out.println("Hai This is Vijaya");
  }
  @AfterAll
    public static void last(){
      System.out.println("Good Job! Continue learning");
  }
  @AfterEach
    public  void afterEachTest(){
      System.out.println("Thank you");
  }
  @BeforeEach
    public void beforeEachTest(){
      System.out.println("Continue Testing");
  }
}