package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tj0 {
    public final bb5<yy1> a;

    public tj0() {
        qLd.h(3, sj0.w);
        this.a = new bb5<>(new rj0());
    }

    public final void a(yy1 yy1Var) {
        if (!yy1Var.E()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.a.add(yy1Var);
    }

    public final boolean b(yy1 yy1Var) {
        if (yy1Var.E()) {
            return this.a.remove(yy1Var);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final String toString() {
        return this.a.toString();
    }
}
