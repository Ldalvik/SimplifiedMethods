package com.root.simple.methods;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class GetText extends Activity 
{
	TextView textview;
	EditText edittext;
	int savedText;
    @Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
        setContentView(R.layout.get_text);
		textview = (TextView)findViewById(R.id.textview);
		edittext = (EditText)findViewById(R.id.edittext);
		loadSavedPreferences();
}


public void saveText(View v){
	
 SharedPreferences userDetails = getSharedPreferences("changeText", Context.MODE_PRIVATE);
		 SharedPreferences.Editor editor=userDetails.edit();
		 editor.putString("savedText",edittext.getText().toString());
		 String savedText = userDetails.getString("savedText", "Saved!");
		 textview.setText(String.valueOf(savedText));
		 editor.commit();
	}
	
	public void loadSavedPreferences(){
	 SharedPreferences userDetails = this.getSharedPreferences("changeText", Context.MODE_PRIVATE);
	 String savedText = userDetails.getString("savedText", "");
	 textview.setText(String.valueOf(savedText));
	 }
	
}
			
