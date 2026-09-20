package defpackage;

import com.google.android.gms.internal.ads.zzfuv;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class eq6 extends xp6 {

    @CheckForNull
    public cq6 L;

    public eq6(zzfuv zzfuvVar, boolean z, Executor executor, Callable callable) {
        super(zzfuvVar, z, false);
        this.L = new cq6(this, callable, executor);
        s();
    }

    @Override // com.google.android.gms.internal.ads.zzfxf
    public final void h() {
        cq6 cq6Var = this.L;
        if (cq6Var != null) {
            cq6Var.g();
        }
    }

    @Override // defpackage.xp6
    public final void q(int i, @CheckForNull Object obj) {
    }

    @Override // defpackage.xp6
    public final void r() {
        cq6 cq6Var = this.L;
        if (cq6Var != null) {
            try {
                cq6Var.y.execute(cq6Var);
            } catch (RejectedExecutionException e) {
                cq6Var.z.zze(e);
            }
        }
    }

    @Override // defpackage.xp6
    public final void t(int i) {
        this.H = null;
        if (i == 1) {
            this.L = null;
        }
    }
}
