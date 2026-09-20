package defpackage;

import java.util.concurrent.ExecutionException;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class dv5 implements yu2, nu2, ju2 {

    @GuardedBy("mLock")
    public int A;

    @GuardedBy("mLock")
    public int B;

    @GuardedBy("mLock")
    public Exception C;

    @GuardedBy("mLock")
    public boolean D;
    public final Object w = new Object();
    public final int x;
    public final kc7<Void> y;

    @GuardedBy("mLock")
    public int z;

    public dv5(int i, kc7<Void> kc7Var) {
        this.x = i;
        this.y = kc7Var;
    }

    @GuardedBy("mLock")
    public final void a() {
        int i = this.z + this.A + this.B;
        int i2 = this.x;
        if (i == i2) {
            Exception exc = this.C;
            kc7<Void> kc7Var = this.y;
            if (exc == null) {
                if (this.D) {
                    kc7Var.t();
                    return;
                } else {
                    kc7Var.s(null);
                    return;
                }
            }
            int i3 = this.A;
            StringBuilder sb = new StringBuilder(54);
            sb.append(i3);
            sb.append(" out of ");
            sb.append(i2);
            sb.append(" underlying tasks failed");
            kc7Var.r(new ExecutionException(sb.toString(), this.C));
        }
    }

    @Override // defpackage.ju2
    public final void c() {
        synchronized (this.w) {
            this.B++;
            this.D = true;
            a();
        }
    }

    @Override // defpackage.nu2
    public final void onFailure(Exception exc) {
        synchronized (this.w) {
            this.A++;
            this.C = exc;
            a();
        }
    }

    @Override // defpackage.yu2
    public final void onSuccess(Object obj) {
        synchronized (this.w) {
            this.z++;
            a();
        }
    }
}
