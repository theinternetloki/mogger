package com.kimistudios.mogger;


import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Profile extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_profile);
		WebView mywebview = (WebView) findViewById(R.id.webView1);
        mywebview.loadUrl("http://www.stmgang.com/app/posts.html");
        WebSettings webSettings = mywebview.getSettings();
        webSettings.setJavaScriptEnabled(true);
		mywebview.setWebViewClient(new WebViewClient());
	
	    // TODO Auto-generated method stub
	}

}
