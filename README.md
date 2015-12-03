# Check Time Convention
Checks if Cordova is running in a 12 (AM/PM) or 24 hour environment in iOS.

## How To Use
Install the plugin to your project.

    $ cordova plugin add https://github.com/ZenicStriker/cordova-ios-checktimeconvention

Call the plugin from your JavaScript.

```js
    var success = function(is24h) {
			if (is24h === true) {
				alert("24 hours.");
				// Do what you want.
			} else if (is24h === false) {
				alert("12 hours.");
				// Do what you want.
			}
    }
		
    var failure = function() {
      alert("Error calling CheckTimeConvention plugin!");
    }
    	
    CheckTimeConvention.timeConvention(success, failure);
```
