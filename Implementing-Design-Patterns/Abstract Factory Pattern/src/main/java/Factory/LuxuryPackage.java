package Factory;

import Utilities.*;

public class LuxuryPackage extends AbstractFactory {
    public Utility getUtility(String utilityName){
        Utility utility = null;
        if(utilityName.equalsIgnoreCase("ELECTRIC") ||  utilityName.equalsIgnoreCase("ELECTRICITY")) {
            utility = new Electric();
        }
        else if(utilityName.equalsIgnoreCase("INTERNET") || utilityName.equalsIgnoreCase("CABLE") || utilityName.equalsIgnoreCase("TELEPHONE")){
            utility = new Internet(true, true);
        }
        else if(utilityName.equalsIgnoreCase("WATER")){
            utility = new Water();
        }
        else if(utilityName.equalsIgnoreCase("SEWAGE")){
            utility = new Sewage();
        }
        else if(utilityName.equalsIgnoreCase("TRASH")){
            utility = new Trash();
        }

        return utility;
    }
}
