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
        super.loadUrl("http://easygift.druil.net/test.html");
    }
}