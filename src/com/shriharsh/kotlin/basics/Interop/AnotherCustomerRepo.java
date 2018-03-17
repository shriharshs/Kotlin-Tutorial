package com.shriharsh.kotlin.basics.Interop;

import com.shriharsh.kotlin.basics.classes.CustomerJava;

import java.util.List;

public interface AnotherCustomerRepo {
    CustomerJava getById(int id);

    List<CustomerJava> getAll();
}
