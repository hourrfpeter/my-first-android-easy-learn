package com.example.theapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class activity01 extends Activity{
	private RadioButton manRadioButton;
	private RadioButton womanRdioButton;
	private EditText et_passwordEditText;
	private Button btn_sendButton;
	private EditText et_nameEditText;
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity01);
		et_nameEditText=(EditText)findViewById(R.id.regist_username);
		et_passwordEditText=(EditText)findViewById(R.id.regist_password);
		btn_sendButton=(Button)findViewById(R.id.button1);
		manRadioButton=(RadioButton)findViewById(R.id.radioMale);
		womanRdioButton=(RadioButton)findViewById(R.id.radioFemale);
		btn_sendButton.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				passDate();				
				
			}

		});
	}
	public void passDate(){
		Intent intent = new Intent(this,activity02.class);
		intent.putExtra("name", et_nameEditText.getText().toString().trim());
		intent.putExtra("password", et_passwordEditText.getText().toString().trim());
		String str="";
		if(manRadioButton.isChecked()){
			str = "ÄÐ";
		}
		else if (womanRdioButton.isChecked()) {
			str = "Å®";
		}
		intent.putExtra("sex", str);
		startActivity(intent);
		}
}
