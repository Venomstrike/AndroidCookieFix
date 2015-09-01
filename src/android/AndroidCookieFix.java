import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaInterface;
import android.util.Log;
import android.provider.Settings;
import android.widget.Toast;
import android.webkit.CookieManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public class AndroidCookieFix extends CordovaPlugin 
{
	/**
	* Constructor.
	*/
	public AndroidCookieFix() {}
	/**
	* Sets the context of the Command. This can then be used to do things like
	* get file paths associated with the Activity.
	*
	* @param cordova The context of the main Activity.
	* @param webView The CordovaWebView Cordova is running in.
	*/
	public void initialize(CordovaInterface cordova, CordovaWebView webView) 
	{
		super.initialize(cordova, webView);
		try{
          CookieManager.setAcceptFileSchemeCookies(true);
      	}catch(Throwable e){}
	}
			
	public boolean execute(final String action, JSONArray args, CallbackContext callbackContext) throws JSONException 
	{
		// Shows a toast
		cordova.getActivity().runOnUiThread(new Runnable() {
			public void run() 
			{
				Toast toast = Toast.makeText(cordova.getActivity().getApplicationContext(), action, Toast.LENGTH_SHORT);
				toast.show();
			}
		});

		return true;
	}
}
