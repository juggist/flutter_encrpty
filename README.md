# flutter_encrypt

A new flutter plugin project for DES encrypt.

## Getting Started

This project is a starting point for a Flutter
[plug-in package](https://flutter.dev/developing-packages/),
a specialized package that includes platform-specific implementation code for
Android and/or iOS.

For help getting started with Flutter, view our 
[online documentation](https://flutter.dev/docs), which offers tutorials, 
samples, guidance on mobile development, and a full API reference.

## Note
publish需要终端代理(在terminal输入export http_proxy=socks5:ip,export https_proxy=socks5:ip仍无效)
shadowsocks + proxifier

proxifier:(1)Proxies add address + port + SOCKS Version 5
          (2)Rules Localhost->Target Hosts add address or ip
          
flutter packages pub publish --server=https://pub.dartlang.org -v




