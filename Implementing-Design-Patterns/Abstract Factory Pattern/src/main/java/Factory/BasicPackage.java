package Factory;

import Utilities.*;

public class BasicPackage extends AbstractFactory {
    public Utility getUtility(String utilityName){
        Utility utility = null;
        if(utilityName.equalsIgnoreCase("ELECTRIC") ||  utilityName.equalsIgnoreCase("ELECTRICITY")) {
            utility = new Electric(6075, 100);
        }
        else if(utilityName.equalsIgnoreCase("INTERNET")){
            utility = new Internet();
        }
        else if(utilityName.equalsIgnoreCase("WATER")){
            utility = new Water(85);
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
