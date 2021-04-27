# singleton-class-java

**Approach 1**

In this approach we are lazily loading the instance via Singleton() method.
For multi-threading environment we are using double check locking so that synchronized happens only 1 time.
To prevent against Reflection we are throwing RunTime exception from the Constructor if instance is not null.
To prevent against De-serialization we have provided implementation of readResolve() method and returned the instance.
To prevent against cloning we can throw exception from clone method or return null;

**Approach 2**

Using ENUM.