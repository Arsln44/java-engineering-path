
# ☕ Java Engineering Path: The Master Plan

## 00 - Environment Setup (Ortam Kurulumu)

Java Nedir ve Neden Kullanılır
JVM, JDK, JRE Kavramları ve Farkları
JDK Kurulum Rehberi (Windows/Mac/Linux)
JAVA_HOME ve PATH Ortam Değişkenleri
Java Çalışma Mantığı (Derleme ve Çalıştırma Süreci)
İlk Kurulum Doğrulama

## 01 - First Code (İlk Kod)

Hello World Programı
Hello World Kod Analizi (public, class, static, void, main)
Değişkenler ve Veri Tipleri
Primitive Types (int, double, boolean, char, long, float, byte, short)
Reference Types ve String
Primitive vs Reference Type Farkı
Naming Conventions
Operatörler ve İfadeler
Aritmetik Operatörler
Karşılaştırma Operatörleri
Mantıksal Operatörler
Atama Operatörleri
Konsol Giriş/Çıkış İşlemleri
Scanner Sınıfı Kullanımı

## 02 - Control Flow (Kontrol Yapıları)

Koşullu İfadeler (if, else if, else)
Nested if Yapıları
Ternary Operator
Boolean Logic ve Truth Tables
Switch-Case Yapısı
Switch Syntax ve break Kullanımı
default Case
Döngüler (Loops)
while Loop
do-while Loop
for Loop
break ve continue
Döngü Seçimi ve Kullanım Senaryoları
İç İçe Döngüler (Nested Loops)

## 03 - Methods (Metotlar)

Metot Tanımlama ve Syntax
Metot Parametreleri ve Return Types
void Metotlar
DRY Prensibi (Don't Repeat Yourself)
Modülerlik Kavramı
Method Overloading
Overloading Kuralları
Scope ve Lifetime
Local Variables
Method Scope
Block Scope
Recursion (Özyineleme)
Base Case ve Recursive Case
Recursion vs Iteration

## 04 - Arrays (Diziler)

Tek Boyutlu Diziler
Dizi Tanımlama ve Initialization
Index Mantığı (0-based)
Length Property
Dizi Neden Gerekli
Dizi İşlemleri
Döngü ile Dizi Gezme
Eleman Ekleme/Silme Mantığı
Linear Search
Bubble Sort (Basit Sıralama)
Çok Boyutlu Diziler
2D Array (Matrix)
Matrix İşlemleri
foreach Loop (Enhanced for Loop)

## 05 - OOP Basics (OOP Temelleri)

Nesne Yönelimli Programlamaya Giriş
Prosedürel vs OOP
Gerçek Dünyayı Modelleme
Class ve Object Kavramları
Class = Blueprint, Object = Instance
Fields (Attributes)
Methods (Behaviors)
Constructor'lar
new Keyword
Encapsulation (Kapsülleme)
Information Hiding
Access Modifiers (public, private, protected, default)
Getter/Setter Metotları
Validation Logic
Constructor'lar Derinlemesine
Default Constructor
Parametreli Constructor
Constructor Overloading
this Keyword
Constructor vs Method Farkı
Static Keyword
Static Fields (Class Variables)
Static Methods
Static vs Instance
Utility Classes

## 06 - Inheritance (Kalıtım)

Kalıtım Temelleri
"is-a" İlişkisi
Code Reusability
Superclass ve Subclass
extends Keyword
Inherited Members
Method Overriding
@Override Annotation
Parent Method'u Ezmek
super Keyword
Overloading vs Overriding Farkı
Constructor Chaining
super() Çağrısı
Constructor Execution Order
Object Sınıfı
Her Sınıf Object'ten Türer
toString() Metodu
equals() Metodu

## 07 - Polymorphism (Çok Biçimlilik)

Polymorphism Kavramı
"Bir Nesne Birden Fazla Şekil Alabilir"
Compile-time vs Runtime Polymorphism
Dynamic Method Dispatch
Upcasting ve Downcasting
Implicit Upcasting
Explicit Downcasting
instanceof Operator
Polymorphic Arrays
Polymorphism Kullanım Senaryoları

## 08 - Abstraction (Soyutlama)

Abstraction Nedir
Soyutlama Neden Gerekli
Abstract vs Concrete
Abstract Class
abstract Keyword
Abstract Methods
Concrete Methods
Abstract Class Kuralları
Interface
Interface = Contract
Multiple Inheritance Problemi Çözümü
interface Keyword
Method Signatures
implements Keyword
Multiple Interface Implementation
Default Methods (Java 8+)
Static Methods in Interfaces
Abstract Class vs Interface
Hangi Durumda Hangisi
Karar Ağacı

## 09 - SOLID Principles (SOLID Prensipleri)

Single Responsibility Principle (SRP)
Bir Sınıf Tek Sorumluluk
Kötü Tasarım → İyi Tasarım Refactoring
Open/Closed Principle (OCP)
Extension'a Açık, Modification'a Kapalı
Strategy Pattern ile Çözüm
Liskov Substitution Principle (LSP)
Child, Parent'ın Yerine Geçebilmeli
LSP İhlali Örnekleri
Interface Segregation Principle (ISP)
Fat Interface Problemi
Küçük ve Özelleşmiş Interface'ler
Dependency Inversion Principle (DIP)
Abstraction'a Bağımlı Ol
Concrete'e Değil

## 10 - Strings (String İşlemleri)

String Temelleri
String Immutability
String Pool Kavramı
String Creation (Literal vs new)
String Concatenation
String Metotları
length(), charAt(), substring()
toUpperCase(), toLowerCase(), trim()
contains(), startsWith(), endsWith()
split(), replace()
String Manipulation Exercises
StringBuilder ve StringBuffer
String vs StringBuilder Performance
Mutable String
StringBuilder vs StringBuffer Farkı
String Algoritmaları
Reverse String
Palindrome Check
String Formatting

## 11 - Exception Handling (Hata Yönetimi)

Exception Temelleri
Error vs Exception
Checked vs Unchecked Exceptions
try-catch-finally Syntax
Exception Mesajları
Exception Hiyerarşisi
Throwable → Error / Exception
Common Exceptions (NullPointer, ArrayIndexOutOfBounds, vb.)
throw ve throws
throw Keyword ile Exception Fırlatma
throws Keyword ile Declare Etme
throw vs throws Farkı
Custom Exceptions
Kendi Exception Sınıfımızı Yazmak
Exception Best Practices
try-with-resources (Java 7+)
AutoCloseable Interface
Resource Management

## 12 - Collections Framework

Collections'a Giriş
Collection Hierarchy
List, Set, Map, Queue
Iterable ve Iterator Interface
Iterator Pattern
List Interface
ArrayList
LinkedList
ArrayList vs LinkedList Performance
List Use Cases
Set Interface
HashSet
TreeSet
LinkedHashSet
Set Implementations Karşılaştırması
Set Use Cases
Map Interface
HashMap
TreeMap
LinkedHashMap
Map Implementations Karşılaştırması
Map Use Cases
Queue ve Deque
Queue Interface (FIFO)
Deque Interface (Double-ended Queue)
PriorityQueue
Comparable ve Comparator
Natural Ordering
Custom Ordering
Comparator Chaining
Sorting Strategies
Collections Utility Class
sort(), reverse(), shuffle()
binarySearch()
Collections Algorithms

## 13 - Generics (Tip Güvenliği)

Generics Temelleri
Type Safety Neden Önemli
Casting Problemleri
Generic Class Yazma
```<T>``` Syntax
Type Parameters
Generic Metotlar
Generic Methods Syntax
Type Inference
Bounded Type Parameters
```<T extends Number>``` Upper Bounds
```<T super Integer>``` Lower Bounds
Wildcards
```<?>``` Unbounded Wildcard
```<? extends T>``` Upper Bounded Wildcard
```<? super T>``` Lower Bounded Wildcard
Type Erasure
Runtime'da Generic Bilgisi Silinir
Type Erasure Limitations
Generics Best Practices

## 14 - File I/O (Dosya İşlemleri)

File ve Path
File Class
exists(), isFile(), isDirectory()
createNewFile(), mkdir()
Absolute vs Relative Path
Byte Streams
FileInputStream, FileOutputStream
Binary File Okuma/Yazma
Byte vs Character Streams
Character Streams
FileReader, FileWriter
Text File Okuma/Yazma
BufferedReader, BufferedWriter
Buffer Kullanımı ve Performance
Modern File I/O (NIO.2)
Files Class (Java 7+)
Files.readAllLines(), Files.write()
Path API
NIO.2 Avantajları
Serialization
Serialization Nedir
Object Persistence
Serializable Interface
ObjectInputStream, ObjectOutputStream
Serialization Best Practices

## 15 - Modern Java Features (Java 8+)

Lambda Expressions
Lambda Nedir
Anonymous Functions
Functional Programming'e Giriş
Lambda Syntax
Lambda ile Runnable, Comparator
Functional Interfaces
SAM (Single Abstract Method)
@FunctionalInterface Annotation
Built-in Functional Interfaces
Predicate, Function, Consumer, Supplier
Method References (::)
Stream API
Stream Philosophy
Declarative Programming
Internal vs External Iteration
Stream Basics
stream() Metodu
Intermediate Operations (filter, map, sorted)
Terminal Operations (collect, forEach, reduce)
Lazy Evaluation
Stream İleri Seviye
flatMap()
Collectors Class (groupingBy, partitioningBy)
Parallel Streams
Parallel Streams Dikkat Noktaları
Optional
Null Reference Problem (Billion Dollar Mistake)
Optional.of(), Optional.empty()
isPresent(), ifPresent()
orElse(), orElseThrow()
Optional Best Practices
Date/Time API (Java 8)
Old Date API Problemleri
LocalDate, LocalTime, LocalDateTime
ZonedDateTime
Period ve Duration
Date/Time Formatting

## 16 - Testing (Test Yazma)

Testing'e Giriş
Neden Test Yazarız
Manual vs Automated Testing
Test Pyramid
TDD Felsefesi (Red-Green-Refactor)
JUnit 5 Temelleri
JUnit 5 Kurulum
@Test Annotation
Assertions (assertEquals, assertTrue, assertThrows)
@BeforeEach, @AfterEach
Test Lifecycle
Test Yazma Stratejileri
Test Naming Conventions
Given-When-Then Pattern
AAA Pattern (Arrange-Act-Assert)
Parameterized Tests
@DisplayName
Mocking ile Test
Test Doubles (Dummy, Stub, Mock, Spy, Fake)
Mockito Temelleri
@Mock, @InjectMocks
when().thenReturn()
verify()
Mockito Best Practices
Test Coverage
Code Coverage Nedir
JaCoCo Integration
Coverage Metrics Yorumlama

## 17 - Maven (Build Tool)

Maven'e Giriş
Build Tool Neden Gerekli
Manual Build Problemleri
Dependency Hell
Maven Kurulum
POM (Project Object Model)
pom.xml Anatomisi
groupId, artifactId, version
Dependencies
Plugins
Maven Lifecycle
clean, compile, test, package, install, deploy
Maven Phases
Dependency Management
Dependency Scope (compile, test, provided, runtime)
Transitive Dependencies
Dependency Exclusions
Maven Repositories
Local, Central, Remote Repositories
Multi-Module Projects
Multi-Module Neden
Parent-Child POM Yapısı
Module Dependencies

## 18 - Design Patterns - Creational (Yaratıcı Kalıplar)

Design Patterns'e Giriş
Gang of Four (GoF)
Pattern Kategorileri
Anti-patterns
Singleton Pattern
Singleton Philosophy
Tek Instance Garantisi
Eager Singleton
Lazy Singleton
Thread-Safe Singleton
Singleton Caveats (Serialization, Reflection)
Factory Method Pattern
Factory Method Nedir
Nesne Yaratma Sorumluluğu Delegasyonu
Factory vs Constructor
Abstract Factory Pattern
Abstract Factory Nedir
Factory of Factories
Abstract Factory Use Cases
Builder Pattern
Builder Philosophy
Fluent API
Telescoping Constructor Problemi
Builder Implementation
Lombok Builder Comparison
Prototype Pattern
Prototype Nedir
Cloning Objects
Shallow vs Deep Copy
Object Pool Pattern
Object Pool Nedir
Pool Management

## 19 - Design Patterns - Structural (Yapısal Kalıplar)

Adapter Pattern
Adapter Nedir
Interface Uyumsuzluğu Çözümü
Adapter Use Cases
Decorator Pattern
Decorator Philosophy
Runtime'da Fonksiyonalite Ekleme
Inheritance vs Decorator
Java I/O Streams Örneği
Facade Pattern
Facade Nedir
Karmaşık Sistemi Basitleştirme
Facade Use Cases
Proxy Pattern
Proxy Types (Virtual, Protection, Remote)
Lazy Loading
Access Control
Proxy vs Decorator
Composite Pattern
Composite Nedir
Tree Structure
Part-Whole Hierarchy
Bridge Pattern
Bridge Nedir
Abstraction vs Implementation
Flyweight Pattern
Flyweight Nedir
Object Sharing
Memory Optimization

## 20 - Design Patterns - Behavioral (Davranışsal Kalıplar)

Strategy Pattern
Strategy Philosophy
Algorithm Seçimi Runtime'da
Strategy vs if-else
Observer Pattern
Observer Event-Driven
Publisher-Subscriber
Observer Use Cases
Command Pattern
Command Nedir
Encapsulate Requests
Undo/Redo Functionality
Template Method Pattern
Template Method Nedir
Algorithm Skeleton
Hook Methods
State Pattern
State Nedir
Object Behavior Değişimi
State Machine
Chain of Responsibility
Chain of Responsibility Nedir
Request Handling Chain
Chain Building
Iterator Pattern
Iterator Nedir
Collection Traversal
Mediator Pattern
Mediator Nedir
Centralized Communication
Memento Pattern
Memento Nedir
State Capture and Restore
Visitor Pattern
Visitor Nedir
Double Dispatch
Interpreter Pattern
Interpreter Nedir
Grammar Representation

## 21 - Concurrency (Eşzamanlılık)

Thread Temelleri
Process vs Thread
Thread Creation (Thread class, Runnable interface)
Lambda ile Thread
Thread Lifecycle
Thread States (NEW, RUNNABLE, BLOCKED, WAITING, TERMINATED)
Thread Synchronization
Race Condition
Thread-Safety Problemleri
synchronized Keyword
synchronized Block
Intrinsic Locks
volatile Keyword
volatile Semantics
Wait, Notify, NotifyAll
Inter-Thread Communication
wait() ve notify() Kullanımı
Producer-Consumer Problem
Locks (java.util.concurrent.locks)
Lock Interface
ReentrantLock
tryLock(), lockInterruptibly()
ReadWriteLock
Executor Framework
Executor Framework Nedir
Thread Pool Yönetimi
ExecutorService
newFixedThreadPool(), newCachedThreadPool()
submit() vs execute()
ScheduledExecutorService
Concurrent Collections
ConcurrentHashMap
BlockingQueue
Thread-Safe Collections
CopyOnWriteArrayList
CompletableFuture
Asynchronous Programming
CompletableFuture API
thenApply(), thenAccept(), thenCompose()
allOf(), anyOf()
Exception Handling in CompletableFuture
Fork/Join Framework
Fork/Join Framework Nedir
Work Stealing
RecursiveTask, RecursiveAction
Atomic Variables
AtomicInteger, AtomicLong
Compare-and-Swap (CAS)
Thread Safety Best Practices

## 22 - Advanced Topics (İleri Seviye Konular)

Reflection API
Reflection Nedir
Runtime Type Inspection
Reflection Use Cases ve Tehlikeleri
Class Object
Method Invocation
Field Access
Reflection Performance
Annotations
Annotation Philosophy
Metadata
Custom Annotation Oluşturma
@interface
Retention, Target
Annotation Processor
Built-in Annotations
Networking
Socket Programming
SocketClient, SocketServer
TCP vs UDP
HttpUrlConnection
HTTP Requests
Java Modules (Java 9+)
Module System
Jigsaw Project
module-info.java
Module Directives (requires, exports)
Records (Java 14+)
Records Nedir
Immutable Data Carriers
Record Components
Sealed Classes (Java 17+)
Sealed Classes Nedir
Restricted Class Hierarchy
permits Keyword
Text Blocks (Java 15+)
Multi-line Strings
Pattern Matching (Java 16+)
Pattern Matching for instanceof
Switch Expressions (Java 14+)
Enhanced Switch

## 23 - JVM Internals (JVM İç Yapısı)

JVM Architecture Deep Dive
JVM Architecture Detaylı
Class Loader Subsystem
Runtime Data Areas (Heap, Stack, Method Area, PC Register, Native Stack)
Execution Engine (Interpreter, JIT Compiler, GC)
Bytecode Analysis
Bytecode Nedir
javap -c Kullanımı
Bytecode Instructions
JVM Instruction Set
Class Loading Mechanism
ClassLoader Hierarchy
Bootstrap, Extension, Application ClassLoader
Delegation Model
Custom ClassLoader
Memory Management Detaylı
Heap Structure
Young Generation (Eden, S0, S1)
Old Generation (Tenured)
Metaspace (Java 8+)
Stack Frame Anatomy
Local Variable Array
Operand Stack
Frame Data
Garbage Collection Algorithms
GC Algorithms Detaylı
Serial GC
Parallel GC
CMS (Concurrent Mark Sweep)
G1 GC
ZGC, Shenandoah
GC Algorithm Seçimi
JIT Compiler
JIT Compilation
C1 Compiler (Client)
C2 Compiler (Server)
Tiered Compilation
Code Cache
Escape Analysis
Escape Analysis Nedir
Scalar Replacement
Lock Elision

## 23A - JVM Diagnostics (JVM Teşhis)

JVM Diagnostic Tools
jstat, jmap, jstack, jcmd, jinfo
Her Tool Ne Zaman Kullanılır
Command-Line Options
Thread Dump Analizi
Thread Dump Nedir
Thread State'leri Detaylı
Deadlock Detection
Thread Contention
Thread Dump Okuma
Heap Dump Analizi
Heap Dump Ne Zaman Alınır
Heap Dump Alma Yöntemleri
MAT (Memory Analyzer Tool) Kullanımı
Dominator Tree
Retained Heap vs Shallow Heap
Leak Suspects
JVM Crash Troubleshooting
hs_err_pid Log Analizi
Native Crash Analizi
SIGSEGV, SIGBUS Errors
Core Dump Analysis
OutOfMemoryError Türleri
OOM Types and Solutions
Heap Space
Metaspace
Direct Buffer Memory
Unable to Create New Native Thread
GC Overhead Limit Exceeded
Her Biri İçin: Sebep → Tespit → Çözüm
JVM Flags Deep Dive
Critical JVM Flags
-XX:+PrintGCDetails
-XX:+HeapDumpOnOutOfMemoryError
-XX:+UseStringDeduplication
-XX:MaxRAMPercentage
Diagnostic Flags
Performance Flags
Flag Kombinasyonları

## 24 - Clean Code (Temiz Kod)

Clean Code Principles
Clean Code Manifesto
Meaningful Names
Functions (Small, Single Responsibility)
Comments (When and When Not)
Code Formatting
Code Smells
Common Code Smells
Long Method
Large Class
Duplicate Code
Feature Envy
Data Clumps
Primitive Obsession
Switch Statements
Lazy Class
Speculative Generality
Refactoring Techniques
Extract Method
Rename Variable
Extract Class
Inline Method
DRY, KISS, YAGNI
Don't Repeat Yourself
Keep It Simple, Stupid
You Aren't Gonna Need It
Boy Scout Rule
Naming Conventions
Java Naming Conventions
Package Naming
Class Naming
Method Naming
Variable Naming
Constant Naming

## 25 - Git and Version Control (Git ve Versiyon Kontrolü)

Git Temelleri
Git Nedir
Version Control Neden
Distributed vs Centralized
Git Kurulum
Git Configuration
Git Basic Commands
git init, add, commit
git status, log
git diff
Working Directory, Staging Area, Repository
Branching ve Merging
Branch Nedir
git branch, checkout, switch
Feature Branch
Merge Strategies
Fast-Forward vs 3-Way Merge
Git Flow
Branching Strategies
Feature, Develop, Release, Hotfix Branches
Git Flow Workflow
Conflict Resolution
Merge Conflicts
Conflict Resolution Strategies
Git Remote
git clone, pull, push
git fetch vs git pull
Remote Branches
GitHub/GitLab Workflow
Fork ve Pull Request
Code Review
Pull Request Best Practices
Git Best Practices
Commit Messages
Conventional Commits (feat, fix, docs, refactor)
Semantic Versioning
MAJOR.MINOR.PATCH
Git Advanced
git rebase
git cherry-pick
git stash
git reset vs revert
.gitignore

## 26 - Architecture Patterns (Mimari Kalıplar)

Layered Architecture
Layered Architecture Nedir
Presentation, Business, Persistence, Database Layers
Layer Separation
3-Tier Architecture
Hexagonal Architecture (Ports & Adapters)
Hexagonal Architecture Nedir
Domain-Centric Design
Ports (Interfaces)
Adapters (Implementations)
Dependency Direction
Clean Architecture
Clean Architecture (Uncle Bob)
Dependency Rule
Entities, Use Cases, Interface Adapters, Frameworks
Clean Architecture Layers
Independence of Frameworks
Domain-Driven Design (DDD) Basics
DDD Introduction
Ubiquitous Language
Bounded Context
DDD Building Blocks
Entity, Value Object
Aggregate, Aggregate Root
Repository
Domain Service
Domain Events
CQRS (Command Query Responsibility Segregation)
CQRS Pattern Nedir
Command vs Query
Write Model vs Read Model
CQRS Benefits and Trade-offs
Event Sourcing
Event Sourcing Nedir
Event Store
Event Replay
Event Sourcing vs Traditional State
Microservices Architecture Basics
Monolith vs Microservices
Microservices Principles
Service Boundaries
Database per Service

## 27 - Performance and Optimization (Performans ve Optimizasyon)

Performance Fundamentals
Performance Basics
Latency vs Throughput
Response Time
Big O Notation (Tekrar)
Performance Metrics
Profiling
Profiling Nedir
CPU Profiling
Memory Profiling
Profiling Tools (JProfiler, YourKit, VisualVM)
Sampling vs Instrumentation
Microbenchmarking (JMH)
JMH Introduction
@Benchmark, @State
Warmup Neden Gerekli
Dead Code Elimination
Constant Folding
JMH Best Practices
Caching Strategies
Caching Patterns
Cache-Aside (Lazy Loading)
Read-Through
Write-Through
Write-Behind
Cache Eviction Policies (LRU, LFU, FIFO)
Caffeine Cache
Ehcache
Database Performance
Connection Pooling
HikariCP
Pool Sizing
N+1 Query Problem
Lazy Loading vs Eager Loading
Code Optimization Techniques
String Concatenation Optimization
Loop Optimization
Object Pooling
Avoiding Unnecessary Object Creation
Collection Performance
Algorithm Complexity

## 27A - Profiling and Performance Analysis (Profiling ve Performans Analizi)

CPU Profiling
CPU Profiling Guide
Sampling vs Instrumentation
Hot Spots Tespit Etme
Call Tree Analizi
CPU Profiling Tools (VisualVM, JProfiler, Async Profiler)
Memory Profiling
Memory Profiling Guide
Allocation Hot Spots
Object Retention Paths
Shallow vs Retained Size
Memory Profiling Tools
Memory Leak Hunting (Step-by-Step)
Java Flight Recorder (JFR)
JFR Production Profiling
Low Overhead Profiling
JFR Event Types
JMC (Mission Control) Kullanımı
JFR Recording
Flame Graphs
Flame Graphs Nedir
CPU Flame Graphs Okuma
Off-CPU Analysis
Flame Graph Generation (async-profiler)
Garbage Collection Analysis
GC Log Analysis
GC Log Okuma
GCEasy.io Kullanımı
STW (Stop-The-World) Pause Analizi
GC Tuning Stratejileri
GC Pause Time vs Throughput
Microbenchmarking Best Practices
JMH Advanced
Warmup ve Measurement
Fork ve Iterations
@State Scope
Common Pitfalls

## 28 - Security (Güvenlik)

Security Fundamentals
OWASP Top 10
Injection (SQL Injection, XSS)
Broken Authentication
Sensitive Data Exposure
XML External Entities (XXE)
Broken Access Control
Security Misconfiguration
Cross-Site Scripting (XSS)
Insecure Deserialization
Using Components with Known Vulnerabilities
Insufficient Logging & Monitoring
Input Validation
Input Validation Strategies
Whitelist vs Blacklist
Sanitization vs Validation
Regular Expressions for Validation
Cryptography Basics
Hashing (SHA-256, bcrypt)
Encryption (Symmetric vs Asymmetric)
AES Encryption
RSA
Secure Coding Practices
Secure Coding Guidelines
Avoid Hardcoded Credentials
Principle of Least Privilege
Secure Password Storage
Security Headers
Dependency Vulnerability Scanning
OWASP Dependency-Check
Snyk
Dependency Security

## 28A - Monitoring and Observability (İzleme ve Gözlemlenebilirlik)

Observability Pillars
Three Pillars of Observability
Logs, Metrics, Traces
Her Biri Ne Zaman Kullanılır
Observability vs Monitoring
Metrics with Micrometer
Micrometer Metrics
Counter, Gauge, Timer, Distribution Summary
Metrics Naming Conventions
Custom Business Metrics
JVM Metrics
Prometheus Integration
Grafana Dashboards
Distributed Tracing
Distributed Tracing Nedir
Trace Context Propagation
Span, Trace ID
OpenTelemetry
Jaeger, Zipkin
Manual Tracing
Auto-Instrumentation
Log Aggregation
ELK Stack (Elasticsearch, Logstash, Kibana)
Structured Logging (JSON)
Logstash Encoder
MDC (Mapped Diagnostic Context)
Correlation ID Pattern
Log Levels Strategy
Kibana Query Language
Application Performance Monitoring (APM)
APM Tools Comparison
New Relic, Dynatrace, AppDynamics, DataDog
APM Metrics
Apdex Score
Transaction Tracing
Health Checks ve Readiness
Health Checks Nedir
Liveness vs Readiness Probes
Dependency Health Checks
Health Check Endpoint Implementation
Alerting Strategies
Alerting Best Practices
Alert Fatigue
SLI, SLO, SLA Kavramları
Actionable Alerts
Alert Routing

## 29 - Final Project (Final Proje)

E-Commerce Backend System
Proje Genel Bakış
Multi-Module Maven Projesi
Clean Architecture
Domain Module
Application Module
Infrastructure Module
Presentation Module
Design Patterns Kullanımı
Factory, Strategy, Observer, Repository
SOLID Prensipleri Uygulaması
Testing Strategy
Unit Tests (JUnit + Mockito)
Integration Tests
Test Coverage
Exception Handling
Custom Exceptions
Global Exception Handler
Logging Strategy
SLF4J + Logback
Structured Logging
File I/O
CSV Import/Export
Collections ve Stream API
Business Logic
Concurrency
Thread-Safe Cart
User Management
Registration/Login
Product Catalog
Product CRUD
Shopping Cart
Cart Operations
Order Management
Order Processing
Payment Processing (Strategy Pattern)
Notification System (Observer Pattern)

## 29A - Database Performance (Veritabanı Performansı)

Query Optimization
Query Optimization Nedir
EXPLAIN PLAN Analizi
Query Execution Plan
Query Rewriting
Index Usage
Index Strategies
Indexing Deep Dive
B-Tree, Hash, Bitmap Indexes
Composite Indexes
Covering Indexes
Index Selectivity
Index Maintenance
When Not to Use Indexes
N+1 Query Problem
N+1 Problem Solutions
Problem Tespiti
Eager vs Lazy Loading
Batch Fetching
JOIN Strategies
Connection Pooling Advanced
HikariCP Tuning
Pool Sizing Formülü
Connection Leak Detection
Statement Caching
Connection Timeout Configuration
Transaction Management
Transaction Isolation Levels
READ_UNCOMMITTED, READ_COMMITTED
REPEATABLE_READ, SERIALIZABLE
Phantom Read, Dirty Read, Non-Repeatable Read
Optimistic vs Pessimistic Locking
Transaction Boundaries
JDBC Batch Processing
Batch Processing Nedir
addBatch(), executeBatch()
Batch Size Optimization
Performance Comparison (Batch vs Single)
Database Connection Best Practices
PreparedStatement vs Statement
ResultSet Types
JDBC Performance Tips

## 30 - Future Learning (Gelecek Öğrenme)

Spring Framework'e Geçiş Hazırlığı
Spring Core Concepts
Dependency Injection Deep Dive
IoC Container
Spring vs Pure Java Comparison
Reactive Programming
Reactive Manifesto
Project Reactor Introduction
Reactive Streams
Backpressure
Microservices Architecture
Monolith vs Microservices
Microservices Patterns
Service Discovery
API Gateway
Circuit Breaker (Resilience4j)
Cloud Native Java
12-Factor App
Containerization Basics
Cloud Platforms (AWS, Azure, GCP)
Sürekli Öğrenme
Learning Resources
Kitaplar (Effective Java, Clean Code, Design Patterns)
Bloglar ve Podcasts
Conference Talks
Online Courses
Open Source Contribution
How to Contribute
Finding Projects
Making Pull Requests

## 30A - Advanced I/O and Networking (İleri Seviye I/O ve Ağ)

NIO (Non-blocking I/O)
NIO vs IO
Blocking vs Non-blocking
Buffer, Channel, Selector
ByteBuffer Kullanımı
SocketChannel, ServerSocketChannel
Selector ile Multiplexing
NIO Echo Server
NIO.2 (Asynchronous I/O)
NIO.2 Async I/O
AsynchronousSocketChannel
AsynchronousFileChannel
CompletionHandler
Async HTTP Client
Memory-Mapped Files
Memory-Mapped Files Nedir
MappedByteBuffer
Use Cases (Large File Processing)
mmap vs Traditional I/O Performance
Zero-Copy Transfer
Zero-Copy Nedir
FileChannel.transferTo()
sendfile() System Call
File Transfer Optimization
HTTP/2 ve gRPC
HTTP/2 Basics
Multiplexing, Server Push
gRPC Introduction
Protocol Buffers
Streaming (Unary, Server, Client, Bidirectional)
WebSocket
WebSocket Protocol
Full-Duplex Communication
WebSocket vs HTTP
WebSocket Chat Application

## 31 - Resilience and Fault Tolerance (Dayanıklılık ve Hata Toleransı)

Retry Pattern
Retry Strategies
Fixed Delay
Exponential Backoff
Jitter
Resilience4j Retry
Retry Configuration
Circuit Breaker Pattern
Circuit Breaker Pattern Nedir
Closed, Open, Half-Open States
Failure Threshold
Circuit Breaker Metrics
Resilience4j CircuitBreaker
Circuit Breaker Demo
Bulkhead Pattern
Bulkhead Isolation
Thread Pool Isolation
Semaphore Isolation
Bulkhead Implementation
Timeout Strategies
Timeout Best Practices
Connection Timeout vs Read Timeout
Cascading Failures Prevention
Timeout Configuration
Fallback Mechanisms
Graceful Degradation
Default Values
Cached Responses
Fallback Examples
Rate Limiting
Rate Limiting Algorithms
Token Bucket
Leaky Bucket
Fixed Window
Sliding Window
Guava RateLimiter
API Rate Limiting
Resilience Patterns Combination
Pattern Combination Strategies
Resilience4j Stack

## 32 - API Design (API Tasarımı)

REST API Principles
REST Constraints
Stateless, Cacheable, Uniform Interface
Richardson Maturity Model
HTTP Methods Correctly
GET, POST, PUT, PATCH, DELETE
Idempotency
Safe Methods
API Versioning
API Versioning Strategies
URI Versioning
Header Versioning
Content Negotiation
Semantic Versioning for APIs
Pagination, Filtering, Sorting
API Query Parameters
Pagination Strategies (Offset, Cursor)
Filtering Best Practices
Sorting
HATEOAS
Error Handling in APIs
API Error Responses
Problem Details (RFC 7807)
Error Codes
Standardized Error Response
API Documentation
OpenAPI Specification
Swagger/OpenAPI 3.0
Swagger Annotations
Swagger UI
API Documentation Best Practices
API Security
API Authentication
Basic Auth, Bearer Token, API Keys
JWT Structure (Header, Payload, Signature)
OAuth 2.0 Flow
Authorization Code, Client Credentials
JWT Validation
API Rate Limiting
CORS (Cross-Origin Resource Sharing)
API Design Best Practices
Resource Naming
URL Structure
HTTP Status Codes
Content Negotiation

## 33 - Code Quality Metrics (Kod Kalitesi Metrikleri)

Cyclomatic Complexity
Complexity Metrics
Cyclomatic Complexity Nedir
Ne Kadar Complexity Kabul Edilebilir
Karmaşık Kodu Refactor Etme
SonarQube Complexity Rules
Code Coverage Realism
Code Coverage Myths
%100 Coverage Hedefi Doğru mu
Meaningful Coverage
Branch Coverage vs Line Coverage
JaCoCo Report Analizi
Mutation Testing
Mutation Testing Nedir
Testlerin Kalitesi Nasıl Ölçülür
PIT Mutation Testing
Mutation Coverage
Technical Debt
Technical Debt Management
Code Smells Detection
Debt Ratio
Technical Debt Quadrant
Refactoring Strategies
SonarQube Debt Analysis
Static Analysis Tools
Static Analysis Tools Karşılaştırması
SpotBugs
PMD
Checkstyle
Error Prone
Her Birinin Güçlü Yönleri
CI/CD'ye Entegrasyon
Code Quality Gates
Quality Gates Nedir
SonarQube Quality Gates
Failing Builds on Quality Issues

## 34 - Testing Strategies Advanced (İleri Seviye Test Stratejileri)

Test Pyramid
Test Pyramid Detailed
Unit, Integration, E2E Oranları
Anti-Patterns (Ice Cream Cone, Hourglass)
Test Strategy
Test Doubles Deep Dive
Test Doubles Advanced
Dummy, Stub, Spy, Mock, Fake
Her Birini Ne Zaman Kullanmalı
Mockito Advanced (ArgumentCaptor, Spy)
Contract Testing
Contract Testing Nedir
Consumer-Driven Contracts
Pact Framework
Contract Test Example
Integration Testing Strategies
Integration Test Scope
Test Containers
Database Testing
Performance Testing
Load Testing Strategies
Load, Stress, Spike, Endurance Testing
JMeter Basics
Gatling Basics
Load Test Scenario
Performance Benchmarks
Chaos Engineering Basics
Chaos Engineering Introduction
Chaos Monkey
Failure Injection
Testing in Production
Property-Based Testing
Property-Based Testing Nedir
jqwik Framework

## 35 - CI/CD and DevOps Essentials (CI/CD ve DevOps Temelleri)

CI/CD Concepts
CI/CD Principles
Continuous Integration
Continuous Delivery vs Deployment
Pipeline as Code
Build Automation
Jenkins Basics
Jenkins Pipeline
Jenkinsfile (Declarative vs Scripted)
Stages, Steps
Pipeline for Java Project
Jenkins Plugins
GitHub Actions
GitHub Actions for Java
Workflow Syntax
Matrix Builds
GitHub Actions Java Build
Caching Dependencies
GitLab CI/CD
.gitlab-ci.yml
GitLab Runners
Docker for Java
Docker Java Apps
Dockerfile Best Practices
Multi-Stage Builds
JVM in Containers (CGroup Aware)
Docker Image Optimization
Java App Dockerize Etme
Kubernetes Basics
Kubernetes for Java Apps
Pod, Service, Deployment
ConfigMap, Secret
Health Checks (Liveness, Readiness)
Java App K8s'e Deploy
Infrastructure as Code
IaC Concepts
Terraform Basics
Ansible Basics
Configuration Management
Artifact Management
Nexus, Artifactory
Docker Registry
Monitoring in CI/CD
Build Metrics
Deployment Metrics

## 36 - Security Advanced (İleri Seviye Güvenlik)

Authentication Deep Dive
JWT Deep Dive
JWT Structure (Header, Payload, Signature)
JWT Claims
Access Token vs Refresh Token
Token Rotation
JWT Generation/Validation
JWT Best Practices
OAuth 2.0 ve OpenID Connect
OAuth 2.0 Flows Detailed
Authorization Code Flow
Implicit Flow (Deprecated)
Client Credentials Flow
PKCE (Proof Key for Code Exchange)
OIDC Basics
ID Token vs Access Token
Secret Management
Secret Management Nedir
HashiCorp Vault
AWS Secrets Manager
Externalized Configuration
Vault Integration
Rotating Secrets
Certificate Management
SSL/TLS Certificates
KeyStore, TrustStore
Certificate Generation
Certificate Rotation
HTTPS Client Configuration
Mutual TLS (mTLS)
Dependency Vulnerability Scanning
OWASP Dependency-Check
Snyk
Supply Chain Security
CI/CD Integration
Vulnerability Remediation
Security Testing
SAST (Static Application Security Testing)
DAST (Dynamic Application Security Testing)
Penetration Testing Basics
Secure Configuration
Security Headers
CSP (Content Security Policy)
HSTS

## 37 - Algorithms and Data Structures Deep Dive (Algoritmalar ve Veri Yapıları Derinlemesine)

Time Complexity Analysis
Big O Notation Detailed
O(1), O(log n), O(n), O(n log n), O(n²)
Best, Average, Worst Case
Amortized Analysis
Space Complexity
Space Complexity Nedir
Auxiliary Space
In-Place Algorithms
Space-Time Trade-offs
Sorting Algorithms
Sorting Algorithms Comparison
QuickSort
MergeSort
HeapSort
Insertion Sort, Selection Sort
Time/Space Trade-offs
Stable vs Unstable Sorting
Implementation ve Benchmark
Search Algorithms
Search Algorithms Nedir
Linear Search
Binary Search Variants
Interpolation Search
BFS (Breadth-First Search)
DFS (Depth-First Search)
Graph Algorithms Basics
Shortest Path (Dijkstra)
Minimum Spanning Tree (Kruskal, Prim)
Tree Data Structures
Binary Tree
Binary Search Tree
AVL Tree
Red-Black Tree
B-Tree
Custom Data Structures
When to Build Custom
Trade-offs
LRU Cache Implementation
Trie Implementation
Bloom Filter
Skip List
Algorithm Design Techniques
Divide and Conquer
Dynamic Programming
Greedy Algorithms
Backtracking

## 38 - Real-World Debugging (Gerçek Dünya Hata Ayıklama)

Debugging Methodology
Systematic Debugging
Reproduce → Isolate → Fix → Verify
Rubber Duck Debugging
Binary Search Debugging
Scientific Method in Debugging
Log Analysis
Log Analysis Techniques
Grep Patterns
Log Correlation
Timeline Reconstruction
Log Aggregation Tools
Performance Degradation Investigation
Performance Degradation Checklist
Metrics Analizi
Baseline Comparison
Resource Utilization
Scenario-Based Investigation
Memory Leak Hunting Step-by-Step
Memory Leak Investigation
Belirti Tespiti (OOM, High GC)
Heap Dump Alma
MAT ile Analiz
Leak Source Tespiti
Fix ve Verification
Gerçek Memory Leak Senaryosu
Deadlock Debugging
Deadlock Investigation
Thread Dump Alma
Deadlock Graph Analizi
Lock Order Reversal
Fix Strategies
Deadlock Prevention
Production Incident Response
Incident Response Playbook
Severity Classification
Communication Protocols
Incident Timeline
Post-Mortem Analysis
Blameless Culture
Root Cause Analysis
RCA Techniques
5 Whys
Fishbone Diagram
Fault Tree Analysis
Remote Debugging
Remote Debugging Setup
Debugging in Containers
Debugging in Kubernetes

## 39 - Soft Skills and Best Practices (Soft Beceriler ve En İyi Uygulamalar)

Code Review Best Practices
Effective Code Reviews
Reviewer Sorumlulukları
Reviewee Sorumlulukları
Constructive Feedback
Review Checklist
Code Review Tools
Technical Documentation
Documentation Strategies
README Anatomy
Architecture Decision Records (ADR)
Runbooks
API Documentation
Diagram Types (UML, C4)
Mentoring Junior Developers
Mentoring Guide
Knowledge Transfer
Pair Programming
Code Kata
Constructive Criticism
Technical Debt Management
Debt Prioritization
Boy Scout Rule
Refactoring Strategies
Technical Debt Quadrant
Communication Skills
Technical Communication
Explaining Complex Topics
Presentation Skills
Writing Technical Proposals
Team Collaboration
Agile Practices
Scrum, Kanban Basics
Sprint Planning
Retrospectives
Staying Up-to-Date
Continuous Learning
Blogs, Newsletters (Java Weekly, Baeldung)
Conference Talks (Devoxx, JavaOne)
Open Source Contribution
Building Side Projects
Time Management
Prioritization
Deep Work vs Shallow Work
Work-Life Balance

## 40 - Senior-Level Project (Senior Seviye Proje)

Distributed Order Management System
Proje Genel Bakış
System Architecture
Technology Stack
Microservices Architecture
Order Service
Inventory Service
Payment Service
Notification Service
API Gateway
Service Discovery
RESTful APIs
API Design
Endpoint Design
Versioning
Error Handling
Database Design
PostgreSQL Schema
Database Migration (Flyway)
Redis Cache Integration
Message Queue
RabbitMQ/Kafka Simulation
Event-Driven Architecture
Message Patterns
Authentication & Authorization
JWT Authentication
Role-Based Access Control (RBAC)
Distributed Tracing
OpenTelemetry Integration
Trace Context Propagation
Metrics & Monitoring
Micrometer + Prometheus
Grafana Dashboards
Structured Logging
ELK Stack Ready
JSON Logging
Resilience Patterns
Circuit Breaker (Resilience4j)
Retry Logic
Rate Limiting
Containerization
Dockerfile for Each Service
Docker Compose
CI/CD Pipeline
GitHub Actions Workflow
Multi-Stage Build
Automated Tests
Comprehensive Testing
Unit Tests (JUnit + Mockito)
Integration Tests
Contract Tests
Performance Tests (Gatling)
API Documentation
OpenAPI/Swagger
Interactive API Docs
Health Checks
Liveness Endpoint
Readiness Endpoint
Graceful Shutdown
Production Readiness
JVM Tuning Documentation
Connection Pooling (HikariCP)
Async Processing (CompletableFuture)
Scheduled Tasks
Deployment Strategy
Rolling Deployment
Blue-Green Deployment

## 41 - Reactive Programming Deep Dive (Reaktif Programlama Derinlemesine)

Reactive Programming Fundamentals
Reactive Manifesto
Responsive, Resilient, Elastic, Message-Driven
Pull vs Push Models
Blocking vs Non-Blocking
Reactive vs Imperative
Reactive Streams Specification
Publisher, Subscriber, Subscription, Processor
Backpressure Nedir
Backpressure Strategies
TCK (Technology Compatibility Kit)
Project Reactor
Reactor Core Concepts
Mono ve Flux
Cold vs Hot Publishers
Reactor Operators
Transformation Operators (map, flatMap)
Filtering Operators (filter, take, skip)
Combining Operators (zip, merge, concat)
Error Handling Operators (onErrorReturn, onErrorResume)
Schedulers
Scheduler Types
publishOn vs subscribeOn
Parallel Execution
Backpressure Handling
Backpressure Strategies
Buffer, Drop, Latest
onBackpressureBuffer, onBackpressureDrop
Testing Reactive Code
StepVerifier
Test Publisher/Subscriber
Virtual Time
Reactive Context
Context Propagation
MDC in Reactive
WebFlux Integration
Reactive Web Applications

## 42 - Messaging Systems (Mesajlaşma Sistemleri)

Message Queue Fundamentals
Message Queue Nedir
Synchronous vs Asynchronous Communication
Point-to-Point vs Publish-Subscribe
Message Broker Architecture
RabbitMQ Basics
RabbitMQ Architecture
Exchange Types (Direct, Fanout, Topic, Headers)
Queue Declaration
Message Routing
Dead Letter Queues
RabbitMQ Java Client
Apache Kafka Basics
Kafka Architecture
Topics, Partitions, Replicas
Producers, Consumers, Consumer Groups
Offset Management
Kafka Java Client
Message Patterns
Request-Reply
Fire and Forget
Saga Pattern
Event Sourcing with Messaging
Message Serialization
JSON, Avro, Protocol Buffers
Schema Registry
Message Reliability
At-Most-Once, At-Least-Once, Exactly-Once
Idempotent Consumers
Message Ordering
Transactional Messaging
Distributed Transactions
Two-Phase Commit
Message Monitoring
Queue Metrics
Consumer Lag
Dead Letter Queue Monitoring

## 43 - Caching Strategies Deep Dive (Önbellekleme Stratejileri Derinlemesine)

Caching Fundamentals
Why Cache
Cache Hit vs Cache Miss
Cache Invalidation (Two Hard Problems)
TTL (Time To Live)
Cache Levels
CPU Cache
Application Cache
Distributed Cache
CDN Cache
Caching Patterns
Cache-Aside (Lazy Loading)
Read-Through
Write-Through
Write-Behind (Write-Back)
Refresh-Ahead
Cache Eviction Policies
LRU (Least Recently Used)
LFU (Least Frequently Used)
FIFO (First In First Out)
Random Replacement
Caffeine Cache
Caffeine Features
Size-Based Eviction
Time-Based Eviction
Reference-Based Eviction
Async Loading
Cache Statistics
Redis Integration
Redis Data Structures
Redis as Cache
Redis Pub/Sub
Redis Transactions
Redis Cluster
Distributed Caching
Cache Consistency
Cache Stampede Problem
Thundering Herd
Cache Warming
Cache Monitoring
Hit Rate Metrics
Cache Size Metrics
Eviction Metrics

## 44 - Data Serialization (Veri Serileştirme)

Serialization Fundamentals
Serialization Nedir
Marshalling vs Serialization
Binary vs Text Formats
Java Serialization
Serializable Interface Deep Dive
serialVersionUID
transient Keyword
Custom Serialization (writeObject, readObject)
Externalizable Interface
Serialization Security Issues
JSON Serialization
Jackson Library
ObjectMapper Configuration
Annotations (@JsonProperty, @JsonIgnore)
Custom Serializers/Deserializers
Polymorphic Types
Gson Library
XML Serialization
JAXB (Java Architecture for XML Binding)
XML Annotations
Marshalling/Unmarshalling
Protocol Buffers
Protobuf Nedir
Schema Definition
Code Generation
Protobuf vs JSON
Apache Avro
Avro Schema
Schema Evolution
Avro vs Protobuf
MessagePack
YAML Serialization
Binary Formats Comparison
Performance Benchmarks
Size Comparison
Serialization Best Practices

## 45 - API Integration Patterns (API Entegrasyon Kalıpları)

HTTP Client Libraries
HttpURLConnection
Apache HttpClient
OkHttp
Java 11 HttpClient
Rest Template (Spring)
API Client Design
Client Configuration
Connection Pooling
Timeout Configuration
Retry Logic
Error Handling
Circuit Breaker Integration
Request/Response Interceptors
Authentication Integration
API Key Authentication
Bearer Token
OAuth 2.0 Client
Webhook Handling
Webhook Nedir
Webhook Security (Signature Verification)
Webhook Retry Logic
GraphQL Client
GraphQL Nedir
Query vs Mutation
GraphQL Java Client
API Mocking
WireMock
MockServer
Contract Testing with Mocks
API Versioning Client Side
API Client Best Practices
Rate Limiting Client Side
Bulk Operations
Pagination Handling

## 46 - Batch Processing (Toplu İşleme)

Batch Processing Fundamentals
Batch vs Real-Time
Batch Processing Use Cases
ETL (Extract, Transform, Load)
Spring Batch Architecture
Job, Step, Tasklet
ItemReader, ItemProcessor, ItemWriter
Chunk-Oriented Processing
Job Repository
Job Parameters
Reading Data
File Readers (Flat File, XML, JSON)
Database Readers (JDBC, JPA)
Custom Readers
Processing Data
ItemProcessor
Validation
Transformation
Filtering
Writing Data
File Writers
Database Writers
Custom Writers
Error Handling in Batch
Skip Logic
Retry Logic
Rollback
Job Execution
Job Launcher
Scheduling Batch Jobs
Job Restart
Job Monitoring
Execution Context
Job Metrics
Performance Tuning
Parallel Processing
Partitioning
Multi-threaded Steps
Async ItemProcessor
Remote Chunking
Testing Batch Jobs
JobLauncherTestUtils
Integration Testing

## 47 - Search and Indexing (Arama ve İndeksleme)

Full-Text Search Fundamentals
Inverted Index
Tokenization
Stemming, Lemmatization
Stop Words
Lucene Basics
Lucene Architecture
Document, Field, Term
IndexWriter, IndexReader
Query Types
Elasticsearch Basics
Elasticsearch Architecture
Index, Document, Shard, Replica
RESTful API
Elasticsearch Java Client
Index Management
Mapping
Analyzers
Custom Analyzers
Search Queries
Match Query, Term Query
Bool Query
Range Query
Fuzzy Query
Aggregations
Metric Aggregations
Bucket Aggregations
Pipeline Aggregations
Search Performance
Query Optimization
Index Optimization
Caching
Search Relevance
Scoring
Boosting
Custom Scoring
Apache Solr Basics
Search Integration Patterns
Sync vs Async Indexing
Change Data Capture (CDC)
Search Testing
Test Containers for Elasticsearch

## 48 - Distributed Systems Concepts (Dağıtık Sistem Kavramları)

Distributed Systems Fundamentals
CAP Theorem
Consistency, Availability, Partition Tolerance
Trade-offs
BASE vs ACID
Consistency Models
Strong Consistency
Eventual Consistency
Causal Consistency
Read-Your-Writes Consistency
Distributed Transactions
Two-Phase Commit (2PC)
Three-Phase Commit (3PC)
Saga Pattern Deep Dive
Orchestration vs Choreography
Compensating Transactions
Distributed Consensus
Paxos Algorithm
Raft Algorithm
Leader Election
Service Discovery
Service Registry
Client-Side Discovery
Server-Side Discovery
Consul, Eureka
Load Balancing
Load Balancing Algorithms
Round Robin, Least Connections
Consistent Hashing
Client-Side Load Balancing
API Gateway Patterns
Gateway Aggregation
Gateway Offloading
Gateway Routing
Distributed Caching
Cache Coherence
Cache Invalidation Strategies
Distributed Tracing Deep Dive
Trace Sampling
Trace Analysis
Clock Synchronization
NTP (Network Time Protocol)
Logical Clocks (Lamport, Vector)
Failure Detection
Heartbeat Mechanisms
Timeout-Based Detection
Phi Accrual Failure Detector

## 49 - Cloud Native Java (Bulut Tabanlı Java)

Cloud Native Principles
12-Factor App Methodology
Codebase, Dependencies, Config
Backing Services, Build/Release/Run
Processes, Port Binding
Concurrency, Disposability
Dev/Prod Parity, Logs
Admin Processes
Containerization Deep Dive
Docker Best Practices for Java
Image Layering
Multi-Stage Builds
Distroless Images
JVM Container Optimization
Container Orchestration
Kubernetes Deep Dive
Pods, ReplicaSets, Deployments
Services, Ingress
ConfigMaps, Secrets
StatefulSets, DaemonSets
Jobs, CronJobs
Resource Management
Resource Requests and Limits
Horizontal Pod Autoscaler (HPA)
Vertical Pod Autoscaler (VPA)
Cluster Autoscaler
Health Checks Advanced
Startup Probes
Custom Health Indicators
Service Mesh
Istio Basics
Traffic Management
Security (mTLS)
Observability
Cloud Configuration
Externalized Configuration
Spring Cloud Config
Kubernetes ConfigMaps/Secrets
Cloud Storage
Object Storage (S3, Azure Blob)
File Storage (EFS, Azure Files)
Block Storage
Cloud Databases
RDS, Aurora
Azure SQL Database
Cloud SQL
Serverless Java
AWS Lambda with Java
Azure Functions
Cold Start Optimization
Cloud Messaging
SQS, SNS
Azure Service Bus
Cloud Pub/Sub
Cloud Monitoring
CloudWatch, Azure Monitor
Cloud Logging
Cost Optimization
Right-Sizing
Reserved Instances
Spot Instances

## 50 - Performance Engineering (Performans Mühendisliği)

Performance Engineering Methodology
Performance Requirements
Performance Testing Lifecycle
Capacity Planning
Scalability Analysis
Load Testing Advanced
Load Testing Tools Deep Dive
JMeter Advanced
Gatling Advanced
Test Scenario Design
Ramp-Up Strategies
Think Time
Correlation
Parameterization
Performance Metrics
Response Time, Throughput
Error Rate
Percentiles (P50, P95, P99)
Apdex Score
Little's Law
Performance Baselines
Establishing Baselines
Performance Regression Testing
Continuous Performance Testing
Bottleneck Analysis
CPU Bottlenecks
Memory Bottlenecks
I/O Bottlenecks
Network Bottlenecks
Database Bottlenecks
Application Performance Management (APM) Deep Dive
Transaction Tracing
Code-Level Diagnostics
Database Query Analysis
External Service Calls
Performance Tuning Checklist
JVM Tuning
Database Tuning
Network Tuning
Application Code Optimization
Scalability Patterns
Vertical vs Horizontal Scaling
Stateless Applications
Database Sharding
Read Replicas
CQRS for Scalability
Performance Documentation
Performance Test Reports
Tuning Recommendations
Capacity Planning Documents

## 51 - Advanced Security Patterns (İleri Seviye Güvenlik Kalıpları)

Zero Trust Architecture
Zero Trust Principles
Never Trust, Always Verify
Least Privilege Access
Micro-Segmentation
Identity and Access Management (IAM)
RBAC (Role-Based Access Control)
ABAC (Attribute-Based Access Control)
Multi-Factor Authentication (MFA)
Single Sign-On (SSO)
Federation (SAML, OAuth, OIDC)
API Security Advanced
API Gateways Security
API Throttling
API Keys Management
API Security Testing
OWASP API Security Top 10
Data Protection
Encryption at Rest
Encryption in Transit
Key Management (KMS)
Data Masking
Tokenization
Secure Communication
TLS/SSL Deep Dive
Certificate Pinning
Perfect Forward Secrecy
Compliance and Auditing
GDPR Compliance
PCI-DSS Compliance
SOC 2 Compliance
Audit Logging
Security Monitoring
SIEM (Security Information and Event Management)
Intrusion Detection Systems (IDS)
Security Analytics
Threat Modeling
STRIDE Model
Attack Trees
Risk Assessment
Security Testing Advanced
SAST Tools Deep Dive
DAST Tools Deep Dive
IAST (Interactive Application Security Testing)
Fuzz Testing
Penetration Testing
Secure Development Lifecycle
Security by Design
Threat Modeling in Design Phase
Security Code Review
Security Testing in CI/CD
Security Incident Response
Incident Response Plan
Incident Classification
Containment Strategies
Forensics Basics
Post-Incident Review

## 52 - System Design and Architecture (Sistem Tasarımı ve Mimari)

System Design Fundamentals
Requirements Gathering
Functional vs Non-Functional Requirements
Capacity Estimation
Back-of-the-Envelope Calculations
System Design Approach
High-Level Design
Detailed Design
Component Design
Interface Design
Database Design Advanced
Schema Design
Normalization vs Denormalization
Partitioning Strategies
Replication Strategies
Scalability Patterns
Caching Strategies
Load Balancing
Database Sharding
Asynchronous Processing
Availability Patterns
Failover Strategies
Replication
Redundancy
Reliability Engineering
Fault Tolerance
Graceful Degradation
Error Budgets
SLA, SLO, SLI Deep Dive
Design for Failure
Chaos Engineering Deep Dive
Chaos Monkey, Chaos Kong
Failure Injection
Resilience Testing
Real-World System Design
URL Shortener Design
Social Media Feed Design
Chat Application Design
Video Streaming Platform Design
E-Commerce Platform Design
Rate Limiter Design
Distributed Cache Design
Search Autocomplete Design
Notification System Design
Trade-offs in System Design
Consistency vs Availability
Latency vs Throughput
Read-Heavy vs Write-Heavy
System Design Documentation
Architecture Diagrams (C4 Model)
Sequence Diagrams
Data Flow Diagrams
Architecture Decision Records (ADR)

## 53 - Legacy Code and Refactoring (Eski Kod ve Yeniden Yapılandırma)

Working with Legacy Code
Characterization Tests
Seams (Finding Safe Places to Change)
Dependency Breaking Techniques
Sprout Method, Sprout Class
Wrap Method, Wrap Class
Refactoring Catalog
Extract Method
Inline Method
Move Method
Rename
Extract Class
Inline Class
Extract Interface
Pull Up Method/Field
Push Down Method/Field
Replace Conditional with Polymorphism
Introduce Parameter Object
Replace Magic Number with Symbolic Constant
Refactoring Strategies
Red-Green-Refactor (TDD)
Boy Scout Rule
Strangler Fig Pattern
Branch by Abstraction
Testing Legacy Code
Adding Tests to Legacy Code
Breaking Dependencies for Testing
Test Harness
Code Smells Deep Dive
Bloaters (Long Method, Large Class, Primitive Obsession, Long Parameter List, Data Clumps)
Object-Orientation Abusers (Switch Statements, Temporary Field, Refused Bequest, Alternative Classes with Different Interfaces)
Change Preventers (Divergent Change, Shotgun Surgery, Parallel Inheritance Hierarchies)
Dispensables (Comments, Duplicate Code, Lazy Class, Data Class, Dead Code, Speculative Generality)
Couplers (Feature Envy, Inappropriate Intimacy, Message Chains, Middle Man, Incomplete Library Class)
Technical Debt Paydown
Identifying High-Value Refactoring
Incremental Refactoring
Measuring Refactoring Impact
Modernization Strategies
Microservices Migration from Monolith
Database Migration
Framework Upgrades
Java Version Upgrades
Refactoring Tools
IDE Refactoring Tools
Static Analysis for Refactoring Opportunities
Code Quality Metrics Tracking

## 54 - Software Craftsmanship (Yazılım Ustalığı)

Craftsmanship Mindset
Software Craftsmanship Manifesto
Continuous Improvement
Pride in Workmanship
Professionalism
Deliberate Practice
Code Katas
Coding Dojos
Practice Projects
Learning Through Teaching
Pair Programming
Pair Programming Styles (Driver/Navigator, Ping-Pong)
Benefits and Challenges
Remote Pair Programming
Mob Programming
Code Ownership
Collective Code Ownership
Code Reviews as Learning
Knowledge Sharing
Estimation and Planning
Story Points
Planning Poker
Velocity Tracking
Risk Management
Quality Mindset
Definition of Done
Zero Bug Policy
Continuous Refactoring
Career Development
Career Paths (IC vs Management)
Building a Portfolio
Speaking at Conferences
Writing Technical Blogs
Contributing to Open Source
Building a Personal Brand
Networking
Community Involvement
Ethics in Software Development
User Privacy
Accessibility
Environmental Impact of Code
Ethical Decision Making
Soft Skills for Seniors
Leadership Without Authority
Influencing Skills
Conflict Resolution
Effective Meetings
Work-Life Balance for Seniors
Avoiding Burnout
Sustainable Pace
Setting Boundaries

## 55 - Enterprise Integration Patterns (Kurumsal Entegrasyon Kalıpları)

Integration Styles
File Transfer
Shared Database
Remote Procedure Invocation
Messaging
Messaging Patterns
Message Channel
Message Endpoint
Message Router
Message Translator
Message Filter
Content Enricher
Content Filter
Claim Check
Normalizer
Message Transformation
Canonical Data Model
Message Transformation Patterns
Routing Patterns
Content-Based Router
Message Filter
Dynamic Router
Recipient List
Splitter, Aggregator
Resequencer
Composed Message Processor
Scatter-Gather
Routing Slip
Process Manager
Message Construction
Command Message
Document Message
Event Message
Request-Reply
Return Address
Correlation Identifier
Message Expiration
Format Indicator
Message Endpoints
Messaging Gateway
Messaging Mapper
Transactional Client
Polling Consumer
Event-Driven Consumer
Competing Consumers
Message Dispatcher
Selective Consumer
Durable Subscriber
Idempotent Receiver
Service Activator
System Management
Control Bus
Detour
Wire Tap
Message History
Message Store
Smart Proxy
Test Message
Channel Purger
Enterprise Service Bus (ESB)
ESB Architecture
ESB vs Microservices

## 56 - Operational Excellence (Operasyonel Mükemmellik)

Production Readiness
Production Readiness Checklist
Deployment Strategy
Rollback Strategy
Disaster Recovery Plan
Runbook Creation
Operational Metrics
System Metrics (CPU, Memory, Disk, Network)
Application Metrics
Business Metrics
SLI/SLO/SLA Implementation
On-Call and Incident Management
On-Call Rotations
Incident Severity Levels
Incident Response Procedures
Escalation Procedures
Communication During Incidents
Post-Mortem Culture
Blameless Post-Mortems
Root Cause Analysis
Action Items Tracking
Sharing Learnings
Change Management
Change Advisory Board (CAB)
Change Windows
Emergency Changes
Change Rollback Procedures
Capacity Management
Capacity Planning
Resource Forecasting
Scaling Triggers
Cost Optimization
Configuration Management
Configuration as Code
Configuration Drift Detection
Configuration Versioning
Database Operations
Database Migrations
Database Backups and Restores
Database Performance Monitoring
Index Management
Disaster Recovery
Backup Strategies
RTO (Recovery Time Objective)
RPO (Recovery Point Objective)
DR Testing
Chaos Engineering in Production
Game Days
Controlled Failure Injection
Learning from Failures
Documentation for Operations
System Documentation
Runbooks
Troubleshooting Guides
Architecture Documentation
Operational Dashboards
Golden Signals (Latency, Traffic, Errors, Saturation)
Dashboard Design
Alert Fatigue Prevention

## 57 - Advanced Concurrency Patterns (İleri Seviye Eşzamanlılık Kalıpları)

Thread Confinement
Thread-Local Storage
Thread-Per-Message Pattern
Immutable Objects Pattern
Concurrent Object Pool
Active Object Pattern
Half-Sync/Half-Async Pattern
Leader/Followers Pattern
Producer-Consumer Variations
Bounded Buffer
Unbounded Buffer
Priority Queue
Read-Write Lock Pattern
Readers-Writer Problem
Reader Preference vs Writer Preference
Fair Locks
Barrier Synchronization
CyclicBarrier Pattern
CountDownLatch Pattern
Phaser Pattern
Thread-Safe Lazy Initialization
Double-Checked Locking
Initialization-On-Demand Holder
Enum Singleton
Compare-and-Swap Patterns
Lock-Free Data Structures
Wait-Free Algorithms
Software Transactional Memory
Actor Model
Actor Pattern
Message Passing
Akka Basics (if applicable)
Parallel Algorithms
Parallel Reduction
Parallel Prefix Sum
Parallel Sorting
Thread Pool Patterns
Fixed Thread Pool
Cached Thread Pool
Single Thread Executor
Work Stealing Pool
Custom Thread Pool Design
Concurrency Testing
Thread Safety Testing
Race Condition Detection
Deadlock Detection Tools
Stress Testing for Concurrency
Performance Implications
Context Switching Overhead
Lock Contention Analysis
Scalability Testing

## 58 - Data Engineering for Java Developers (Java Geliştiricileri için Veri Mühendisliği)

Data Pipeline Fundamentals
ETL vs ELT
Batch vs Stream Processing
Data Pipeline Architecture
Apache Spark Basics (Java API)
RDD, DataFrame, Dataset
Transformations and Actions
Spark SQL
Stream Processing
Kafka Streams
Processing Topologies
Stateful Processing
Windowing
Data Formats for Big Data
Parquet
ORC
Avro
Data Quality
Data Validation
Data Cleansing
Data Profiling
Data Governance
Data Partitioning
Partitioning Strategies
Bucketing
Data Warehousing Concepts
Star Schema
Snowflake Schema
Fact and Dimension Tables
Data Lake Architecture
Data Lake vs Data Warehouse
Data Lake Zones (Raw, Curated, Consumption)
Real-Time Analytics
Lambda Architecture
Kappa Architecture
Data Lineage
Data Catalog
Metadata Management
Data Observability
Data Monitoring
Data Quality Metrics
Anomaly Detection

## 59 - Machine Learning Integration (Makine Öğrenmesi Entegrasyonu)

ML for Java Developers
ML Basics for Engineers
Supervised vs Unsupervised Learning
Model Training vs Inference
ML Libraries for Java
Deeplearning4j
Weka
Apache Mahout
TensorFlow Java API
Model Serving
Model Deployment Strategies
REST API for ML Models
gRPC for ML Models
Model Versioning
A/B Testing for Models
Feature Engineering in Java
Feature Extraction
Feature Transformation
Feature Selection
ML Pipeline
Data Preprocessing
Model Training Pipeline
Model Evaluation
Model Monitoring
Model Performance Monitoring
Data Drift Detection
Model Drift Detection
Retraining Strategies
ML Ops Basics
Model Registry
Experiment Tracking
Responsible AI
Model Fairness
Model Explainability
Privacy-Preserving ML

## 60 - Final Capstone: Production-Grade Microservices Ecosystem (Final Proje: Production Seviyesi Mikroservis Ekosistemi)

Project Overview
Business Domain (Multi-Tenant SaaS Platform)
System Architecture
Technology Stack
Development Roadmap
Microservices Design
Service Boundaries (DDD)
API Gateway (Spring Cloud Gateway / custom)
Service Discovery (Consul / Eureka)
Configuration Management (Spring Cloud Config / Kubernetes ConfigMaps)
Core Services
User Service (Authentication & Authorization)
Tenant Service (Multi-Tenancy)
Product Service
Order Service
Payment Service
Notification Service
Analytics Service
Data Management
Database per Service
Polyglot Persistence (PostgreSQL, MongoDB, Redis)
Event Store (Event Sourcing)
CQRS Implementation
Inter-Service Communication
Synchronous (REST, gRPC)
Asynchronous (Kafka)
Event-Driven Architecture
Saga Pattern Implementation
Resilience Implementation
Circuit Breaker (Resilience4j)
Retry, Rate Limiting, Bulkhead
Timeout Management
Security Implementation
OAuth 2.0 / OpenID Connect
JWT with Refresh Tokens
API Gateway Security
Service-to-Service Authentication (mTLS)
Secret Management (Vault)
Observability Stack
Distributed Tracing (Jaeger with OpenTelemetry)
Metrics (Prometheus + Grafana)
Logging (ELK Stack with structured logging)
Health Checks and Readiness Probes
Testing Strategy
Unit Tests (JUnit 5 + Mockito)
Integration Tests (TestContainers)
Contract Tests (Pact)
E2E Tests
Performance Tests (Gatling)
Chaos Engineering Tests
Containerization and Orchestration
Docker Multi-Stage Builds
Kubernetes Deployment
Helm Charts
Horizontal Pod Autoscaling
CI/CD Pipeline
GitHub Actions Workflow
Build, Test, Security Scan, Deploy
Blue-Green Deployment
Canary Deployment
Production Readiness
Load Testing Results
Capacity Planning
Disaster Recovery Plan
Runbooks
Monitoring Dashboards
Alert Configuration
Documentation
Architecture Documentation (C4 Model)
API Documentation (OpenAPI)
Developer Onboarding Guide
Operations Manual
Post-Mortem Template
Performance Benchmarks
Throughput Metrics
Latency Percentiles
Resource Utilization
Cost Analysis