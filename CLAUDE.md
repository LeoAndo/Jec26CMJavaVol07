# CLAUDE.md

このリポジトリでは、ルールの Single Source of Truth として `AGENTS.md` に従ってください。

## ルールの読み込み

- セッション開始時に `@AGENTS.md` を参照してください。
- またはプロジェクトコマンド `/load-rules` を実行してください（`.claude/commands/load-rules.md` を参照）。

## コードベースの前提

- 教材は Java 基礎 Vol.07「配列」です。
- `src/` 直下のデフォルトパッケージに、`App.java`、`SampleArray*.java`、`Kakunin*.java` などの独立した Java プログラムがあります。
- 外部ライブラリは使わず、`javac` と `java` で対象ファイルを 1 つずつ実行します。
- 一部の Java ファイルは、配列のコンパイルエラーや実行時例外を確認するために、意図的にエラーを含んでいます。
