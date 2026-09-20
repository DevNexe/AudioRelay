package defpackage;

import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzfuv;

/* JADX INFO: loaded from: classes3.dex */
public final class ys5 {
    public long a;
    public Object b;

    public /* synthetic */ ys5() {
    }

    public /* synthetic */ ys5(long j, zzfuv zzfuvVar) {
        this.a = j;
        this.b = zzfuvVar;
    }

    public final void a(Exception exc) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.b) == null) {
            this.b = exc;
            this.a = 100 + jElapsedRealtime;
        }
        if (jElapsedRealtime >= this.a) {
            Exception exc2 = (Exception) this.b;
            if (exc2 != exc) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(exc2, exc);
                } catch (Exception unused) {
                }
            }
            Exception exc3 = (Exception) this.b;
            this.b = null;
            throw exc3;
        }
    }
}
