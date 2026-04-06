# Android Boilerplate Project

This boilerplate project includes the following features and integrations:

- **WorkManager**: Handles background tasks, such as syncing data, uploading files, or scheduling jobs.
- **Fastlane (CI/CD)**: Automates build, testing, and deployment processes.
- **Room Database**: Local database solution for persistent storage.
- **Automatic App Signing**: Seamlessly manages app signing for multiple build variants.
- **Navigation Groups**: Simplifies navigation between app components.
- **LiveData**: Reactive data handling for UI updates.
- **Firebase Cloud Messaging (FCM)**: Enables push notifications and messaging services.
- **Hilt (Dagger)**: Provides dependency injection for easier object management.
- **Coroutines**: Supports asynchronous programming and concurrency handling.
- **DataStore**: A modern, coroutine-based solution for storing key-value pairs or typed objects.
- **Retrofit**: A powerful HTTP client for managing API calls and network requests.
- **ViewModel**: Manages UI-related data in a lifecycle-conscious way to survive configuration changes.
- **Lottie**: Integrates animated graphics and vector-based visual effects.
- **SharedPreferences**: Provides simple, synchronous key-value storage for small amounts of data.
- **Play In-App Update**: Integrates Google's in-app update mechanism for smooth updates.
- **Facebook Ads Integration**: Supports Facebook ads for app monetization.
- **Google Ads Integration**: Adds Google ads for additional monetization options.

### Base Classes

- **Base Activity**: Provides a common structure for activities.
- **Base Fragment**: Shared functionality for fragments.
- **Base Dialog Fragment**: Common dialog fragment functionalities.
- **Base Bottom Sheet**: Standard structure for bottom sheet dialogs.
- **Etc.**: Additional shared components and utilities for code reuse.

---

# Android Topics & Interview Guide

## Table of Contents

### Android Topics
- [Fundamentals](#fundamentals)
- [User Interface](#user-interface)
- [Data Storage](#data-storage)
- [Networking](#networking)
- [Permissions & Security](#permissions--security)
- [Multithreading & Concurrency](#multithreading--concurrency)
- [Jetpack Components](#jetpack-components)
- [Testing](#testing)
- [Multimedia](#multimedia)
- [Location & Maps](#location--maps)
- [Firebase](#firebase)
- [Background Processing](#background-processing)
- [Sensors & Hardware](#sensors--hardware)
- [Performance Optimization](#performance-optimization)
- [Modern Android Development (MAD)](#modern-android-development-mad)
- [App Distribution](#app-distribution)
- [Android Customization](#android-customization)
- [Internationalization & Accessibility](#internationalization--accessibility)
- [Tools & Libraries](#tools--libraries)

### Interview Questions
- [Kotlin Questions](#kotlin-questions)
- [Android Questions](#android-questions)
- [SOLID Principles](#solid-principles)

### Advanced Topics
- [Kotlin Advanced](#kotlin-advanced)
- [Android Architecture](#android-architecture)
- [Dependency Injection with Hilt](#dependency-injection-with-hilt)
- [Networking (Advanced)](#networking-advanced)
- [Jetpack Compose](#jetpack-compose)
- [Performance & Memory](#performance--memory)
- [Testing (Advanced)](#testing-advanced)

---

# Android Topics

## Fundamentals

- **App Components**: Activities, Services, Broadcast Receivers, Content Providers
- **Application Lifecycle**: Application class, Process death handling
- **Context**: Types (Activity, Application), Use cases
- **Intents**: Explicit vs. implicit, Intent filters
- **Manifest File**: Declaring components, Permissions, Metadata
- **Android System Architecture**: Linux kernel, HAL, Binder IPC

## User Interface

- **XML Layouts**: Styles, Themes, include/merge tags
- **Views & ViewGroups**: Custom Views, Canvas/Paint, MotionLayout
- **Adaptive Layouts**: Fragments for multi-pane, WindowManager (foldables)
- **RecyclerView**: DiffUtil, ListAdapter, SnapHelper
- **Jetpack Compose**: State management, Modifiers, Navigation, Theming
- **Material Design**: Components (BottomNavigation, Snackbar), Material You (Dynamic Color)
- **Animations**: ViewPropertyAnimator, Lottie, AnimatedVectorDrawable

## Data Storage

- **SharedPreferences**: vs. DataStore (Preferences/Proto)
- **Room Database**: DAOs, Relations, Migration, Testing
- **File Storage**: Scoped Storage (MediaStore, SAF), FileProvider
- **Backup**: Auto Backup for Apps, BackupManager
- **Caching**: DiskLruCache, Retrofit caching strategies

## Networking

- **Retrofit**: Coroutine support, Interceptors, Error handling
- **OkHttp**: Cache, Timeouts, Certificate Pinning
- **Protocols**: gRPC, MQTT (IoT), GraphQL (Apollo)
- **Security**: TLS/SSL, Certificate validation, Certificate Transparency

## Permissions & Security

- **Runtime Permissions**: One-time, grouped permissions (Android 13+)
- **Biometric Auth**: Strong vs. weak biometrics, CryptoObject
- **Encryption**: AES, RSA, Android Keystore System
- **App Security**: Network Security Config, HTTPS pinning, Obfuscation (R8)
- **Privacy**: Data anonymization, Advertising ID restrictions

## Multithreading & Concurrency

- **Coroutines**: Flows, Channels, CoroutineScope (lifecycle-aware)
- **RxJava**: Observables, Subjects (alternative to coroutines)
- **WorkManager**: Chained tasks, Constraints, PeriodicWork
- **Thread Management**: ThreadPoolExecutor, Synchronization (Mutex)

## Jetpack Components

- **Navigation Component**: Deep links, Nested graphs, Compose integration
- **Data Binding**: Two-way binding, Binding adapters
- **CameraX**: Image analysis, Video capture
- **App Startup**: Initialization of components
- **Hilt**: Dependency injection (scopes, qualifiers)

## Testing

- **Unit Testing**: JUnit5, MockK, Turbine (Flow testing)
- **UI Testing**: Espresso (Idling Resources), Compose testing APIs
- **Instrumentation Tests**: UI Automator, Barista

## Multimedia

- **Camera**: Camera2 API, ML Kit (barcode scanning)
- **ExoPlayer**: Custom DRM, Adaptive streaming (HLS, DASH)
- **Image Processing**: Glide/Coil (image loading), Bitmap manipulation

## Location & Maps

- **Google Maps**: Clustering, Heatmaps, Offline maps
- **Location APIs**: FusedLocationProviderClient, Geocoding

## Firebase

- **Firebase ML**: Custom models (TensorFlow Lite), Text recognition
- **Remote Config**: A/B testing, Feature toggles
- **App Distribution**: Beta testing, Crashlytics analytics
- **Dynamic Links**: Deep linking with attribution

## Background Processing

- **Foreground Services**: Notifications, Ongoing tasks
- **JobScheduler**: vs. WorkManager (backward compatibility)
- **AlarmManager**: Exact alarms (Android 12+ restrictions)

## Sensors & Hardware

- **Sensor Types**: Proximity, Ambient light, Step counter
- **Bluetooth**: BLE (GATT), Classic Bluetooth (sockets)

## Performance Optimization

- **Memory Management**: LeakCanary, onTrimMemory()
- **Battery Optimization**: Doze mode, Background limits
- **APK Size**: R8 optimization, Dynamic feature modules
- **Tools**: Android Profiler, Systrace, Baseline Profiles

## Modern Android Development (MAD)

- **Architecture**: MVI, Unidirectional Data Flow, Clean Architecture layers
- **Kotlin**: Sealed classes, Extension functions, DSLs
- **App Startup**: Optimizing cold starts, Class preloading

## App Distribution

- **Google Play**: App signing, Target API requirements, Policy compliance
- **Alternatives**: Amazon Appstore, Huawei AppGallery
- **In-App Updates**: Flexible vs. immediate
- **Monitoring**: Vitals (ANR, crashes), Play Console metrics

## Android Customization

- **Theming**: Dark mode, Dynamic colors (Material You)
- **Animations**: Shared element transitions

## Internationalization & Accessibility

- **Localization**: Plurals, Date/number formatting
- **RTL**: Layout mirroring, android:supportsRtl

## Tools & Libraries

- **Debugging**: Stetho
- **CI/CD**: GitHub Actions, Fastlane, Firebase App Distribution

---

# Interview Questions

## Kotlin Questions

<details>
<summary><strong>What is the difference between <code>val</code> and <code>var</code> in Kotlin?</strong></summary>

- `val` is used to declare a **read-only** variable (immutable).
- `var` is used to declare a **mutable** variable, allowing reassignment.

```kotlin
val myString = "Hello World"
myString = "Hello Kotlin" // This will give a compile error

var anotherString = "Hello World"
anotherString = "Hello Kotlin" // This is valid
```
</details>

<details>
<summary><strong>What is the difference between <code>lateinit</code> and <code>lazy</code> in Kotlin?</strong></summary>

`lateinit` is used to initialize a non-nullable property outside of the constructor. `lazy` is used to create a property whose value will be computed only when it is first accessed.

```kotlin
lateinit var myLateInitVar: String
if (::myLateInitVar.isInitialized) { println(myLateInitVar) }

val myLazyProperty: String by lazy {
    "Hello"
}
```
</details>

<details>
<summary><strong>Explain the difference between a regular class, a data class, and an object class in Kotlin.</strong></summary>

A regular class is a template for creating objects, and an object class is a singleton class that can only have one instance throughout the entire application. A data class is a class that is specifically designed to hold data, and automatically includes functionality such as `equals`, `hashCode`, and `toString` methods.

```kotlin
class MyRegularClass { //regular class
    //properties and methods
}

object MyObjectClass { //object class
    //properties and methods
}

data class User(val name: String, val age: Int)
```
</details>

<details>
<summary><strong>Explain the use of coroutines in Android</strong></summary>

Coroutines are a lightweight concurrency framework that allows you to write asynchronous code in a more readable and manageable way. They are used to perform long-running tasks such as network requests or database operations without blocking the main thread. This makes the app more responsive and improves the user experience.

```kotlin
suspend fun getDataFromApi(): String {
    return withContext(Dispatchers.IO) {
        // perform network request
    }
}
```
</details>

<details>
<summary><strong>Explain asynchronous coding in Android</strong></summary>

Asynchronous refers to a method of executing tasks without waiting for the previous task to complete. Instead of blocking execution, it allows the program to continue running while waiting for long-running tasks like network calls, database operations, or file I/O to finish in the background.
</details>

<details>
<summary><strong>Explain the use of sealed classes in Kotlin.</strong></summary>

Sealed classes are used to represent a closed set of cases for a given type. They are used to express the possible states of a variable or object in a more explicit and readable way. They can only have a limited set of subclasses and are defined within the same file as the sealed class.

```kotlin
sealed class ApiResponse {
    data class Success(val data: Any): ApiResponse()
    data class Error(val error: String): ApiResponse()
    object Loading: ApiResponse()
}

fun handleApiResponse(response: ApiResponse) {
    when (response) {
        is ApiResponse.Success -> handleSuccess(response.data)
        is ApiResponse.Error -> handleError(response.error)
        ApiResponse.Loading -> showLoading()
    }
}
```
</details>

<details>
<summary><strong>What is the difference between a Companion Object and an object declaration in Kotlin?</strong></summary>

A Companion Object is a singleton object that is associated with a class, whereas an object declaration creates a singleton object without association to a class. Companion objects can access the private members of its associated class, whereas regular objects cannot.

```kotlin
class MyClass {
    companion object {
        fun create(): MyClass {
            // access private members of MyClass
        }
    }
}

object MySingleton {
    fun doSomething() {
        // not associated with any class
    }
}
```
</details>

<details>
<summary><strong>How does the null safety feature work in Kotlin?</strong></summary>

The null safety feature in Kotlin helps to prevent null pointer exceptions by providing a way to explicitly identify variables that can hold null values. A variable that can hold null is defined by adding a `?` after the variable type.
</details>

<details>
<summary><strong>Explain <code>with</code>, <code>apply</code>, <code>let</code>, <code>also</code> and <code>run</code>.</strong></summary>

- The `with` function is used to call multiple methods on an object without having to repeat the object's name for each method call.

```kotlin
val myTextView = TextView(this)
with(myTextView) {
    text = "Hello"
    textSize = 20f
    setPadding(10, 10, 10, 10)
}
```

- The `apply` function is used to call multiple methods on an object and return the object itself, allowing for method chaining.

```kotlin
val myTextView = TextView(this).apply {
    text = "Hello"
    textSize = 20f
    setPadding(10, 10, 10, 10)
}
```

- The `let` function is used to perform an action on an object only if the object is not null. It takes a lambda and passes the object as an argument (`it`).

```kotlin
val myString: String? = "Hello"
myString?.let { print(it) } // prints "Hello"

val myNull: String? = null
myNull?.let { print(it) } // does nothing
```

- The `also` function is used to perform side effects on an object within a block of code, without changing the object itself. It returns the original object.

```kotlin
val list = mutableListOf<Int>()

val result = list.also {
    it.add(1)
    it.add(2)
    it.add(3)
}

println(result) // Prints the original list with added elements
```

- The `run` function executes a block of code on an object using it as the receiver (`this`), and returns the lambda result.

```kotlin
val person = Person("John", 25)

val result = person.run {
    val formattedName = name.uppercase()
    "Formatted name: $formattedName, Age: $age"
}

println(result) // Prints "Formatted name: JOHN, Age: 25"
```
</details>

<details>
<summary><strong>What are higher-order functions in Kotlin?</strong></summary>

Higher-order functions are functions that can accept other functions as parameters or return functions as results. They allow for a more functional programming style in Kotlin.

```kotlin
fun performOperation(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}
val sum: (Int, Int) -> Int = { a, b -> a + b }
val result = performOperation(5, 3, sum) // result will be 8
```
</details>

<details>
<summary><strong>Explain the concept of generics in Kotlin. How are generics used in Android development?</strong></summary>

Generics in Kotlin allow you to create reusable components that can work with different types. They provide type safety and avoid the need for type casting. Generics are widely used in Android development, for example, when working with collections like `List<T>` or when creating adapters for RecyclerViews.

```kotlin
fun <T> getListSize(list: List<T>): Int {
    return list.size
}

val stringList: List<String> = listOf("A", "B", "C")
val size = getListSize(stringList) // size will be 3
```
</details>

<details>
<summary><strong>What is a primary constructor in Kotlin? How is it different from secondary constructors?</strong></summary>

A primary constructor is declared in the class header and is part of the class declaration. It can define properties and receive parameters. Secondary constructors are additional constructors declared inside the class body. They provide alternative ways to initialize the class.

```kotlin
class Person(val name: String, val age: Int) {
    constructor(name: String) : this(name, 0) {
        // Secondary constructor
    }
}
```
</details>

<details>
<summary><strong>What is type inference in Kotlin? How does it help in reducing code verbosity?</strong></summary>

Type inference in Kotlin allows the compiler to automatically determine the type of a variable or expression based on its context. It eliminates the need for explicitly declaring the type, reducing code verbosity.

```kotlin
val number = 42 // The compiler infers the type as Int
val list = listOf(1, 2, 3) // The compiler infers the type as List<Int>
```
</details>

<details>
<summary><strong>How do you handle exceptions in Kotlin? Explain the try-catch-finally block.</strong></summary>

If an exception occurs, it is caught and handled in the `catch` block. The `finally` block is optional and is executed regardless of whether an exception occurred.

```kotlin
try {
    // Code that might throw an exception
} catch (e: Exception) {
    // Exception handling
} finally {
    // Code that will always execute
}
```
</details>

<details>
<summary><strong>What are the visibility modifiers available in Kotlin?</strong></summary>

Kotlin provides four visibility modifiers:

- `private`: Visible only within the same file or class.
- `protected`: Visible within the same class and subclasses.
- `internal`: Visible within the same module.
- `public`: Visible everywhere (default if no modifier is specified).
</details>

<details>
<summary><strong>What is the difference between a lambda expression and an anonymous function in Kotlin?</strong></summary>

Both allow you to define function literals. The main difference is in syntax. Lambda expressions are surrounded by curly braces and have implicit return, while anonymous functions have the `fun` keyword, explicit return types, and can have multiple return statements.

```kotlin
val lambda: (Int, Int) -> Int = { a, b -> a + b }

val anonymousFun = fun(a: Int, b: Int): Int {
    return a + b
}
```
</details>

<details>
<summary><strong>Non-Null Assertion, Safe Casts, Elvis Operator and Safe Calls</strong></summary>

```kotlin
text!!.length        // non-null assertion — throws if null
value as? String     // safe cast — returns null instead of throwing
val length = text?.length ?: 0  // Elvis operator — fallback if null
val length2 = text?.length      // safe call — returns null if text is null
```
</details>

<details>
<summary><strong>What is the difference between a list and an array in Kotlin?</strong></summary>

- **Size:** Lists can dynamically grow or shrink; arrays have a fixed size.
- **Type Flexibility:** Lists support generics (heterogeneous); arrays are homogeneous.
- **Modification:** Lists have `add`/`remove` methods; arrays require creating a new array.
- **Performance:** Arrays offer better performance for direct element access due to contiguous memory.
</details>

<details>
<summary><strong>What is the difference between an immutable and a mutable list in Kotlin?</strong></summary>

An immutable list (created with `listOf()`) cannot be modified after creation. A mutable list (created with `mutableListOf()`) supports adding, removing, and modifying elements.

```kotlin
val immutableList: List<Int> = listOf(1, 2, 3)
val mutableList: MutableList<Int> = mutableListOf(4, 5, 6)

// immutableList[0] = 10 // Error: cannot modify

mutableList[0] = 10
mutableList.add(7)
mutableList.removeAt(1)
```
</details>

<details>
<summary><strong>Explain the concept of extension functions in Kotlin.</strong></summary>

Extension functions allow you to add new functions to existing classes without modifying their source code.

```kotlin
fun String.addExclamation(): String {
    return "$this!"
}

val message = "Hello"
println(message.addExclamation()) // Output: Hello!
```
</details>

<details>
<summary><strong>What is the difference between companion objects and static members in Java?</strong></summary>

- **Syntax:** Java uses the `static` keyword; Kotlin uses the `companion` keyword inside the class.
- **Access:** Static members are accessed directly via the class name; companion object members are too, but they are actual objects.
- **Inheritance:** Static members in Java are not polymorphic; companion objects support interfaces.
- **Extension Functions:** Companion objects can have extension functions; Java static members cannot.

```java
// Java
public class MyClass {
    public static int myStaticField = 10;
    public static void myStaticMethod() { }
}
```

```kotlin
// Kotlin
class MyClass {
    companion object {
        val myStaticField = 10
        fun myStaticMethod() { }
    }
}
```
</details>

<details>
<summary><strong>Explain the <code>suspend</code> modifier in Kotlin.</strong></summary>

The `suspend` modifier marks a function that can be paused and resumed without blocking the thread. It is a fundamental concept in coroutine-based programming and can only be called from a coroutine or another suspend function.

```kotlin
suspend fun fetchData(): String {
    delay(1000L)
    return "Data fetched"
}

fun main() = runBlocking {
    val result = fetchData()
    println(result)
}
```
</details>

<details>
<summary><strong>What is the purpose of the <code>withContext()</code> function in Kotlin coroutines?</strong></summary>

The `withContext()` function switches the coroutine's context to a different dispatcher while suspending the current coroutine, then returns to the original dispatcher once the block completes.

```kotlin
suspend fun fetchFromNetwork(): String {
    return withContext(Dispatchers.IO) {
        // Perform network request
        // Return result
    }
}
```
</details>

<details>
<summary><strong>What is a flow in Kotlin coroutines?</strong></summary>

A flow is a cold asynchronous stream of data that can emit multiple values over time. It is designed to handle sequences of values computed asynchronously and lazily. Flows provide built-in operators to transform and combine data streams.

```kotlin
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

fun fetchData(): Flow<Int> = flow {
    for (i in 1..5) {
        delay(1000L)
        emit(i)
    }
}

fun main() = runBlocking {
    fetchData()
        .map { it * 2 }
        .collect { value ->
            println(value)
        }
}
```
</details>

<details>
<summary><strong>Functional programming in Kotlin.</strong></summary>

Functional programming in Kotlin encourages:

- **Immutable Data:** Use of immutable data structures where objects cannot be modified after creation.
- **Pure Functions:** Functions that produce the same output for the same input, with no side effects.
- **Higher-Order Functions:** Functions that accept or return other functions, enabling code reuse and abstraction.

```kotlin
val numbers = listOf(1, 2, 3, 4, 5)

val sum = numbers
    .filter { it % 2 == 0 }
    .map { it * 2 }
    .reduce { acc, value -> acc + value }

println(sum) // Prints the sum of doubled even numbers: 12
```
</details>

<details>
<summary><strong>Explain the concept of delegates in Kotlin.</strong></summary>

Delegates provide a way to delegate the implementation of properties or functions to another object, allowing reuse of common behavior without inheritance.

```kotlin
val myLazyProperty: String by lazy {
    println("Initializing myLazyProperty")
    "Hello, Kotlin!"
}

val args: SecondFragmentArgs by navArgs()

// by -> Delegation
```
</details>

<details>
<summary><strong>What is the difference between <code>init</code> and constructor in Kotlin?</strong></summary>

`init` is an initialization block executed when an instance is created. The constructor creates the instance, while the `init` block handles initialization logic. The key difference is that `init` always runs regardless of which constructor is used.

```kotlin
class Person(name: String) {
    val greeting: String

    init {
        greeting = "Hello, $name!"
        println("Person initialized")
    }
}

fun main() {
    val person = Person("John") // Output: Person initialized
    println(person.greeting)   // Output: Hello, John!
}
```
</details>

<details>
<summary><strong>What is the difference between invariance, covariance, and contravariance in Kotlin generics?</strong></summary>

- `Invariance` — no subtyping relationship between different generic instantiations. `Box<String>` is NOT a subtype of `Box<Any>`.
- `Covariance` (`out`) — allows a subtype relationship that preserves the direction of subtyping. A `Container<Dog>` can be used where `Container<Animal>` is expected.
- `Contravariance` (`in`) — reverses the direction of subtyping. A `Processor<Animal>` can be used where `Processor<Dog>` is expected.

```kotlin
open class Animal
class Dog : Animal()

interface Container<out T> {
    fun getItem(): T
}

interface Processor<in T> {
    fun process(item: T)
}

fun main() {
    val dogContainer: Container<Dog> = object : Container<Dog> {
        override fun getItem(): Dog = Dog()
    }
    val animalContainer: Container<Animal> = dogContainer // Covariance

    val animalProcessor: Processor<Animal> = object : Processor<Animal> {
        override fun process(item: Animal) { println("Processing: $item") }
    }
    val dogProcessor: Processor<Dog> = animalProcessor // Contravariance
}
```
</details>

<details>
<summary><strong>Explain the concept of <code>typealias</code> in Kotlin.</strong></summary>

`typealias` provides an alternative name for an existing type, making the code more readable and maintainable.

```kotlin
typealias EmployeeId = String

class Employee(val id: EmployeeId, val name: String)

fun main() {
    val employee = Employee("123", "John Doe")
    println(employee.id) // Output: 123
}
```
</details>

<details>
<summary><strong>What are inline functions in Kotlin?</strong></summary>

Inline functions are expanded at the call site during compilation — the function body is inserted directly instead of making a function call. This reduces overhead, especially for higher-order functions with lambdas. Declared using the `inline` keyword.

```kotlin
inline fun calculateSum(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    val sum = calculateSum(3, 4)
    println(sum) // Output: 7
}
```
</details>

<details>
<summary><strong>Explain the concept of tail recursion in Kotlin.</strong></summary>

Tail recursion is where a recursive function calls itself as its last operation. The compiler optimizes it into an efficient loop, preventing stack overflow. Use the `tailrec` modifier to enable this optimization.

```kotlin
tailrec fun factorial(n: Int, acc: Int = 1): Int {
    return if (n == 0) {
        acc
    } else {
        factorial(n - 1, acc * n)
    }
}

fun main() {
    val result = factorial(5)
    println(result) // Output: 120
}
```
</details>

<details>
<summary><strong>What is the use of the <code>@JvmStatic</code> annotation in Kotlin?</strong></summary>

`@JvmStatic` is used when interoperating with Java code. Applied to a companion object's function or property, it generates a static equivalent in the compiled Java bytecode, allowing Java callers to invoke it as a static method.

```kotlin
class Utils {
    companion object {
        @JvmStatic
        fun doSomething() {
            println("Doing something")
        }
    }
}
// Java: Utils.doSomething()
```
</details>

<details>
<summary><strong>What is the difference between <code>==</code> and <code>===</code> operators in Kotlin?</strong></summary>

- `==` — structural equality: checks if the **values** of two objects are equal (calls `equals()`).
- `===` — referential equality: checks if two **references point to the same object** in memory.

```kotlin
val a = "Hello"
val b = "Hello"
val c = a

println(a == b)  // true (structural equality)
println(a === b) // true (string interning in JVM)
println(a === c) // true (same reference)
```
</details>

<details>
<summary><strong>What is the purpose of the <code>operator</code> modifier in Kotlin?</strong></summary>

The `operator` modifier allows you to overload or define custom behavior for built-in operators such as `+`, `-`, `*`, `/`, `==`, etc.

```kotlin
data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
}

fun main() {
    val p1 = Point(1, 2)
    val p2 = Point(3, 4)
    val sum = p1 + p2
    println(sum) // Output: Point(x=4, y=6)
}
```
</details>

<details>
<summary><strong>What is the difference between extension functions and member functions in Kotlin?</strong></summary>

- **Extension functions** add new functions to existing classes without modifying their source code.
- **Member functions** are defined inside the class and can access its private properties and functions directly.

```kotlin
// Extension function
fun String.isPalindrome(): Boolean {
    return this == this.reversed()
}

// Member function
class Person(val name: String) {
    fun introduce() {
        println("Hello, my name is $name")
    }
}

fun main() {
    println("radar".isPalindrome()) // true

    val person = Person("John")
    person.introduce() // Hello, my name is John
}
```
</details>

<details>
<summary><strong>Explain the concept of the <code>this</code> expression in Kotlin.</strong></summary>

The `this` expression refers to the current instance of the class.

```kotlin
class Person {
    var name: String = "John"

    fun printName() {
        println("My name is ${this.name}")
    }
}

fun main() {
    val person = Person()
    person.printName() // Output: My name is John
}
```
</details>

<details>
<summary><strong>Explain the concept of default arguments in Kotlin.</strong></summary>

Default arguments allow you to define default values for function parameters. If an argument is not provided for a parameter with a default value, the default value is used.

```kotlin
fun greet(name: String = "World") {
    println("Hello, $name!")
}

fun main() {
    greet()       // Output: Hello, World!
    greet("John") // Output: Hello, John!
}
```
</details>

<details>
<summary><strong>Explain the concept of function references in Kotlin.</strong></summary>

Function references allow you to refer to a function by its name without invoking it, and pass it as a first-class value.

```kotlin
fun greet() {
    println("Hello, World!")
}

val functionReference = ::greet

fun main() {
    functionReference() // Output: Hello, World!
}
```
</details>

<details>
<summary><strong>What is the purpose of the <code>downTo</code> keyword in Kotlin?</strong></summary>

`downTo` is used with the range operator to create a range in descending order, commonly used in `for` loops.

```kotlin
for (i in 10 downTo 1) {
    println(i)
}
```
</details>

<details>
<summary><strong>Explain the concept of the <code>until</code> keyword in Kotlin.</strong></summary>

`until` creates a range from the starting value up to, but **not including**, the end value.

```kotlin
for (i in 1 until 5) {
    println(i) // Prints 1, 2, 3, 4
}
```
</details>

<details>
<summary><strong>Explain the concept of the <code>internal</code> visibility modifier in Kotlin.</strong></summary>

The `internal` modifier restricts visibility to the same module. It allows access from any code within the same module, but not from outside it. A module is a set of Kotlin files compiled together.

```kotlin
// ModuleA.kt
internal class InternalClass {
    fun doSomething() {
        println("Doing something internally")
    }
}
```
</details>

<details>
<summary><strong>What is the difference between <code>first()</code> and <code>firstOrNull()</code> functions in Kotlin?</strong></summary>

Both retrieve the first element of a collection. The difference is in handling empty collections:

- `first()` — throws `NoSuchElementException` if the collection is empty.
- `firstOrNull()` — returns `null` if the collection is empty.

```kotlin
val numbers = listOf(1, 2, 3)
println(numbers.first())        // Output: 1

val empty = emptyList<Int>()
println(empty.firstOrNull())    // Output: null
// empty.first() would throw NoSuchElementException
```
</details>

<details>
<summary><strong>Explain the concept of <code>crossinline</code> in Kotlin.</strong></summary>

The `crossinline` modifier is used in inline higher-order functions to indicate that the passed lambda cannot contain non-local returns. It is required when the lambda is executed in a different context (e.g., inside a `Runnable` or another lambda).

```kotlin
inline fun higherOrderFunction(crossinline lambda: () -> Unit) {
    val runnable = Runnable {
        lambda()
    }
    runnable.run()
}

fun main() {
    higherOrderFunction {
        // Non-local return is not allowed here
        return@higherOrderFunction
    }
}
```
</details>

<details>
<summary><strong>What is the use of the <code>requireNotNull</code> function in Kotlin?</strong></summary>

`requireNotNull` checks that a value is not null. It throws `IllegalArgumentException` with a message if null, and returns the non-null value otherwise.

```kotlin
fun printName(name: String?) {
    val nonNullName = requireNotNull(name) { "Name must not be null" }
    println("Name: $nonNullName")
}

fun main() {
    printName("John") // Output: Name: John
    printName(null)   // Throws IllegalArgumentException
}
```
</details>

<details>
<summary><strong>Explain the concept of top-level functions in Kotlin.</strong></summary>

Top-level functions are declared outside of any class or interface, at the top level of a file. They are accessible from anywhere in the same module and provide a way to organize logic that doesn't belong to a specific class.

```kotlin
// File: MathUtils.kt
package com.example.utils

fun addNumbers(a: Int, b: Int): Int {
    return a + b
}

fun multiplyNumbers(a: Int, b: Int): Int {
    return a * b
}
```
</details>

<details>
<summary><strong>Explain the concept of inlining in Kotlin.</strong></summary>

Inlining optimizes higher-order functions by replacing the function call with the actual code at each call site. This reduces the overhead of lambda object creation and function call overhead.

```kotlin
inline fun calculateResult(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main() {
    val result = calculateResult(5, 3) { x, y -> x + y }
    println(result) // Output: 8
}
```
</details>

<details>
<summary><strong>How does Kotlin handle SAM (Single Abstract Method) conversions for Java interoperability?</strong></summary>

Kotlin allows SAM conversions, where functional interfaces in Java can be seamlessly used as lambda expressions in Kotlin. This simplifies the integration of Kotlin with Java libraries that heavily use functional interfaces.

```kotlin
fun setClickListener(listener: ClickListener) {
    listener.onClick("Button clicked")
}

// Using SAM conversion — passing a lambda instead of an object
setClickListener { message ->
    println("Lambda: $message")
}
```
</details>

<details>
<summary><strong>What are Kotlin Contracts, and how do they improve code optimization?</strong></summary>

Kotlin Contracts are annotations that developers can use to provide additional information to the compiler about the expected behavior of functions. By specifying contracts, developers can guide the compiler in making more informed decisions during optimization, resulting in potentially more efficient code.
</details>

<details>
<summary><strong>How do you perform string interpolation in Kotlin?</strong></summary>

String interpolation allows you to embed expressions or variables directly within string literals using `$` for variables and `${}` for expressions.

```kotlin
fun main() {
    val name = "John"
    val age = 30
    val message = "My name is $name and I am $age years old."
    println(message) // Output: My name is John and I am 30 years old.
}
```
</details>

---

## Android Questions

<details>
<summary><strong>What's Activity in Android?</strong></summary>

Activity represents a single screen with a user interface. It serves as the entry point for interacting with the app and can host UI elements like buttons, text fields, and images. Each Android app typically consists of multiple activities that work together to provide a seamless user experience.
</details>

<details>
<summary><strong>What are the components of the Android Application?</strong></summary>

There are four main building blocks that an Android application consists of. These loosely coupled components are bound by the application manifest file:

- `Activities`
- `Services`
- `Content Providers`
- `Broadcast Receivers`
</details>

<details>
<summary><strong>What is Toast in Android?</strong></summary>

A Toast is a short alert message shown on the Android screen for a short interval of time. It is used to display information when we perform any operation in our app. It disappears automatically.
</details>

<details>
<summary><strong>What's Service in Android?</strong></summary>

Services in Android are a special component that facilitates an application to run in the background in order to perform long-running operation tasks.
</details>

<details>
<summary><strong>What is a Content Provider in Android?</strong></summary>

A Content Provider acts as a central repository for storing and managing application data. It allows apps to securely share, access, and modify data from other apps while maintaining proper permissions and security.

```kotlin
val contentUri = Uri.parse("content://com.example.provider/users")
val cursor = contentResolver.query(contentUri, null, null, null, null)
```
</details>

<details>
<summary><strong>What is a Broadcast Receiver in Android?</strong></summary>

A Broadcast Receiver listens for system-wide or app-specific events (broadcasts) and responds when they occur. Events include device boot, incoming SMS, battery changes, or airplane mode activation.

- **Static Broadcast Receiver** – Declared in `AndroidManifest.xml`, works even if the app is closed.
- **Dynamic Broadcast Receiver** – Registered at runtime, works only when the app is running or minimized.
</details>

<details>
<summary><strong>What is Gradle in Android?</strong></summary>

Gradle is an open-source build automation tool used in Android for building, testing, and deployment. It automates tasks like compiling code, managing dependencies, and generating APKs.
</details>

<details>
<summary><strong>What is a Fragment in Android?</strong></summary>

A Fragment is a reusable UI component that represents a portion of an Activity. It helps create flexible, modular, and adaptive UI designs that adjust to different screen sizes.
</details>

<details>
<summary><strong>What's RecyclerView in Android & How it works?</strong></summary>

RecyclerView is a ViewGroup that is an improvement on ListView and GridView. It improves efficiency by **recycling** off-screen item views — items scrolled out of view are reused for new items, reducing memory consumption.
</details>

<details>
<summary><strong>What's the Difference Between Intent and Intent Filters?</strong></summary>

An Intent is an object passed to `startActivity()`, `startService()`, etc. to launch a component or trigger an action. An Intent Filter describes the capability of the component — what kinds of Intents it can respond to.
</details>

<details>
<summary><strong>What is the AndroidManifest.xml?</strong></summary>

Every project includes a manifest file stored in the root directory. It defines the structure and metadata of the application, its components (Activities, Services, Content Providers, Broadcast Receivers), permissions, and requirements like icon and theme.
</details>

<details>
<summary><strong>Activity Lifecycle in brief.</strong></summary>

![Activity Lifecycle](A0ED08A0-8A80-4B38-8CB0-C85D004B7557.jpeg)

| Callback | When it's called |
|---|---|
| `onCreate()` | Activity first created — do static setup here |
| `onStart()` | Activity becomes visible to the user |
| `onRestart()` | Activity returning from stopped state |
| `onResume()` | Activity in foreground and interactive |
| `onPause()` | Activity losing focus (another activity coming on top) |
| `onStop()` | Activity no longer visible |
| `onDestroy()` | Activity being destroyed |
</details>

<details>
<summary><strong>Why do we need to call <code>setContentView()</code> in <code>onCreate()</code>?</strong></summary>

`onCreate()` is called only once in the lifecycle. Calling `setContentView()` here ensures the layout is inflated a single time. Calling it in `onResume()` or `onStart()` would re-inflate the layout on every transition, which is inefficient.
</details>

<details>
<summary><strong>Explain the Fragment Lifecycle in Brief</strong></summary>

![Fragment Lifecycle](Android_Fragment_Lifecycle.jpg)
</details>

<details>
<summary><strong>Difference between Fragment and Activity</strong></summary>

| Feature | Activity | Fragment |
|---|---|---|
| **Definition** | An application component that provides a user interface. | A UI component that is part of an Activity. |
| **Independence** | Not dependent on a Fragment. | Dependent on an Activity; cannot exist independently. |
| **Manifest Requirement** | Must be declared in `AndroidManifest.xml`. | No need to declare in the manifest. |
| **Multi-Screen UI** | Cannot create a multi-screen UI alone. | Enables multi-screen UI by combining multiple fragments. |
| **Existence** | Can exist without a Fragment. | Cannot exist without an Activity. |
| **Lifecycle Handling** | Managed by the OS. | Managed by the hosting Activity. |
| **Performance** | Heavier component. | Lightweight compared to Activity. |
| **Reusability** | Not reusable. | Highly reusable. |
</details>

<details>
<summary><strong>What's Context in Android?</strong></summary>

Context gives us the context of the current state of our application. It is used to:

- Access resources.
- Interact with other Android components by sending messages.
- Get information about the app environment.

**Two main types of Context:**
- **Application Context** — tied to the app's lifecycle.
- **Activity Context** — tied to the Activity's lifecycle.
</details>

<details>
<summary><strong>Difference Between View and ViewGroup in Android</strong></summary>

| Feature | View | ViewGroup |
|---|---|---|
| **Definition** | A single rectangular UI element. | An invisible container that holds Views and other ViewGroups. |
| **Purpose** | Represents UI elements like buttons and text boxes. | Organizes Views to structure the UI layout. |
| **Examples** | `EditText`, `Button`, `CheckBox` | `LinearLayout`, `RelativeLayout`, `ConstraintLayout` |
| **Base Class** | `android.view.View` | `android.view.ViewGroup` |
</details>

<details>
<summary><strong>Describe the architecture of your last app.</strong></summary>

The most popular Android architectures are:

- `MVC (Model — View — Controller)`
- `MVP (Model — View — Presenter)`
- `MVVM (Model — View — ViewModel)`

**MVC vs MVP vs MVVM Architecture:**

| Feature | MVC | MVP | MVVM |
|---|---|---|---|
| **Coupling** | View and Model tightly coupled. | Presenter decouples View and Model. | Data binding; clear separation of business logic and UI. |
| **Relationships** | One Controller → many Views. | One Presenter → one View. | One ViewModel → many Views. |
| **Best for** | Small-scale projects. | Simple and complex apps. | Large-scale projects. |
</details>

<details>
<summary><strong>Describe MVVM</strong></summary>

`Model — View — ViewModel (MVVM)` separates data presentation logic from the core business logic:

- `Model` — responsible for data sources. Works with the ViewModel to get and save data.
- `View` — observes the ViewModel and contains no application logic.
- `ViewModel` — exposes data streams to the View and serves as a link between Model and View.
</details>

<details>
<summary><strong>How to Reduce APK size in Android?</strong></summary>

- Remove unused resources and code
- Use Vector Drawables
- Compress PNG and JPEG files
- Use WebP image format
- Enable ProGuard / R8
- Use `shrinkResources true`
- Limit external library usage
- Use the Android Size Analyzer tool
- Publish App Bundles (AAB) instead of APK
- Use `resConfigs` to strip unused locales
</details>

<details>
<summary><strong>What's Android Jetpack and its Key Benefits?</strong></summary>

Jetpack is a set of software components, libraries, tools, and guidance to help in developing great Android apps.

Key Benefits:
- Forms a recommended architecture through its components
- Eliminates boilerplate code
- Simplifies complex tasks
- Provides backward compatibility via `androidx.*`
- Inbuilt Kotlin integration
</details>

<details>
<summary><strong>What's Jetpack Compose and its Benefits?</strong></summary>

Jetpack Compose is a modern declarative UI toolkit for building native Android UI with less code and Kotlin APIs.

- Declarative
- Compatible with existing Views
- Increases development speed
- Concise and idiomatic Kotlin
- Easy to maintain
</details>

<details>
<summary><strong>What are the Architecture Components of Android?</strong></summary>

- Room
- WorkManager
- Lifecycle
- ViewModel
- LiveData
- Navigation
- Paging
- Data Binding
</details>

<details>
<summary><strong>How to Improve RecyclerView Scrolling Performance in Android?</strong></summary>

- Set a specific width and height to `ImageView` in items
- Avoid nested scrolling views
- Use `setHasFixedSize(true)`
- Use an image loading library (Glide, Coil)
- Keep `onBindViewHolder()` lightweight
- Use `DiffUtil` / `notifyItemChanged()` instead of `notifyDataSetChanged()`
</details>

<details>
<summary><strong>What's Retrofit in Android?</strong></summary>

Retrofit is a type-safe REST client for Android and Java that simplifies consuming RESTful web services. It uses OkHttp as the networking layer and automatically serializes JSON responses into Kotlin/Java objects using a converter (e.g., Gson, Moshi).

> Note: Retrofit does not support image loading — use Glide or Coil for that.
</details>

<details>
<summary><strong>What are the reasons your Android app is lagging?</strong></summary>

- Too much work on the main thread
- Large asset files
- Outdated SDK version
- Poorly optimized libraries
- Slow network responses
- Chatty network calls (too many small requests)
- Inefficient code
</details>

<details>
<summary><strong>What is ANR and How can it be Prevented in Android?</strong></summary>

ANR stands for Application Not Responding. It is triggered when a process on the UI thread takes more than ~5 seconds. The GUI locks up and the system shows a dialog prompting the user to wait or force-close the app.

**Prevention:** Move heavy tasks off the main thread using coroutines, `WorkManager`, or background threads. Identify blocked threads with Android Profiler or StrictMode.
</details>

<details>
<summary><strong>What is Android NDK and why is it useful?</strong></summary>

The NDK (Native Development Kit) allows you to write performance-critical code in C/C++ for Android. It is useful for:
- Games or physics simulations requiring low latency
- Reusing existing C/C++ libraries
- Computationally intensive operations
</details>

<details>
<summary><strong>Explain the JUnit test in brief.</strong></summary>

JUnit is a Unit Testing framework for Java/Kotlin included by default in Android Studio. It provides annotations such as `@Test`, `@Before`, `@After` to define and organize tests.
</details>

<details>
<summary><strong>What's LiveData in Android Architecture Component and its Advantages?</strong></summary>

LiveData is a lifecycle-aware observable data holder. It only updates observers whose lifecycle state is active (STARTED or RESUMED), and automatically removes destroyed observers — preventing memory leaks.

**Advantages:**
- UI stays in sync with data changes
- No memory leaks — lifecycle-aware
- No crashes from stopped or destroyed activities

![LiveData Component](LiveData_Component-(1).jpg)
</details>

<details>
<summary><strong>What's Data Binding in Android?</strong></summary>

Data Binding is a library that allows you to bind UI components to data sources declaratively in XML, removing the need for `findViewById()` calls.

```kotlin
// Without Data Binding
val textView = findViewById<TextView>(R.id.sample_text)
textView.setText(viewModel.getUserName())
```

```xml
<!-- With Data Binding -->
<TextView android:text="@{viewmodel.userName}" />
```

**Advantages of Data Binding:**
- Removes UI framework calls from the Activity
- Allows classes and methods to observe data changes
- Reduces boilerplate
</details>

<details>
<summary><strong>Room in Android Architecture Component.</strong></summary>

Room is an SQLite abstraction library that:

- Validates queries at **compile time**
- Maps results directly to Kotlin objects (no boilerplate)
- Can return `LiveData` or `Flow` from queries

Three sub-components:
- `@Entity` — annotated class representing a database table
- `@Dao` — interface defining query methods
- `@Database` — abstract class that serves as the main access point
</details>

<details>
<summary><strong>ViewModel in Android</strong></summary>

ViewModel holds and manages UI-related data in a lifecycle-conscious way. Its main purpose is to survive configuration changes like screen rotation — data is not lost when the Activity is recreated.
</details>

<details>
<summary><strong>What is the difference between Serializable and Parcelable in Android?</strong></summary>

Both are used to transfer data between components. However:

- `Serializable` — Java standard interface; uses **reflection** which is slower.
- `Parcelable` — Android-specific; uses **direct memory access**, making it significantly faster.

Use `@Parcelize` for the simplest Parcelable implementation:

```kotlin
@Parcelize
data class User(val name: String, val age: Int) : Parcelable
```
</details>

<details>
<summary><strong>How does Dependency Injection (DI) work in Android?</strong></summary>

Dependency Injection is a design pattern that promotes loose coupling by providing dependencies externally rather than creating them inside a class. In Android, **Hilt** (built on Dagger) is the recommended DI framework. It improves code maintainability, testability, and allows easy swapping of implementations.
</details>

<details>
<summary><strong>What is the purpose of ProGuard in Android development?</strong></summary>

ProGuard is used for code shrinking, optimization, and obfuscation. It removes unused classes, fields, and methods to reduce app size, and obfuscates code by renaming identifiers to make reverse engineering harder.
</details>

<details>
<summary><strong>How can you handle orientation changes in an Android application?</strong></summary>

Orientation changes cause an Activity to restart. Handle this by:
- Overriding `onSaveInstanceState()` to save important data
- Restoring state in `onCreate()` or `onRestoreInstanceState()`
- Using **ViewModel** to retain UI data across configuration changes (recommended approach)
</details>

<details>
<summary><strong>What is the difference between a Service and an IntentService in Android?</strong></summary>

| | Service | IntentService |
|---|---|---|
| Thread | Runs on main thread | Creates a worker thread automatically |
| Request handling | Manual | Sequential, automatic |
| Best for | Ongoing background work | Simple, independent tasks |

> Note: `IntentService` is deprecated in API 30+. Use `WorkManager` or a coroutine-based approach instead.
</details>

<details>
<summary><strong>What is Android WorkManager?</strong></summary>

Android WorkManager is an API that provides a unified, reliable solution for scheduling and executing background tasks, even across device reboots. It abstracts away differences between Android versions and their background processing limitations.
</details>

<details>
<summary><strong>What are the key features of WorkManager?</strong></summary>

- One-time and periodic task scheduling
- Constraints (network, charging, device idle)
- Guaranteed execution across reboots
- Task chaining
- Progress and output observation
- Integration with LiveData and ViewModel

```kotlin
// One-time task
val myWorkRequest = OneTimeWorkRequestBuilder<MyWorker>().build()

// Periodic task
val myPeriodicWorkRequest = PeriodicWorkRequestBuilder<MyWorker>(1, TimeUnit.HOURS).build()

// With network constraint
val constraints = Constraints.Builder()
    .setRequiredNetworkType(NetworkType.UNMETERED)
    .build()

val constrainedRequest = OneTimeWorkRequestBuilder<MyWorker>()
    .setConstraints(constraints)
    .build()
```
</details>

<details>
<summary><strong>How does WorkManager differ from other background task scheduling mechanisms in Android?</strong></summary>

WorkManager provides a unified API that handles task execution across all Android versions. It intelligently selects the best available implementation (JobScheduler, AlarmManager, etc.) based on the device's API level, ensuring optimal performance and reliability.
</details>

<details>
<summary><strong>What are the different types of constraints that can be applied to a WorkRequest?</strong></summary>

- Network connectivity requirements (e.g., unmetered network)
- Device charging status
- Device idle state
- Execution window (time frame for task execution)
</details>

<details>
<summary><strong>What is the difference between OneTimeWorkRequest and PeriodicWorkRequest?</strong></summary>

- `OneTimeWorkRequest` — executes a task once. Ideal for one-off operations like sending analytics.
- `PeriodicWorkRequest` — executes a task repeatedly at a specified interval. Ideal for recurring sync tasks.
</details>

<details>
<summary><strong>How can you pass data to a Worker class?</strong></summary>

Use `workDataOf()` to build input data and attach it with `setInputData()`. Retrieve it inside `doWork()` via `inputData`.

```kotlin
val inputData = workDataOf("key" to "value")

val myWorkRequest = OneTimeWorkRequestBuilder<MyWorker>()
    .setInputData(inputData)
    .build()
```
</details>

<details>
<summary><strong>How can you observe the progress or output of a Worker class?</strong></summary>

WorkManager provides `getWorkInfoByIdLiveData()` to observe the `WorkInfo` object, which contains the task's state, progress, and output data.

```kotlin
WorkManager.getInstance(context)
    .getWorkInfoByIdLiveData(workRequestId)
    .observe(owner) { workInfo ->
        if (workInfo != null && workInfo.state.isFinished) {
            val output = workInfo.outputData
        } else {
            val progress = workInfo.progress
        }
    }
```
</details>

<details>
<summary><strong>How can you chain multiple work requests together?</strong></summary>

Use `beginWith()` and `then()` to define a sequence of tasks.

```kotlin
val firstWorkRequest = OneTimeWorkRequestBuilder<FirstWorker>().build()
val secondWorkRequest = OneTimeWorkRequestBuilder<SecondWorker>().build()

WorkManager.getInstance(context)
    .beginWith(firstWorkRequest)
    .then(secondWorkRequest)
    .enqueue()
```
</details>

<details>
<summary><strong>How can you handle and retry failed tasks in WorkManager?</strong></summary>

WorkManager automatically retries failed tasks using the retry policy defined by `setBackoffCriteria()`. It supports linear and exponential backoff strategies.

```kotlin
val myWorkRequest = OneTimeWorkRequestBuilder<MyWorker>()
    .setBackoffCriteria(BackoffPolicy.EXPONENTIAL, 1, TimeUnit.MINUTES)
    .build()
```
</details>

---

## SOLID Principles

The SOLID principles are five essential guidelines that enhance software design, making code more maintainable and scalable:

| Principle | Rule |
|---|---|
| **S**ingle Responsibility | A class should have only one reason to change |
| **O**pen/Closed | Open for extension, closed for modification |
| **L**iskov Substitution | Subclasses must be substitutable for their parent class |
| **I**nterface Segregation | Don't force clients to implement interfaces they don't use |
| **D**ependency Inversion | Depend on abstractions, not concrete implementations |

SOLID helps reduce tight coupling — where classes are highly dependent on one another. Loosely coupled classes are more reusable, maintainable, flexible, and stable.

<details>
<summary><strong>Single Responsibility Principle (SRP)</strong></summary>

"A class should have only one reason to change" — every class should have a single, well-defined responsibility.
</details>

<details>
<summary><strong>Open/Closed Principle</strong></summary>

"Software entities should be open for extension, but closed for modification" — you should be able to extend behavior without modifying existing code.
</details>

<details>
<summary><strong>Liskov's Substitution Principle (LSP)</strong></summary>

"Derived or child classes must be substitutable for their base or parent classes" — any subclass should work correctly wherever its parent is expected, without unexpected behavior.
</details>

<details>
<summary><strong>Interface Segregation Principle (ISP)</strong></summary>

"Do not force any client to implement an interface which is irrelevant to them" — prefer many small, client-specific interfaces over one large general-purpose interface.
</details>

<details>
<summary><strong>Dependency Inversion Principle (DIP)</strong></summary>

"High-level modules should not depend on low-level modules. Both should depend on abstractions" — classes should rely on interfaces or abstract classes rather than concrete implementations, making it easier to swap implementations without affecting other parts of the codebase.
</details>

---

# Advanced Topics

## Kotlin Advanced

<details>
<summary><strong>What is <code>StateFlow</code> and how is it different from <code>LiveData</code>?</strong></summary>

`StateFlow` is a hot, coroutine-based observable that always holds a current value and emits updates to all collectors. Unlike `LiveData`, it is not lifecycle-aware by default, works outside Android (pure Kotlin), and requires an initial value.

| | LiveData | StateFlow |
|---|---|---|
| Lifecycle-aware | Yes (automatic) | No (use `repeatOnLifecycle`) |
| Initial value | Not required | Required |
| Threading | Main thread by default | Any dispatcher |
| Platform | Android only | Pure Kotlin |
| Backpressure | None | Conflated (latest value only) |

```kotlin
// ViewModel
val uiState: StateFlow<UiState> = MutableStateFlow(UiState.Loading)

// Collect safely in Fragment
viewLifecycleOwner.lifecycleScope.launch {
    repeatOnLifecycle(Lifecycle.State.STARTED) {
        viewModel.uiState.collect { state ->
            render(state)
        }
    }
}
```
</details>

<details>
<summary><strong>What is <code>SharedFlow</code> and when do you use it over <code>StateFlow</code>?</strong></summary>

`SharedFlow` is a hot flow that can emit multiple values to multiple collectors. Unlike `StateFlow`, it has no current-value concept and can be configured with a replay cache and buffer.

Use `SharedFlow` for **one-time events** (navigation, snackbars, errors) where you don't want a stale value replayed on resubscription.

```kotlin
// ViewModel
private val _events = MutableSharedFlow<UiEvent>()
val events: SharedFlow<UiEvent> = _events.asSharedFlow()

fun navigateToHome() {
    viewModelScope.launch { _events.emit(UiEvent.NavigateHome) }
}

// Fragment
lifecycleScope.launch {
    repeatOnLifecycle(Lifecycle.State.STARTED) {
        viewModel.events.collect { event ->
            when (event) {
                UiEvent.NavigateHome -> findNavController().navigate(R.id.homeFragment)
            }
        }
    }
}
```

| | StateFlow | SharedFlow |
|---|---|---|
| Holds current value | Yes | No |
| Replay on subscribe | Last value | Configurable (0–N) |
| Best for | UI state | One-time events |
</details>

<details>
<summary><strong>What are Coroutine Dispatchers?</strong></summary>

Dispatchers determine which thread or thread pool a coroutine runs on.

| Dispatcher | Used for |
|---|---|
| `Dispatchers.Main` | UI updates, LiveData observation |
| `Dispatchers.IO` | Network calls, file/DB operations |
| `Dispatchers.Default` | CPU-intensive work (sorting, parsing) |
| `Dispatchers.Unconfined` | Testing or special cases — avoid in production |

```kotlin
viewModelScope.launch {
    val data = withContext(Dispatchers.IO) { repository.fetchData() }
    _uiState.value = UiState.Success(data) // back on Main
}
```
</details>

<details>
<summary><strong>How does Coroutine Exception Handling work?</strong></summary>

Exceptions in coroutines propagate up the Job hierarchy. Use `CoroutineExceptionHandler` for top-level coroutines, or `try/catch` inside `suspend` functions. `SupervisorJob` prevents one child's failure from cancelling siblings.

```kotlin
// CoroutineExceptionHandler — for launch {}
val handler = CoroutineExceptionHandler { _, throwable ->
    Log.e("TAG", "Caught: $throwable")
}

viewModelScope.launch(handler) {
    riskyOperation()
}

// try/catch — for async {} or suspend functions
viewModelScope.launch {
    try {
        val result = async { riskyOperation() }.await()
    } catch (e: Exception) {
        handleError(e)
    }
}

// SupervisorJob — failure of one child doesn't cancel others
val supervisor = SupervisorJob()
val scope = CoroutineScope(Dispatchers.IO + supervisor)
```
</details>

<details>
<summary><strong>What is <code>Channel</code> in Kotlin and how does it differ from Flow?</strong></summary>

A `Channel` is a hot, concurrent communication primitive — like a queue between coroutines. Unlike Flow, it is consumed once (not multicasted) and is stateful.

| | Flow | Channel |
|---|---|---|
| Hot/Cold | Cold | Hot |
| Multicast | Yes (SharedFlow) | No — single consumer |
| Buffering | Operators | Built-in buffer |
| Best for | Data streams | Producer–consumer pipelines |

```kotlin
val channel = Channel<Int>()

launch { channel.send(1); channel.send(2) }
launch { for (value in channel) println(value) }
```
</details>

<details>
<summary><strong>What is <code>callbackFlow</code> and <code>channelFlow</code>?</strong></summary>

- `callbackFlow` — bridges callback-based APIs (e.g., listeners) into a Flow.
- `channelFlow` — allows emitting values from different coroutines within the same flow builder.

```kotlin
fun locationUpdates(): Flow<Location> = callbackFlow {
    val callback = object : LocationCallback() {
        override fun onLocationResult(result: LocationResult) {
            trySend(result.lastLocation)
        }
    }
    fusedClient.requestLocationUpdates(request, callback, Looper.getMainLooper())
    awaitClose { fusedClient.removeLocationUpdates(callback) }
}
```
</details>

<details>
<summary><strong>What are Flow operators you commonly use?</strong></summary>

| Operator | Purpose |
|---|---|
| `map` | Transform each emission |
| `filter` | Emit only matching values |
| `flatMapLatest` | Cancel previous flow on new emission |
| `flatMapMerge` | Run all inner flows concurrently |
| `combine` | Combine latest values from two flows |
| `zip` | Pair emissions one-by-one |
| `debounce` | Emit only after idle period (search input) |
| `distinctUntilChanged` | Skip duplicate consecutive emissions |
| `catch` | Handle upstream exceptions |
| `onEach` | Side effects without transforming |
| `stateIn` | Convert cold flow to StateFlow |
| `shareIn` | Convert cold flow to SharedFlow |

```kotlin
searchQuery
    .debounce(300)
    .distinctUntilChanged()
    .flatMapLatest { query -> repository.search(query) }
    .catch { emit(emptyList()) }
    .collect { results -> showResults(results) }
```
</details>

---

## Android Architecture

<details>
<summary><strong>What is Clean Architecture in Android?</strong></summary>

Clean Architecture separates the codebase into independent layers, each with a clear responsibility. The dependency rule states that inner layers know nothing about outer layers.

```
UI Layer  →  Domain Layer  →  Data Layer
(View, ViewModel)  (UseCases, Entities)  (Repository impl, API, DB)
```

- **UI Layer** — Activities, Fragments, ViewModels, UI state
- **Domain Layer** — Business logic. Pure Kotlin, no Android dependencies. Contains `UseCases` and `Entities`.
- **Data Layer** — Repository implementations, API services, Room DAOs, data models
</details>

<details>
<summary><strong>What is a UseCase (Interactor)?</strong></summary>

A UseCase encapsulates a single business operation. It sits in the domain layer, depends only on repository interfaces (not implementations), and is called by the ViewModel.

```kotlin
// Domain layer — pure Kotlin
class GetUserUseCase(private val repository: UserRepository) {
    suspend operator fun invoke(id: String): User {
        return repository.getUser(id)
    }
}

// ViewModel
class UserViewModel(private val getUser: GetUserUseCase) : ViewModel() {
    fun loadUser(id: String) {
        viewModelScope.launch {
            val user = getUser(id)
            _uiState.value = UiState.Success(user)
        }
    }
}
```
</details>

<details>
<summary><strong>What is the Repository Pattern?</strong></summary>

The Repository provides a clean API for data access and hides the details of where data comes from (network, cache, DB). The ViewModel/UseCase interacts only with the repository interface.

```kotlin
// Domain layer — interface
interface UserRepository {
    suspend fun getUser(id: String): User
}

// Data layer — implementation
class UserRepositoryImpl(
    private val api: UserApi,
    private val dao: UserDao
) : UserRepository {
    override suspend fun getUser(id: String): User {
        val cached = dao.getUser(id)
        if (cached != null) return cached.toDomain()
        val remote = api.fetchUser(id)
        dao.insert(remote.toEntity())
        return remote.toDomain()
    }
}
```
</details>

<details>
<summary><strong>What is MVI Architecture?</strong></summary>

MVI (Model–View–Intent) is a unidirectional data flow architecture where:

- **Model** — immutable UI state
- **View** — renders state and emits user intents
- **Intent** — user actions (not Android Intent)

```
User Action → Intent → ViewModel → State → UI
```

```kotlin
// State — immutable
data class LoginState(
    val isLoading: Boolean = false,
    val error: String? = null,
    val isLoggedIn: Boolean = false
)

// Intent — sealed class
sealed class LoginIntent {
    data class Login(val email: String, val pass: String) : LoginIntent()
    object Logout : LoginIntent()
}

// ViewModel
fun handleIntent(intent: LoginIntent) {
    when (intent) {
        is LoginIntent.Login -> login(intent.email, intent.pass)
        LoginIntent.Logout   -> logout()
    }
}
```

**MVI vs MVVM:**

| | MVVM | MVI |
|---|---|---|
| State | Multiple LiveData/StateFlow fields | Single immutable state object |
| Data flow | Bidirectional (two-way binding possible) | Strictly unidirectional |
| Predictability | Moderate | High — state is always reproducible |
| Complexity | Lower | Higher boilerplate |
</details>

<details>
<summary><strong>What is the difference between <code>ViewModel</code> and <code>AndroidViewModel</code>?</strong></summary>

`AndroidViewModel` is a subclass of `ViewModel` that holds a reference to the `Application` context. Use it only when you need application context (e.g., accessing system services). Avoid it when possible — prefer injecting context via Hilt.

```kotlin
class MyViewModel(application: Application) : AndroidViewModel(application) {
    fun getAppName() = getApplication<Application>().getString(R.string.app_name)
}
```
</details>

<details>
<summary><strong>What is <code>SavedStateHandle</code>?</strong></summary>

`SavedStateHandle` is a key-value map that survives both configuration changes and process death. Inject it into ViewModels to persist critical UI state.

```kotlin
class SearchViewModel(private val savedState: SavedStateHandle) : ViewModel() {
    val query = savedState.getStateFlow("query", "")

    fun onQueryChanged(q: String) {
        savedState["query"] = q
    }
}
```
</details>

---

## Dependency Injection with Hilt

<details>
<summary><strong>What is Hilt and how does it work?</strong></summary>

Hilt is Android's recommended DI library built on top of Dagger. It generates DI components at compile time, eliminating runtime reflection. Annotate your `Application` class with `@HiltAndroidApp` to set it up.

```kotlin
@HiltAndroidApp
class MyApp : Application()

@AndroidEntryPoint
class MainActivity : AppCompatActivity()

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repo: UserRepository
) : ViewModel()
```
</details>

<details>
<summary><strong>What are Hilt Scopes?</strong></summary>

Scopes control how long a dependency lives.

| Annotation | Lifetime |
|---|---|
| `@Singleton` | Entire app lifetime |
| `@ActivityRetainedScoped` | Survives rotation, dies with Activity |
| `@ViewModelScoped` | Tied to ViewModel lifetime |
| `@ActivityScoped` | Tied to Activity lifetime |
| `@FragmentScoped` | Tied to Fragment lifetime |

```kotlin
@Singleton
class AnalyticsService @Inject constructor() { }

@ViewModelScoped
class SearchRepository @Inject constructor(private val api: SearchApi) { }
```
</details>

<details>
<summary><strong>What are Hilt Modules and <code>@Provides</code> vs <code>@Binds</code>?</strong></summary>

- `@Provides` — used when you don't own the class (e.g., Retrofit, Room) or need manual construction.
- `@Binds` — used to bind an interface to its implementation. More efficient (no generated wrapper).

```kotlin
@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .build()
}

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindUserRepository(impl: UserRepositoryImpl): UserRepository
}
```
</details>

<details>
<summary><strong>What are <code>@Qualifiers</code> in Hilt?</strong></summary>

Qualifiers distinguish between multiple bindings of the same type.

```kotlin
@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class AuthInterceptorOkHttp

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class LoggingInterceptorOkHttp

@Provides @AuthInterceptorOkHttp
fun provideAuthOkHttp(): OkHttpClient = OkHttpClient.Builder()
    .addInterceptor(AuthInterceptor())
    .build()

@Provides @LoggingInterceptorOkHttp
fun provideLoggingOkHttp(): OkHttpClient = OkHttpClient.Builder()
    .addInterceptor(HttpLoggingInterceptor())
    .build()
```
</details>

---

## Networking (Advanced)

<details>
<summary><strong>What are OkHttp Interceptors?</strong></summary>

Interceptors intercept and modify HTTP requests/responses. Two types:

- **Application Interceptors** — see the original request; run once.
- **Network Interceptors** — see the network-level request/response including redirects.

```kotlin
class AuthInterceptor(private val tokenProvider: TokenProvider) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request().newBuilder()
            .addHeader("Authorization", "Bearer ${tokenProvider.getToken()}")
            .build()
        return chain.proceed(request)
    }
}

val client = OkHttpClient.Builder()
    .addInterceptor(AuthInterceptor(tokenProvider))
    .addInterceptor(HttpLoggingInterceptor().apply { level = Level.BODY })
    .build()
```
</details>

<details>
<summary><strong>What is Certificate Pinning?</strong></summary>

Certificate Pinning ensures the app only trusts a specific server certificate or public key, protecting against man-in-the-middle attacks even if a rogue CA is compromised.

```kotlin
val certificatePinner = CertificatePinner.Builder()
    .add("api.example.com", "sha256/AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA=")
    .build()

val client = OkHttpClient.Builder()
    .certificatePinner(certificatePinner)
    .build()
```

> Rotate pins carefully — if the server certificate changes and the pin is not updated, the app will break.
</details>

<details>
<summary><strong>What are Retrofit Caching Strategies?</strong></summary>

HTTP caching is handled by OkHttp. Set a `Cache` on the client and control behavior via headers or a custom interceptor.

```kotlin
val cache = Cache(context.cacheDir, 10 * 1024 * 1024) // 10 MB

// Force network or cache via interceptor
val offlineInterceptor = Interceptor { chain ->
    var request = chain.request()
    if (!isNetworkAvailable()) {
        request = request.newBuilder()
            .header("Cache-Control", "public, only-if-cached, max-stale=${60 * 60 * 24}")
            .build()
    }
    chain.proceed(request)
}

val client = OkHttpClient.Builder()
    .cache(cache)
    .addInterceptor(offlineInterceptor)
    .build()
```
</details>

<details>
<summary><strong>What is the difference between <code>@GET</code> and <code>@POST</code> in Retrofit? Common annotations?</strong></summary>

| Annotation | Purpose |
|---|---|
| `@GET` | Read data |
| `@POST` | Submit data (body) |
| `@PUT` | Replace a resource |
| `@PATCH` | Partially update a resource |
| `@DELETE` | Delete a resource |
| `@Path` | Replace URL segment |
| `@Query` | Append query parameter |
| `@Body` | Send object as JSON body |
| `@Header` | Add a single header |
| `@Multipart` / `@Part` | File uploads |

```kotlin
interface UserApi {
    @GET("users/{id}")
    suspend fun getUser(@Path("id") id: String): User

    @GET("users")
    suspend fun searchUsers(@Query("name") name: String): List<User>

    @POST("users")
    suspend fun createUser(@Body user: CreateUserRequest): User

    @Multipart
    @POST("upload")
    suspend fun uploadPhoto(@Part photo: MultipartBody.Part): UploadResponse
}
```
</details>

---

## Jetpack Compose

<details>
<summary><strong>What is recomposition and how do you minimize unnecessary recompositions?</strong></summary>

Recomposition is when Compose re-executes a composable because its state changed. It is efficient by design (skips unchanged composables), but can be costly if triggered too often.

Tips to minimize:
- Use `remember` to avoid recomputing values
- Use `derivedStateOf` when state derivations are expensive
- Use stable/immutable data classes (`@Stable`, `@Immutable`)
- Avoid reading unstable state at a high level in the tree
- Use `key()` in `LazyColumn` to help Compose identify items

```kotlin
// Bad — lambda captures unstable reference, causes recomposition
@Composable
fun Item(list: List<String>) {
    list.forEach { Text(it) }
}

// Good — stable input
@Immutable
data class ItemState(val items: List<String>)

@Composable
fun Item(state: ItemState) {
    state.items.forEach { Text(it) }
}
```
</details>

<details>
<summary><strong>What is the difference between <code>remember</code> and <code>rememberSaveable</code>?</strong></summary>

| | `remember` | `rememberSaveable` |
|---|---|---|
| Survives recomposition | Yes | Yes |
| Survives config change (rotation) | No | Yes |
| Survives process death | No | Yes (if type is saveable) |

```kotlin
var count by remember { mutableStateOf(0) }             // lost on rotation
var name by rememberSaveable { mutableStateOf("") }     // survives rotation
```
</details>

<details>
<summary><strong>What are Compose Side Effects?</strong></summary>

Side effects are operations that escape the composable scope (e.g., launching a coroutine, registering a listener). Compose provides structured APIs for them.

| API | When to use |
|---|---|
| `LaunchedEffect(key)` | Launch a coroutine tied to a composable's lifecycle; re-launches when key changes |
| `SideEffect` | Sync Compose state to non-Compose code on every successful recomposition |
| `DisposableEffect(key)` | Register/unregister listeners; cleanup runs when key changes or composable leaves |
| `rememberCoroutineScope` | Get a scope to launch coroutines in response to user events (button clicks) |
| `produceState` | Convert non-Compose state (Flow, callback) into Compose state |
| `derivedStateOf` | Derive state from other state — only recomposes when the derived value changes |

```kotlin
// LaunchedEffect — fetch on screen enter or userId change
LaunchedEffect(userId) {
    val user = viewModel.fetchUser(userId)
    // update state
}

// DisposableEffect — register/unregister lifecycle observer
DisposableEffect(lifecycleOwner) {
    val observer = LifecycleEventObserver { _, event -> handleEvent(event) }
    lifecycleOwner.lifecycle.addObserver(observer)
    onDispose { lifecycleOwner.lifecycle.removeObserver(observer) }
}

// derivedStateOf — avoid recomposing parent when only derived value matters
val isScrolled by remember { derivedStateOf { listState.firstVisibleItemIndex > 0 } }
```
</details>

<details>
<summary><strong>What is State hoisting in Compose?</strong></summary>

State hoisting moves state up to the caller so a composable becomes stateless and reusable. The pattern is: pass value down, pass event (lambda) up.

```kotlin
// Stateful (not reusable)
@Composable
fun SearchBar() {
    var query by remember { mutableStateOf("") }
    TextField(value = query, onValueChange = { query = it })
}

// Stateless (hoisted — reusable and testable)
@Composable
fun SearchBar(query: String, onQueryChange: (String) -> Unit) {
    TextField(value = query, onValueChange = onQueryChange)
}
```
</details>

<details>
<summary><strong>What is <code>CompositionLocal</code>?</strong></summary>

`CompositionLocal` implicitly passes data down the composition tree without explicit parameter passing. Built-in examples include `LocalContext`, `LocalDensity`, `MaterialTheme`.

```kotlin
val LocalUserSession = compositionLocalOf<UserSession> { error("No session") }

// Provide at a high level
CompositionLocalProvider(LocalUserSession provides session) {
    HomeScreen()
}

// Consume anywhere below
@Composable
fun ProfileBadge() {
    val session = LocalUserSession.current
    Text(session.userName)
}
```
</details>

<details>
<summary><strong>What is <code>Modifier</code> in Compose and how does order matter?</strong></summary>

`Modifier` is a chain of transformations applied to a composable. Order matters because each modifier operates on the result of the previous one.

```kotlin
// Different results:
Box(Modifier.padding(16.dp).background(Color.Red))   // padding outside background
Box(Modifier.background(Color.Red).padding(16.dp))   // padding inside background (red area is larger)
```
</details>

---

## Performance & Memory

<details>
<summary><strong>What is a Memory Leak in Android? Common causes?</strong></summary>

A memory leak occurs when an object is no longer needed but is still referenced, preventing garbage collection.

Common causes:

| Cause | Example |
|---|---|
| Static reference to Context | `static Activity context` |
| Anonymous inner class / listener | Holding Activity reference in a callback |
| Unregistered BroadcastReceiver / Listener | Registered in `onStart`, forgotten in `onStop` |
| Non-cancelled coroutines | Coroutine holding View reference after Fragment detach |
| Bitmap not recycled (pre-API 26) | Large Bitmaps in long-lived objects |

Detection: **LeakCanary** automatically detects and reports leaks in debug builds.

```kotlin
// Common fix — use WeakReference for callbacks
class MyCallback(activity: MainActivity) {
    private val ref = WeakReference(activity)
    fun onResult() { ref.get()?.updateUI() }
}

// Or cancel coroutines properly
viewModelScope.launch { } // auto-cancelled when ViewModel is cleared
```
</details>

<details>
<summary><strong>What is <code>StrictMode</code> in Android?</strong></summary>

`StrictMode` is a developer tool that detects and reports accidental disk/network access on the main thread and other violations, failing fast during development.

```kotlin
// In Application.onCreate() or Activity.onCreate() — debug builds only
if (BuildConfig.DEBUG) {
    StrictMode.setThreadPolicy(
        StrictMode.ThreadPolicy.Builder()
            .detectDiskReads()
            .detectDiskWrites()
            .detectNetwork()
            .penaltyLog()
            .build()
    )
    StrictMode.setVmPolicy(
        StrictMode.VmPolicy.Builder()
            .detectLeakedSqlLiteObjects()
            .detectLeakedClosableObjects()
            .penaltyLog()
            .build()
    )
}
```
</details>

<details>
<summary><strong>What are Baseline Profiles?</strong></summary>

Baseline Profiles are a list of critical code paths provided to the Android Runtime (ART) ahead of time, allowing it to pre-compile them on install rather than at runtime. This improves startup time and reduces jank for commonly used flows.

- Defined in `src/main/baseline-prof.txt` or generated using `BaselineProfileRule` in a Macrobenchmark test.
- Supported from Android 7 (via Play) and Android 9+ (device-local).

```kotlin
// Generate with Macrobenchmark
@RunWith(AndroidJUnit4::class)
class BaselineProfileGenerator {
    @get:Rule
    val rule = BaselineProfileRule()

    @Test
    fun generate() = rule.collect("com.example.app") {
        pressHome()
        startActivityAndWait()
        // interact with critical paths
    }
}
```
</details>

<details>
<summary><strong>How do you optimize App Startup time?</strong></summary>

- Use `App Startup` library to initialize libraries lazily and control order.
- Defer non-critical initialization out of `Application.onCreate()`.
- Avoid synchronous I/O on the main thread at startup (use Baseline Profiles, splash screen).
- Use `Lazy` initialization for heavy singletons.
- Profile with **Android Studio App Inspection** or `reportFullyDrawn()`.

```kotlin
// App Startup — lazy initializer
class TimberInitializer : Initializer<Unit> {
    override fun create(context: Context) {
        if (BuildConfig.DEBUG) Timber.plant(Timber.DebugTree())
    }
    override fun dependencies() = emptyList<Class<Initializer<*>>>()
}
```
</details>

<details>
<summary><strong>What is the difference between <code>onTrimMemory()</code> and <code>onLowMemory()</code>?</strong></summary>

| | `onLowMemory()` | `onTrimMemory(level)` |
|---|---|---|
| API level | All | 14+ |
| Granularity | Binary (low or not) | Levels (RUNNING_LOW, BACKGROUND, etc.) |
| Called when | System is critically low | Multiple levels before and after backgrounding |

```kotlin
override fun onTrimMemory(level: Int) {
    if (level >= ComponentCallbacks2.TRIM_MEMORY_MODERATE) {
        imageCache.clear()
    }
}
```
</details>

---

## Testing (Advanced)

<details>
<summary><strong>What is the difference between Unit, Integration, and UI tests?</strong></summary>

| Type | Scope | Speed | Tools |
|---|---|---|---|
| Unit test | Single class / function | Fast | JUnit5, MockK |
| Integration test | Multiple classes / layers | Medium | Robolectric, Hilt test |
| UI / Instrumentation test | Full app on device | Slow | Espresso, Compose UI test, UI Automator |

The **Testing Pyramid**: many unit tests → fewer integration tests → few UI tests.
</details>

<details>
<summary><strong>How do you unit test a ViewModel with coroutines?</strong></summary>

Use `TestCoroutineDispatcher` / `UnconfinedTestDispatcher` and `turbine` for Flow testing.

```kotlin
@OptIn(ExperimentalCoroutinesApi::class)
class UserViewModelTest {

    @get:Rule
    val mainDispatcherRule = MainDispatcherRule() // replaces Main dispatcher

    private val repository = mockk<UserRepository>()
    private lateinit var viewModel: UserViewModel

    @Before
    fun setup() {
        viewModel = UserViewModel(repository)
    }

    @Test
    fun `loadUser emits success state`() = runTest {
        coEvery { repository.getUser("1") } returns User("John")

        viewModel.loadUser("1")

        assertEquals(UiState.Success(User("John")), viewModel.uiState.value)
    }
}

// MainDispatcherRule
class MainDispatcherRule : TestWatcher() {
    val dispatcher = UnconfinedTestDispatcher()
    override fun starting(d: Description) { Dispatchers.setMain(dispatcher) }
    override fun finished(d: Description) { Dispatchers.resetMain() }
}
```
</details>

<details>
<summary><strong>What is MockK and how is it used?</strong></summary>

MockK is a Kotlin-first mocking library. It supports coroutines, extension functions, objects, and companion objects — things Mockito struggles with.

```kotlin
// Mock a class
val repo = mockk<UserRepository>()

// Stub a suspend function
coEvery { repo.getUser("1") } returns User("John")

// Verify a call was made
coVerify(exactly = 1) { repo.getUser("1") }

// Stub and throw
coEvery { repo.getUser("bad") } throws IOException("Network error")

// Relaxed mock — returns defaults for unstubbed calls
val repo = mockk<UserRepository>(relaxed = true)
```
</details>

<details>
<summary><strong>What is Turbine and how do you test Flows with it?</strong></summary>

Turbine is a library for testing Kotlin Flows concisely. It provides `test {}` extension that lets you assert emitted values in order.

```kotlin
@Test
fun `search emits results`() = runTest {
    coEvery { repo.search("Kotlin") } returns listOf(Result("Kotlin book"))

    viewModel.onSearch("Kotlin")

    viewModel.results.test {
        assertEquals(listOf(Result("Kotlin book")), awaitItem())
        cancelAndIgnoreRemainingEvents()
    }
}
```
</details>

<details>
<summary><strong>How do you write UI tests with Jetpack Compose?</strong></summary>

```kotlin
@get:Rule
val composeRule = createComposeRule()

@Test
fun loginButton_isDisabled_whenFieldsEmpty() {
    composeRule.setContent { LoginScreen(viewModel) }

    composeRule.onNodeWithText("Login").assertIsNotEnabled()
}

@Test
fun loginButton_isEnabled_afterInput() {
    composeRule.setContent { LoginScreen(viewModel) }

    composeRule.onNodeWithTag("emailField").performTextInput("a@b.com")
    composeRule.onNodeWithTag("passwordField").performTextInput("pass")

    composeRule.onNodeWithText("Login").assertIsEnabled()
}
```
</details>

<details>
<summary><strong>What is Hilt testing support?</strong></summary>

Hilt provides `@HiltAndroidTest` and `HiltTestApplication` to replace production modules with test fakes.

```kotlin
@HiltAndroidTest
@RunWith(AndroidJUnit4::class)
class HomeFragmentTest {

    @get:Rule
    val hiltRule = HiltAndroidRule(this)

    @BindValue
    val fakeRepo: UserRepository = FakeUserRepository()

    @Test
    fun displaysUserName() {
        // launch fragment, assert UI
    }
}
```
</details>
