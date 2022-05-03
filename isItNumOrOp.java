public class isItNumOrOp {
    public static boolean NumOrOp(char chr) //throws NumberFormatException
    {
        boolean numop = false;
        if (!isItNum.Num(chr) && !isItOp.Op(chr)) {
            numop = true;
        }
        return numop;
    }
}
