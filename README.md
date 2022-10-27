# AdvanceJavaTutorial

## Notes

- **Enumeration**
  - Example

        ```java
        public enum Color {
            BLUE("blue"), GREEN("green"), RED("red");
        
            private String value;
        
            Color(String value) {
                this.value = value;
            }
        
            public String getValue() {
                return value;
            }
          
        }
        ```

- **Annotation**: are metadata
  - to provide information to the compiler (save time)
  - for compile-time and deployment-time processing,
  - for runtime processing
  - Example

        ```java
        @Target(ElementType.METHOD)
        @Retention(RetentionPolicy.RUNTIME)
        public @interface MyCustomAnnotation {
            int value();
        
        }
        ```

- **Multithreading** in Java
  - 2 ways of implementing it
    - extend Thread
      - Implementation
      - Code

                ```java
                public class Thread1 extends Thread {
                
                    @Override
                    public void run() {
                        try {
                            System.out.println("Thread1 is running");
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    }
                
                }
                ```

      - Usage
      - Code

                ```java
                Thread t = new Thread();
                t.start();
                ```

    - implements runnable
      - Implementation
      - Example

                ```java
                public class Thread2 implements Runnable {
                
                    @Override
                    public void run() {
                
                        try {
                            System.out.println("Thread2 is running");
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    }
                
                }
                ```

      - Usage
      - Example

                ```java
                Thread t = new Thread(new Thread1());
                t.start();
                ```

  - **Synchronization** in multithreading
    - Java allows us to lock an object for a thread to prevent its modification by many threads at the same time.
    - Example

            ```java
            synchronized (this) {
             // process to synchronize
             for (int i = 1; i <= 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e);
                }
              }
            }
            ```

- **Autoboxing** is the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes. (int → integer)
  - 1 scenario could be in a collection that only works with objects.
  - Example

        ```java
        Integer iObj = Integer.valueOf(i);
        ```

- **Unboxing** (integer → int)
  - Example

        ```java
        int i1 = iObj;
        ```

- **I/O Streams**:
  - **Classes hierarchy**

        ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4e761f13-d8d5-4d44-9cb9-18d9d457c117/Untitled.png)

  - **ByteStream**
    - If you don’t know what kind of data the file is going to contain
    - The file is read byte by byte
    - Classes (*FileInputStream, FileOutputStream)*
  - **CharacterStream**
    - When you work on a particular file
    - The file is read character by character
    - Classes (*FileReader, FileWriter)*
  - **FileInputStream**
    - Read a file
  - **FileOutputStream**
    - Write into a file
- Advanced Java **Database Connections**
  - **JDBC**
    - interface to connect to different databases
    - helps developers easily switch between databases
- **Generics** **type**
  - Benefits
    - Stronger type checks at compile time.
    - Elimination of casts.
      - Example
        - before

                ```java
                List list = new ArrayList();
                list.add("hello");
                String s = (String) list.get(0);
                ```

        - after

                ```java
                List<String> list = new ArrayList<String>();
                list.add("hello");
                String s = list.get(0);  // no cast
                ```

  - Example
  - Code

        ```java
        public class DualGenericHolder<T, U> {
            
            T obj1;
            U obj2;
        
            public DualGenericHolder(T obj1, U obj2) {
                this.obj1 = obj1;
                this.obj2 = obj2;
            }
        
            public void display() {
                System.out.println(obj1);
                System.out.println(obj2);
            }
        }
        ```

        ```java
        public static void main(String[] args) {
            DualGenericHolder<String, Integer> obj = new DualGenericHolder<String,Integer>("Wi11i4m", 5);
            obj.display();
        }
        ```
