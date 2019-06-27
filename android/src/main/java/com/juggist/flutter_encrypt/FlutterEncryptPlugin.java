package com.juggist.flutter_encrypt;

import com.juggist.flutter_encrypt.utils.DESUtil;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.PluginRegistry.Registrar;

/** FlutterEncryptPlugin */
public class FlutterEncryptPlugin implements MethodCallHandler {
  /** Plugin registration. */
  public static void registerWith(Registrar registrar) {
    final MethodChannel channel = new MethodChannel(registrar.messenger(), "com.encrypt");
    channel.setMethodCallHandler(new FlutterEncryptPlugin());
  }

  @Override
  public void onMethodCall(MethodCall call, Result result) {
    if (call.method.equals("getDES")) {
      String args = call.argument("beforeDES");
      String key = call.argument("key");
      String desStr = DESUtil.encrypt(args, key);
      result.success(desStr);
    } else {
      result.notImplemented();
    }
  }
}
