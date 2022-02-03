package com.harbour.thirdlecture.accessmodifiers.onepackage;

import java.util.Objects;

public class AClass {
    private int myIntField;
    private String myString;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AClass aClass = (AClass) o;
        return myIntField == aClass.myIntField && Objects.equals(myString, aClass.myString);
    }

    @Override
    public int hashCode() {
        return Objects.hash(myIntField, myString);
    }
}
