package com.hsense.drawdemo01;

import android.app.Activity;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout.LayoutParams;

public class MainActivity extends Activity {

	private DrawPath dPath;
	private EraserPath eraserPath;
	Paint p = new Paint();
	Button draw_btn;// ѡ��ͼ�εİ�ť
	Button eraser_btn;

	/*
	 * ����ÿ��view�Ĳ��ִ�С This set of layout parameters defaults the width and the
	 * height
	 * 
	 * LayoutParams.MATCH_PARENT��xml�ж���ؼ���С��match_parent����һ��
	 * height������Ϊ700���������Ϊmatch_parent��wrap_content��view��ռ��ȫ����סdraw_btn��ť�ؼ�
	 */
	LayoutParams lParams = new LayoutParams(LayoutParams.MATCH_PARENT, 700);

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		draw_btn = (Button) findViewById(R.id.draw_button);
		eraser_btn = (Button) findViewById(R.id.eraser_button);

		draw_btn.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

				dPath = new DrawPath(getApplicationContext());
				addContentView(dPath, lParams);
			}
		}

		);

		eraser_btn.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				eraserPath = new EraserPath(getApplicationContext());
				addContentView(eraserPath, lParams);
			}
		}

		);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
