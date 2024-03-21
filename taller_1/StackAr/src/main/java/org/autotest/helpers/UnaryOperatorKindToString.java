package org.autotest.helpers;

import spoon.reflect.code.UnaryOperatorKind;

/**
 * Clase auxiliar para convertir un UnaryOperatorKind de Spoon a String.
 */
public class UnaryOperatorKindToString {
    public static String get(UnaryOperatorKind kind) {
        switch (kind) {
            case POS:
                return "+";
            case NEG:
                return "-";
            case NOT:
                return "!";
            case COMPL:
                return "~";
            case PREINC:
            case POSTINC:
                return "++";
            case PREDEC:
            case POSTDEC:
                return "--";
            default:
                return null;
        }
    }
}
