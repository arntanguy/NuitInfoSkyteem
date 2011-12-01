package skyteem.nuitinfo;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class NuitInfoSkyteemActivity extends Activity {
	WebView webView=null;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        webView = (WebView) findViewById(R.id.webView);
        // Simplest usage: note that an exception will NOT be thrown
        // if there is an error loading this page (see below).
        webView.loadUrl("http://slashdot.org/");
    
    }
}