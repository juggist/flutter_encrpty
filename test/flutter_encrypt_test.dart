import 'package:flutter/services.dart';
import 'package:flutter_test/flutter_test.dart';
import 'package:flutter_encrypt/flutter_encrypt.dart';

void main() {
  const MethodChannel channel = MethodChannel('flutter_encrypt');

  setUp(() {
    channel.setMockMethodCallHandler((MethodCall methodCall) async {
      return '42';
    });
  });

  tearDown(() {
    channel.setMockMethodCallHandler(null);
  });

  test('getPlatformVersion', () async {
    expect(await FlutterEncrypt.platformVersion, '42');
  });
}
