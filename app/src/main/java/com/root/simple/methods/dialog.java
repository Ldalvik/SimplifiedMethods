package com.root.simple.methods;

import android.app.*;
import android.content.*;
import android.net.*;

public class dialog
{
	protected Context context;
	public String title;
	public String message;
	public String positive;
	public String negative;

public static void showDialog(Context context, String title, String message, String positive, String negative)
{
	AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
		context);
	// dialog text
	alertDialogBuilder.setTitle(title);
	alertDialogBuilder
	.setMessage(message)
	.setCancelable(false)
	.setPositiveButton(positive, null)
	.setNegativeButton(negative,new DialogInterface.OnClickListener() {
	public void onClick(DialogInterface dialog,int id) {
		// closes dialog
		dialog.cancel();
		}
	});
	
	AlertDialog alertDialog = alertDialogBuilder.create();
				alertDialog.show();
			}
	}
