import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import static java.lang.System.out;
import java.lang.*;

import java.util.Map;
import java.util.HashMap;

import spark.ModelAndView;

import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;


public class CoinReturn{
  public static void main(String[] args) {
    // this is where we'll put the templates
  }

  public static HashMap<String, Integer> returnChange (double change){
    Integer inputChange = change * 100;
    Integer quarter = Math.floor(inputChange/25);
    Integer remainder = inputChange % 25;

    Integer dime = Math.floor(remainder%10);

    Integer dime = Math.floor(inputChange/10);
    Integer nickel = Math.floor()
  }
}
