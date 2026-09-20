package defpackage;

import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class JUCk {
    public static ej1 a;
    public static final boolean[] b = new boolean[3];
    public static final int[] c = {R.attr.keylines, R.attr.statusBarBackground};
    public static final int[] d = {android.R.attr.layout_gravity, R.attr.layout_anchor, R.attr.layout_anchorGravity, R.attr.layout_behavior, R.attr.layout_dodgeInsetEdges, R.attr.layout_insetEdge, R.attr.layout_keyline};

    public /* synthetic */ JUCk() {
        new s62();
        new nk4(0);
        new sy4((Object) null);
    }

    public static final dl3 a(vb2 vb2Var, int i, p95 p95Var, o55 o55Var, boolean z, int i2) {
        dl3 dl3VarC = o55Var != null ? o55Var.c(p95Var.b.b(i)) : dl3.e;
        int iP0 = vb2Var.p0(q25.a);
        float f = dl3VarC.a;
        return new dl3(z ? (i2 - f) - iP0 : f, dl3VarC.b, z ? i2 - f : iP0 + f, dl3VarC.d);
    }

    public static final Object b(qw qwVar, z80 z80Var) {
        xm xmVar = new xm(1, ps0.L(z80Var));
        xmVar.r();
        qwVar.b(new r04(xmVar));
        Object objP = xmVar.p();
        return objP == va0.COROUTINE_SUSPENDED ? objP : sd5.a;
    }

    public static final Object c(vk4 vk4Var, z80 z80Var) {
        xm xmVar = new xm(1, ps0.L(z80Var));
        xmVar.r();
        vk4Var.b(new s04(xmVar));
        return xmVar.p();
    }

    public static pg2 d(pg2 pg2Var, float f, dj4 dj4Var) {
        long j = ua1.a;
        if (Float.compare(f, 0) <= 0) {
            return pg2Var;
        }
        wo1.QnHx qnHx = wo1.a;
        return wo1.a(pg2Var, new cb(new zi4(f, dj4Var, false, j, j)));
    }

    public static String e(int i) {
        if (i == 1) {
            return "Text";
        }
        if (i == 2) {
            return "Ascii";
        }
        if (i == 3) {
            return "Number";
        }
        if (i == 4) {
            return "Phone";
        }
        if (i == 5) {
            return "Uri";
        }
        if (i == 6) {
            return "Email";
        }
        if (i == 7) {
            return "Password";
        }
        if (i == 8) {
            return "NumberPassword";
        }
        return i == 9 ? "Decimal" : "Invalid";
    }
}
