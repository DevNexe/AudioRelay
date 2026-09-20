package defpackage;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class lk3 extends v05 {
    public final /* synthetic */ jk3 e;
    public final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk3(String str, jk3 jk3Var, long j) {
        super(str, true);
        this.e = jk3Var;
        this.f = j;
    }

    @Override // defpackage.v05
    public final long a() {
        vl5 vl5Var;
        jk3 jk3Var = this.e;
        synchronized (jk3Var) {
            if (!jk3Var.t && (vl5Var = jk3Var.j) != null) {
                int i = jk3Var.v ? jk3Var.u : -1;
                jk3Var.u++;
                jk3Var.v = true;
                sd5 sd5Var = sd5.a;
                if (i != -1) {
                    jk3Var.j(new SocketTimeoutException("sent ping but didn't receive pong within " + jk3Var.c + "ms (after " + (i - 1) + " successful ping/pongs)"), null);
                } else {
                    try {
                        vl5Var.b(9, mk.z);
                    } catch (IOException e) {
                        jk3Var.j(e, null);
                    }
                }
            }
        }
        return this.f;
    }
}
