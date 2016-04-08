# Fastbuild
Android fast build structure

-------
这是个在之前项目的基础上改进的框架，基于**Rxjava** + **Dagger2** + **Retrofit**进行开发，业务模块（Modules）单独出来，方便单独进行开发，同时便于维护。
模块可以统一使用MVP模式，也可以单独使用MVC

目前内置的第三方库有：Rxandroid、dagger2、retrofit、okhttp、greendao。


自己目前还是个菜鸟，觉得这个结构还有不少缺陷，像目前只考虑了**NativeApp**的形式，因为之前没有经验，没有考虑到 **HibridApp** 和 **WebApp** 在该框架下是否适用的情况。这些在之后的学习中也会不断完善


-------------
