package org.autotest.helpers;

import spoon.reflect.code.BinaryOperatorKind;

/**
 * Clase auxiliar para convertir un BinaryOperatorKind de Spoon a String.
 */
public class BinaryOperatorKindToString {
    public static String get(BinaryOperatorKind kind) {
        switch (kind) {
            case PLUS:
                return "+";
            case MINUS:
                return "-";
            case MUL:
                return "*";
            case DIV:
                return "/";
            case MOD:
                return "%";
            case BITAND:
                return "&";
            case BITOR:
                return "|";
            case BITXOR:
                return "^";
            case SL:
                return "<<";
            case SR:
                return ">>";
            case USR:
                return ">>>";
            case GT:
                return ">";
            case LT:
                return "<";
            case GE:
                return ">=";
            case LE:
                return "<=";
            case EQ:
                return "==";
            case NE:
                return "!=";
            case INSTANCEOF:
                return "instanceof";
            default:
                return null;
        }
    }
}
