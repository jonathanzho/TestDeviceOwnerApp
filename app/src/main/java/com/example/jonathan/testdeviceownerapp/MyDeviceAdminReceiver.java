package com.example.jonathan.testdeviceownerapp;

import android.app.admin.DeviceAdminReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.example.jonathan.testdeviceownerapp.utils.ConstUtils;

public class MyDeviceAdminReceiver extends DeviceAdminReceiver {
  private static final String TAG = ConstUtils.APP_TAG +
      MyDeviceAdminReceiver.class.getSimpleName();

  /**
   * Intercept standard device administrator broadcasts.  Implementations
   * should not override this method; it is better to implement the
   * convenience callbacks for each action.
   */
  @Override
  public void onReceive(Context context, Intent intent) {
    Log.d(TAG, "onReceive: context=[" + context +
        "], intent.action=[" + intent.getAction() + "]");

    super.onReceive(context, intent);

    // TODO
  }

  @Override
  public void onEnabled(Context context, Intent intent) {
    Log.d(TAG, "onEnabled: context=[" + context +
        "], intent.action=[" + intent.getAction() + "]");

    super.onEnabled(context, intent);

    // TODO
  }
}
