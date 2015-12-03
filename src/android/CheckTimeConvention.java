package us.elirio.d.checktimeconvention;

import org.apache.cordova.*;

public class CheckTimeConvention extends CordovaPlugin {

    public boolean execute(CallbackContext callbackContext) {
        callbackContext.success("Hello");
        
        return true;
    }
}