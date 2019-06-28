//
//  DESUtil.swift
//  flutter_encrypt
//
//  Created by 陆费松 on 2019/6/28.
//

import Foundation
import GLEncryptManager
class DESUtil{
    public static func encrypt(_ arg:String,_ key:String)->String{
        let resultData = GLEncryptManager.excuteDES(with: arg.data(using: String.Encoding.utf8), secureKey: key.data(using: String.Encoding.utf8), operation: CCOperation(kCCEncrypt))
        let result = GLEncryptManager.encodeBase64(with: resultData)
        print("result\(String(describing: result))")
        return result!
    }
}
