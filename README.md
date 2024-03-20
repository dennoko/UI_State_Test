# UI State のデータクラスで UI を管理する実装のテストアプリ
## 目的
UI が ViewModel の実装の内容を知らなくても良いように、Composable が引数として受け取った値を表示し、ラムダ式で受け取ったメソッドを実行するだけで良いようにする。
その時に、データクラス内の値の変化を State の変化として監視できているかをテストした。

具体的には、データクラス内の Int, String, List の変化を監視するようにした。

特に List は、内部の変化が監視できるように実装した。
## 使い方
画面上のボタンをポチポチする。
### Count Up
Count の値がインクリメントされる
### Add hoge
Text に hoge が追加される
### Add List Item
List に数字が追加される
### Change List Item
List 内の数字が変化する
### Reset
リセット
