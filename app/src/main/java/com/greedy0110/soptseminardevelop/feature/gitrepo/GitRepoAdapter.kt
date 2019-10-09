package com.greedy0110.soptseminardevelop.feature.gitrepo

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.greedy0110.soptseminardevelop.R
import com.greedy0110.soptseminardevelop.data.GitRepoItem

// 1. Adapter 는 화면을 그려주기 위해서 context 를 멤버로 가진다.
// 2. Adapter 는 RecyclerView.Adapter 를 상속받는다. <ViewHolder> 로 해당 어뎁터가 데이터를 "어떤 ViewHolder"로 변경하는지 알려준다.
class GitRepoAdapter(private val context: Context) : RecyclerView.Adapter<GitRepoViewHolder>() {

    // 3. Adapter 는 ViewHolder 로 변경할 data 를 가지고 있는다.
    var data = listOf<GitRepoItem>()

    // 4. Adapter 는 아이템마다 ViewHolder 를 만드는 방법을 정의해야 한다.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GitRepoViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.rv_item_repository, parent, false)

        return GitRepoViewHolder(view)
    }

    // 5. Adapter 는 전체 아이템의 숫자를 알아야 한다.
    override fun getItemCount(): Int {
        return data.size
    }

    // 6. Adapter 는 ViewHolder 에 data 를 전달해 주어야 한다.
    override fun onBindViewHolder(holder: GitRepoViewHolder, position: Int) {
        holder.bind(data[position])
    }
}