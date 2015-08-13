import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import static java.lang.System.out;
import java.lang.*;

import java.util.Map;
import java.util.HashMap;

import spark.ModelAndView;

//import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;


public class CoinReturn{
  public static void main(String[] args) {
    // this is where we'll put the templates
  }

  public static HashMap<String, Integer> returnChange (Integer change){
    Integer quarter = 0;
    Integer dime = 0;
    Integer nickel = 0;
    Integer penny = 0;


    while(change > 25) {
      change = change - 25;
      quarter++;
    }
    while(change > 10) {
      change = change - 10;
      dime++;
    }
    while(change > 5) {
      change = change - 5;
      nickel++;
    }
    penny = change;


    HashMap<String, Integer> coinReturn = new HashMap<String, Integer>();
    coinReturn.put("quarter", quarter);
    coinReturn.put("dime", dime);
    coinReturn.put("nickel", nickel);
    coinReturn.put("penny", penny);

    return coinReturn;
  }
}
