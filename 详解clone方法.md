#clone方法
##如何让一个类使用clone方法
某一个类想要使用clone方法，就要继承Cloneable接口，重写其中的clone方法。
例如：

    class Person implements Cloneable{
      private String name;
      private int age;

      public Person(int age,String name){
        this.age = age;
        this.name = name;
      }

      public int getAge(){
        return age;
      }

      public String getName(){
        return name;
      }

      @Override
      protected Object clone(){
        Person p = null;
        try{
          p = (Person)super.clone();
        }
        catch(CloneNotSupportedException c){
          c.printStackTrace();
        }
        return p;
      }
    }
    
如果要调用clone的方法

    Person p = new Person(22,"Sun");
    Person p1 = (Person)p.clone();
    
##复制对象or复制引用，深拷贝or浅拷贝，如何实现深拷贝
这篇博客介绍的很好<http://blog.csdn.net/zhangjg_blog/article/details/18369201>
