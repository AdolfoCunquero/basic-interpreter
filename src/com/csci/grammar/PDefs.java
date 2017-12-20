package com.csci.grammar;

import com.csci.visitor.Visitor;

public class PDefs extends Program {

    public ListDef listdef_;

    public PDefs(ListDef p1) {
        listdef_ = p1;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
