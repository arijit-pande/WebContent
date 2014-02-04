package com.example.webcontent;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class RoundBall extends Activity {

	WebView w=null;
	//Button b1,b2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.roundball);
		w=(WebView)findViewById(R.id.webView1);
		w.loadUrl("file:///android_asset/roundball/roundball.html");
		WebSettings webSettings = w.getSettings();
		webSettings.setDomStorageEnabled(true);
		w.getSettings().setJavaScriptEnabled(true);
		w.getSettings().setDomStorageEnabled(true);
		w.getSettings().setBuiltInZoomControls(true);
		//b1=(Button)findViewById(R.id.button1);
		//b2=(Button)findViewById(R.id.button2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

