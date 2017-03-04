package com.root.simple.methods;

import android.content.*;
import android.view.*;

public class goToActivity{
    public Context context;
	public Context text;

	public static void goToActivity(Context context, String text){
		context.startActivity(new Intent(text));
}
}
