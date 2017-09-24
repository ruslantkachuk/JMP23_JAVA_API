module jmp.com.service {

    requires java.xml.ws.annotation;
    requires spring.beans;
    requires spring.context;

    exports jmp.com.service.service to jmp.com.api;
    exports jmp.com.service.domain to jmp.com.api;
    exports jmp.com.service.configuration to jmp.com.api;

    opens jmp.com.service.service;
    opens jmp.com.service.configuration;
    opens jmp.com.service.repository;
}