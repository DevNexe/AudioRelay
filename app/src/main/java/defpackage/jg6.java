package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jg6 {
    public static final Object g = new Object();
    public final String a;
    public final qf6 b;
    public final Object c;
    public final Object d;
    public final Object e = new Object();
    public volatile Object f = null;

    public /* synthetic */ jg6(String str, Object obj, Object obj2, qf6 qf6Var) {
        this.a = str;
        this.c = obj;
        this.d = obj2;
        this.b = qf6Var;
    }

    public final Object a(Object obj) {
        synchronized (this.e) {
        }
        if (obj != null) {
            return obj;
        }
        if (Th.X == null) {
            return this.c;
        }
        synchronized (g) {
            if (sy4.d()) {
                return this.f == null ? this.c : this.f;
            }
            try {
                for (jg6 jg6Var : lg6.a) {
                    if (sy4.d()) {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                    Object objZza = null;
                    try {
                        qf6 qf6Var = jg6Var.b;
                        if (qf6Var != null) {
                            objZza = qf6Var.zza();
                        }
                    } catch (IllegalStateException unused) {
                    }
                    synchronized (g) {
                        jg6Var.f = objZza;
                    }
                }
            } catch (SecurityException unused2) {
            }
            qf6 qf6Var2 = this.b;
            if (qf6Var2 == null) {
                return this.c;
            }
            try {
                return qf6Var2.zza();
            } catch (IllegalStateException unused3) {
                return this.c;
            } catch (SecurityException unused4) {
                return this.c;
            }
        }
    }
}
