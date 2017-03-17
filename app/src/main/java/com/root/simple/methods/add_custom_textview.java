package com.root.simple.methods;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.widget.LinearLayout.*;
import android.opengl.*;

public class add_custom_textview extends Activity 
{
	
    @Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
        setContentView(R.layout.add_custom_textview);
	}	

public void add(View v){
	String customText;	
	EditText et1 = (EditText)findViewById(R.id.edittext);
	LinearLayout secondlayout = (LinearLayout) findViewById(R.id.addCustomLayout);
	customText = et1.getText().toString();
	TextView multipleTextViews = new TextView(this);
	multipleTextViews.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
	multipleTextViews.setText(customText);
	secondlayout.addView(multipleTextViews);
		}
}
