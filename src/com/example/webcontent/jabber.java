package com.example.webcontent;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;


public class jabber extends Activity {

	WebView w=null;
	Button b1,b2;
	MediaPlayer player=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.jabber);
		String x="";
		b1=(Button)findViewById(R.id.button1);
		b2=(Button)findViewById(R.id.button2);
		w=(WebView)findViewById(R.id.webView1);
		w.loadUrl("file:///android_asset/jabberwocky.html");
		player = MediaPlayer.create(jabber.this,R.raw.frieza ); 
        player.setLooping(true); // Set looping 
        player.setVolume(100,100); 
        player.start(); 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	@Override
	protected void onPause()
	{
		super.onPause();
		player.stop();
		player.release();
	}
	@Override
	protected void onStop() {
	    Log.w("helloworld", "App stopped");

	    super.onStop();
	}

	@Override
	protected void onDestroy() {
	    Log.w("hello wolrd", "App destoryed");

	    super.onDestroy();
	}
	public void onClick(View v)
	{
		if(R.id.button1==v.getId())
		{
			Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://en.wikipedia.org/wiki/Jabberwocky"));
			startActivity(browserIntent);
		}
		if(R.id.button2==v.getId())
		{
			w.loadUrl("file:///android_asset/jabberwocky.jpg");
		}
	}
}

