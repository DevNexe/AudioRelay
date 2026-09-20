package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ar4 implements zy0 {
    public final sy0 a;

    public ar4(ij0 ij0Var) {
        this.a = new sy0(br4.a, ij0Var);
    }

    @Override // defpackage.zy0
    public final void a() {
    }

    @Override // defpackage.zy0
    public final float b(float f, long j) {
        long j2 = j / 1000000;
        sy0.QnHx qnHxA = this.a.a(f);
        long j3 = qnHxA.c;
        return (((Math.signum(qnHxA.a) * dUh_.a(j3 > 0 ? j2 / j3 : 1.0f).b) * qnHxA.b) / j3) * 1000.0f;
    }

    @Override // defpackage.zy0
    public final float c(float f, float f2, long j) {
        long j2 = j / 1000000;
        sy0.QnHx qnHxA = this.a.a(f2);
        long j3 = qnHxA.c;
        return (Math.signum(qnHxA.a) * qnHxA.b * dUh_.a(j3 > 0 ? j2 / j3 : 1.0f).a) + f;
    }

    @Override // defpackage.zy0
    public final long d(float f) {
        return ((long) (Math.exp(this.a.b(f) / (((double) ty0.a) - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // defpackage.zy0
    public final float e(float f, float f2) {
        sy0 sy0Var = this.a;
        double dB = sy0Var.b(f2);
        double d = ty0.a;
        return (Math.signum(f2) * ((float) (Math.exp((d / (d - 1.0d)) * dB) * ((double) (sy0Var.a * sy0Var.c))))) + f;
    }
}
