# 本プログラムの説明
## 概要
このプログラムは、**参照型の変数**を利用して<u>参照情報の扱いを調べる</u>ためのものである。問題1～3がObjectクラスを用いた基本問題、問題4～6がStringクラスを用いた発展問題となっている。

|基本|発展|
|:--:|:--:|
|[問題1](#問題1)|[問題4](#問題4)|
|[問題2](#問題2)|[問題5](#問題5)|
|[問題3](#問題3)|[問題6](#問題6)|
## 問題1
**そのままプログラムを実行**し、**obj1**, **obj2**, **obj3**のハッシュ値が全て異なることを確認せよ。

### 実行例1-1

    obj1: java.lang.Object@4926097b
    obj2: java.lang.Object@39ed3c8d
    obj3: java.lang.Object@71dac704
    ----------
    answer: null

### 実行例1-2

    obj1: java.lang.Object@123ef382
    obj2: java.lang.Object@dbf57b3
    obj3: java.lang.Object@384ad17b
    ----------
    answer: null

## 問題2
変数**answer**に代入する値を「***null***」から「***new Object()***」に変更してから実行し、obj1, obj2, obj3のハッシュ値と異なることを確認せよ。

### 実行例2-1

    obj1: java.lang.Object@4926097b
    obj2: java.lang.Object@39ed3c8d
    obj3: java.lang.Object@71dac704
    ----------
    answer: java.lang.Object@123772c4

### 実行例2-2

    obj1: java.lang.Object@123ef382
    obj2: java.lang.Object@dbf57b3
    obj3: java.lang.Object@384ad17b
    ----------
    answer: java.lang.Object@61862a7f

## 問題3
変数**answer**の値が***obj2と同じ***になるよう変更してから実行し、次のように「**obj2とanswerは同じ参照情報です。**」と表示されることを確認せよ。

### 実行例3-1

    obj1: java.lang.Object@4926097b
    obj2: java.lang.Object@39ed3c8d
    obj3: java.lang.Object@71dac704
    ----------
    answer: java.lang.Object@39ed3c8d
    obj2とanswerは同じ参照情報です。

### 実行例3-2

    obj1: java.lang.Object@123ef382
    obj2: java.lang.Object@dbf57b3
    obj3: java.lang.Object@384ad17b
    ----------
    answer: java.lang.Object@dbf57b3
    obj2とanswerは同じ参照情報です。

## 問題4
**Objectクラス**から***Stringクラスに変更***せよ。さらに**obj1**, **obj2**, **obj3**に代入する値を「"ABC"」などの***文字列リテラルに変更***せよ。

### 実行例4-1

    obj1: A
    obj2: B
    obj3: C
    ----------
    answer: B
    obj2とanswerは同じ参照情報です。

### 実行例4-2

    obj1: ABC
    obj2: XYZ
    obj3: 12345
    ----------
    answer: XYZ
    obj2とanswerは同じ参照情報です。

## 問題5
変数**answer**に代入する値を***obj2と同じ文字列リテラル***に変更し、「obj2とanswerは同じ参照情報です。」と表示されてしまうことを確認せよ。

### 実行例5-1

    obj1: A
    obj2: B
    obj3: C
    ----------
    answer: B
    obj2とanswerは同じ参照情報です。

### 実行例5-2

    obj1: ABC
    obj2: XYZ
    obj3: 12345
    ----------
    answer: XYZ
    obj2とanswerは同じ参照情報です。

## 問題6
変数**answer**に代入する文字列リテラルを「***new String(***」と「***)***」で囲い、「obj2とanswerは同じ参照情報です。」と表示されてないことを確認せよ。
- 例: 「**"ABC"**」なら「***new String(***__"ABC"__***)***」に変更する。

### 実行例6-1

    obj1: A
    obj2: B
    obj3: C
    ----------
    answer: B

### 実行例6-2

    obj1: ABC
    obj2: XYZ
    obj3: 12345
    ----------
    answer: XYZ

