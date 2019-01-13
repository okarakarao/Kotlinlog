package jp.techacademy.tomoyuki.sugiyama.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("朋之", 25,"テニス")      // 名前を達也、年齢18歳で、humanのインスタンスを作る

        human.say()
        Log.d("kotlintest", "私の名前は" + human.name + "です。")
        Log.d("kotlintest", "年は" + human.age + "歳です。")

        human.think()
        Log.d("kotolintest","「私は" + human.hobby + "について考える。」")

    }
}