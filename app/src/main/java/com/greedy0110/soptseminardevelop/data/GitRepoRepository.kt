package com.greedy0110.soptseminardevelop.data

class GitRepoRepository {
    fun getRepoList() : List<GitRepoItem> {
        return listOf(
            GitRepoItem(
                name = "SoptStagram",
                desc = "IT 창업 동아리 SOPT 안드로이드 교육 프로젝트",
                language = "Kotlin",
                languageColor = 0
            ),
            GitRepoItem(
                name = "artic_android",
                desc = "Forked from artic_development/artic_android",
                language = "Kotlin",
                languageColor = 0
            ),
            GitRepoItem(
                name = "CalculatorWithEspresso",
                desc = "UI Test with Espresso + Unit Test Calculator",
                language = "Kotlin",
                languageColor = 0
            ),
            GitRepoItem(
                name = "problemSovingGuZongMan",
                desc = "프로그래밍 대회에서 배우는 알고리즘 문제해결전략 공부하자",
                language = "Java",
                languageColor = 1
            )
        )
    }
}