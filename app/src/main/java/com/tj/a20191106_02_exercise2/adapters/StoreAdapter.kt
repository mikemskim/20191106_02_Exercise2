package com.tj.a20191106_02_exercise2.adapters

import android.content.Context
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import com.tj.a20191106_02_exercise2.datas.StoreData

class StoreAdapter(context: Context, res:Int, list: ArrayList<StoreData>) : ArrayAdapter<StoreData>(context, res, list)  {
    var mContext = context
    var mList = list
    var inf = LayoutInflater.from(mContext)
    
}