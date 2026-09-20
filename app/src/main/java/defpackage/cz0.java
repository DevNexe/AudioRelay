package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cz0 implements vy0 {
    public final int a;
    public final int b;
    public final mq0 c;

    public cz0(int i, int i2, mq0 mq0Var) {
        this.a = i;
        this.b = i2;
        this.c = mq0Var;
    }

    @Override // defpackage.Ah
    public final bh5 a(pb5 pb5Var) {
        return new gh5(this);
    }

    @Override // defpackage.vy0
    public final float b(long j, float f, float f2, float f3) {
        long jP = AY.p((j / 1000000) - ((long) this.b), 0L, this.a);
        if (jP < 0) {
            return 0.0f;
        }
        if (jP == 0) {
            return f3;
        }
        return (e(jP * 1000000, f, f2, f3) - e((jP - 1) * 1000000, f, f2, f3)) * 1000.0f;
    }

    @Override // defpackage.vy0
    public final long c(float f, float f2, float f3) {
        return ((long) (this.b + this.a)) * 1000000;
    }

    @Override // defpackage.vy0
    public final float d(float f, float f2, float f3) {
        return b(c(f, f2, f3), f, f2, f3);
    }

    @Override // defpackage.vy0
    public final float e(long j, float f, float f2, float f3) {
        long j2 = (j / 1000000) - ((long) this.b);
        int i = this.a;
        float fA = this.c.a(AY.n(i == 0 ? 1.0f : AY.p(j2, 0L, i) / i, 0.0f, 1.0f));
        qb5 qb5Var = mg5.a;
        return (f2 * fA) + ((1 - fA) * f);
    }
}
