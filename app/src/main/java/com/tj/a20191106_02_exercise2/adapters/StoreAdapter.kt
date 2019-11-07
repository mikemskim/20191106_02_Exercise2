package com.tj.a20191106_02_exercise2.adapters

import android.content.Context
import android.media.Rating
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import com.tj.a20191106_02_exercise2.R
import com.tj.a20191106_02_exercise2.datas.StoreData
import kotlinx.android.synthetic.main.activity_main.view.*
import java.text.DecimalFormat

class StoreAdapter(context: Context, res:Int, list: ArrayList<StoreData>) : ArrayAdapter<StoreData>(context, res, list)  {
    var mContext = context
    var mList = list
    var inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView

        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.store_item_list, null)
        }

        var row = tempRow!!

        var gameTitleTxt = row.findViewById<TextView>(R.id.gameTitleText)
        var gameCompanyTxt = row.findViewById<TextView>(R.id.gameCompanyText)
        var gameRating = row.findViewById<RatingBar>(R.id.gameRating)
        var gameInstalledImage = row.findViewById<ImageView>(R.id.gameInstalledImage)
        var gamePriceTxt = row.findViewById<TextView>(R.id.gamePriceText)

        var curStoreData = mList.get(position)
        var decimalFormat = DecimalFormat("###,###")
        var msg = ""
        var visible = ImageView.INVISIBLE

        if (curStoreData.isInstalled) {
            visible = ImageView.VISIBLE
            msg = "설치된 항목"
        } else {
            if (curStoreData.price > 0) {
                msg = "￦ ${decimalFormat.format(curStoreData.price)}"
            } else {
                msg = "무료"
            }
        }



        gameTitleTxt.text = curStoreData.gameName
        gameCompanyTxt.text = curStoreData.companyName
        gameRating.rating = curStoreData.rating
        gameInstalledImage.visibility = visible

        gamePriceTxt.text = msg

        return row
    }
}