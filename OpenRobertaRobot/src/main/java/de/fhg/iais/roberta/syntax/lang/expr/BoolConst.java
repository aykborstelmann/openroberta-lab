package de.fhg.iais.roberta.syntax.lang.expr;

import java.util.List;

import de.fhg.iais.roberta.blockly.generated.Block;
import de.fhg.iais.roberta.blockly.generated.Field;
import de.fhg.iais.roberta.syntax.BlockTypeContainer;
import de.fhg.iais.roberta.syntax.BlocklyBlockProperties;
import de.fhg.iais.roberta.syntax.BlocklyComment;
import de.fhg.iais.roberta.syntax.BlocklyConstants;
import de.fhg.iais.roberta.syntax.Phrase;
import de.fhg.iais.roberta.transformer.Ast2Jaxb;
import de.fhg.iais.roberta.transformer.Jaxb2Ast;
import de.fhg.iais.roberta.typecheck.BlocklyType;

/**
 * This class represents the <b>logic_boolean</b> block from Blockly into the AST (abstract syntax tree). Object from this class will generate boolean
 * constant.<br/>
 * <br>
 * The client must provide the value of the boolean constant. <br>
 * <br>
 * To create an instance from this class use the method {@link #make(boolean, BlocklyBlockProperties, BlocklyComment)}.<br>
 */
public class BoolConst<V> extends Expr<V> {
    private final boolean value;

    private BoolConst(boolean value, BlocklyBlockProperties properties, BlocklyComment comment) {
        super(BlockTypeContainer.getByName("BOOL_CONST"), properties, comment);
        this.value = value;
        setReadOnly();
    }

    /**
     * creates instance of {@link BoolConst}. This instance is read only and can not be modified.
     *
     * @param value that the boolean constant will have,
     * @param properties of the block (see {@link BlocklyBlockProperties}),
     * @param comment added from the user,
     * @return read only object of class {@link BoolConst}
     */
    public static <V> BoolConst<V> make(boolean value, BlocklyBlockProperties properties, BlocklyComment comment) {
        return new BoolConst<>(value, properties, comment);
    }

    public static <V> BoolConst<V> make(boolean value) {
        return new BoolConst<>(value, BlocklyBlockProperties.make("1", "1"), null);
    }

    /**
     * @return the value of the boolean constant.
     */
    public boolean getValue() {
        return this.value;
    }

    @Override
    public int getPrecedence() {
        return 999;
    }

    @Override
    public Assoc getAssoc() {
        return Assoc.NONE;
    }

    @Override
    public BlocklyType getVarType() {
        return BlocklyType.BOOLEAN;
    }

    @Override
    public String toString() {
        return "BoolConst [" + this.value + "]";
    }

    /**
     * Transformation from JAXB object to corresponding AST object.
     *
     * @param block for transformation
     * @param helper class for making the transformation
     * @return corresponding AST object
     */
    public static <V> Phrase<V> jaxbToAst(Block block) {
        List<Field> fields = Jaxb2Ast.extractFields(block, (short) 1);
        String field = Jaxb2Ast.extractField(fields, BlocklyConstants.BOOL);
        return BoolConst.make(Boolean.parseBoolean(field.toLowerCase()), Jaxb2Ast.extractBlockProperties(block), Jaxb2Ast.extractComment(block));
    }

    @Override
    public Block astToBlock() {
        Block jaxbDestination = new Block();
        Ast2Jaxb.setBasicProperties(this, jaxbDestination);
        String fieldValue = String.valueOf(((BoolConst<?>) this).getValue()).toUpperCase();
        Ast2Jaxb.addField(jaxbDestination, BlocklyConstants.BOOL, fieldValue);
        return jaxbDestination;
    }

}
