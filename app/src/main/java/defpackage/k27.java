package defpackage;

import com.google.android.gms.internal.measurement.zzko;

/* JADX INFO: loaded from: classes3.dex */
public class k27 {
    public volatile q37 a;
    public volatile a07 b;

    static {
        q07 q07Var = q07.b;
    }

    public final a07 a() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            if (this.a == null) {
                this.b = a07.x;
            } else {
                this.b = this.a.a();
            }
            return this.b;
        }
    }

    public final void b(q37 q37Var) {
        if (this.a != null) {
            return;
        }
        synchronized (this) {
            if (this.a == null) {
                try {
                    this.a = q37Var;
                    this.b = a07.x;
                } catch (zzko unused) {
                    this.a = q37Var;
                    this.b = a07.x;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k27)) {
            return false;
        }
        k27 k27Var = (k27) obj;
        q37 q37Var = this.a;
        q37 q37Var2 = k27Var.a;
        if (q37Var == null && q37Var2 == null) {
            return a().equals(k27Var.a());
        }
        if (q37Var != null && q37Var2 != null) {
            return q37Var.equals(q37Var2);
        }
        if (q37Var != null) {
            k27Var.b(q37Var.c());
            return q37Var.equals(k27Var.a);
        }
        b(q37Var2.c());
        return this.a.equals(q37Var2);
    }

    public final int hashCode() {
        return 1;
    }
}
