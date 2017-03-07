package com.root.simple.methods;

import android.app.*;
import android.content.*;
import android.net.*;
import android.os.*;
import android.view.*;

public class MainActivity extends Activity 
{
    @Override
   protected void onCreate(Bundle savedInstanceState){
super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
}
			
		
		
public void openActivity(View v){ startActivity(new Intent(MainActivity.this, SecondActivity.class)); }

public void openUrl(View v){ goToUrl.goToUrl(MainActivity.this, "google.com"); }

public void makeToastSHORT(View v){ toast.makeToastShort(this, "Short Toast!"); }

public void makeToastLONG(View v){ toast.makeToastLong(this, "Long Toast!"); }






	public void openSharedPrefs(View v){ startActivity(new Intent(MainActivity.this, GetText.class)); }
	
}
