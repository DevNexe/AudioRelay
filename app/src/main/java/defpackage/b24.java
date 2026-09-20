package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class b24 extends cx1 implements x81<Integer, la0.CQf, Integer> {
    public final /* synthetic */ z14<?> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b24(z14<?> z14Var) {
        super(2);
        this.w = z14Var;
    }

    @Override // defpackage.x81
    public final Integer invoke(Integer num, la0.CQf cQf) {
        int iIntValue = num.intValue();
        la0.CQf cQf2 = cQf;
        la0.F1<?> key = cQf2.getKey();
        la0.CQf cQfJ = this.w.A.j(key);
        int i = ms1.j;
        if (key != ms1.CQf.w) {
            return Integer.valueOf(cQf2 != cQfJ ? Integer.MIN_VALUE : iIntValue + 1);
        }
        ms1 ms1Var = (ms1) cQfJ;
        ms1 parent = (ms1) cQf2;
        while (true) {
            if (parent != null) {
                if (parent == ms1Var || !(parent instanceof u54)) {
                    break;
                }
                fq fqVarA0 = ((u54) parent).A0();
                parent = fqVarA0 != null ? fqVarA0.getParent() : null;
            } else {
                parent = null;
                break;
            }
        }
        if (parent == ms1Var) {
            if (ms1Var != null) {
                iIntValue++;
            }
            return Integer.valueOf(iIntValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + parent + ", expected child of " + ms1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
