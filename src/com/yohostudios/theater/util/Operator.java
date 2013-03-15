package com.yohostudios.theater.util;

import java.util.ArrayList;
import java.util.List;

import com.yohostudios.theater.exception.UnsupportedOperatorException;

/**
 * @author simon
 * 
 */
public enum Operator {

    /**
     * 
     */
    ASSIGN("="), ADD_ASSIGN("+="), SUB_ASSIGN("-="), INCREMENT("++"), DECREMENT(
            "--"), EQUALS("eq"), LOWER_THAN("lt"), LOWER_THAN_OR_EQUALS("lteq"), GREATER_THAN(
            "gt"), GREATER_THAN_OR_EQUALS("gteq");

    /** */
    private String value;

    /**
     * @param value
     */
    private Operator(String value) {
        this.value = value;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return value;
    }

    /**
     * 
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value
     * @return
     * @throws UnsupportedOperatorException
     */
    public static final Operator getOperator(String value)
            throws UnsupportedOperatorException {

        for (Operator o : Operator.values()) {
            if (o.toString().equals(value)) {
                return o;
            }
        }
        throw new UnsupportedOperatorException(value);
    }

    /**
     * @param operatorValues
     * @return
     * @throws UnsupportedOperatorException
     */
    public static final List<Operator> getOperators(List<String> operatorValues)
            throws UnsupportedOperatorException {

        List<Operator> operatorList = new ArrayList<Operator>();

        for (String operatorValue : operatorValues) {
            operatorList.add(getOperator(operatorValue));
        }

        return operatorList;

    }
}
