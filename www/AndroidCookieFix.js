var exec = require('cordova/exec');

function AndroidCookieFix() 
{ 
	console.log("AndroidCookieFix.js: is created");
}

AndroidCookieFix.prototype.showToast = function(aString)
{ 
	console.log("AndroidCookieFix.js: showToast"); 
	exec(

	function(result)
	{ 
		/*alert("OK" + reply);*/ 
	}, 

	function(result)
	{ 
		/*alert("Error" + reply);*/ 
	},

	"AndroidCookieFix", aString, []);

} 

module.exports = new AndroidCookieFix();
