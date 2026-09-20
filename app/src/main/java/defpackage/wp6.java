package defpackage;

import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.zzfyo;
import com.google.android.gms.internal.ads.zzfyx;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wp6 extends qc implements Runnable {
    public static final /* synthetic */ int F = 0;

    @CheckForNull
    public zzfyx D;

    @CheckForNull
    public Object E;

    public wp6(Object obj, zzfyx zzfyxVar) {
        zzfyxVar.getClass();
        this.D = zzfyxVar;
        obj.getClass();
        this.E = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzfxf
    @CheckForNull
    public final String d() {
        String str;
        zzfyx zzfyxVar = this.D;
        Object obj = this.E;
        String strD = super.d();
        if (zzfyxVar != null) {
            str = "inputFuture=[" + zzfyxVar + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (strD != null) {
                return str.concat(strD);
            }
            return null;
        }
        return str + "function=[" + obj + "]";
    }

    @Override // com.google.android.gms.internal.ads.zzfxf
    public final void e() {
        i(this.D);
        this.D = null;
        this.E = null;
    }

    public abstract Object n(Object obj, Object obj2);

    public abstract void o(Object obj);

    @Override // java.lang.Runnable
    public final void run() {
        zzfyx zzfyxVar = this.D;
        Object obj = this.E;
        if ((isCancelled() | (zzfyxVar == null)) || (obj == null)) {
            return;
        }
        this.D = null;
        if (zzfyxVar.isCancelled()) {
            j(zzfyxVar);
            return;
        }
        try {
            try {
                Object objN = n(obj, zzfyo.zzp(zzfyxVar));
                this.E = null;
                o(objN);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    zze(th);
                } finally {
                    this.E = null;
                }
            }
        } catch (Error e) {
            zze(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e2) {
            zze(e2);
        } catch (ExecutionException e3) {
            zze(e3.getCause());
        }
    }
}
