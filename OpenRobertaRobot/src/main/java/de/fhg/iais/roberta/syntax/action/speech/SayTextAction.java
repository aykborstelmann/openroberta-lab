package de.fhg.iais.roberta.syntax.action.speech;

import java.util.List;

import de.fhg.iais.roberta.blockly.generated.Block;
import de.fhg.iais.roberta.blockly.generated.Value;
import de.fhg.iais.roberta.syntax.BlockTypeContainer;
import de.fhg.iais.roberta.syntax.BlocklyBlockProperties;
import de.fhg.iais.roberta.syntax.BlocklyComment;
import de.fhg.iais.roberta.syntax.BlocklyConstants;
import de.fhg.iais.roberta.syntax.Phrase;
import de.fhg.iais.roberta.syntax.action.Action;
import de.fhg.iais.roberta.syntax.lang.expr.Expr;
import de.fhg.iais.roberta.transformer.Ast2Jaxb;
import de.fhg.iais.roberta.transformer.ExprParam;
import de.fhg.iais.roberta.transformer.Jaxb2Ast;
import de.fhg.iais.roberta.transformer.Jaxb2ProgramAst;
import de.fhg.iais.roberta.typecheck.BlocklyType;
import de.fhg.iais.roberta.util.dbc.Assert;

/**
 * This class represents the <b>naoActions_sayText</b> block from Blockly into the AST (abstract syntax tree). Object from this class will generate code for
 * making the robot say the text.<br>
 * <br>
 * <br>
 */
public class SayTextAction<V> extends Action<V> {
    private final Expr<V> msg;
    private final Expr<V> speed;
    private final Expr<V> pitch;

    private SayTextAction(Expr<V> msg, Expr<V> speed, Expr<V> pitch, BlocklyBlockProperties properties, BlocklyComment comment) {
        super(BlockTypeContainer.getByName("SAY_TEXT"), properties, comment);
        Assert.isTrue(msg != null && speed != null && pitch != null);
        this.msg = msg;
        this.speed = speed;
        this.pitch = pitch;
        setReadOnly();
    }

    /**
     * Creates instance of {@link SayTextAction}. This instance is read only and can not be modified.
     *
     * @param msg {@link Expr} that will be printed on the display of the brick; must be <b>not</b> null,
     * @param properties of the block (see {@link BlocklyBlockProperties}),
     * @param comment added from the user,
     * @return read only object of class {@link SayTextAction}
     */
    public static <V> SayTextAction<V> make(Expr<V> msg, Expr<V> speed, Expr<V> pitch, BlocklyBlockProperties properties, BlocklyComment comment) {
        return new SayTextAction<>(msg, speed, pitch, properties, comment);
    }

    /**
     * @return the message.
     */
    public Expr<V> getMsg() {
        return this.msg;
    }

    /**
     * @return the speed.
     */
    public Expr<V> getSpeed() {
        return this.speed;
    }

    /**
     * @return the pitch.
     */
    public Expr<V> getPitch() {
        return this.pitch;
    }

    @Override
    public String toString() {
        return "SayTextAction [" + this.msg + ", " + this.speed + ", " + this.pitch + "]";
    }

    /**
     * Transformation from JAXB object to corresponding AST object.
     *
     * @param block for transformation
     * @param helper class for making the transformation
     * @return corresponding AST object
     */
    public static <V> Phrase<V> jaxbToAst(Block block, Jaxb2ProgramAst<V> helper) {
        List<Value> values = Jaxb2Ast.extractValues(block, (short) 3);
        Phrase<V> msg = helper.extractValue(values, new ExprParam(BlocklyConstants.OUT, BlocklyType.STRING));
        Phrase<V> speed = helper.extractValue(values, new ExprParam(BlocklyConstants.VOICESPEED, BlocklyType.NUMBER_INT));
        Phrase<V> pitch = helper.extractValue(values, new ExprParam(BlocklyConstants.VOICEPITCH, BlocklyType.NUMBER_INT));
        return SayTextAction
            .make(
                Jaxb2Ast.convertPhraseToExpr(msg),
                Jaxb2Ast.convertPhraseToExpr(speed),
                Jaxb2Ast.convertPhraseToExpr(pitch),
                Jaxb2Ast.extractBlockProperties(block),
                Jaxb2Ast.extractComment(block));
    }

    @Override
    public Block astToBlock() {
        Block jaxbDestination = new Block();
        Ast2Jaxb.setBasicProperties(this, jaxbDestination);

        Ast2Jaxb.addValue(jaxbDestination, BlocklyConstants.OUT, this.msg);
        Ast2Jaxb.addValue(jaxbDestination, BlocklyConstants.VOICESPEED, this.speed);
        Ast2Jaxb.addValue(jaxbDestination, BlocklyConstants.VOICEPITCH, this.pitch);

        return jaxbDestination;
    }

}
