package jp.techacademy.tomoyuki.sugiyama.kotlinlog

abstract class Animal{
    // プロパティ
    var name: String
    var hobby:String
    var age: Int

    // 引数付きコンストラクタ
    constructor(name: String, age: Int,hobby:String) {
        this.name = name
        this.hobby = hobby
        this.age = age
    }

    abstract fun say()

}