# Basic Concepts

## CLI
- sbt

## Process RSS
- Implementation Model
    1. RSS URL
    2. HTTP Client -> String Content - XML format
    3. Parse XML Content using External Library

## Scala Basics
- Values and Variables
- Control Structures and Loops
- Import
    - Basic Import

    ```scala
    // Importing one or more members
    import scala.concurrent.Future
    // import one by one
    import scala.concurrent.Future
    import scala.concurrent.Promise
    import scala.concurrent.blocking
    // import
    import scala.concurrent.{Future, Promise, blocking}
    // import all
    import scala.concurrent._
    ```
    - Renaming Member on Import

    ```scala
    import java.util.{List => JavaList}
    import java.util.{Date => JDate, HashMap => JHashMap}
    ```
- External Library
    - mavenrepository.com
