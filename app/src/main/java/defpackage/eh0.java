package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eh0 implements ob2 {
    public final zq1 w;
    public final int x;
    public final int y;

    public eh0(zq1 zq1Var, int i, int i2) {
        this.w = zq1Var;
        this.x = i;
        this.y = i2;
    }

    @Override // defpackage.zq1
    public final Object B() {
        return this.w.B();
    }

    @Override // defpackage.zq1
    public final int W(int i) {
        return this.w.W(i);
    }

    @Override // defpackage.zq1
    public final int c(int i) {
        return this.w.c(i);
    }

    @Override // defpackage.zq1
    public final int u(int i) {
        return this.w.u(i);
    }

    @Override // defpackage.zq1
    public final int x(int i) {
        return this.w.x(i);
    }

    @Override // defpackage.ob2
    public final b43 y(long j) {
        int i = this.y;
        int i2 = this.x;
        zq1 zq1Var = this.w;
        if (i == 1) {
            return new ny0(i2 == 2 ? zq1Var.x(g70.g(j)) : zq1Var.u(g70.g(j)), g70.g(j));
        }
        return new ny0(g70.h(j), i2 == 2 ? zq1Var.c(g70.h(j)) : zq1Var.W(g70.h(j)));
    }
}
