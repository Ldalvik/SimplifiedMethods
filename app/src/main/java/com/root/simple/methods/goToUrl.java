package com.root.simple.methods;

import android.content.*;
import android.net.*;

public class goToUrl
{
	protected Context context;
	public String text;

	public static void goToUrl(String p0)
	{
		// TODO: Implement this method
	}

	public static void goToUrl(Context context, String text){
		context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://"+text)));
	}

}
