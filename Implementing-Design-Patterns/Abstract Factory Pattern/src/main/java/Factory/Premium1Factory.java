package Factory;

import Utilities.*;

public class Premium1Factory extends AbstractFactory {
    public Utility getUtility(String utilityName){
        Utility utility = null;
        if(utilityName.equalsIgnoreCase("ELECTRIC") ||  utilityName.equalsIgnoreCase("ELECTRICITY")) {
            utility = new Electric();
        }
        else if(utilityName.equalsIgnoreCase("INTERNET")){
            utility = new Internet(true, false);
        }
        else if(utilityName.equalsIgnoreCase("WATER")){
            utility = new Water(70);
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
