package com.example.webcontent;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class uofi extends Activity {

	WebView w=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.uofi);
		w=(WebView)findViewById(R.id.webView1);
		w.loadUrl("file:///android_asset/uofi-at-nasa.html");
		WebSettings webSettings = w.getSettings();
		webSettings.setDomStorageEnabled(true);
		w.getSettings().setJavaScriptEnabled(true);
		w.getSettings().setDomStorageEnabled(true);
		w.getSettings().setBuiltInZoomControls(true);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

