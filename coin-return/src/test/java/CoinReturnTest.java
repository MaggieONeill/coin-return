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
    Integer numOne = 3;
    assertEquals(numOne , newReturn.returnChange(90).get("quarter"));
  }
}
