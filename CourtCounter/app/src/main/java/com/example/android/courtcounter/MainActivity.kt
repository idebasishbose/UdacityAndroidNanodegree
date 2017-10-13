package com.example.android.courtcounter

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView


class MainActivity : AppCompatActivity() {
  var scoreTeamA: Int = 0
  var scoreTeamB: Int = 0
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
//    displayForTeamA(8)
  }

  /**
   * Displays the given score for Team A.
   */
  fun displayForTeamA(score: Int) {
    val scoreView: TextView = findViewById(R.id.team_a_score_a)
    scoreTeamA += score
    scoreView.text = scoreTeamA.toString()
  }

  fun addThreePointForTeamA(view: View) {
    displayForTeamA(3)
  }

  fun addTwoPointForTeamA(view: View) {
    displayForTeamA(2)
  }

  fun addOnePointForTeamA(view: View) {
    displayForTeamA(1)

  }


  fun displayForTeamB(score: Int) {
    val scoreView: TextView = findViewById(R.id.team_a_score_b)
    scoreTeamB += score
    scoreView.text = scoreTeamB.toString()
  }

  fun addThreePointForTeamB(view: View) {
    displayForTeamB(3)
  }

  fun addTwoPointForTeamB(view: View) {
    displayForTeamB(2)
  }

  fun addOnePointForTeamB(view: View) {
    displayForTeamB(1)

  }

  fun reset(view: View) {
    scoreTeamA = 0
    scoreTeamB = 0
    displayForTeamA(scoreTeamA)
    displayForTeamB(scoreTeamB)
  }
}
