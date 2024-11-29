// Generated from f:/Apps/Stalker2Modding/Stalker2PakCfgMergeTool/Stalker2PakCfgMergeTool/grammar/Stalker2Cfg.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Stalker2CfgParser}.
 */
public interface Stalker2CfgListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Stalker2CfgParser#cfg}.
	 * @param ctx the parse tree
	 */
	void enterCfg(Stalker2CfgParser.CfgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stalker2CfgParser#cfg}.
	 * @param ctx the parse tree
	 */
	void exitCfg(Stalker2CfgParser.CfgContext ctx);
	/**
	 * Enter a parse tree produced by {@link Stalker2CfgParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(Stalker2CfgParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stalker2CfgParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(Stalker2CfgParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link Stalker2CfgParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(Stalker2CfgParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stalker2CfgParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(Stalker2CfgParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link Stalker2CfgParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(Stalker2CfgParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stalker2CfgParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(Stalker2CfgParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Stalker2CfgParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(Stalker2CfgParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stalker2CfgParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(Stalker2CfgParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Stalker2CfgParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(Stalker2CfgParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Stalker2CfgParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(Stalker2CfgParser.NumberContext ctx);
}