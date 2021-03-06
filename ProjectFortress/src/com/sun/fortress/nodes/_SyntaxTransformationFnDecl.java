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
 * Class _SyntaxTransformationFnDecl, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Thu Oct 11 03:24:55 EDT 2018
 */
@SuppressWarnings("unused")
public class _SyntaxTransformationFnDecl extends FnDecl implements _SyntaxTransformation {
    private final java.util.Map<String, Level> _variables;
    private final java.util.List<String> _syntaxParameters;
    private final String _syntaxTransformer;

    /**
     * Constructs a _SyntaxTransformationFnDecl.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public _SyntaxTransformationFnDecl(FnHeader in_header, IdOrOp in_unambiguousName, Option<Expr> in_body, Option<IdOrOp> in_implementsUnambiguousName, ASTNodeInfo in_info, java.util.Map<String, Level> in_variables, java.util.List<String> in_syntaxParameters, String in_syntaxTransformer) {
        super(in_info, in_header, in_unambiguousName, in_body, in_implementsUnambiguousName);
        if (in_variables == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'variables' to the _SyntaxTransformationFnDecl constructor was null");
        }
        _variables = in_variables;
        if (in_syntaxParameters == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'syntaxParameters' to the _SyntaxTransformationFnDecl constructor was null");
        }
        _syntaxParameters = in_syntaxParameters;
        if (in_syntaxTransformer == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'syntaxTransformer' to the _SyntaxTransformationFnDecl constructor was null");
        }
        _syntaxTransformer = in_syntaxTransformer.intern();
    }

    /**
     * A constructor with some fields provided by default values.
     */
    public _SyntaxTransformationFnDecl(FnHeader in_header, IdOrOp in_unambiguousName, Option<Expr> in_body, Option<IdOrOp> in_implementsUnambiguousName, java.util.Map<String, Level> in_variables, java.util.List<String> in_syntaxParameters, String in_syntaxTransformer) {
        this(in_header, in_unambiguousName, in_body, in_implementsUnambiguousName, NodeFactory.makeASTNodeInfo(NodeFactory.macroSpan), in_variables, in_syntaxParameters, in_syntaxTransformer);
    }

    final public java.util.Map<String, Level> getVariables() { return _variables; }
    final public java.util.List<String> getSyntaxParameters() { return _syntaxParameters; }
    final public String getSyntaxTransformer() { return _syntaxTransformer; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.for_SyntaxTransformationFnDecl(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.for_SyntaxTransformationFnDecl(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.for_SyntaxTransformationFnDecl(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.for_SyntaxTransformationFnDecl(this);
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
            _SyntaxTransformationFnDecl casted = (_SyntaxTransformationFnDecl) obj;
            FnHeader temp_header = getHeader();
            FnHeader casted_header = casted.getHeader();
            if (!(temp_header == casted_header || temp_header.equals(casted_header))) return false;
            IdOrOp temp_unambiguousName = getUnambiguousName();
            IdOrOp casted_unambiguousName = casted.getUnambiguousName();
            if (!(temp_unambiguousName == casted_unambiguousName || temp_unambiguousName.equals(casted_unambiguousName))) return false;
            Option<Expr> temp_body = getBody();
            Option<Expr> casted_body = casted.getBody();
            if (!(temp_body == casted_body || temp_body.equals(casted_body))) return false;
            Option<IdOrOp> temp_implementsUnambiguousName = getImplementsUnambiguousName();
            Option<IdOrOp> casted_implementsUnambiguousName = casted.getImplementsUnambiguousName();
            if (!(temp_implementsUnambiguousName == casted_implementsUnambiguousName || temp_implementsUnambiguousName.equals(casted_implementsUnambiguousName))) return false;
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
        FnHeader temp_header = getHeader();
        code ^= temp_header.hashCode();
        IdOrOp temp_unambiguousName = getUnambiguousName();
        code ^= temp_unambiguousName.hashCode();
        Option<Expr> temp_body = getBody();
        code ^= temp_body.hashCode();
        Option<IdOrOp> temp_implementsUnambiguousName = getImplementsUnambiguousName();
        code ^= temp_implementsUnambiguousName.hashCode();
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
    protected _SyntaxTransformationFnDecl() {
        _variables = null;
        _syntaxParameters = null;
        _syntaxTransformer = null;
    }

    public Node accept(TemplateUpdateVisitor visitor) {
        return visitor.for_SyntaxTransformationFnDecl(this);
    }
    /**
     * Single Span constructor, for template gap access.  Clients are 
     * responsible for never accessing other fields than the gapId and 
     * templateParams.
     */
    protected _SyntaxTransformationFnDecl(ASTNodeInfo info) {
        super(info);
        _variables = null;
        _syntaxParameters = null;
        _syntaxTransformer = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "_SyntaxTransformationFnDecl", 8)) {
            FnHeader temp_header = getHeader();
            if (w.visitNodeField("header", temp_header)) {
                temp_header.walk(w);
                w.endNodeField("header", temp_header);
            }
            IdOrOp temp_unambiguousName = getUnambiguousName();
            if (w.visitNodeField("unambiguousName", temp_unambiguousName)) {
                temp_unambiguousName.walk(w);
                w.endNodeField("unambiguousName", temp_unambiguousName);
            }
            Option<Expr> temp_body = getBody();
            if (w.visitNodeField("body", temp_body)) {
                if (temp_body.isNone()) {
                    w.visitEmptyOption(temp_body);
                }
                else if (w.visitNonEmptyOption(temp_body)) {
                    Expr elt_temp_body = temp_body.unwrap();
                    if (elt_temp_body == null) w.visitNull();
                    else {
                        elt_temp_body.walk(w);
                    }
                    w.endNonEmptyOption(temp_body);
                }
                w.endNodeField("body", temp_body);
            }
            Option<IdOrOp> temp_implementsUnambiguousName = getImplementsUnambiguousName();
            if (w.visitNodeField("implementsUnambiguousName", temp_implementsUnambiguousName)) {
                if (temp_implementsUnambiguousName.isNone()) {
                    w.visitEmptyOption(temp_implementsUnambiguousName);
                }
                else if (w.visitNonEmptyOption(temp_implementsUnambiguousName)) {
                    IdOrOp elt_temp_implementsUnambiguousName = temp_implementsUnambiguousName.unwrap();
                    if (elt_temp_implementsUnambiguousName == null) w.visitNull();
                    else {
                        elt_temp_implementsUnambiguousName.walk(w);
                    }
                    w.endNonEmptyOption(temp_implementsUnambiguousName);
                }
                w.endNodeField("implementsUnambiguousName", temp_implementsUnambiguousName);
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
            w.endNode(this, "_SyntaxTransformationFnDecl", 8);
        }
    }

}
