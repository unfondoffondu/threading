# Fun with Threading and Singletons

### There can be only one.

The program has an option to run threads to perform on either safe-threading or unsafe-threading modes, each being a variation
of lazy initialization.

When running in unsafe mode, every few runs a thread or two will have a different hashcode, meaning that the
getInstance method in the "unsafe" class will create a new instance of that class even if there is already one on the stack. 

The thread safe mode has the same hashcode every time seemingly without fail.



