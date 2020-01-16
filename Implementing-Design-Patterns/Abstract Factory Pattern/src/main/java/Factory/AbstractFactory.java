package Factory;

import Utilities.Utility;

public abstract class AbstractFactory {
    abstract Utility getUtility(String utilityName);
}
