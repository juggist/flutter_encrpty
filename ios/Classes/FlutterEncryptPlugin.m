#import "FlutterEncryptPlugin.h"
#import <flutter_encrypt/flutter_encrypt-Swift.h>

@implementation FlutterEncryptPlugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  [SwiftFlutterEncryptPlugin registerWithRegistrar:registrar];
}
@end
