# Ideas Lab

Thu, Oct 27, 2022

# Roles

## Dylan

Dylan will be responsible for any programming related to computation
and statistics with help from Jason and will also be the main
presenter.

## Trevin

Trevin will be responsible for all graphic design and and will work on
architectural decisions with Jason as well.

## Taylor

Taylor will be writing most of the documentation and supporting
literature as well as testing.

## Jason

Jason will be working on the programming and architectural design
decisions along with Trevin and Dylan.

# Idea

The project will be a game launcher written in JavaFX. We will attempt
to implement 2-4 of the following games:

- Connect Four
- Checkers
- Snake
- Hangman

We reserve the right to add or remove games from this list.

The game launcher will save a high score for each game. Some games may
have an AI implemented to play against and others may be two player.

# Architecture

## Creational

Each game will use a `builder pattern` in order to configure complex
game options.

## Behavioral

The `command pattern` will be used in order to implement an undo/redo
capability.

## Structural

The `facade pattern` will be used for interacting with a complex game
object consisting of components such as a timer or players.
