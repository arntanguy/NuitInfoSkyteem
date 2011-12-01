package skyteem.easygift;

import android.os.Bundle;
import android.webkit.WebView;
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