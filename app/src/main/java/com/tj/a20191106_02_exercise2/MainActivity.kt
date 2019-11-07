package com.tj.a20191106_02_exercise2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import com.tj.a20191106_02_exercise2.adapters.StoreAdapter
import com.tj.a20191106_02_exercise2.datas.StoreData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var storeList = ArrayList<StoreData>()
    var storeAdapter:StoreAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setValues()
    }

    fun setValues() {

        addInitialStoreData()

        storeAdapter = StoreAdapter(this, R.layout.store_item_list, storeList)
        storeListView.adapter = storeAdapter

    }

    fun addInitialStoreData() {
        storeList.add(StoreData("1. 아스팔트 8: 에어본", "Gameloft", 4.5f, true, 2000))
        storeList.add(StoreData("2. Minecraft - Pocket Edition", "Mojang",4.5f, true, 3000))
        storeList.add(StoreData("3. 아스팔트 7: 히트", "Gameloft",4.0f, false, 1000))
        storeList.add(StoreData("4. 팔라독(Paladog)", "FazeCat",4.0f, false, 3000))
        storeList.add(StoreData("5. Plants vs. Zombies", "EA Swiss Sarl",3.5f, false, 1087))
        storeList.add(StoreData("6. 스왐피(Swampy) Where is My Water", "Disney",4.5f, false, 1106))
    }


}
