package com.hsense.drawdemo01;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Paint.Style;
import android.util.Log;
import android.view.View;


/**
 * ��Ƥ��
 * @author Administrator
 *
 */
public class EraserDraw extends View {
	// public���ͣ�������Ҫ�õ�
	public Point downPoint, movePoint, upPoint;
	public Paint paint;// ��������
	public Canvas canvas;// ����
	public Bitmap bitmap;// λͼ
	public int downState;
	public int moveState;

	public EraserDraw(Context context) {
		super(context);
		// TODO Auto-generated constructor stub

		paint = new Paint(Paint.DITHER_FLAG);// ����һ������
		bitmap = Bitmap.createBitmap(480, 700, Bitmap.Config.ARGB_8888); // ����λͼ�Ŀ��
		canvas = new Canvas(bitmap);

		// ���û���
		paint.setStyle(Style.STROKE);// ���÷����
		paint.setStrokeWidth(20);// �ʿ�20����
		paint.setColor(Color.WHITE);// ���ðױ�
		paint.setAntiAlias(true);// ��ݲ���ʾ

		downPoint = new Point();
		movePoint = new Point();
		upPoint = new Point();

		Log.i("MyDraw", "bitmap::::::::::::::::::" + bitmap);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		canvas.drawBitmap(bitmap, 0, 0, null);
	}

}
