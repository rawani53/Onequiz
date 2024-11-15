package com.example.onequiz

object Constants {

    fun getQuestion():ArrayList<Question> {

        val que1 = Question(
            1, "what country flag is it ?",
            image = R.drawable.ic_flag_of_argentina,
            op1 = "argentina",
            op2 = "austrialia",
            op3 = "nambia",
            "congo",
            Cans = 1,
        )
        val que2 = Question(
            2, "what country flag is it ?",
            image = R.drawable.ic_flag_of_australia,
            op1 = "argentina",
            op2 = "austrialia",
            op3 = "nambia",
            "congo",
            Cans = 2,
        )
        val que3 = Question(
            3, "what country flag is it ?",
            image = R.drawable.ic_flag_of_belgium,
            op1 = "argentina",
            op2 = "austrialia",
            op3 = "nambia",
            "belgium",
            Cans = 4,
        )
        val que4 = Question(
            4, "what country flag is it ?",
            image = R.drawable.ic_flag_of_brazil,
            op1 = "argentina",
            op2 = "austrialia",
            op3 = "brazil",
            "congo",
            Cans = 3,
        )
        val que5 = Question(
            5, "what country flag is it ?",
            image = R.drawable.ic_flag_of_denmark,
            op1 = "argentina",
            op2 = "denmark",
            op3 = "nambia",
            "congo",
            Cans = 2,
        )
        val que6 = Question(
            6, "what country flag is it ?",
            image = R.drawable.ic_flag_of_fiji,
            op1 = "fiji",
            op2 = "austrialia",
            op3 = "nambia",
            "congo",
            Cans = 1,
        )
        val que7 = Question(
            7, "what country flag is it ?",
            image = R.drawable.ic_flag_of_germany,
            op1 = "argentina",
            op2 = "austrialia",
            op3 = "nambia",
            "germany",
            Cans = 4,
        )
        val que8 = Question(
            8, "what country flag is it ?",
            image = R.drawable.ic_flag_of_india,
            op1 = "india",
            op2 = "austrialia",
            op3 = "nambia",
            "india",
            Cans = 4,
        )
        val que9 = Question(
            9, "what country flag is it ?",
            image = R.drawable.ic_flag_of_kuwait,
            op1 = "india",
            op2 = "austrialia",
            op3 = "nambia",
            "kuwait",
            Cans = 4,
        )
        val que10 = Question(
            10, "what country flag is it ?",
            image = R.drawable.ic_flag_of_new_zealand,
            op1 = "india",
            op2 = "New zealand",
            op3 = "nambia",
            "india",
            Cans = 2,
        )

        val questionsList = ArrayList<Question>()
        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)
        questionsList.add(que6)
        questionsList.add(que7)
        questionsList.add(que8)
        questionsList.add(que9)
        questionsList.add(que10)

        return questionsList
    }
}