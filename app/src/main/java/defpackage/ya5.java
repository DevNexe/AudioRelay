package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ya5 implements xa5 {
    public static volatile ne0 e;
    public final at a;
    public final at b;
    public final b54 c;
    public final ne5 d;

    public ya5(at atVar, at atVar2, b54 b54Var, ne5 ne5Var, ln5 ln5Var) {
        this.a = atVar;
        this.b = atVar2;
        this.c = b54Var;
        this.d = ne5Var;
        ln5Var.getClass();
        ln5Var.a.execute(new ty(ln5Var, 8));
    }

    public static ya5 a() {
        ne0 ne0Var = e;
        if (ne0Var != null) {
            return ne0Var.A.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (ya5.class) {
                if (e == null) {
                    context.getClass();
                    e = new ne0(context);
                }
            }
        }
    }
}
