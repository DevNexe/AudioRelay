package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c2 {
    public final long a;
    public volatile long b;

    public c2(long j) {
        this.a = j;
    }

    public final void a(h81<sd5> h81Var) {
        if (zs.QnHx.a.c() - this.b > gq0.g(this.a)) {
            try {
                h81Var.invoke();
            } finally {
                this.b = zs.QnHx.a.c();
            }
        }
    }
}
