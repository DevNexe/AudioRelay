package defpackage;

import defpackage.z_Mm;

/* JADX INFO: loaded from: classes.dex */
public final class lh5<V extends z_Mm> implements fh5<V> {
    public final int a;
    public final int b;
    public final mq0 c;
    public final gh5<V> d;

    public lh5(int i, int i2, mq0 mq0Var) {
        this.a = i;
        this.b = i2;
        this.c = mq0Var;
        this.d = new gh5<>(new cz0(i, i2, mq0Var));
    }

    @Override // defpackage.bh5
    public final /* synthetic */ boolean a() {
        return false;
    }

    @Override // defpackage.bh5
    public final V b(long j, V v, V v2, V v3) {
        return (V) this.d.b(j, v, v2, v3);
    }

    @Override // defpackage.fh5
    public final int c() {
        return this.b;
    }

    @Override // defpackage.fh5
    public final int d() {
        return this.a;
    }

    @Override // defpackage.bh5
    public final V e(long j, V v, V v2, V v3) {
        return (V) this.d.e(j, v, v2, v3);
    }

    @Override // defpackage.bh5
    public final z_Mm f(z_Mm z_mm, z_Mm z_mm2, z_Mm z_mm3) {
        return b(g(z_mm, z_mm2, z_mm3), z_mm, z_mm2, z_mm3);
    }

    @Override // defpackage.bh5
    public final long g(z_Mm z_mm, z_Mm z_mm2, z_Mm z_mm3) {
        return ((long) (d() + c())) * 1000000;
    }
}
