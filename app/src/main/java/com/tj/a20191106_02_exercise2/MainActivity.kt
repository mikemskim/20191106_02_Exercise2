package com.tj.a20191106_02_exercise2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tj.a20191106_02_exercise2.datas.StoreData

class MainActivity : AppCompatActivity() {

    var storeList = ArrayList<StoreData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setValues()
    }

    fun setValues() {

        addInitialStoreData()

    }

    fun addInitialStoreData() {
        storeList.add(StoreData("1. 아스팔트 8: 에어본", "Gameloft"))
        storeList.add(StoreData("2. Minecraft - Pocket Edition", "Mojang"))
        storeList.add(StoreData("3. 아스팔트 7: 히트", "Gameloft"))
        storeList.add(StoreData("4. 팔라독(Paladog)", "FazeCat"))
        storeList.add(StoreData("5. Plants vs. Zombies", "EA Swiss Sarl"))
        storeList.add(StoreData("6. 스왐피(Swampy) Where is My Water", "Disney"))
    }

}
