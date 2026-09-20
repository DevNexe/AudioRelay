package defpackage;

import com.azefsw.audioconnect.opus.jni.OpusJni;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class gd4 implements dd4 {
    public final long a;
    public final OpusJni b;
    public final int c;
    public final e8 d;
    public final byte[] e = new byte[4000];
    public final ny1 f = new ny1(5);

    public gd4(long j, OpusJni opusJni, int i, e8 e8Var) {
        this.a = j;
        this.b = opusJni;
        this.c = i;
        this.d = e8Var;
    }

    @Override // defpackage.dd4
    public final void a(qk qkVar, v33 v33Var) {
        ny1 ny1Var = this.f;
        try {
            if (((AtomicInteger) ny1Var.w).addAndGet(2) % 2 == 0) {
                this.d.a(qkVar, false, new fd4(v33Var, this));
                sd5 sd5Var = sd5.a;
            } else {
                sd5 sd5Var2 = sd5.a;
            }
        } finally {
            ((AtomicInteger) ny1Var.w).addAndGet(-2);
        }
    }

    @Override // defpackage.dd4
    public final void close() {
        this.f.k();
        this.b.destroyEncoder(this.a);
    }
}
