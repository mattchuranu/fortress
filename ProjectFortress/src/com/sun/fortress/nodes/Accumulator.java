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
 * Class Accumulator, a component of the ASTGen-generated composite hierarchy.
 * Note: null is not allowed as a value for any field.
 * @version  Generated automatically by ASTGen at Thu Oct 11 03:24:55 EDT 2018
 */
@SuppressWarnings("unused")
public class Accumulator extends BigOpApp {
    private final Op _accOp;
    private final List<GeneratorClause> _gens;
    private final Expr _body;

    /**
     * Constructs a Accumulator.
     * @throws java.lang.IllegalArgumentException  If any parameter to the constructor is null.
     */
    public Accumulator(ExprInfo in_info, List<StaticArg> in_staticArgs, Op in_accOp, List<GeneratorClause> in_gens, Expr in_body) {
        super(in_info, in_staticArgs);
        if (in_accOp == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'accOp' to the Accumulator constructor was null");
        }
        _accOp = in_accOp;
        if (in_gens == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'gens' to the Accumulator constructor was null");
        }
        _gens = in_gens;
        if (in_body == null) {
            throw new java.lang.IllegalArgumentException("Parameter 'body' to the Accumulator constructor was null");
        }
        _body = in_body;
    }

    final public Op getAccOp() { return _accOp; }
    final public List<GeneratorClause> getGens() { return _gens; }
    final public Expr getBody() { return _body; }

    public <RetType> RetType accept(ExprVisitor<RetType> visitor) {
        return visitor.forAccumulator(this);
    }

    public <RetType> RetType accept(AbstractNodeVisitor<RetType> visitor) {
        return visitor.forAccumulator(this);
    }

    public <RetType> RetType accept(NodeVisitor<RetType> visitor) {
        return visitor.forAccumulator(this);
    }

    public void accept(ExprVisitor_void visitor) {
        visitor.forAccumulator(this);
    }

    public void accept(AbstractNodeVisitor_void visitor) {
        visitor.forAccumulator(this);
    }

    public void accept(NodeVisitor_void visitor) {
        visitor.forAccumulator(this);
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
            Accumulator casted = (Accumulator) obj;
            ExprInfo temp_info = getInfo();
            ExprInfo casted_info = casted.getInfo();
            if (!(temp_info == casted_info || temp_info.equals(casted_info))) return false;
            List<StaticArg> temp_staticArgs = getStaticArgs();
            List<StaticArg> casted_staticArgs = casted.getStaticArgs();
            if (!(temp_staticArgs == casted_staticArgs || temp_staticArgs.equals(casted_staticArgs))) return false;
            Op temp_accOp = getAccOp();
            Op casted_accOp = casted.getAccOp();
            if (!(temp_accOp == casted_accOp || temp_accOp.equals(casted_accOp))) return false;
            List<GeneratorClause> temp_gens = getGens();
            List<GeneratorClause> casted_gens = casted.getGens();
            if (!(temp_gens == casted_gens || temp_gens.equals(casted_gens))) return false;
            Expr temp_body = getBody();
            Expr casted_body = casted.getBody();
            if (!(temp_body == casted_body || temp_body.equals(casted_body))) return false;
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
        ExprInfo temp_info = getInfo();
        code ^= temp_info.hashCode();
        List<StaticArg> temp_staticArgs = getStaticArgs();
        code ^= temp_staticArgs.hashCode();
        Op temp_accOp = getAccOp();
        code ^= temp_accOp.hashCode();
        List<GeneratorClause> temp_gens = getGens();
        code ^= temp_gens.hashCode();
        Expr temp_body = getBody();
        code ^= temp_body.hashCode();
        return code;
    }

    /**
     * Empty constructor, for reflective access.  Clients are 
     * responsible for manually instantiating each field.
     */
    protected Accumulator() {
        _accOp = null;
        _gens = null;
        _body = null;
    }

    /**
     * Single Span constructor, for template gap access.  Clients are 
     * responsible for never accessing other fields than the gapId and 
     * templateParams.
     */
    protected Accumulator(ExprInfo info) {
        super(info);
        _accOp = null;
        _gens = null;
        _body = null;
    }

    public void walk(TreeWalker w) {
        if (w.visitNode(this, "Accumulator", 5)) {
            ExprInfo temp_info = getInfo();
            if (w.visitNodeField("info", temp_info)) {
                temp_info.walk(w);
                w.endNodeField("info", temp_info);
            }
            List<StaticArg> temp_staticArgs = getStaticArgs();
            if (w.visitNodeField("staticArgs", temp_staticArgs)) {
                if (w.visitIterated(temp_staticArgs)) {
                    int i_temp_staticArgs = 0;
                    for (StaticArg elt_temp_staticArgs : temp_staticArgs) {
                        if (w.visitIteratedElement(i_temp_staticArgs, elt_temp_staticArgs)) {
                            if (elt_temp_staticArgs == null) w.visitNull();
                            else {
                                elt_temp_staticArgs.walk(w);
                            }
                        }
                        i_temp_staticArgs++;
                    }
                    w.endIterated(temp_staticArgs, i_temp_staticArgs);
                }
                w.endNodeField("staticArgs", temp_staticArgs);
            }
            Op temp_accOp = getAccOp();
            if (w.visitNodeField("accOp", temp_accOp)) {
                temp_accOp.walk(w);
                w.endNodeField("accOp", temp_accOp);
            }
            List<GeneratorClause> temp_gens = getGens();
            if (w.visitNodeField("gens", temp_gens)) {
                if (w.visitIterated(temp_gens)) {
                    int i_temp_gens = 0;
                    for (GeneratorClause elt_temp_gens : temp_gens) {
                        if (w.visitIteratedElement(i_temp_gens, elt_temp_gens)) {
                            if (elt_temp_gens == null) w.visitNull();
                            else {
                                elt_temp_gens.walk(w);
                            }
                        }
                        i_temp_gens++;
                    }
                    w.endIterated(temp_gens, i_temp_gens);
                }
                w.endNodeField("gens", temp_gens);
            }
            Expr temp_body = getBody();
            if (w.visitNodeField("body", temp_body)) {
                temp_body.walk(w);
                w.endNodeField("body", temp_body);
            }
            w.endNode(this, "Accumulator", 5);
        }
    }

}
