package com.root.simple.methods;

import android.content.*;
import android.widget.*;

	public class toast{
		protected Context context;
		public String text;

	public static void makeToastShort(Context context, String text){
			Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
		}
	public static void makeToastLong(Context context, String text){
		Toast.makeText(context, text, Toast.LENGTH_LONG).show();
	}
		
}
