package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j70 implements lm2 {
    public final boolean w;
    public final boolean x;

    public j70(boolean z, boolean z2) {
        this.w = z;
        this.x = z2;
    }

    @Override // defpackage.lm2
    public final Object a(long j, long j2, z80<? super mh5> z80Var) {
        return new mh5(XTd3.c(this.w ? mh5.b(j2) : 0.0f, this.x ? mh5.c(j2) : 0.0f));
    }

    @Override // defpackage.lm2
    public final long b(int i, long j) {
        return kt2.b;
    }

    @Override // defpackage.lm2
    public final long d(int i, long j, long j2) {
        if (i == 2) {
            return X.a(this.w ? kt2.c(j2) : 0.0f, this.x ? kt2.d(j2) : 0.0f);
        }
        int i2 = kt2.e;
        return kt2.b;
    }

    @Override // defpackage.lm2
    public final Object e(long j, z80 z80Var) {
        return new mh5(mh5.b);
    }
}
