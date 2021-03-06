/*******************************************************************************
    Copyright 2008, Oracle and/or its affiliates.
    All rights reserved.


    Use is subject to license terms.

    This distribution may include materials developed by third parties.

 ******************************************************************************/
package com.sun.fortress.compiler.codegen;

import com.sun.fortress.nodes.Node;
import com.sun.fortress.nodes.NodeAbstractVisitor;

public class WorthParallelizing extends NodeAbstractVisitor<Boolean> {
    public Boolean defaultCase(Node that) {
        return Boolean.FALSE;
    }
    
}
