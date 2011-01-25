package brainfuckcompiler.expressions.nodetypes;

import brainfuckcompiler.code.BrainfuckTools;
import brainfuckcompiler.expressions.Node;
import brainfuckcompiler.statics;

/**
 *
 * @author vrighter
 */
public class Constant extends Node
{

    int value = 0;

    /**
     *
     * @param tokens
     * @param index
     * @return
     */
    public int populate(String[] tokens, int index)
    {
        value = Integer.parseInt(tokens[index + 1]);
        return index;
    }

    /**
     *
     * @return
     */
    public int generateBF()
    {
        int address = statics.t.alloc();
        if (value != 0)
        {
            statics.t.to(address);
            statics.t.plus(value);
        }
        return address;
    }
}