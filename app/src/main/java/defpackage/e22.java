package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e22 extends cx1 implements j81<Integer, Boolean> {
    public final /* synthetic */ q12 w;
    public final /* synthetic */ ua0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e22(q12 q12Var, ua0 ua0Var) {
        super(1);
        this.w = q12Var;
        this.x = ua0Var;
    }

    @Override // defpackage.j81
    public final Boolean invoke(Integer num) {
        int iIntValue = num.intValue();
        q12 q12Var = this.w;
        if (iIntValue >= 0 && iIntValue < q12Var.g().d()) {
            fp1.k0(this.x, null, 0, new d22(q12Var, iIntValue, null), 3);
            return Boolean.TRUE;
        }
        StringBuilder sbC = iZUl.c("Can't scroll to index ", iIntValue, ", it is out of bounds [0, ");
        sbC.append(q12Var.g().d());
        sbC.append(')');
        throw new IllegalArgumentException(sbC.toString().toString());
    }
}
