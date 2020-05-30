module demo.main {
    requires static lombok;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires org.jooq;
    requires java.xml;
    requires java.annotation;
    requires java.logging;
    requires spring.context;
    exports com.example.demo;
}
