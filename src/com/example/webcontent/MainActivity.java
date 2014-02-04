package com.example.webcontent;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	Button b1=null,b2=null,b3=null,b4=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		b1=(Button)findViewById(R.id.button1);
		b2=(Button)findViewById(R.id.button2);
		b3=(Button)findViewById(R.id.button3);
		b4=(Button)findViewById(R.id.button4);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public void onClick(View v)
	{
		if(v.getId()==R.id.button1)
		{
			Intent i=new Intent(this,RoundBall.class);
			startActivity(i);
		}
		if(v.getId()==R.id.button2)
		{
			Intent i=new Intent(this,jabber.class);
			startActivity(i);
		}
		if(v.getId()==R.id.button3)
		{
			Intent i=new Intent(this,uofi.class);
			startActivity(i);
		}
		if(v.getId()==R.id.button4)
		{
			Intent i=new Intent(this,war.class);
			startActivity(i);
		}
	}
}
