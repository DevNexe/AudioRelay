package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g71 extends cx1 implements j81<ul2, sd5> {
    public static final g71 w = new g71();

    public g71() {
        super(1);
    }

    @Override // defpackage.j81
    public final sd5 invoke(ul2 ul2Var) {
        ul2 ul2Var2 = ul2Var;
        ou3.auxFixed auxVar = ou3.auxFixed.e;
        ul2Var2.getClass();
        if (!(!iv4.s("fullscreen"))) {
            throw new IllegalArgumentException("Cannot pop up to an empty route".toString());
        }
        ul2Var2.d = "fullscreen";
        ul2Var2.c = -1;
        ul2Var2.e = false;
        z93 z93Var = new z93();
        f71.w.invoke(z93Var);
        ul2Var2.e = z93Var.a;
        ul2Var2.f = z93Var.b;
        return sd5.a;
    }
}
