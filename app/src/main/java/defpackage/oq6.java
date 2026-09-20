package defpackage;

import com.google.android.gms.internal.ads.zzfyx;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class oq6 implements Runnable {

    @CheckForNull
    public qq6 w;

    public oq6(qq6 qq6Var) {
        this.w = qq6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfyx zzfyxVar;
        qq6 qq6Var = this.w;
        if (qq6Var == null || (zzfyxVar = qq6Var.D) == null) {
            return;
        }
        this.w = null;
        if (zzfyxVar.isDone()) {
            qq6Var.j(zzfyxVar);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = qq6Var.E;
            qq6Var.E = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th) {
                    qq6Var.zze(new pq6(str));
                    throw th;
                }
            }
            qq6Var.zze(new pq6(str + ": " + zzfyxVar));
            zzfyxVar.cancel(true);
        } catch (Throwable th2) {
            zzfyxVar.cancel(true);
            throw th2;
        }
    }
}
