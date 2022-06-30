package simsource;

import java.util.HashMap;
import java.util.Map;

/*
 * the ratings class will hold ratings for 
 */
public class ratings {
    private Map<String, Double> ratingsValues = new HashMap<String, Double>();
    public void init(double hitRating, double critRating, double expertiseRating, double attackPower, double spellPower ){
        ratingsValues.put("hit", hitRating);
        ratingsValues.put("crit", critRating);
        ratingsValues.put("expertise", expertiseRating);
        ratingsValues.put("attackPower", attackPower);
        ratingsValues.put("spellPower", spellPower);
    }
    
}
