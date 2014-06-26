package com.example.androidtest;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Path.FillType;
import android.graphics.drawable.BitmapDrawable;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MyDlog extends Dialog implements android.view.View.OnClickListener{
	
	public interface MulClick{
		public abstract void cancle();
		
		public abstract void toast();
		
	}

	private Button mCancleBT;
	
	private Button mToastBT;
	
	private MulClick mMulClick;
	public MyDlog(Context context, int theme) {
		super(context, theme);
		// TODO Auto-generated constructor stub
		setCancelable(true);
		setContentView(R.layout.dialog);
		mCancleBT=(Button) findViewById(R.id.cancle);
		mToastBT=(Button)findViewById(R.id.toast);
		mCancleBT.setOnClickListener(this);
		mToastBT.setOnClickListener(this);
		getWindow().setLayout(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
		getWindow().setGravity(Gravity.BOTTOM);
		getWindow().setWindowAnimations(R.style.dialog_bottom_enterandout);
	}

	public MyDlog(Context context) {
		this(context,R.style.dialog_style);
		
	}

	public void setMulClick(MulClick m){
		this.mMulClick=m;
	}
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch (arg0.getId()) {
		case R.id.cancle:
			mMulClick.cancle();
			break;
		case R.id.toast:
			mMulClick.toast();
			break;
		default:
			break;
		}
	}
	
	

}
