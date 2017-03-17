package com.root.simple.methods;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.widget.LinearLayout.*;

public class add_onclick extends Activity 
{
    @Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
        setContentView(R.layout.add_when_clicked);
	}	

	public void add(View v){
		int i=0;
		int x=0;
	new Integer(x=+1);

		LinearLayout secondlayout = (LinearLayout) findViewById(R.id.AddLayout);
		
		TextView multipleTextViews = new TextView(this);
		multipleTextViews.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		multipleTextViews.setText("Multiple TextViews!");
		
		if(i<x){
			i++;
		secondlayout.addView(multipleTextViews);
		}
	}
}
