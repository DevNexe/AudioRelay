package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sv2<T> implements pg3<T>, mi0<T> {
    public static final un c = new un(3);
    public static final nz d = new nz(1);
    public mi0.QnHx<T> a;
    public volatile pg3<T> b;

    public sv2(un unVar, pg3 pg3Var) {
        this.a = unVar;
        this.b = pg3Var;
    }

    public final void a(mi0.QnHx<T> qnHx) {
        pg3<T> pg3Var;
        pg3<T> pg3Var2;
        pg3<T> pg3Var3 = this.b;
        nz nzVar = d;
        if (pg3Var3 != nzVar) {
            qnHx.f(pg3Var3);
            return;
        }
        synchronized (this) {
            pg3Var = this.b;
            if (pg3Var != nzVar) {
                pg3Var2 = pg3Var;
            } else {
                this.a = new ey0(this.a, qnHx);
                pg3Var2 = null;
            }
        }
        if (pg3Var2 != null) {
            qnHx.f(pg3Var);
        }
    }

    @Override // defpackage.pg3
    public final T get() {
        return this.b.get();
    }
}
