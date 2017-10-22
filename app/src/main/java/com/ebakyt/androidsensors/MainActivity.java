package com.ebakyt.androidsensors;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.ebakyt.androidsensors.acceleration.LinAcceleroMain;
import com.ebakyt.androidsensors.accelerometer.AcceleroMain;
import com.ebakyt.androidsensors.gyroscope.GyroMain;
import com.ebakyt.androidsensors.light.LightMain;
import com.ebakyt.androidsensors.magnetometer.MagnetoMain;
import com.ebakyt.androidsensors.proximity.ProximityMain;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button btAccelo = (Button) findViewById(R.id.btnAccelerometer);
		btAccelo.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {				
				startActivity(new Intent(MainActivity.this, AcceleroMain.class));
			}
		});
        
        Button btGyro = (Button) findViewById(R.id.btnGyroscope);
        btGyro.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				startActivity(new Intent(MainActivity.this, GyroMain.class));
			}
		});
        
        Button btLight = (Button) findViewById(R.id.btnLight);
        btLight.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				startActivity(new Intent(MainActivity.this, LightMain.class));
			}
		});
        
        Button btLinAccelo = (Button) findViewById(R.id.btnLinearAcceleration);
        btLinAccelo.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {				
				startActivity(new Intent(MainActivity.this, LinAcceleroMain.class));
			}
		});
        
        Button btMagneto = (Button) findViewById(R.id.btnMagnetometer);
        btMagneto.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {				
				startActivity(new Intent(MainActivity.this, MagnetoMain.class));
			}
		});


        Button btProxi = (Button) findViewById(R.id.btnProximity);
        btProxi.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {				
				startActivity(new Intent(MainActivity.this, ProximityMain.class));
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
