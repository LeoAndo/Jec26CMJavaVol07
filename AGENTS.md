# Repository Guidelines

このファイルは AI エージェント向けの **Single Source of Truth** です。
コード生成・レビュー時に必ず従ってください。

## AI エージェントへの指示

- すべての回答は日本語で行うこと。
- コードは授業教材として使用するため、**シンプルさ・可読性を最優先**すること。
- 新しいソースファイルを追加する場合は下記の命名規則に従うこと。
- コメントは**日本語**で記述すること。
- **外部ライブラリを導入しないこと**（Java 標準ライブラリのみ使用可）。
- このリポジトリには、教材として意図的にコンパイルエラーや実行時エラーを含む Java ファイルがある。全ファイル一括コンパイルを前提にしないこと。

## プロジェクト構成とモジュール

- **教材**: Java 基礎 Vol.07「配列」
- **言語**: Java（標準ライブラリのみ、外部依存なし）
- **IDE**: IntelliJ IDEA（`.iml` プロジェクト）
- **ビルドツール**: なし（`javac` / `java` で直接コンパイル・実行）
- **ソースルート**: `src/`（デフォルトパッケージ）
- **テストフレームワーク**: なし

```
src/
├── App.java                    # Hello World の最小プログラム
├── SampleArray*.java           # 配列の基本サンプル
├── SampleArrayLength*.java     # length フィールドのサンプル
├── SampleArrayFor*.java        # for 文・拡張 for 文のサンプル
├── SampleArrayAsRef*.java      # 配列と参照のサンプル
├── SampleArray2D*.java         # 2 次元配列のサンプル
├── Array3DSample*.java         # 3 次元配列のサンプル
├── Kakunin*.java               # 確認問題
└── kakuninArray*.java          # 確認問題（一部既存ファイルは小文字始まり）
```

## ビルド・実行コマンド

授業で扱うファイルを 1 つずつコンパイル・実行します。

```bash
# コンパイル
javac src/<ClassName>.java

# 実行
java -cp src <ClassName>
```

例:

```bash
javac src/SampleArray04c.java
java -cp src SampleArray04c
```

一部ファイルはエラー確認用のため、`javac src/*.java` のような一括コンパイルは失敗する。
検証で全体のコンパイル可否を確認したい場合も、結果を「教材としての意図的なエラー」と「修正すべきエラー」に分けて扱うこと。

## コーディング規約と命名

- 各ファイルは、原則として `public static void main(String[] args)` を持つ独立したプログラムにする。
- パッケージ宣言なし（デフォルトパッケージ）。
- クラス名とファイル名を一致させる。
- 新規ファイル名は Java の慣習に従い、大文字始まりにする。
- 既存の `kakuninArray02.java` と `kakuninArray03.java` は小文字始まりだが、新規追加時は `KakuninArrayXX.java` を優先する。
- 教材コードでは複雑な抽象化を避け、授業で説明しやすい直線的なコードを優先する。

| プレフィックス | 用途 | 例 |
|----------------|------|-----|
| `App` | 導入用の最小プログラム | `App.java` |
| `SampleArray` | 配列の基本サンプル | `SampleArray02a.java` |
| `SampleArrayLength` | `length` のサンプル | `SampleArrayLength01a.java` |
| `SampleArrayFor` | 通常の `for` 文・拡張 `for` 文 | `SampleArrayFor01b.java` |
| `SampleArrayAsRef` | 配列と参照のサンプル | `SampleArrayAsRef06.java` |
| `SampleArray2D` | 2 次元配列のサンプル | `SampleArray2D03.java` |
| `Array3DSample` | 3 次元配列のサンプル | `Array3DSample01.java` |
| `Kakunin` | 確認問題 | `Kakunin08.java` |
| `KakuninArray` | 配列と参照の確認問題 | `KakuninArray04.java` |
| `KakuninForEach` | 拡張 `for` 文の確認問題 | `KakuninForEach01.java` |
| `Kakunin072` | Vol.07 後半の多次元配列確認問題 | `Kakunin07206.java` |

## エラー確認用ファイルの扱い

次のファイルは、そのままではコンパイルエラーになる教材である。

`Kakunin07201.java`, `Kakunin07202.java`, `Kakunin09.java`, `Kakunin11.java`, `KakuninArray01.java`, `KakuninArray07.java`, `KakuninForEach03.java`, `SampleArray01b.java`, `SampleArray02d.java`, `SampleArray02e.java`, `SampleArray02g.java`, `SampleArray02h.java`, `SampleArrayAsRef01.java`, `SampleArrayAsRef02.java`, `SampleArrayAsRef03.java`, `SampleArrayAsRef08a.java`, `kakuninArray02.java`

次のファイルは、コンパイルできるが実行時例外を確認する教材である。

`Kakunin06.java`, `Kakunin08.java`, `KakuninArray06.java`, `KakuninForEach04.java`, `SampleArray02c.java`, `SampleArray02f.java`, `SampleArrayAsRef10.java`

これらを修正対象にする場合は、ユーザーが明示的に「教材としてのエラーをなくす」と依頼した場合に限る。

## 設定・環境

- **JDK**: 11 以上
- **GitHub Actions**:
  - `claude-review.yml` — PR コメントで `@claude` を付けると AI レビュー（要 `ANTHROPIC_API_KEY`）
  - `junie-review.yml` — PR 作成・更新時に Junie レビュー（要 `JUNIE_API_KEY`）

## ドキュメント

- `README.md` : プロジェクト概要、セットアップ、収録ファイル一覧。
- `TUTORIAL.md` : Vol.07 配列の授業用テキスト。
- `AGENTS.md` : AI エージェント向け共通ルール（本ファイル）。
- `CLAUDE.md` : Claude 向けのルール読み込み案内。
- `.github/copilot-instructions.md` : GitHub Copilot 向けのルール参照。
- `.junie/guidelines.md` : Junie 向けのルール参照。
