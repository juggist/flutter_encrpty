import 'package:flutter/material.dart';
import 'package:flutter/services.dart';

/// @author juggist
/// @date 2019-06-25 17:16
/// @description
class FlutterEncryptLib {
  static const MethodChannel platform =
  const MethodChannel('com.encrypt');

  static Future<String> getDES(String args,String key) async {
    String result;
    try {
      result = await platform.invokeMethod('getDES', <String, dynamic>{
        'beforeDES': args,
        'key':key,
      });
    } on PlatformException catch (e) {

    }
    return result;
  }


}
