package com.csci.grammar; // Java Package generated by the BNF Converter.

public class PDefs extends Program {

    public ListDef listdef_;

    public PDefs(ListDef p1) {
        listdef_ = p1;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Def def : listdef_) {
            builder.append(def.toString());
        }
        return builder.toString();
    }
}
