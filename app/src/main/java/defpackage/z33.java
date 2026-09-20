package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class z33 {
    public final cd4 a;
    public final x33 b;
    public final OW8 c;
    public final qq3 d;
    public final HashMap<j33, p33> e = new HashMap<>();

    public z33(cd4 cd4Var, x33 x33Var, OW8 ow8, qq3 qq3Var) {
        this.a = cd4Var;
        this.b = x33Var;
        this.c = ow8;
        this.d = qq3Var;
    }

    public final j33 a(je4 je4Var) {
        this.c.getClass();
        x40 x40Var = je4Var.m().a;
        BSo qnHx = x40Var == null ? BSo.CQf.a : new BSo.QnHx(x40Var.a);
        gc4 gc4VarM = je4Var.m();
        boolean z = gc4VarM.d;
        nh2 nh2Var = gc4VarM.b;
        return new j33(qnHx, new l51(z, nh2Var == null ? m51.CQf.a : new m51.QnHx(nh2Var.a, nh2Var.b)));
    }
}
