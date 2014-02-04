package com.example.webcontent;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class war extends Activity {

	WebView w=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.war);
		w=(WebView)findViewById(R.id.webView1);
		w.loadUrl("file:///android_asset/waroftheworlds.html");
		WebSettings webSettings = w.getSettings();
		webSettings.setDomStorageEnabled(true);
		//w.getSettings().setJavaScriptEnabled(true);
		//w.getSettings().setDomStorageEnabled(true);
		//w.getSettings().setBuiltInZoomControls(true);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

