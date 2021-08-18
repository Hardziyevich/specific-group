# Introduction

Intention: This lesson provides a brief introduction of the Java programming language.

## `Java` as a Structural Language

Before discussing the particulars, it is useful to think of a computer program in terms of both its <b>structure</b> and 
its <b>meaning</b> simultaneously.

A `Java` program is structured in a specific and particular manner. `Java` is a language and therefore has 
grammar similar to a spoken language like <i>English</i>. 
The grammar of computer languages is usually much, much simpler than spoken languages but comes with the disadvantage of 
having stricter rules. Applying this structure or grammar to the language is what allows the computer to understand 
the program and what it is supposed to do.

The overall program has a <b>structure</b>, but it is also important to understand the purpose of part of that 
<b>structure</b>. By analogy, a textbook can be split into sections, chapters, paragraphs, sentences, 
and words (the structure), but it is also necessary to understand the overall meaning of the words, the sentences, 
and chapters to fully understand the content of the textbook. You can think of this as the semantics of the program.

A line-by-line analysis of the program should give a better idea of both the <b>structure</b> and meaning of 
the classic <b>"Hello World"</b> program. Let’s take a look at it in the upcoming lessons.

## New Features

The new features and upgrades included in Java changed the face of the programming environment and gave a new definition 
to <i>Object-Oriented Programming</i> (OOP in short). But unlike its predecessors, Java needed to be bundled with standard 
functionality and be independent of the host platform.

The primary goals in the creation of the Java language:

- It is <b>Simple & Portable</b>: Memory Management using Pointers is not allowed;
- It is <b>Object-Oriented</b>;
- It is <b>Independent</b> of the host platform;
- It is <b>Secured & Dynamic</b>: Designed to execute code from remote sources securely;
- It contains language facilities and libraries for <b>Networking</b>;
- <b>High Performance</b>: With the use of JIT (Just-In-Time) compilers, Java achieves high performance through the use of 
  <b>byte-code</b> that can be easily translated into native machine code;
- It is <b>Robust</b>: Java has its own strong <b>memory management</b> system. This helps to eliminate errors as it 
  checks the code during compile and runtime;
- Java is <b>Multithreaded</b>: It supports multiple executions of threads (i.e., lightweight processes), 
  including a set of synchronization primitives.
  
The Java language introduces some new features that did not exist in other languages like C and C++.

## Bad Practices

Over the years, some features in C/C++ programming became abused by the programmers. Although the language allows it, 
it was known as bad practices. So the creators of Java have disabled them:

- Use of Pointers;
- Operator overloading;
- Multiple inheritance;
- Friend classes (access another object’s private members);
- Restrictions of explicit type casting (related to memory management).

## About the project

Intention: About the contents covered in this project

`Java` programming language itself has a relatively small number of keywords, but it has a large and complex 
programming landscape. It is a popular programming language for embedded system development, back end systems and APIs.

In this project, you will start by learning key features of the `Java` programming language. `Java` is known as 
an <i>object-oriented</i> programming language. You will learn what that means and how to use `Java`'s 
object-oriented features in this project, as well.

Programming is about solving problems using programming languages. Several problems lend themselves naturally 
to <i>recursive</i> solutions. In this project, you will learn what recursion means and how to implement recursion in 
`Java` programs.

`Java` finds use in several large and complex systems. Such systems often require high-performance which can’t be 
achieved using single threaded programs. Parallelism is the key in such situations. Parallelism is not just a blessing, 
but also comes with its own set of challenges. You’ll learn about constructs that `Java` provides for implementing 
parallel programs.

The nature of applications that we develop and use keeps changing with time. This means that the requirements 
for programming languages keep evolving. Every programming language must evolve to meet these changing requirements, 
or face being outdated. `Java` 8 provides several new libraries and features to help modern software development easy. 
You’ll learn about those features in this project, too.

<hr>

Previous: [Java Programming](../../README.md "Java Programming") - Java Programming.

Next: [First Java Program](first-program.md "First Java Program") - A First Java Program.