/*global cordova, module*/

module.exports = {
    timeConvention: function (successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "CheckTimeConvention", "timeConvention");
    }
};
