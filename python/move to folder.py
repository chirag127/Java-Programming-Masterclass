"""
# find all .java files in a folder and all subfolders
# and move them to a folder with the same name as the file from which they were
# imported
# e.g. if a file is imported from
# 22 - Java Networking Programming/387 - Multi Threaded Server.java

# then the file will be moved to
# 22 - Java Networking Programming/Multi_Threaded_Server.java
"""

import glob
import os

# get all files of form
files = glob.glob('*/*.java', recursive=True)


folders = """01 - Introduction To The Course.java
02 - Remaster in Progress.java
03 - Video Quality.java
05 - How to Get Help.java
06 - Important Tip Source Code.java
07 - Biggest Tip to Succeed as a Java Programmer.java
08 - Software Tools Introduction.java
09 - Which Version of Java.java
10 - Install JDK 17 for Windows.java
100 - Introduction.java
101 - Composition Part 1.java
102 - Composition Part 2.java
103 - Composition Challenge.java
104 - Encapsulation Part 1.java
105 - Encapsulation Part 2.java
106 - Encapsulation Challenge.java
107 - Polymorphism Part 1.java
108 - Polymorphism Part 2.java
109 - Casting with classes and using Object and var references.java
11 - Install JDK 11 for Mac.java
110 - Testing the runtime type using the instanceof operator.java
111 - Polymorphism Challenge Exercise.java
112 - Polymorphism Challenge Exercise Part 2.java
113 - OOP Master Challenge Exercise Part 1.java
114 - OOP Master Challenge Exercise Part 2.java
115 - OOP Master Challenge Exercise The Bonus.java
116 - Organizing Java Classes Packages and Import Statements.java
117 - Introduction.java
118 - Arrays Part 1.java
119 - Arrays Part 2.java
12 - Install JDK 11 for Linux.java
120 - Using javautilArrays sort fill copyOf.java
121 - Finding a Match Using a Binary Search and testing equality of arrays.java
122 - Arrays Challenge Exercise.java
123 - Arrays Recap.java
124 - References Types vs Value Types.java
125 - Variable Arguments Varargs.java
126 - Minimum Element Challenge.java
127 - Reverse Array Challenge.java
128 - TwoDimensional Arrays.java
129 - Multidimensional Arrays.java
13 - Confirming installation and intro to JShell.java
130 - Introduction.java
131 - List and ArrayList Part 1.java
132 - ArrayList Part 2.java
133 - ArrayList Part 3.java
134 - Arrays vs ArrayLists.java
135 - ArrayList Challenge Part 1.java
136 - Arrays ArrayList LinkedList Memory and Big O Notation.java
137 - LinkedList Part 1.java
138 - LinkedList Part 2.java
139 - Iterators.java
14 - Hello World.java
140 - LinkedList Challenge.java
141 - LinkedList Challenge Continued.java
142 - Introduction to Autoboxing and Unboxing.java
143 - Autoboxing and Unboxing related to Arrays Lists.java
144 - Autoboxing Unboxing Challenge.java
145 - Autoboxing Unboxing Challenge.java
146 - Introduction to the enum type.java
147 - The enum type continued with the switch statement.java
148 - Interfaces.java
149 - Interfaces Part 2.java
15 - Variables.java
150 - Interfaces Challenge Part 1.java
151 - Interfaces Challenge Part 2.java
152 - Inner classes Part 1.java
153 - Inner Classes Part 2.java
154 - Inner Classes Challenge.java
155 - Abstract Classes Part 1.java
156 - Abstract Classes Part 2.java
157 - Interface vs Abstract Class.java
158 - Abstract Class Challenge Part 1.java
159 - Abstract Class Challenge Part 2.java
16 - Starting out with Expressions.java
160 - Abstract Class Challenge Part 3 includes recursion.java
161 - Generics Introduction.java
162 - Our Generics Class.java
163 - Our Generics Class Part 2.java
164 - Our Generics Class Part 3.java
165 - Generics Challenge.java
166 - Naming Conventions.java
167 - Packages.java
168 - Packages Part 2.java
169 - Packages Part 3.java
17 - Primitive Types.java
170 - Packages Challenge Exercise.java
171 - Scope.java
172 - Scope Part 2 and Visibility.java
173 - Scope Challenge Exercise.java
174 - Access Modifiers.java
175 - The static statement.java
176 - The final statement.java
177 - Final Part 2 and Static Initializers.java
178 - Collections Overview.java
179 - Binary Search.java
18 - byte short long and width.java
180 - Collections List Methods.java
181 - Comparable and Comparator.java
182 - Maps.java
183 - Map Continued and Adventure Game.java
184 - Adding Exits to the Adventure game.java
185 - Adventure Game challenge.java
186 - Immutable Classes.java
187 - Immutable Class Challenge.java
188 - Sets HashSet.java
189 - HashSet equals and hashCode.java
19 - Casting in Java.java
190 - Finish off equals and hashcode.java
191 - Potential issue with equals and subclassing.java
192 - Sets Symmetric Asymmetric.java
193 - Finishing Off Sets.java
194 - Sets Challenge Part 1.java
195 - Sets Challenge Part 2.java
196 - Sets Challenge Part 3.java
197 - Sorted Collections.java
198 - StockList Class With Maps.java
199 - Add a Basket.java
20 - Primitive Types Challenge.java
200 - TreeMap and Unmodifiable Maps.java
201 - Challenge Part 1.java
202 - Challenge Part 2.java
203 - Challenge Part 3.java
204 - Challenge Part 4 Final.java
205 - JDK11 Global Library Configuration.java
206 - Create Your First JavaFX Project.java
207 - JavaFX Overview.java
208 - JavaFX Hello World Program.java
209 - GridPane Layout.java
21 - Float and Double Primitives.java
210 - HBox Layout.java
211 - BorderPane Layout.java
212 - Other Layouts.java
213 - Controls.java
214 - RadioButton and CheckBox.java
215 - ComboBox and ChoiceBox.java
216 - Slider Spinner ColorPicker DatePicker Controls.java
217 - TitledPane.java
218 - Events and Event Handlers.java
219 - Events Continued.java
22 - Floating Point Precision and a Challenge.java
220 - UI Thread.java
221 - Threads and Runnable.java
222 - Setup Sample Todo List Application.java
223 - Base Interface.java
224 - Add Change Listener.java
225 - Formatting Dates.java
226 - Singletons.java
227 - Load and Save ToDo Items fromto Disk.java
228 - Add DialogPane.java
229 - Show Dialog and Add Controller Code.java
23 - The char and boolean Primitive Data Types.java
230 - Bug Fix and Update List View.java
231 - Data Binding and Observable.java
232 - Cell Factories.java
233 - Context Menu.java
234 - KeyEvents and Toolbars.java
235 - SortedList.java
236 - FilteredList.java
237 - CSS With JavaFX.java
238 - Transforming Nodes and Choosers.java
239 - More on Choosers and Web Pages.java
24 - Primitive Types Recap and the String Data Type.java
240 - SceneBuilder.java
241 - Installing SceneBuilder for Windows.java
242 - Installing SceneBuilder for Mac.java
243 - Overview of SceneBuilder.java
244 - Building a UI with SceneBuilder.java
245 - More on SceneBuilder.java
246 - JavaFX Challenge.java
247 - JavaFX Challenge Part 2.java
248 - JavaFX Challenge Part 3.java
249 - JavaFX Challenge Part 4.java
25 - Operators Operands and Expressions.java
250 - JavaFX Challenge Wrap up.java
251 - Exceptions.java
252 - Stack Trace and Call Stack.java
253 - Catching and throwing Exceptions.java
254 - Multi Catch Exceptions.java
255 - Introduction to IO.java
256 - Writing content FileWriter class and Finally block.java
257 - Try with Resources.java
258 - FileReader and Closeable.java
259 - BufferedReader.java
26 - Abbreviating Operators.java
260 - Load Big Location and Exits Files.java
261 - Challenge.java
262 - Buffered Writer and Challenge.java
263 - Byte Streams.java
264 - Reading Binary Data and End of File Exceptions.java
265 - Object Input Output including Serialization.java
266 - Finish Object IO and RandomAccessFile class.java
267 - Create Random Access File.java
268 - Update Static Initializer Block With Random File Access.java
269 - Update Adventure Game to Read Random Access File.java
27 - From JShell to an IDE.java
270 - Java NIO.java
271 - Writing Objects With Java NIO.java
272 - Reading and Writing with Java NIO.java
273 - Writing Binary Files with Java NIO.java
274 - Reading Files with NIO.java
275 - Absolute and Relative Reads.java
276 - Chained Put Methods.java
277 - Writing Sequentially.java
278 - FileChannel to Copy Files and Pipes with Threads.java
279 - Filesystem.java
28 - Installing IntelliJ IDEA for Windows.java
280 - More on Paths.java
281 - Exists and CopyFile.java
282 - Move Rename and Delete.java
283 - File Attributes.java
284 - Read Existing Directory Contents.java
285 - Separators Temp Files and File Stores.java
286 - Walk File Tree.java
287 - Copy Entire Tree.java
288 - Mapping IO and NIO Methods.java
289 - Concurrency and Threads Introduction.java
29 - Installing IntelliJ IDEA for Mac.java
290 - Threads.java
291 - Runnable and Thread.java
292 - Interrupt and Join.java
293 - Multiple Threads.java
294 - Thread Variables.java
295 - Synchronisation.java
296 - Producer and Consumer.java
297 - Deadlocks wait notify and notifyAll methods.java
298 - The Java Util Concurrent package.java
299 - Thread Interference.java
30 - Installing IntelliJ IDEA for Linux.java
300 - Reentrant Lock and Unlock.java
301 - Using Try Finally With Threads.java
302 - Thread Pools.java
303 - ArrayBlockingQueue Class.java
304 - Deadlocks.java
305 - More on Deadlocks.java
306 - Thread Starvation.java
307 - Fair Locks and Live Locks.java
308 - Live Lock Example and Slipped Conditions.java
309 - Other Thread Issues.java
31 - Configuring IntelliJ IDEA WINDOWS MAC and LINUX.java
310 - JavaFX Background Tasks.java
311 - Data Binding.java
312 - Service.java
313 - Challenge 1 and 2.java
314 - Challenge 34 and 5.java
315 - Challenge 6 and 7.java
316 - Challenge 8.java
317 - Challenge 9.java
318 - Lambda Expressions Introduction.java
319 - Lambda Expressions Continued.java
32 - Hello World in IntelliJ.java
320 - Lambda Expressions Nested Blocks.java
321 - Scope and Functional Programming.java
322 - Functional Interfaces Predicates.java
323 - More on Predicates Suppliers.java
324 - Functions.java
325 - Chaining javautilfunction Functions.java
326 - Streams.java
327 - Streams Intermediate and Terminal Operations.java
328 - Streams Flatmap Lambda Best Practices.java
329 - Lambda Challenge Part 1.java
33 - Hello World in IntelliJ.java
330 - Lambda Challenge Part 2.java
331 - Regular Expressions Introduction.java
332 - Character classes and Boundary Matchers.java
333 - Quantifiers and the Pattern and Matcher classes.java
334 - Matcher find and Group Methods.java
335 - And Or Not.java
336 - Regular Expressions Challenge Part 1.java
337 - Regular Expressions Challenge Part 2.java
338 - Regular Expressions Challenge Part 3.java
339 - Introduction to Debugging.java
34 - ifthen Statement.java
340 - More on Debugging.java
341 - Field Watch Points.java
342 - Advanced Debugging.java
343 - Introduction to Unit Testing with JUnit.java
344 - Asserts in Junit.java
345 - More Asserts and Exception Handling.java
346 - Parameterized Testing.java
347 - JUnit Challenge 1 and 2.java
348 - JUnit Challenges 3 to 7.java
349 - Junit Challenges 8 to 10.java
35 - Logical AND Operator.java
350 - Section Introduction.java
351 - Database Terminology.java
352 - Install and Setup SQLite for Windows.java
353 - Install and Setup SQLite for Mac.java
354 - Install and Setup SQLite for Linux.java
355 - Introduction to SQLite.java
356 - More with SQLite.java
357 - Querying Data With SQL.java
358 - SQL Order by and Joins.java
359 - More Complex Joins.java
36 - Logical OR Operator.java
360 - Wildcards in Queries and Views.java
361 - Housekeeping and Final SQL Challenge.java
362 - JDBC and SQLite GUI Browser.java
363 - Creating Databases With JDBC in Java.java
364 - JDBC Insert Update Delete.java
365 - executeQuery and using Constants.java
366 - The Music SQLite Database.java
367 - Write Java Query for Artists.java
368 - Executing SQL in DB Browser.java
369 - Query Albums by Artist Method.java
37 - Assignment Operator VS Equals to Operator.java
370 - Query Artists for Song method.java
371 - Result Set Meta Data.java
372 - Functions and Views.java
373 - Write the Method to Query View.java
374 - SQL Injection Attacks and Prepared Statements.java
375 - Transactions.java
376 - Inserting Records With JDBC.java
377 - Insert Albums Artists and Songs.java
378 - Test Insert JDBC Code.java
379 - JDBC with a GUI Program.java
38 - Ternary Operator.java
380 - Add Artists.java
381 - Fix Artist and Preload Records.java
382 - Implement Artist Query.java
383 - Add ProgressBar.java
384 - Handling Updates.java
385 - Networking Overview.java
386 - First Client and Server Apps.java
387 - Multi Threaded Server.java
388 - MultiThreading and Timeouts.java
389 - UDP Server and Client.java
39 - Operator Precedence and Operator Challenge.java
390 - High Level APIS.java
391 - URL Connections and Input Stream Reader.java
392 - HTTPUrlConnection.java
393 - Alternatives to HTTPUrlConnection.java
394 - Introduction to Modules.java
395 - Module Declarations and Statements.java
396 - Module Types.java
397 - Project Setup and Test.java
398 - Structuring the new project.java
399 - Creating the first module Common.java
40 - Introduction.java
400 - Creating the Module Descriptor file.java
401 - Creating the 2nd module Database.java
402 - Challenge Create the final module UI.java
403 - Transitive Dependencies.java
404 - Introduction To The Course.java
405 - Remaster in Progress.java
406 - Video Quality.java
407 - Subtitles.java
408 - How to Get Help.java
409 - Important Tip Source Code.java
41 - Keywords and Expressions.java
410 - Biggest Tip to Succeed as a Java Programmer.java
412 - Software Tools Introduction.java
413 - Java Development Kit Installation Overview.java
414 - Install JDK 11 for Windows.java
415 - Installing Intellij IDEA for Windows.java
417 - Install JDK 11 for Mac.java
418 - Installing Intellij IDEA for Mac.java
419 - Install JDK 11 for Linux.java
42 - Statements Whitespace and Indentation Code Organization.java
420 - Installing Intellij IDEA for Linux.java
421 - Configuring IntelliJ IDEA WINDOWS MAC and LINUX.java
422 - Introduction.java
423 - Hello World Project.java
424 - Defining the Main Method.java
425 - Hello World Challenge and Common Errors.java
426 - Variables.java
427 - Starting out with Expressions.java
428 - Primitive Types.java
429 - byte short long and width.java
43 - Code Blocks And The If Then Else Control Statement.java
430 - Casting in Java.java
431 - Primitive Types Challenge.java
432 - float and double Primitive Types.java
433 - Floating Point Precision and a Challenge.java
434 - The char and boolean Primitive Data Types.java
435 - Primitive Types Recap and the String Data Type.java
436 - Operators Operands and Expressions.java
437 - Abbreviating Operators.java
438 - ifthen Statement.java
439 - Logical and Operator.java
44 - if then else Challenge.java
440 - Logical OR Operator.java
441 - Assignment Operator VS Equals to Operator.java
442 - Ternary Operator.java
443 - Operator Precedence and Operator Challenge.java
444 - First Steps Summary.java
445 - End of Remaster.java
446 - Introduction.java
447 - Keywords And Expressions.java
448 - Statements Whitespace and Indentation Code Organization.java
449 - Code Blocks And The If Then Else Control Statements.java
45 - Methods in Java.java
450 - if then else Recap.java
451 - Methods In Java.java
452 - More On Methods And A Challenge.java
453 - Method Challenge Final Code Changes.java
454 - DiffMerge Tool Introduction.java
455 - Install DiffMerge.java
456 - Using DiffMerge.java
457 - Coding Exercises.java
458 - Coding Exercises Example Part 1.java
459 - Coding Exercises Example Part 2.java
46 - More on Methods.java
460 - Coding Exercises Example Part 3.java
461 - Method Overloading.java
462 - Method Overloading Recap.java
463 - Seconds and Minutes Challenge.java
464 - Bonus Challenge Solution.java
465 - Introduction.java
466 - The switch statement Challenge Exercise.java
467 - Day of the Week Challenge.java
468 - The for Statement Challenge Exercise.java
469 - For Loop Recap.java
47 - Methods Recap.java
470 - Sum 3 and 5 Challenge.java
471 - The while and do while statements Challenge Exercise.java
472 - While and Do While Recap.java
473 - Digit Sum Challenge.java
474 - Parsing Values from a String.java
475 - Reading User Input.java
476 - Problems and Solutions.java
477 - Reading User Input Challenge.java
478 - Min and Max Challenge.java
479 - Introduction.java
48 - Method Challenge.java
480 - Classes Part 1.java
481 - Classes Part 2.java
482 - Constructors Part 1 Challenge Exercise.java
483 - Constructors Part 2 Challenge Exercise.java
484 - Inheritance Part 1.java
485 - Inheritance Part 2.java
486 - Reference vs Object vs Instance vs Class.java
487 - this vs super.java
488 - Method Overloading vs Overriding Recap.java
489 - Static vs Instance Methods.java
49 - Code Comparison in IntelliJ.java
490 - Static vs Instance Variables.java
491 - Inheritance Challenge Part 1 Challenge Exercise.java
492 - Inheritance Challenge Part 2.java
493 - Introduction.java
494 - Composition.java
495 - Composition Part 2 Challenge Exercise.java
496 - Encapsulation.java
497 - Encapsulation Challenge Exercise.java
498 - Polymorphism.java
499 - Polymorphism Challenge Exercise.java
50 - Coding Exercises.java
500 - OOP Master Challenge Exercise.java
501 - OOP Challenge Solution.java
502 - Arrays.java
503 - Arrays Challenge Exercise.java
504 - Arrays Recap.java
505 - References Types vs Value Types.java
506 - Minimum Element Challenge.java
507 - Reverse Array Challenge.java
508 - List and ArrayList Part 1.java
509 - ArrayList Part 2.java
51 - Method Overloading.java
510 - ArrayList Part 3.java
511 - ArrayList Challenge Part 1.java
512 - ArrayList Challenge Part 2.java
513 - ArrayList Challenge Part 3.java
514 - Bug Fix for ArrayList Challenge.java
515 - Autoboxing and Unboxing.java
516 - Autoboxing Unboxing Challenge Exercise Part 1.java
517 - Autoboxing Unboxing Challenge Exercise Part 2.java
518 - Autoboxing Unboxing Challenge Exercise Part 3.java
519 - LinkedList Part 1.java
52 - Method Overloading Challenge.java
520 - LinkedList Part 2.java
521 - LinkedList Part 3.java
522 - LinkedList Challenge Part 1.java
523 - Bug Fix for Track 1 Error.java
524 - LinkedList Challenge Part 2.java
525 - LinkedList Challenge Part 3 Final video.java
526 - Old JavaFX Introduction Video for JDK 8.java
527 - Old JavaFX Code Vs FXml Video for JDK 8.java
529 - Bonus Lecture and Information.java
53 - Seconds And Minutes Challenge.java
54 - Bonus Challenge Solution.java
55 - Introduction.java
56 - The switch statement.java
57 - More switch statement.java
58 - Traditional Switch Challenge.java
59 - A Switch Expression Challenge.java
60 - The for Statement.java
61 - The for Statement Challenge Exercise.java
62 - Sum 3 and 5 Challenge And Using IntelliJs Debugger.java
63 - For Loop Recap.java
64 - The while and do while statements.java
65 - The while Loop Challenge Exercise.java
66 - Digit Sum Challenge.java
67 - While Loop and Do While Recap.java
68 - Local Variables and Scope.java
69 - The class the object static instance fields and methods.java
70 - Parsing Values and Reading Input using Systemconsole.java
71 - Exception Handling and Introduction to Scanner.java
72 - Reading Input with Scanner.java
73 - Reading User Input Challenge.java
74 - Min and Max Challenge.java
75 - Introduction.java
76 - Introduction to Classes and Objects.java
77 - Introduction to Classes Using Getter Methods.java
78 - Classes Using Setters and Creating Objects.java
79 - Classes Challenge Exercise.java
80 - Constructors Part 1.java
81 - Constructors Part 2.java
82 - Constructor Challenge Exercise.java
83 - Reference vs Object vs Instance vs Class.java
84 - Static vs Instance Variables.java
85 - Static vs Instance Methods.java
86 - The POJO.java
87 - Javas Implicit POJO Type The Record.java
88 - Inheritance Part 1.java
89 - Inheritance Part 2.java
90 - Inheritance Part 3.java
91 - What is javalangObject.java
92 - Inheritance Challenge Part 1.java
93 - Inheritance Challenge Part 2.java
94 - this vs super.java
95 - Method Overloading vs Overriding Recap.java
96 - The Text Block and other Formatting Options.java
97 - Another Look at the String.java
98 - String Manipulation Methods.java
99 - The StringBuilder class.java"""
for infolder in folders.splitlines():

    try:
        file_name = infolder
        # get the folder name
        folder_name = file_name.replace(".java", "")
        # remove the number and the space before the file name
        try:
            new_file_name = file_name.split(' - ')[1]
        except IndexError:
            new_file_name = file_name


        new_file_name = new_file_name.replace(' ', '')

        new_file_name = new_file_name.replace('-', '')

        new_file_name = new_file_name.replace('(', '')

        new_file_name = new_file_name.replace(')', '')

        new_file_name = new_file_name.replace(';', '')

        new_file_name = new_file_name.replace(',', '')

        for fit in files:

            if new_file_name in fit:
                # example fit is 01 - Getting Started/BiggestTiptoSucceedasaJavaProgrammer.java
                # example new_file_name is GettingStartedBiggestTiptoSucceedasaJavaProgrammer.java
                # new file location is 01 - Getting Started/07 - Biggest Tip to Succeed as a Java Programmer/GettingStartedBiggestTiptoSucceedasaJavaProgrammer.java

                new_file_location = fit.replace(fit.split('/')[1], folder_name + '/' + new_file_name)


                if not os.path.exists(fit.split('/')[0] + '/' + folder_name):
                    os.makedirs(fit.split('/')[0] + '/' + folder_name)

                # rename the file

                os.rename(fit, new_file_location)

    except Exception as error:
        print('error: ', error)
