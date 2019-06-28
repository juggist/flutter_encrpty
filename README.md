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
publish需要终端代理(在terminal输入export http_proxy=socks5:ip,export https_proxy=socks5:ip 仍无效)  
shadowsocks + proxifier  

proxifier:(1)Proxies add address + port + SOCKS Version 5  
          (2)Rules Localhost->Target Hosts add address or ip  
          
flutter packages pub publish --server=https://pub.dartlang.org -v  

IOS 引入第三方包  (podspec 不支持ssl引入,其它可直接在podspec里引入 s.dependency 'name','~> 版本号')  
1.先在Podfile 里引入  pod 'name', :git => 'xxxxx'  
2.然后在Pods\Developement Pods\Pod\xxx.podspec\ 添加s.dependency 'name'  
3.发布到dartpub    
4.在新项目里引入发布到dartpub的插件，然后重复第一步操作，把第三方包正确引入到新项目里，让podspec能有引用




