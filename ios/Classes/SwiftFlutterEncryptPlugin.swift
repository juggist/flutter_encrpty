import Flutter
import UIKit

public class SwiftFlutterEncryptPlugin: NSObject, FlutterPlugin {
  public static func register(with registrar: FlutterPluginRegistrar) {
    let channel = FlutterMethodChannel(name: "com.encrypt", binaryMessenger: registrar.messenger())
    let instance = SwiftFlutterEncryptPlugin()
    registrar.addMethodCallDelegate(instance, channel: channel)
  }

  public func handle(_ call: FlutterMethodCall, result: @escaping FlutterResult) {
    if ("getDES" == call.method) {
        let arguments = call.arguments as![String:Any]
        let arg = arguments["beforeDES"] as! String
        let key = arguments["key"] as! String
        result(DESUtil.encrypt(arg,key));
    } else {
        result(FlutterMethodNotImplemented);
    }
  }
}
