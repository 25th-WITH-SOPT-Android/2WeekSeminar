package com.greedy0110.soptseminardevelop.data

data class GitRepoItem(
    val name: String,
    val desc: String,
    val language: String?, // 없을 수 도 있에 null 가능 타입으로 설정하였다.
    val languageColor: Int? // Int형으로 color를 식별하려고 하였다.
)