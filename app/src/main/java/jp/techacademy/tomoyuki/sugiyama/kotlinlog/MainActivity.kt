package jp.techacademy.tomoyuki.sugiyama.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("たかし", 14,"演劇")      // 名前を朋之、年齢25歳で、humanのインスタンスを作る

        human.say()
        human.think()

        val human2 = Human("ひろし",31,"釣り")

        human2.say()
        human2.think()

    }
}