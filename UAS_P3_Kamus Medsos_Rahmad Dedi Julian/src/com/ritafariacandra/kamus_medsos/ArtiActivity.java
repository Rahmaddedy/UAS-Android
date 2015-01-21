package com.ritafariacandra.kamus_medsos;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;
 
public class ArtiActivity extends Activity {
	private TextView txtArti, txtIstilah;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_arti);
		txtArti = (TextView) findViewById(R.id.arti);
		txtIstilah = (TextView) findViewById(R.id.istilah);

		Bundle b = getIntent().getExtras();
		if (b != null) {
			txtIstilah.setText(b.getString("istilah"));
			txtArti.setText(b.getString("arti"));
		}
	}
}