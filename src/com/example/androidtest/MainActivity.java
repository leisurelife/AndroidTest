package com.example.androidtest;

import com.example.androidtest.MyDlog.MulClick;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	MyDlog mDialog;
	Button mShowBT;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mShowBT=(Button) findViewById(R.id.show);
		mDialog=new MyDlog(this);
		mDialog.setMulClick(new MulClick() {
			
			@Override
			public void toast() {
				// TODO Auto-generated method stub
				if(!mShowBT.getText().toString().equals("我变成这样了。。。")){
					mShowBT.setText("我变成这样了。。。");
				}else{
					mShowBT.setText(R.string.hello_world);
				}
				
			}
			
			@Override
			public void cancle() {
				// TODO Auto-generated method stub
				mDialog.cancel();
			}
		});
	}

	
	public void show(View v){
		mDialog.show();
	}

	
}
