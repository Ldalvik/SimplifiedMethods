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
			
		
		
public void openActivity(View v){ startActivity(new Intent(this, SecondActivity.class)); }

public void openUrl(View v){ goToUrl.goToUrl(MainActivity.this, /*no https:// needed*/ "google.com"); }

public void makeToastSHORT(View v){ toast.makeToastShort(this, "Short Toast!"); }

public void makeToastLONG(View v){ toast.makeToastLong(this, "Long Toast!"); }

public void makeDialog(View v){dialog.showDialog(MainActivity.this, "title", "message", "positive button", "negative button");}

public void openSharedPrefs(View v){ startActivity(new Intent(this, GetText.class)); }
public void openProgramViews(View v){ startActivity(new Intent(this, programViews.class)); }
public void openAddView(View v){ startActivity(new Intent(this, add_onclick.class)); }
public void openCustomTextView(View v){ startActivity(new Intent(this, add_custom_textview.class)); }
	



}
