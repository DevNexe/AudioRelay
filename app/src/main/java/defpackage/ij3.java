package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ij3 extends v05 {
    public final /* synthetic */ jj3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij3(jj3 jj3Var, String str) {
        super(str, true);
        this.e = jj3Var;
    }

    @Override // defpackage.v05
    public final long a() {
        jj3 jj3Var = this.e;
        long jNanoTime = System.nanoTime();
        int i = 0;
        long j = Long.MIN_VALUE;
        ej3 ej3Var = null;
        int i2 = 0;
        for (ej3 ej3Var2 : jj3Var.e) {
            synchronized (ej3Var2) {
                if (jj3Var.b(ej3Var2, jNanoTime) > 0) {
                    i2++;
                } else {
                    i++;
                    long j2 = jNanoTime - ej3Var2.q;
                    if (j2 > j) {
                        ej3Var = ej3Var2;
                        j = j2;
                    }
                    sd5 sd5Var = sd5.a;
                }
            }
        }
        long j3 = jj3Var.b;
        if (j < j3 && i <= jj3Var.a) {
            if (i > 0) {
                return j3 - j;
            }
            if (i2 > 0) {
                return j3;
            }
            return -1L;
        }
        synchronized (ej3Var) {
            if (!(!ej3Var.p.isEmpty()) && ej3Var.q + j == jNanoTime) {
                ej3Var.j = true;
                jj3Var.e.remove(ej3Var);
                qf5.e(ej3Var.d);
                if (jj3Var.e.isEmpty()) {
                    jj3Var.c.a();
                }
            }
        }
        return 0L;
    }
}
