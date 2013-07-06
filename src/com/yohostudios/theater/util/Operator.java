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
     * @param value the operator as a String
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
     * @return the operator as a String.
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the operator as a string.
     * @return the enum corresponding to the string.
     * @throws UnsupportedOperatorException if the operator is not supported.
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
     * Get a list of operators matching provided values.
     * @param operators list of operators as string values.
     * @return a list of enums.
     * @throws UnsupportedOperatorException if the operator is not supported.
     */
    public static final List<Operator> getOperators(List<String> operators)
            throws UnsupportedOperatorException {

        List<Operator> operatorList = new ArrayList<Operator>();

        for (String operator : operators) {
            operatorList.add(getOperator(operator));
        }

        return operatorList;

    }
}
