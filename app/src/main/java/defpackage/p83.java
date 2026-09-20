package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p83 extends cx1 implements j81<ul2, sd5> {
    public static final p83 w = new p83();

    public p83() {
        super(1);
    }

    @Override // defpackage.j81
    public final sd5 invoke(ul2 ul2Var) {
        ul2 ul2Var2 = ul2Var;
        ul2Var2.getClass();
        if (!(!iv4.s("idle"))) {
            throw new IllegalArgumentException("Cannot pop up to an empty route".toString());
        }
        ul2Var2.d = "idle";
        ul2Var2.c = -1;
        ul2Var2.e = false;
        z93 z93Var = new z93();
        tl2.w.invoke(z93Var);
        ul2Var2.e = z93Var.a;
        ul2Var2.f = z93Var.b;
        return sd5.a;
    }
}
