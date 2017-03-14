package com.root.simple.methods;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.widget.LinearLayout.*;

public class programViews extends Activity 
{
    @Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
        setContentView(R.layout.views);
	
	
	
	
	LinearLayout layout = (LinearLayout) findViewById(R.id.YourLayout);

    
    Button btn = new Button(this);
    btn.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
    btn.setText("title");
	btn.setId(1);
	btn.setTextSize(15);
    layout.addView(btn);
	
		TextView txtview = new TextView(this);
		txtview.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		txtview.setText("text");
		txtview.setId(2);

		layout.addView(txtview);
	}
	
}
