package com.greedy0110.soptseminardevelop.feature.gitrepo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.greedy0110.soptseminardevelop.R
import com.greedy0110.soptseminardevelop.data.GitRepoItem
import com.greedy0110.soptseminardevelop.data.GitRepoRepository

class MainActivity : AppCompatActivity() {

    private lateinit var rvMainGitRepo: RecyclerView
    private lateinit var gitRepoAdapter: GitRepoAdapter
    private val gitRepoRepository = GitRepoRepository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initGitRepoList()
    }

    private fun initGitRepoList() {
        // 다른 것과 같이 메모리로 가져오자.
        rvMainGitRepo = findViewById(R.id.rvMainGitRepo)

        // this 로 현재 context 를 전달하자.
        gitRepoAdapter = GitRepoAdapter(this)

        // 우리의 recyclerView 에 우리의 adapter 로 세팅하자.
        rvMainGitRepo.adapter = gitRepoAdapter

        // viewHolder 들이 어떻게 배치될 지 설정하자.
        rvMainGitRepo.layoutManager = LinearLayoutManager(this)

        // 어뎁터에 우리가 정의한 data 를 대입하고
        gitRepoAdapter.data = gitRepoRepository.getRepoList()
        
        // 데이터를 변경했다고 알려줘서 리스트를 갱신하게 하자!
        gitRepoAdapter.notifyDataSetChanged()
    }
}

interface Server {
    fun signUp(id: String, pw: String)
}

class SignInActivity

class SignUpActivity(private val api: Server) {
    var id: String = ""
    var pw: String = ""

    fun requestSignUp() {
        api.signUp(id, pw)
    }
}

val dum: SignInActivity =
    SignInActivity()
val dum2 = SignUpActivity(object :
    Server {
    override fun signUp(id: String, pw: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
})