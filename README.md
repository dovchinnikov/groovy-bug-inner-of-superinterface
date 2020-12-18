# groovy-bug-inner-of-superinterface

Ensure example works fine when compiled:
```
$ groovy -version
Groovy Version: 3.0.7 JVM: 15.0.1 Vendor: Oracle Corporation OS: Mac OS X
$ groovyc -d bin com/foo/I.groovy com/foo/C.groovy playground.groovy
$ java -classpath bin:$GROOVY_HOME/lib/groovy-3.0.7.jar playground
com.foo.C@794cb805
```

Now try running `playground.groovy` as scipt:
```
$ groovy playground.groovy
org.codehaus.groovy.control.MultipleCompilationErrorsException: startup failed:
file:~/groovy-bug-inner-of-superinterface/com/foo/C.groovy: 11: unable to resolve class Level
 @ line 11, column 24.
       boolean isLoggable(Level level) {
                          ^

file:~/groovy-bug-inner-of-superinterface/com/foo/C.groovy: 16: unable to resolve class Level
 @ line 16, column 14.
       void log(Level level, ResourceBundle bundle, String msg, Throwable thrown) {}
                ^

file:~/groovy-bug-inner-of-superinterface/com/foo/C.groovy: 19: unable to resolve class Level
 @ line 19, column 14.
       void log(Level level, ResourceBundle bundle, String format, Object... params) {}
                ^

3 errors
```
