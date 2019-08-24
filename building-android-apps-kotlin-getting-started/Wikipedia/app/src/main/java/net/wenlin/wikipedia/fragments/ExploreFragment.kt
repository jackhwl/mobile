package net.wenlin.wikipedia.fragments


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_explore.*

import net.wenlin.wikipedia.R
import net.wenlin.wikipedia.activaties.SearchActivity
import net.wenlin.wikipedia.adapters.ArticleCardRecyclerAdapter

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class ExploreFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater!!.inflate(R.layout.fragment_explore, container, false)

        search_card_view.setOnClickListener{
            val searchIntent = Intent(context, SearchActivity::class.java)
            context.startActivity(searchIntent)
        }

        explore_article_recycler.layoutManager = LinearLayoutManager(context)
        explore_article_recycler.adapter = ArticleCardRecyclerAdapter()

        return view
    }


}
