package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Employer extends JobField {

    public Employer(String value) {
        super(value);
    }

    // Custom toString, equals, and hashCode methods:

      @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer employer = (Employer) o;
        return this.getId() == employer.getId();
    }

}