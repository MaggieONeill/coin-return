import org.junit.*;
import static org.junit.Assert.*;
import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import java.lang.*;

import static org.assertj.core.api.Assertions.assertThat;

public class CoinReturnTest {

  @Test
  public void returnChange_CheckThatReturnsCorrectChange_true() {
    CoinReturn newReturn = new CoinReturn();
    Integer numThree = 3;
    assertEquals(numThree , newReturn.returnChange(90).get("quarter"));
    //return change is calling the method, 90 is the input
  }

  @Test
  public void returnChange_CheckThatReturnsCorrectPennies_true(){
    CoinReturn newReturn = new CoinReturn();
    Integer numOne = 1;
    assertEquals(numOne , newReturn.returnChange(26).get("penny"));
  }

  @Test
  public void validateInput_MakeSureInputIsAnInt_true() {
    CoinReturn newReturn = new CoinReturn();

    assertEquals(true, newReturn.validateInput("23"));
  }
  @Test
  public void validateInput_ReturnFalseWhenNotANum_false() {
    CoinReturn newReturn = new CoinReturn();

    assertEquals(false, newReturn.validateInput("peack0@ck"));
  }
}
