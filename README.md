# Jec26CMJavaVol07

Java 基礎 Vol.07「配列」を学ぶための授業用プロジェクトです。
1 次元配列、配列の長さ、通常の `for` 文、拡張 `for` 文、配列と参照、2 次元配列、3 次元配列を扱います。

## NotebookLM 補足資料

https://notebooklm.google.com/notebook/fc30f692-9b4d-473d-a83c-246a7b16c92a

## 必要環境

- **JDK** 11 以上
- **IntelliJ IDEA**（Community Edition 可）

## セットアップ

1. このリポジトリをクローンする
2. IntelliJ IDEA でプロジェクトを開く（`JecJavaTemplate.iml` が自動認識されます）
3. Project SDK に JDK 11 以上を設定する

## 使い方

IntelliJ IDEA 上で各 Java ファイルの `main` メソッドを右クリックし、**Run** を選択して実行します。

コマンドラインで実行する場合は、対象のファイルを 1 つずつコンパイルします。

```bash
# 例: App.java
javac src/App.java
java -cp src App

# 例: 配列初期化のサンプル
javac src/SampleArray04c.java
java -cp src SampleArray04c
```

この教材には、コンパイルエラーや実行時エラーを確認するためのファイルも含まれます。
`javac src/*.java` のように全ファイルをまとめてコンパイルするのではなく、授業で扱うファイルを個別に実行してください。

## プロジェクト構成

```
src/
├── App.java                    # Hello World の最小プログラム
├── SampleArray01a.java         # 配列変数の宣言
├── SampleArray02a.java         # 配列の生成と要素への代入
├── SampleArray03a.java         # 配列要素への値の設定
├── SampleArray04a.java         # new と for 文による表示
├── SampleArrayLength01a.java   # length フィールド
├── SampleArrayFor01a.java      # 通常の for 文
├── SampleArrayFor01b.java      # 拡張 for 文
├── SampleArrayAsRef06.java     # 配列参照の共有
├── SampleArray2D01.java        # 2 次元配列
├── Array3DSample01.java        # 3 次元配列
└── Kakunin*.java               # 確認問題・エラー確認用コード
```

各ファイルは、原則として `public static void main(String[] args)` を持つ独立したプログラムです。
パッケージ宣言はなく、`src/` 直下のデフォルトパッケージで動作します。

## 収録ファイル

| 分類 | ファイル | 学習内容 |
|------|----------|----------|
| 導入 | `App.java` | `Hello, World!` の表示 |
| 配列の宣言 | `SampleArray01a.java`, `SampleArray01b.java` | 配列変数の宣言、未初期化変数のエラー |
| 配列の生成 | `SampleArray02a.java` 〜 `SampleArray02h.java` | `new`、初期値、負の要素数、範囲外アクセス、配列型の不一致 |
| 配列要素の操作 | `SampleArray03a.java`, `SampleArray04a.java` 〜 `SampleArray04c.java` | 要素への代入、初期化子、`for` 文による表示 |
| 配列の長さ | `SampleArrayLength01a.java`, `SampleArrayLength02a.java`, `SampleArrayLength02b.java` | `length` を使った要素数の取得とループ |
| ループ | `SampleArrayFor01a.java`, `SampleArrayFor01b.java` | 通常の `for` 文と拡張 `for` 文 |
| 配列と参照 | `SampleArrayAsRef01.java` 〜 `SampleArrayAsRef10.java` | 配列型の代入可否、参照の共有、`null`、配列参照の表示 |
| 2 次元配列 | `SampleArray2D01.java`, `SampleArray2D02.java`, `SampleArray2D03.java` | 2 次元配列の生成、初期化、行ごとの長さ |
| 3 次元配列 | `Array3DSample01.java`, `Array3DSample02.java` | 3 次元配列の生成、初期化、入れ子のループ |
| 確認問題 | `Kakunin01.java` 〜 `Kakunin11.java` | 1 次元配列の文法、初期値、添字、型変換 |
| 確認問題 | `KakuninArray01.java`, `kakuninArray02.java`, `kakuninArray03.java`, `KakuninArray04.java` 〜 `KakuninArray07.java` | 配列型、参照、`null`、`String` 配列 |
| 確認問題 | `KakuninForEach01.java` 〜 `KakuninForEach04.java` | 拡張 `for` 文、ループ変数のスコープ、範囲外アクセス |
| 確認問題 | `Kakunin07201.java` 〜 `Kakunin07206.java` | 2 次元配列・3 次元配列の宣言、初期化、`length` |

## 意図的にエラーを含むファイル

以下のファイルは、エラーの原因を確認する教材として、そのままではコンパイルに失敗します。

`Kakunin07201.java`, `Kakunin07202.java`, `Kakunin09.java`, `Kakunin11.java`, `KakuninArray01.java`, `KakuninArray07.java`, `KakuninForEach03.java`, `SampleArray01b.java`, `SampleArray02d.java`, `SampleArray02e.java`, `SampleArray02g.java`, `SampleArray02h.java`, `SampleArrayAsRef01.java`, `SampleArrayAsRef02.java`, `SampleArrayAsRef03.java`, `SampleArrayAsRef08a.java`, `kakuninArray02.java`

以下のファイルはコンパイルできますが、実行すると例外を確認できます。

`Kakunin06.java`, `Kakunin08.java`, `KakuninArray06.java`, `KakuninForEach04.java`, `SampleArray02c.java`, `SampleArray02f.java`, `SampleArrayAsRef10.java`

## GitHub Actions

### Claude Code Review

`.github/workflows/claude-review.yml` を使うには、GitHub Secrets の設定が必要です。

1. GitHub のリポジトリ画面で `Settings` → `Secrets and variables` → `Actions` → `New repository secret`
2. Name: `ANTHROPIC_API_KEY`
3. Value: Anthropic の API キー

PR コメントで `@claude` を付けるとレビュー応答します（Owner/Member/Collaborator のみ）。

### Junie Code Review

`.github/workflows/junie-review.yml` を使うには、GitHub Secrets の設定が必要です。

1. GitHub のリポジトリ画面で `Settings` → `Secrets and variables` → `Actions` → `New repository secret`
2. Name: `JUNIE_API_KEY`
3. Value: JetBrains Junie の API キー

PR 作成・更新時に自動実行され、レビューコメントは同一コメントを更新します。

## ドキュメント

- `README.md` : プロジェクト概要とセットアップ手順。
- `TUTORIAL.md` : Vol.07 配列の授業用テキスト。
- `FLOWCHARTS_AND_TRACES.md` : 全 Java ファイルのフローチャートとトレース表。
- `AGENTS.md` : AI エージェント向け共通ルール。
- `CLAUDE.md` : Claude 向けのルール読み込み案内。

## ライセンス

未設定です。必要に応じて追加してください。
