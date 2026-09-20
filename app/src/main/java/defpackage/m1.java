package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m1 implements yv0 {
    public h81<Long> a = n1.a;
    public final p1 b = new p1();
    public volatile long c;

    public m1(int i) {
    }

    @Override // defpackage.yv0
    public final long a() {
        long jLongValue = this.a.invoke().longValue();
        long j = this.c;
        p1 p1Var = this.b;
        p1Var.getClass();
        boolean z = jLongValue >= 0;
        if (p1Var.a != z) {
            p1Var.a = z;
            p1Var.b += (long) Integer.MAX_VALUE;
        }
        return j - (Math.abs(jLongValue) + p1Var.b);
    }
}
