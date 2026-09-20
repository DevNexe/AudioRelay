package defpackage;

import com.google.android.gms.internal.ads.zzfyf;
import com.google.android.gms.internal.ads.zzfyx;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class gq6 extends zzfyf {
    public final zzfyx D;

    public gq6(zzfyx zzfyxVar) {
        zzfyxVar.getClass();
        this.D = zzfyxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxf, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.D.cancel(z);
    }

    @Override // com.google.android.gms.internal.ads.zzfxf, java.util.concurrent.Future
    public final Object get() {
        return this.D.get();
    }

    @Override // com.google.android.gms.internal.ads.zzfxf, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.D.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.zzfxf, java.util.concurrent.Future
    public final boolean isDone() {
        return this.D.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzfxf
    public final String toString() {
        return this.D.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfxf, com.google.android.gms.internal.ads.zzfyx
    public final void zzc(Runnable runnable, Executor executor) {
        this.D.zzc(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfxf, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.D.get(j, timeUnit);
    }
}
