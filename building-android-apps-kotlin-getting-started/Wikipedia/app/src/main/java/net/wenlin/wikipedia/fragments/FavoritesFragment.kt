package net.wenlin.wikipedia.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_favorites.*

import net.wenlin.wikipedia.R
import net.wenlin.wikipedia.adapters.ArticleCardRecyclerAdapter
import net.wenlin.wikipedia.adapters.ArticleListItemRecyclerAdapter

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class FavoritesFragment : Fragment() {

    var favoritesRecyler: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_favorites, container, false)

        favoritesRecyler = view.findViewById<RecyclerView>(R.id.favorites_article_recycler);
        favoritesRecyler!!.layoutManager = LinearLayoutManager(context)
        favoritesRecyler!!.adapter = ArticleCardRecyclerAdapter()

        return view
    }


}
