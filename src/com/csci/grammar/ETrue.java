package com.csci.grammar;

import com.csci.visitor.EvalVisitor;
import com.csci.visitor.PrintVisitor;

public class ETrue extends Exp {

    public ETrue() { }

    @Override
    public String accept(PrintVisitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public Object eval(EvalVisitor visitor) {
        return visitor.visit(this);
    }
}
