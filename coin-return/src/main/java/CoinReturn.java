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

  public static HashMap<String, Double> returnChange (Double change){



    Double quarter =  Math.floor(change / 25);
    Double remainder = change % 25;

    Double dime = Math.floor(remainder / 10);
    remainder = remainder % 10;

    Double nickel = Math.floor(remainder / 5);
    remainder = remainder % 5;

    Double penny = remainder;

    HashMap<String, Double> coinReturn = new HashMap<String, Double>();

    coinReturn.put("quarter", quarter);
    coinReturn.put("dime", dime);
    coinReturn.put("nickel", nickel);
    coinReturn.put("penny", penny);

    return coinReturn;
  }
}
