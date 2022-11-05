# Unnamed Term Project

[![Build](https://github.com/taylorgrinn/cps240-term-project/actions/workflows/build.yaml/badge.svg)](https://github.com/taylorgrinn/cps240-term-project/actions/workflows/build.yaml)
[![Lint & Test](https://github.com/taylorgrinn/cps240-term-project/actions/workflows/check.yaml/badge.svg)](https://github.com/taylorgrinn/cps240-term-project/actions/workflows/check.yaml)

## UML Diagram

[draw.io](https://app.diagrams.net/?mode=github#Htaylorgrinn%2Fcps240-term-project%2Fmain%2Fdoc%2Fuml.drawio)

## Running

Run the command `./gradlew run`.

## Building

Run the command `./gradlew jar`.

This will build the jar file `build\libs\cps240-term-project.jar`. In
order to run this file, use the command `java -jar
build\libs\cps240-term-project.jar`.

## Test & Lint

Run the command `./gradlew check`.

This will run all tests and check code formatting. In order to fix
code formatting automatically, use the command `./gradlew fix`.

To run all tests without opening a graphical window, use the command
`./gradlew check -Pheadless`.

## Debugging using VSCode

To add a breakpoint, click to the left of the line number and a red
dot will appear.

To debug the main app, select the 'Run and Debug' panel, select
'Launch Launcher' from the dropdown menu, and press the play button.

To debug the tests, install the plugin 'Gradle for Java'. Open the
'Gradle' panel, expand 'Tasks -> verification', and click the 'Debug
Task' button next to the 'test' task.

## Roles

### Dylan

Dylan will be responsible for any programming related to computation
and statistics with help from Jason and will also be the main
presenter.

### Trevin

Trevin will be responsible for all graphic design and and will work on
architectural decisions with Jason as well.

### Taylor

Taylor will be writing most of the documentation and supporting
literature as well as testing.

### Jason

Jason will be working on the programming and architectural design
decisions along with Trevin and Dylan.

## Idea

The project will be a game launcher written in JavaFX. We will attempt
to implement 2-4 of the following games:

- Connect Four
- Checkers
- Snake
- Hangman

We reserve the right to add or remove games from this list.

The game launcher will save a high score for each game. Some games may
have an AI implemented to play against and others may be two player.

## Architecture

### Creational

Each game will use a `builder pattern` in order to configure complex
game options.

### Behavioral

The `command pattern` will be used in order to implement an undo/redo
capability.

### Structural

The `facade pattern` will be used for interacting with a complex game
object consisting of components such as a timer or players.
