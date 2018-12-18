package com.example.jonathan.testdeviceownerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.jonathan.testdeviceownerapp.utils.ConstUtils;

public class MainActivity extends AppCompatActivity {
  private static final String TAG = ConstUtils.APP_TAG + MainActivity.class.getSimpleName();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    Log.d(TAG, "onCreate: savedInstanceState=[" + savedInstanceState + "]");

    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Log.v(TAG, "oncreate: end");
  }

  @Override
  protected void onResume() {
    Log.d(TAG, "onResume");

    super.onResume();
  }

  @Override
  protected void onPause() {
    Log.d(TAG, "onPause");

    super.onPause();
  }

  @Override
  protected void onDestroy() {
    Log.d(TAG, "onDestroy");

    super.onDestroy();
  }
}
