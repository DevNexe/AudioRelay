package defpackage;

import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.zzfxf;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public final class kq6 implements Executor {
    public final /* synthetic */ Executor w;
    public final /* synthetic */ zzfxf x;

    public kq6(Executor executor, qc qcVar) {
        this.w = executor;
        this.x = qcVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.w.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.x.zze(e);
        }
    }
}
