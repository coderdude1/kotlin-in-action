This project contains the code samples from the "Kotlin in Action" book (https://www.manning.com/books/kotlin-in-action).
To build the project import it as Gradle project.

Each of the samples is a self-contained file, and most of them contain a "main"
function. To run a sample, simply open the file in the IDE, right-click the
"main" function and select the "Run" or "Debug" option from the context menu.

Some of the samples do not contain a "main" function, and are provided only as
a reference or demonstration of a concept. You can simply study them, or you
can incorporate them into your own examples or exercises.

The numbering of the sample files corresponds to the order in which they
appear in the book.


## Some notes
### Constructors
you can create a constructor as part of the class definition
From the docs
A class in Kotlin can have a primary constructor and one or more secondary constructors.
The primary constructor is part of the class header: it goes after the class name (and optional type parameters).
https://kotlinlang.org/docs/reference/classes.html

```
class Person constructor(firstName: String) {
}
```
 if there are no annotations or visibility mods, you can ignore the construcctor part
```
class Person(firstName: String) {
}
```


### Visibility rules in kotlin
Kotlin is similar to java, but no package scope.  Instead if you don't declare an access modifier, it
gets module scope.  A module is a compile module, ie something that is part of the same compilation
group (intellij module, gradle module).  Private means 2 things, for a class member it is visible
only in the class.  for  a top level declaration it is visible in the file (like a var/val outside of a class)?
Protected is visible in subclasses and not allowed as a top level declaration

Rules are here https://kotlinlang.org/docs/reference/visibility-modifiers.html