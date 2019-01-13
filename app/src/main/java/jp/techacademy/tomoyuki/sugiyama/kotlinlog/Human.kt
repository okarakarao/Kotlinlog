package jp.techacademy.tomoyuki.sugiyama.kotlinlog

import android.util.Log

open class Human:Animal{

    //引数付きコンストラクタ
    constructor(name:String,age:Int,hobby:String):super(name,age,hobby){
    }

    //Animalクラスのメソッドをオーバーライド
    override fun say(){
        Log.d("kotlintest","「私の名前は"+this.name+"です。年は"+this.age+"です。」")

    }
    //thinkの実装
    fun think(){
        Log.d("kotlintest","「私は" + this.hobby + "について考える。」")
    }

}