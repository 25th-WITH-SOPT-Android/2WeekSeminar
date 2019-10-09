package com.greedy0110.soptseminardevelop.feature.gitrepo

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.greedy0110.soptseminardevelop.R
import com.greedy0110.soptseminardevelop.data.GitRepoItem

class GitRepoViewHolder(view : View) : RecyclerView.ViewHolder(view) {

    val ctnRvItem: View = view.findViewById(R.id.ctnRvItem)
    val txtRvItemName: TextView = view.findViewById(R.id.txtRvItemName)
    val txtRvItemDescription: TextView = view.findViewById(R.id.txtRvItemDescription)
    val txtRvItemLanguage: TextView = view.findViewById(R.id.txtRvItemLanguage)
    val imgRvItemLanguageColor: ImageView = view.findViewById(R.id.imgRvItemLanguageColor)

    fun bind(data: GitRepoItem) {
        txtRvItemName.text = data.name
        txtRvItemDescription.text = data.desc
        txtRvItemLanguage.text = data.language
    }
}