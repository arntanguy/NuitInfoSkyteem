package skyteem.easygift;

import skyteem.nuitinfo.R;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.phonegap.DroidGap;

public class EasyGiftActivity extends DroidGap {
	WebView webView=null;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        webView = (WebView) findViewById(R.id.webView);

        final WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setBuiltInZoomControls(false);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
    
        // Load a web page
        webView.loadUrl("http://easygift.druil.net/test.html");   

        
        // hide address bar
        webView.setWebViewClient(new WebViewClient());
    }
}