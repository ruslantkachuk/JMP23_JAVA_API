module jmp.com.api {

    requires java.sql;
    requires java.xml.ws.annotation;

    requires spring.core;
    requires spring.beans;
    requires spring.context;
    requires spring.aop;
    requires spring.web;
    requires spring.expression;

    requires spring.boot;
    requires spring.boot.autoconfigure;

    requires jmp.com.service;

    exports jmp.com.api;
    exports jmp.com.api.controller;

    opens jmp.com.api;
    opens jmp.com.api.controller;
}