# Java基礎 Vol.07 - 配列 -

Java の配列を学ぶための授業用テキストです。
このリポジトリの `src/` には、配列の基本文法、配列と参照、拡張 `for` 文、2 次元配列、3 次元配列のサンプルと確認問題が収録されています。

---

## 目次

1. [はじめに](#1-はじめに)
2. [プロジェクト構成](#2-プロジェクト構成)
3. [配列の基本](#3-配列の基本)
4. [配列要素の操作](#4-配列要素の操作)
5. [length と繰り返し](#5-length-と繰り返し)
6. [配列と参照](#6-配列と参照)
7. [多次元配列](#7-多次元配列)
8. [確認問題](#8-確認問題)
9. [実行時の注意](#9-実行時の注意)

---

## 1. はじめに

### 1.1 前提条件

このテキストは、Java の基本構文、変数、基本データ型、条件分岐、繰り返しを学習済みの学生を対象としています。

**必要な環境:**

- JDK 11 以上
- IntelliJ IDEA（Community Edition 可）

### 1.2 学習目標

- 配列変数を宣言できる
- `new` を使って配列を生成できる
- 配列の添字が `0` から始まることを説明できる
- `length` を使って配列の要素数を取得できる
- 通常の `for` 文と拡張 `for` 文で配列を処理できる
- 配列が参照型であることを説明できる
- 2 次元配列・3 次元配列の基本的な扱いを理解する
- 配列で起こりやすいコンパイルエラーと実行時エラーを区別できる

---

## 2. プロジェクト構成

### 2.1 ディレクトリ構造

```
Jec26CMJavaVol07/
├── src/
│   ├── App.java
│   ├── SampleArray01a.java
│   ├── SampleArray02a.java
│   ├── SampleArray03a.java
│   ├── SampleArray04a.java
│   ├── SampleArrayLength01a.java
│   ├── SampleArrayFor01a.java
│   ├── SampleArrayAsRef01.java
│   ├── SampleArray2D01.java
│   ├── Array3DSample01.java
│   └── Kakunin*.java
├── README.md
├── TUTORIAL.md
├── FLOWCHARTS_AND_TRACES.md
├── AGENTS.md
└── JecJavaTemplate.iml
```

### 2.2 ファイルの役割

| 分類 | 主なファイル | 内容 |
|------|--------------|------|
| 導入 | `App.java` | `Hello, World!` を表示する最小プログラム |
| 配列の宣言・生成 | `SampleArray01a.java` 〜 `SampleArray02h.java` | 配列変数、`new`、初期値、エラー例 |
| 配列要素の操作 | `SampleArray03a.java`, `SampleArray04a.java` 〜 `SampleArray04c.java` | 要素への代入、初期化子、表示 |
| 配列の長さ | `SampleArrayLength01a.java` 〜 `SampleArrayLength02b.java` | `length` フィールド |
| 繰り返し | `SampleArrayFor01a.java`, `SampleArrayFor01b.java` | 通常の `for` 文、拡張 `for` 文 |
| 配列と参照 | `SampleArrayAsRef01.java` 〜 `SampleArrayAsRef10.java` | 配列型、参照の共有、`null` |
| 多次元配列 | `SampleArray2D01.java` 〜 `SampleArray2D03.java`, `Array3DSample01.java`, `Array3DSample02.java` | 2 次元配列・3 次元配列 |
| 確認問題 | `Kakunin*.java`, `kakuninArray*.java` | 理解確認、エラー確認、出力予測 |

各ファイルはデフォルトパッケージに置かれており、授業で扱うファイルを 1 つずつコンパイルして実行します。

---

## 3. 配列の基本

### 3.1 配列変数の宣言

配列は、同じ型の値をまとめて扱うための仕組みです。
`SampleArray01a.java` では、基本データ型と参照型の配列変数を宣言しています。

```java
int[] arrayInt;
double[] arrayDouble;
String[] arrayString;
```

`int[]` は「`int` 型の配列」を表します。
変数を宣言しただけでは、まだ配列の実体は作られていません。

### 3.2 配列の生成

配列の実体は `new` で生成します。

```java
int[] ai;
ai = new int[3];
```

`new int[3]` は、`int` の値を 3 個入れられる配列を作ります。
添字は `0` から始まるため、使える添字は `0`, `1`, `2` です。

### 3.3 配列の初期値

`SampleArray02b.java` では、各型の配列を作った直後の初期値を確認します。

| 型 | 初期値 |
|----|--------|
| `byte`, `short`, `int`, `long` | `0` |
| `float`, `double` | `0.0` |
| `char` | `\u0000`（画面上は何も表示されない） |
| `boolean` | `false` |
| 参照型（`String` など） | `null` |

### 3.4 エラー例

配列では、次のようなエラーがよく起こります。

| ファイル | 確認する内容 |
|----------|--------------|
| `SampleArray01b.java` | 初期化していないローカル変数は使えない |
| `SampleArray02c.java` | 負の要素数で生成すると `NegativeArraySizeException` |
| `SampleArray02d.java` | 配列の要素数に `double` は使えない |
| `SampleArray02e.java` | 配列の要素数に `long` は使えない |
| `SampleArray02f.java` | 範囲外の添字で `ArrayIndexOutOfBoundsException` |
| `SampleArray02g.java`, `SampleArray02h.java` | 配列型が違うと代入できない |

---

## 4. 配列要素の操作

### 4.1 要素への代入

`SampleArray03a.java` では、配列の各要素に値を代入して表示します。

```java
int[] ai = new int[5];

ai[0] = 34;
ai[1] = 58;
ai[2] = 7;
ai[3] = 89;
ai[4] = 100;
```

配列の要素は、`配列名[添字]` の形で扱います。

### 4.2 初期化子

`SampleArray04c.java` のように、配列の生成と値の設定を同時に書くこともできます。

```java
int[] ai = { 78, 92, 80, 100 };
```

この書き方では、要素数は初期化子に書いた値の数から自動的に決まります。

---

## 5. length と繰り返し

### 5.1 length フィールド

配列の要素数は `length` で取得します。

```java
String[] list = { "Tanaka", "Yamada", "Sato", "Kobayashi" };
System.out.println("登録者数：" + list.length + "人");
```

`length` はメソッドではないため、`list.length()` ではなく `list.length` と書きます。

### 5.2 通常の for 文

`SampleArrayLength02b.java` と `SampleArrayFor01a.java` では、`length` を使って配列全体を処理します。

```java
int[] score = { 89, 56, 24 };
for (int i = 0; i < score.length; i++) {
    System.out.println(score[i]);
}
```

条件式は `i < score.length` にします。
`i <= score.length` にすると、最後に存在しない添字へアクセスして例外が発生します。

### 5.3 拡張 for 文

配列の要素を先頭から順に取り出すだけなら、拡張 `for` 文を使えます。

```java
int[] score = { 89, 56, 24 };
for (int x : score) {
    System.out.println(x);
}
```

`KakuninForEach03.java` では、拡張 `for` 文のループ変数 `x` がループの外では使えないことを確認します。

---

## 6. 配列と参照

### 6.1 配列は参照型

配列変数には、配列そのものではなく、配列を指す参照が入ります。
`SampleArrayAsRef06.java` では、2 つの配列変数が同じ配列を参照する例を確認します。

```java
int[] array1 = { 10, 20, 30 };
int[] array2;

array2 = array1;
array2[0] = 100;
```

この後、`array1[0]` も `100` になります。
`array1` と `array2` が同じ配列を指しているためです。

### 6.2 配列型の代入

配列は参照型ですが、要素の型が違う配列をそのまま代入することはできません。

| ファイル | 内容 |
|----------|------|
| `SampleArrayAsRef01.java` | `byte[]` を `int[]` にキャストできない |
| `SampleArrayAsRef02.java` | `byte[]` を `int[]` に代入できない |
| `SampleArrayAsRef03.java` | `String[]` を `int[]` に代入できない |
| `SampleArrayAsRef04.java` | 同じ `int[]` 型ならキャストして代入できる |
| `SampleArrayAsRef05.java` | 同じ `int[]` 型ならそのまま代入できる |

### 6.3 null

参照型の変数には `null` を代入できます。

```java
int[] array = null;
System.out.println(array);
```

この場合、表示結果は `null` です。
ただし、`array.length` のように `null` からメンバーへアクセスすると `NullPointerException` が発生します。

---

## 7. 多次元配列

### 7.1 2 次元配列

2 次元配列は、配列の中に配列が入っている形です。

```java
int[][] array = new int[2][3];
```

`SampleArray2D01.java` では `2 x 3` の配列を作り、各要素へ値を代入します。
`SampleArray2D02.java` では初期化子で 2 次元配列を作ります。

```java
int[][] array = { { 11, 12, 13 }, { 21, 22, 23 } };
```

### 7.2 行ごとに長さが違う配列

Java の 2 次元配列は、行ごとに長さを変えられます。
`SampleArray2D03.java` と `Kakunin07206.java` では、各行の `length` を確認します。

```java
int[][] array = { { 11, 12, 13 }, { 21, 22, 23, 24 }, { 31, 32 } };
```

この場合、`array.length` は `3`、`array[1].length` は `4` です。

### 7.3 3 次元配列

3 次元配列は、`int[][][]` のように `[]` を 3 つ付けて表します。

```java
int[][][] array = new int[2][3][4];
```

`Array3DSample01.java` は `new` で 3 次元配列を生成し、`Array3DSample02.java` は初期化子で同じ構造の配列を作ります。
どちらも、`z`, `y`, `x` の 3 重ループで全要素を表示します。

---

## 8. 確認問題

確認問題ファイルは、出力を予測したり、コンパイルエラーや実行時エラーの理由を考えたりするためのコードです。

| ファイル | 主な確認内容 |
|----------|--------------|
| `Kakunin01.java` | 配列宣言と生成の正しい書き方 |
| `Kakunin02.java` | 配列の型と初期化子の可否 |
| `Kakunin03.java` 〜 `Kakunin05.java` | 初期値、代入、出力結果 |
| `Kakunin06.java` 〜 `Kakunin08.java` | 添字の範囲と `length` |
| `Kakunin09.java` 〜 `Kakunin11.java` | 配列初期化時の数値型変換 |
| `KakuninArray01.java` 〜 `KakuninArray07.java` | 配列型の代入、参照、`null`、`String` 配列 |
| `KakuninForEach01.java` 〜 `KakuninForEach04.java` | 拡張 `for` 文と通常の `for` 文 |
| `Kakunin07201.java` 〜 `Kakunin07206.java` | 2 次元配列・3 次元配列 |

---

## 9. 実行時の注意

### 9.1 基本の実行方法

```bash
javac src/SampleArray04c.java
java -cp src SampleArray04c
```

### 9.2 エラー確認用ファイル

次のファイルは、コンパイルエラーを確認する教材です。

`Kakunin07201.java`, `Kakunin07202.java`, `Kakunin09.java`, `Kakunin11.java`, `KakuninArray01.java`, `KakuninArray07.java`, `KakuninForEach03.java`, `SampleArray01b.java`, `SampleArray02d.java`, `SampleArray02e.java`, `SampleArray02g.java`, `SampleArray02h.java`, `SampleArrayAsRef01.java`, `SampleArrayAsRef02.java`, `SampleArrayAsRef03.java`, `SampleArrayAsRef08a.java`, `kakuninArray02.java`

次のファイルは、コンパイル後に実行すると例外が発生する教材です。

`Kakunin06.java`, `Kakunin08.java`, `KakuninArray06.java`, `KakuninForEach04.java`, `SampleArray02c.java`, `SampleArray02f.java`, `SampleArrayAsRef10.java`

授業では、エラーが出たこと自体を失敗と考えるのではなく、「なぜそのエラーになるのか」を説明できるようにすることが目的です。

---

## まとめ

このテキストでは、配列の宣言、生成、初期化、要素へのアクセス、`length`、繰り返し、参照、`null`、2 次元配列、3 次元配列を学びました。
配列では、添字の範囲、型の一致、`null` 参照に特に注意してください。
