package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pj4 extends z2n<nj4<?>> {
    public long a = -1;
    public xm b;

    @Override // defpackage.z2n
    public final boolean a(roZB rozb) {
        nj4 nj4Var = (nj4) rozb;
        if (this.a >= 0) {
            return false;
        }
        long j = nj4Var.E;
        if (j < nj4Var.F) {
            nj4Var.F = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.z2n
    public final z80[] b(roZB rozb) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((nj4) rozb).x(j);
    }
}
