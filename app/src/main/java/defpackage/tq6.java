package defpackage;

import com.google.android.gms.internal.ads.MZ;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.zzfxu;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class tq6 extends qc implements RunnableFuture {

    @CheckForNull
    public volatile jq6 D;

    public tq6(zzfxu zzfxuVar) {
        this.D = new rq6(this, zzfxuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfxf
    @CheckForNull
    public final String d() {
        jq6 jq6Var = this.D;
        if (jq6Var == null) {
            return super.d();
        }
        return "task=[" + jq6Var + "]";
    }

    @Override // com.google.android.gms.internal.ads.zzfxf
    public final void e() {
        jq6 jq6Var;
        Object obj = this.w;
        if (((obj instanceof MZ) && ((MZ) obj).a) && (jq6Var = this.D) != null) {
            jq6Var.g();
        }
        this.D = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        jq6 jq6Var = this.D;
        if (jq6Var != null) {
            jq6Var.run();
        }
        this.D = null;
    }

    public tq6(Callable callable) {
        this.D = new sq6(this, callable);
    }
}
