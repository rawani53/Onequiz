package com.example.onequiz

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity(), View.OnClickListener {

private var mCurrentPosition : Int = 1
    private var mquestionList : ArrayList<Question>? = null
    private var mSeletoptionPosition : Int = 0

    private var progressbar :ProgressBar? = null
    private var tvProgress : TextView? = null
    private var tvquestion : TextView? = null
    private var ivImage : ImageView? = null

    private var tvoptionone : TextView? = null
    private var tvoptiontwo : TextView? = null
    private var tvoptionthree : TextView? = null
    private var tvoptionfour : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        tvquestion = findViewById(R.id.tv_question)
        ivImage = findViewById(R.id.iv_image)
        progressbar = findViewById(R.id.progressbar)
        tvProgress = findViewById(R.id.tv_progress)
        tvoptionone = findViewById(R.id.tv_option_one)
        tvoptiontwo= findViewById(R.id.tv_option_two)
        tvoptionthree = findViewById(R.id.tv_option_three)
        tvoptionfour = findViewById(R.id.tv_option_four)


        val questionsList = Constants.getQuestion()
        var currentPosition =1
        val question : Question = questionsList[currentPosition -1]

        ivImage?.setImageResource(question.image)
        progressbar?.progress = currentPosition
        tvProgress?.text = "$currentPosition/${progressbar?.max}"
        tvquestion?.text = question.question
        tvoptionone?.text = question.op1
        tvoptiontwo?.text = question.op2
        tvoptionthree?.text = question.op3
        tvoptionfour?.text = question.op4
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}























