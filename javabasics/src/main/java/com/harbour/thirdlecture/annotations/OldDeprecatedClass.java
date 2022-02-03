package com.harbour.thirdlecture.annotations;

import java.util.ArrayList;
import java.util.List;

@Deprecated
public class OldDeprecatedClass {

    @Deprecated
    public void shouldNotBeUsed() {

    }

    @Override
    public String toString() {
        return super.toString();
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public void produceWarnings(Object string) {
        List l = new ArrayList();
        l.add(string);
    }
}
