/*
Confirming installation and intro to JShell

to comfirm that you have installed JDK 9
and that you can run the java command,
open a command line window
and type java -version

you should see something like this:

java version "9.0.1"
Java(TM) SE Runtime Environment (build 9.0.1+11)
Java HotSpot(TM) 64-Bit Server VM (build 9.0.1+11, mixed mode)

if you see something like this,
then you have installed JDK 9

if you not see something like this,
then you have not installed JDK 9



It is a Read-Eval-Print-Loop (REPL) tool
that allows you to write and execute Java code
in a command line environment.
it is a great tool for learning Java
and for experiment-ing with Java code.

1. open a command line window
2. type jshell
3. type System.out.println("hello world")
4. press enter
5. type /exit


jshell don't replace the java command


print cls for clear the screen
print exit for exit the jshell
print /help for help
print /list for list the commands

/help intro for intro to jshell


/list -all for list all the packages

s1 : import java.util.*;
s2 : import java.io.*;
s3 : import java.net.*;
s4 : import java.math.*;
s5 : import java.text.*;
s6 : import java.time.*;
s7 : import java.util.concurrent.*;
s8 : import java.util.function.*;
s9 : import java.util.regex.*;
s10 : import java.util.stream.*;
s11 : import java.util.prefs.*;
s12 : import java.util.logging.*;


jshell> /list -all

*/

class ConfirminginstallationandintrotoJShell {
    public static void main(String[] args) {
        System.out.println("Confirming installation and intro to JShell");
        System.out.println("JShell is a new tool that is part of the JDK 9.");
        System.out.println("It is a Read-Eval-Print-Loop (REPL) tool");
        System.out.println("that allows you to write and execute Java code");
        System.out.println("in a command line environment.");
        System.out.println("it is a great tool for learning Java");
        System.out.println("and for experiment-ing with Java code.");
        System.out.println("1. open a command line window");
        System.out.println("2. type jshell");
        System.out.println("3. type System.out.println(\"hello world\")");
        System.out.println("4. press enter");
        System.out.println("5. type /exit");
    }
}
