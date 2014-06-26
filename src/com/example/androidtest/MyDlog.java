package com.example.androidtest;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Path.FillType;
import android.graphics.drawable.BitmapDrawable;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;

public class MyDlog extends Dialog{

	public MyDlog(Context context, int theme) {
		super(context, theme);
		// TODO Auto-generated constructor stub
		setCancelable(true);
		setContentView(R.layout.dialog);
		getWindow().setLayout(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
		getWindow().setGravity(Gravity.BOTTOM);
		getWindow().setWindowAnimations(R.style.dialog_bottom_enterandout);
	}

	public MyDlog(Context context) {
		this(context,R.style.dialog_style);
		
	}

}
