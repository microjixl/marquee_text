package com.example.marquee;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
	private BulletinView bulletin;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		List<String> news = new ArrayList<String>();
		news.add("滚动信息1.");
		news.add("滚动信息2.超过一行超过一行超过一行超过一行超过一行超过一行超过一行超过一行超过一行超过一行");
		bulletin = (BulletinView)findViewById(R.id.tv_bulletin);
		bulletin.setData(news);
	}
	
	@Override
	protected void onResume() {
		bulletin.startScroll();
		super.onResume();
	}

	@Override
	protected void onPause() {
		bulletin.stopScroll();
		super.onPause();
	}
}
