package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class so5 {
    public static final so5 b = new so5();
    public nx2 a = null;

    public static nx2 a(Context context) {
        nx2 nx2Var;
        so5 so5Var = b;
        synchronized (so5Var) {
            if (so5Var.a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                so5Var.a = new nx2(context);
            }
            nx2Var = so5Var.a;
        }
        return nx2Var;
    }
}
