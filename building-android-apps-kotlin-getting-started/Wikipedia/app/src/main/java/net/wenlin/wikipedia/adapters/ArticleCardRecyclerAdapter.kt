package net.wenlin.wikipedia.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import net.wenlin.wikipedia.R
import net.wenlin.wikipedia.holders.CardHolder

class ArticleCardRecyclerAdapter : RecyclerView.Adapter<CardHolder>  {
    override fun getItemCount(): Int {
        return 15 // temporary
    }

    override fun onBindViewHolder(holder: CardHolder?, position: Int) {
        // this is where we will update our view
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CardHolder {
        var cardItem = LayoutInflater.from(parent?.context).inflate(R.layout.article_card_item, parent, false)
        return CardHolder(cardItem)
    }
}