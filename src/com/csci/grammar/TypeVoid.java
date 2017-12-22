package com.csci.grammar;

import com.csci.visitor.EvalVisitor;
import com.csci.visitor.PrintVisitor;

public class TypeVoid extends Type {

    public TypeVoid() {
    }

    @Override
    public String accept(PrintVisitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public void eval(EvalVisitor visitor) {
        visitor.visit(this);
    }
}
