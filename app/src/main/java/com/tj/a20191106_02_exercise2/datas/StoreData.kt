package com.tj.a20191106_02_exercise2.datas

import java.io.Serializable

class StoreData(gameName:String, companyName:String, rating:Float, isInstalled:Boolean, price:Int) : Serializable{
    var gameName = gameName
    var companyName = companyName
    var rating = rating
    var isInstalled = isInstalled
    var price = price
}