package com.sun.fortress.nodes;

import java.lang.String;
import java.math.BigInteger;
import java.io.Writer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import com.sun.fortress.nodes_util.*;
import com.sun.fortress.parser_util.*;
import com.sun.fortress.parser_util.precedence_opexpr.*;
import com.sun.fortress.useful.*;
import edu.rice.cs.plt.tuple.Option;

/**
 * Class _SyntaxTransformationExtentRange, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Thu Oct 11 03:24:55 EDT 2018
 */
@SuppressWarnings("unused")
public class _SyntaxTransformationExtentRange extends ExtentRange implements _SyntaxTransformation {
    private final java.util.Map<String, Level> _variables;
    private final java.util.List<String> _syntaxParameters;
    private final String _syntaxTransformer;

    /**
     * Constructs a _SyntaxTransformationExtentRange.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public _SyntaxTransformationExtentRange(Option<StaticArg> in_base, Option<StaticArg> in_size, Option<Op> in_op, ASTNodeInfo in_info, java.util.Map<String, Level> in_variables, java.util.List<String> in_syntaxParameters, String in_syntaxTransformer) {
        super(in_info, in_base, in_size, in_op);
        if (in_variables == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'variables' to the _SyntaxTransformationExtentRange constructor was null");
        }
        _variables = in_variables;
        if (in_syntaxParameters == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'syntaxParameters' to the _SyntaxTransformationExtentRange constructor was null");
        }
        _syntaxParameters = in_syntaxParameters;
        if (in_syntaxTransformer == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'syntaxTransformer' to the _SyntaxTransformationExtentRange constructor was null");
        }
        _syntaxTransformer = in_syntaxTransformer.intern();
    }

    /**
     * A constructor with some fields provided by default values.
     */
    public _SyntaxTransformationExtentRange(Option<StaticArg> in_base, Option<StaticArg> in_size, Option<Op> in_op, java.util.Map<String, Level> in_variables, java.util.List<String> in_syntaxParameters, String in_syntaxTransformer) {
        this(in_base, in_size, in_op, NodeFactory.makeASTNodeInfo(NodeFactory.macroSpan), in_variables, in_syntaxParameters, in_syntaxTransformer);
    }

    final public java.util.Map<String, Level> getVariables() { return _variables; }
    final public java.util.List<String> getSyntaxParameters() { return _syntaxParameters; }
    final public String getSyntaxTransformer() { return _syntaxTransformer; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.for_SyntaxTransformationExtentRange(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.for_SyntaxTransformationExtentRange(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.for_SyntaxTransformationExtentRange(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.for_SyntaxTransformationExtentRange(this);
    }

    /**
     * Implementation of equals that is based on the values of the fields of the
     * object. Thus, two objects created with identical parameters will be equal.
     */
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if ((obj.getClass() != this.getClass()) || (obj.hashCode() != this.hashCode())) {
            return false;
        }
        else {
            _SyntaxTransformationExtentRange casted = (_SyntaxTransformationExtentRange) obj;
            Option<StaticArg> temp_base = getBase();
            Option<StaticArg> casted_base = casted.getBase();
            if (!(temp_base == casted_base || temp_base.equals(casted_base))) return false;
            Option<StaticArg> temp_size = getSize();
            Option<StaticArg> casted_size = casted.getSize();
            if (!(temp_size == casted_size || temp_size.equals(casted_size))) return false;
            Option<Op> temp_op = getOp();
            Option<Op> casted_op = casted.getOp();
            if (!(temp_op == casted_op || temp_op.equals(casted_op))) return false;
            java.util.Map<String, Level> temp_variables = getVariables();
            java.util.Map<String, Level> casted_variables = casted.getVariables();
            if (!(temp_variables == casted_variables || temp_variables.equals(casted_variables))) return false;
            java.util.List<String> temp_syntaxParameters = getSyntaxParameters();
            java.util.List<String> casted_syntaxParameters = casted.getSyntaxParameters();
            if (!(temp_syntaxParameters == casted_syntaxParameters || temp_syntaxParameters.equals(casted_syntaxParameters))) return false;
            String temp_syntaxTransformer = getSyntaxTransformer();
            String casted_syntaxTransformer = casted.getSyntaxTransformer();
            if (!(temp_syntaxTransformer == casted_syntaxTransformer)) return false;
            return true;
        }
    }


    /**
     * Implementation of hashCode that is consistent with equals.  The value of
     * the hashCode is formed by XORing the hashcode of the class object with
     * the hashcodes of all the fields of the object.
     */
    public int generateHashCode() {
        int code = getClass().hashCode();
        Option<StaticArg> temp_base = getBase();
        code ^= temp_base.hashCode();
        Option<StaticArg> temp_size = getSize();
        code ^= temp_size.hashCode();
        Option<Op> temp_op = getOp();
        code ^= temp_op.hashCode();
        java.util.Map<String, Level> temp_variables = getVariables();
        code ^= temp_variables.hashCode();
        java.util.List<String> temp_syntaxParameters = getSyntaxParameters();
        code ^= temp_syntaxParameters.hashCode();
        String temp_syntaxTransformer = getSyntaxTransformer();
        code ^= temp_syntaxTransformer.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected _SyntaxTransformationExtentRange() {
        _variables = null;
        _syntaxParameters = null;
        _syntaxTransformer = null;
    }

    public Node accept(TemplateUpdateVisitor visitor) {
        return visitor.for_SyntaxTransformationExtentRange(this);
    }
    /**
     * Single Span constructor, for template gap access.  Clients are 
     * responsible for never accessing other fields than the gapId and 
     * templateParams.
     */
    protected _SyntaxTransformationExtentRange(ASTNodeInfo info) {
        super(info);
        _variables = null;
        _syntaxParameters = null;
        _syntaxTransformer = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "_SyntaxTransformationExtentRange", 7)) {
            Option<StaticArg> temp_base = getBase();
            if (w.visitNodeField("base", temp_base)) {
                if (temp_base.isNone()) {
                    w.visitEmptyOption(temp_base);
                }
                else if (w.visitNonEmptyOption(temp_base)) {
                    StaticArg elt_temp_base = temp_base.unwrap();
                    if (elt_temp_base == null) w.visitNull();
                    else {
                        elt_temp_base.walk(w);
                    }
                    w.endNonEmptyOption(temp_base);
                }
                w.endNodeField("base", temp_base);
            }
            Option<StaticArg> temp_size = getSize();
            if (w.visitNodeField("size", temp_size)) {
                if (temp_size.isNone()) {
                    w.visitEmptyOption(temp_size);
                }
                else if (w.visitNonEmptyOption(temp_size)) {
                    StaticArg elt_temp_size = temp_size.unwrap();
                    if (elt_temp_size == null) w.visitNull();
                    else {
                        elt_temp_size.walk(w);
                    }
                    w.endNonEmptyOption(temp_size);
                }
                w.endNodeField("size", temp_size);
            }
            Option<Op> temp_op = getOp();
            if (w.visitNodeField("op", temp_op)) {
                if (temp_op.isNone()) {
                    w.visitEmptyOption(temp_op);
                }
                else if (w.visitNonEmptyOption(temp_op)) {
                    Op elt_temp_op = temp_op.unwrap();
                    if (elt_temp_op == null) w.visitNull();
                    else {
                        elt_temp_op.walk(w);
                    }
                    w.endNonEmptyOption(temp_op);
                }
                w.endNodeField("op", temp_op);
            }
            ASTNodeInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            java.util.Map<String, Level> temp_variables = getVariables();
            if (w.visitNodeField("variables", temp_variables)) {
                w.visitUnknownObject(temp_variables);
                w.endNodeField("variables", temp_variables);
            }
            java.util.List<String> temp_syntaxParameters = getSyntaxParameters();
            if (w.visitNodeField("syntaxParameters", temp_syntaxParameters)) {
                if (w.visitIterated(temp_syntaxParameters)) {
                    int i_temp_syntaxParameters = 0;
                    for (String elt_temp_syntaxParameters : temp_syntaxParameters) {
                        if (w.visitIteratedElement(i_temp_syntaxParameters, elt_temp_syntaxParameters)) {
                            if (elt_temp_syntaxParameters == null) w.visitNull();
                            else {
                                w.visitString(elt_temp_syntaxParameters);
                            }
                        }
                        i_temp_syntaxParameters++;
                    }
                    w.endIterated(temp_syntaxParameters, i_temp_syntaxParameters);
                }
                w.endNodeField("syntaxParameters", temp_syntaxParameters);
            }
            String temp_syntaxTransformer = getSyntaxTransformer();
            if (w.visitNodeField("syntaxTransformer", temp_syntaxTransformer)) {
                w.visitString(temp_syntaxTransformer);
                w.endNodeField("syntaxTransformer", temp_syntaxTransformer);
            }
            w.endNode(this, "_SyntaxTransformationExtentRange", 7);
        }
    }

}
