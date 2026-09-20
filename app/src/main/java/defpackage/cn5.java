package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class cn5 implements y60.QnHx {
    public static final String d = s52.e("WorkConstraintsTracker");
    public final bn5 a;
    public final y60<?>[] b;
    public final Object c;

    public cn5(Context context, c15 c15Var, bn5 bn5Var) {
        Context applicationContext = context.getApplicationContext();
        this.a = bn5Var;
        this.b = new y60[]{new q9(applicationContext, c15Var), new s9(applicationContext, c15Var), new cu4(applicationContext, c15Var), new fn2(applicationContext, c15Var), new do2(applicationContext, c15Var), new kn2(applicationContext, c15Var), new jn2(applicationContext, c15Var)};
        this.c = new Object();
    }

    public final boolean a(String str) {
        synchronized (this.c) {
            for (y60<?> y60Var : this.b) {
                Object obj = y60Var.b;
                if (obj != null && y60Var.c(obj) && y60Var.a.contains(str)) {
                    s52.c().a(d, String.format("Work %s constrained by %s", str, y60Var.getClass().getSimpleName()), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public final void b(Collection collection) {
        synchronized (this.c) {
            for (y60<?> y60Var : this.b) {
                if (y60Var.d != null) {
                    y60Var.d = null;
                    y60Var.e(null, y60Var.b);
                }
            }
            for (y60<?> y60Var2 : this.b) {
                y60Var2.d(collection);
            }
            for (y60<?> y60Var3 : this.b) {
                if (y60Var3.d != this) {
                    y60Var3.d = this;
                    y60Var3.e(this, y60Var3.b);
                }
            }
        }
    }

    public final void c() {
        synchronized (this.c) {
            for (y60<?> y60Var : this.b) {
                ArrayList arrayList = y60Var.a;
                if (!arrayList.isEmpty()) {
                    arrayList.clear();
                    c70<?> c70Var = y60Var.c;
                    synchronized (c70Var.c) {
                        if (c70Var.d.remove(y60Var) && c70Var.d.isEmpty()) {
                            c70Var.d();
                        }
                    }
                }
            }
        }
    }
}
