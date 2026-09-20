package defpackage;

import android.os.Looper;
import com.google.android.gms.ads.internal.util.zzf;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class r86 implements Executor {
    public final zzf w = new zzf(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            this.w.post(runnable);
            return;
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            zzt.zzq();
            zzs.zzI(zzt.zzp().zzc(), th);
            throw th;
        }
    }
}
