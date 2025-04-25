Project Overview

This project implements the Iterator pattern to create a Netflix-like episode player. It supports multiple traversal orders (normal, reverse, shuffle) and allows filtering unwatched episodes. The goal is to show how to use the Iterator pattern to hide collection details and provide a uniform interface for episode traversal.
Features:
Iterators for normal, reverse, and shuffle traversal of episodes.
"Skip Intro" iterator to skip the beginning of episodes.
Unwatched episodes filter using the Decorator pattern.
Performance testing with 10,000 fake episodes.
Why Use the Iterator Pattern?

Benefits:
Encapsulation: The collection’s internal structure is hidden, so clients don’t need to know how episodes are stored.
Multiple Traversals: Easily support different traversal orders (normal, reverse, shuffle).
Separation of Concerns: The iterator abstracts the collection traversal, keeping client code clean.
Consistency: Use the same methods (hasNext(), next()) regardless of the collection's structure.
Project Structure

model:
Episode.java: Represents an episode with title and runtime.
Season.java: Represents a season, stores episodes, and provides iterators.
Series.java: Represents a series with multiple seasons and a binge iterator.
iterator:
SeasonIterator.java: Iterator for normal order.
ReverseSeasonIterator.java: Iterator for reverse order.
ShuffleSeasonIterator.java: Iterator for shuffle order.
BingeIterator.java: Iterator to traverse all seasons in order.
SkipIntroIterator.java: Iterator to skip the intro of episodes.
UnwatchedEpisodesIterator.java: Iterator to filter unwatched episodes.
PerformanceTest.java: Generates 10,000 fake episodes and measures performance for different iterators.
Main.java: Demonstrates all iterators and episode filtering.
How to Use

Run PerformanceTest.java to measure execution time for iterating through 10,000 episodes using different iterators.
Test iterators: Demonstrates normal, reverse, shuffle, and binge modes in Main.java.
Skip Intro: Use SkipIntroIterator to skip the intro for each episode.
Filter unwatched episodes: Use UnwatchedEpisodesIterator to show only unwatched episodes.
Why Iterator is Better Than Exposing List<Episode>

Hides collection details: Clients don't need to know how episodes are stored.
Multiple traversal orders: Easily implement different traversal strategies.
Cleaner code: The collection traversal logic is abstracted, making the client code simpler.
Flexible and extendable: New iterators can be added without modifying other parts of the code.
Conclusion

The Iterator pattern is a powerful design pattern that helps manage traversal logic, promotes cleaner code, and allows flexible traversal strategies. This project demonstrates how Iterator can improve the design of a streaming service.
