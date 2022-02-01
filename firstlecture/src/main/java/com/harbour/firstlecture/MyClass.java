package com.harbour.firstlecture;

import java.util.Objects;

public class MyClass {

    int myObjectField = 10;


    public void setMyObjectField(int value) {
        myObjectField = value;
    }

    public void callMeMaybe() {
        //do something
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MyClass myClass = (MyClass) o;
        return myObjectField == myClass.myObjectField;
    }

    @Override
    public int hashCode() {
        return Objects.hash(myObjectField);
    }
}
