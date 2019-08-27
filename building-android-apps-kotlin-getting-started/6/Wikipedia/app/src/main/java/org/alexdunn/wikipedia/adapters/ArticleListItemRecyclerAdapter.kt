package org.alexdunn.wikipedia.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import org.alexdunn.wikipedia.R
import org.alexdunn.wikipedia.holders.CardHolder
import org.alexdunn.wikipedia.holders.ListItemHolder

/**
 * Created by alex on 10/25/17.
 */
class ArticleListItemRecyclerAdapter() : RecyclerView.Adapter<ListItemHolder>() {

    override fun getItemCount(): Int {
        return 15 // temporary
    }

    override fun onBindViewHolder(holder: ListItemHolder?, position: Int) {
        // this is where we will update our view
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ListItemHolder {
        var cardItem = LayoutInflater.from(parent?.context).inflate(R.layout.article_list_item, parent, false)
        return ListItemHolder(cardItem)
    }
}