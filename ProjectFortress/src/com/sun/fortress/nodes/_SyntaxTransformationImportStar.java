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
 * Class _SyntaxTransformationImportStar, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Thu Oct 11 03:24:55 EDT 2018
 */
@SuppressWarnings("unused")
public class _SyntaxTransformationImportStar extends ImportStar implements _SyntaxTransformation {
    private final java.util.Map<String, Level> _variables;
    private final java.util.List<String> _syntaxParameters;
    private final String _syntaxTransformer;

    /**
     * Constructs a _SyntaxTransformationImportStar.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public _SyntaxTransformationImportStar(Option<String> in_foreignLanguage, APIName in_apiName, List<IdOrOpOrAnonymousName> in_exceptNames, ASTNodeInfo in_info, java.util.Map<String, Level> in_variables, java.util.List<String> in_syntaxParameters, String in_syntaxTransformer) {
        super(in_info, in_foreignLanguage, in_apiName, in_exceptNames);
        if (in_variables == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'variables' to the _SyntaxTransformationImportStar constructor was null");
        }
        _variables = in_variables;
        if (in_syntaxParameters == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'syntaxParameters' to the _SyntaxTransformationImportStar constructor was null");
        }
        _syntaxParameters = in_syntaxParameters;
        if (in_syntaxTransformer == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'syntaxTransformer' to the _SyntaxTransformationImportStar constructor was null");
        }
        _syntaxTransformer = in_syntaxTransformer.intern();
    }

    /**
     * A constructor with some fields provided by default values.
     */
    public _SyntaxTransformationImportStar(Option<String> in_foreignLanguage, APIName in_apiName, List<IdOrOpOrAnonymousName> in_exceptNames, java.util.Map<String, Level> in_variables, java.util.List<String> in_syntaxParameters, String in_syntaxTransformer) {
        this(in_foreignLanguage, in_apiName, in_exceptNames, NodeFactory.makeASTNodeInfo(NodeFactory.macroSpan), in_variables, in_syntaxParameters, in_syntaxTransformer);
    }

    final public java.util.Map<String, Level> getVariables() { return _variables; }
    final public java.util.List<String> getSyntaxParameters() { return _syntaxParameters; }
    final public String getSyntaxTransformer() { return _syntaxTransformer; }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.for_SyntaxTransformationImportStar(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.for_SyntaxTransformationImportStar(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.for_SyntaxTransformationImportStar(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.for_SyntaxTransformationImportStar(this);
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
            _SyntaxTransformationImportStar casted = (_SyntaxTransformationImportStar) obj;
            Option<String> temp_foreignLanguage = getForeignLanguage();
            Option<String> casted_foreignLanguage = casted.getForeignLanguage();
            if (!(temp_foreignLanguage == casted_foreignLanguage || temp_foreignLanguage.equals(casted_foreignLanguage))) return false;
            APIName temp_apiName = getApiName();
            APIName casted_apiName = casted.getApiName();
            if (!(temp_apiName == casted_apiName || temp_apiName.equals(casted_apiName))) return false;
            List<IdOrOpOrAnonymousName> temp_exceptNames = getExceptNames();
            List<IdOrOpOrAnonymousName> casted_exceptNames = casted.getExceptNames();
            if (!(temp_exceptNames == casted_exceptNames || temp_exceptNames.equals(casted_exceptNames))) return false;
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
        Option<String> temp_foreignLanguage = getForeignLanguage();
        code ^= temp_foreignLanguage.hashCode();
        APIName temp_apiName = getApiName();
        code ^= temp_apiName.hashCode();
        List<IdOrOpOrAnonymousName> temp_exceptNames = getExceptNames();
        code ^= temp_exceptNames.hashCode();
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
    protected _SyntaxTransformationImportStar() {
        _variables = null;
        _syntaxParameters = null;
        _syntaxTransformer = null;
    }

    public Node accept(TemplateUpdateVisitor visitor) {
        return visitor.for_SyntaxTransformationImportStar(this);
    }
    /**
     * Single Span constructor, for template gap access.  Clients are 
     * responsible for never accessing other fields than the gapId and 
     * templateParams.
     */
    protected _SyntaxTransformationImportStar(ASTNodeInfo info) {
        super(info);
        _variables = null;
        _syntaxParameters = null;
        _syntaxTransformer = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "_SyntaxTransformationImportStar", 7)) {
            Option<String> temp_foreignLanguage = getForeignLanguage();
            if (w.visitNodeField("foreignLanguage", temp_foreignLanguage)) {
                if (temp_foreignLanguage.isNone()) {
                    w.visitEmptyOption(temp_foreignLanguage);
                }
                else if (w.visitNonEmptyOption(temp_foreignLanguage)) {
                    String elt_temp_foreignLanguage = temp_foreignLanguage.unwrap();
                    if (elt_temp_foreignLanguage == null) w.visitNull();
                    else {
                        w.visitString(elt_temp_foreignLanguage);
                    }
                    w.endNonEmptyOption(temp_foreignLanguage);
                }
                w.endNodeField("foreignLanguage", temp_foreignLanguage);
            }
            APIName temp_apiName = getApiName();
            if (w.visitNodeField("apiName", temp_apiName)) {
                temp_apiName.walk(w);
                w.endNodeField("apiName", temp_apiName);
            }
            List<IdOrOpOrAnonymousName> temp_exceptNames = getExceptNames();
            if (w.visitNodeField("exceptNames", temp_exceptNames)) {
                if (w.visitIterated(temp_exceptNames)) {
                    int i_temp_exceptNames = 0;
                    for (IdOrOpOrAnonymousName elt_temp_exceptNames : temp_exceptNames) {
                        if (w.visitIteratedElement(i_temp_exceptNames, elt_temp_exceptNames)) {
                            if (elt_temp_exceptNames == null) w.visitNull();
                            else {
                                elt_temp_exceptNames.walk(w);
                            }
                        }
                        i_temp_exceptNames++;
                    }
                    w.endIterated(temp_exceptNames, i_temp_exceptNames);
                }
                w.endNodeField("exceptNames", temp_exceptNames);
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
            w.endNode(this, "_SyntaxTransformationImportStar", 7);
        }
    }

}
