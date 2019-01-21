module com.slyang.javanew.modulecore {

//   通过名字声明了
//   这个模块依赖的一些其他模块，在编译期和运行期都依赖的
    requires java.net.http;

    exports com.slyang.javanew.modulecore;
}


// https://juejin.im/entry/59cdb7e65188255d3448fc64

// 所有的应用都会默认依赖 java.base,就像以前我们不用显式的 "import java.lang.*;" 一样。

//module java.base{
//        exports java.io;
//        exports java.lang;
//        exports java.lang.annotation;
//        exports java.lang.invoke;
//        exports java.lang.module;
//        exports java.lang.ref;
//        exports java.lang.reflect;
//        exports java.lang.math;
//        exports java.lang.net;
//        //...
//        }