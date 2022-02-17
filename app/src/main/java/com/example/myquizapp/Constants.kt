package com.example.myquizapp

object Constants {

    fun getQuestion():ArrayList<Question>{

        val questionList=ArrayList<Question>()

        val que1=Question(
            1,"What country does this flag belong to?",
            R.drawable.belg, "Aus","France","Italy","Belgium",
            4

        )
        questionList.add(que1)

        val que2=Question(
            2,"What country does this flag belong to?",
            R.drawable.braz, "Aus","Brazil","Mexico","Colombia",
            2

        )
        questionList.add(que2)

        val que3=Question(
            3,"What country does this flag belong to?",
            R.drawable.canada, "Canada","France","Italy","Colombia",
            1
        )
        questionList.add(que3)

        val que4=Question(
            4,"What country does this flag belong to?",
            R.drawable.france, "Norway","France","Italy","Belgium",
            2

        )
        questionList.add(que4)

        val que5=Question(
            5,"What country does this flag belong to?",
            R.drawable.italy, "Croatia","Portugal","Italy","Hungary",
            3

        )
        questionList.add(que5)

        return questionList
    }
}