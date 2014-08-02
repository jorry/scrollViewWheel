package com.wangjie.wheelview.sample;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.wangjie.wheelview.R;
import com.wangjie.wheelview.WheelView;

import java.util.Arrays;

public class MainActivity extends Activity {
	public static final String TAG = MainActivity.class.getSimpleName();

	private static final String[] PLANETS = new String[] { "北京，东城", "湖南，长沙",
			"辽宁，沈阳", "河北，石家庄", "黑龙江，哈尔滨", "吉林，长春", "广西，南宁", "河南" };

	private WheelView wva;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		wva = (WheelView)findViewById(R.id.main_wv);
		wva.setOffset(2);
		wva.setItems(Arrays.asList(PLANETS));
		wva.setOnWheelViewListener(new WheelView.OnWheelViewListener() {
			@Override
			public void onSelected(int selectedIndex, String item) {
			}
		});

	}

	public void onClickCallbackSample(View view) {
		View outerView = LayoutInflater.from(this).inflate(R.layout.wheel_view,
				null);
		WheelView wv = (WheelView) outerView.findViewById(R.id.wheel_view_wv);
		wv.setOffset(2);
		wv.setItems(Arrays.asList(PLANETS));
		wv.setSeletion(3);
		wv.setOnWheelViewListener(new WheelView.OnWheelViewListener() {
			@Override
			public void onSelected(int selectedIndex, String item) {
			}
		});

		new AlertDialog.Builder(this).setTitle("WheelView in Dialog")
				.setView(outerView).setPositiveButton("OK", null).show();
	}

}
