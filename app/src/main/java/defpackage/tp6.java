package defpackage;

import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.zzfyo;
import com.google.android.gms.internal.ads.zzfyx;
import com.google.android.gms.internal.ads.zzfzq;
import java.util.concurrent.ExecutionException;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tp6 extends qc implements Runnable {

    @CheckForNull
    public zzfyx D;

    @CheckForNull
    public Class E;

    @CheckForNull
    public Object F;

    public tp6(zzfyx zzfyxVar, Class cls, Object obj) {
        zzfyxVar.getClass();
        this.D = zzfyxVar;
        this.E = cls;
        obj.getClass();
        this.F = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzfxf
    @CheckForNull
    public final String d() {
        String str;
        zzfyx zzfyxVar = this.D;
        Class cls = this.E;
        Object obj = this.F;
        String strD = super.d();
        if (zzfyxVar != null) {
            str = "inputFuture=[" + zzfyxVar + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (strD != null) {
                return str.concat(strD);
            }
            return null;
        }
        return str + "exceptionType=[" + cls + "], fallback=[" + obj + "]";
    }

    @Override // com.google.android.gms.internal.ads.zzfxf
    public final void e() {
        i(this.D);
        this.D = null;
        this.E = null;
        this.F = null;
    }

    public abstract Object n(Object obj, Throwable th);

    public abstract void o(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable e;
        Object objZzp;
        zzfyx zzfyxVar = this.D;
        Class cls = this.E;
        Object obj = this.F;
        if (((obj == null) || ((zzfyxVar == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.D = null;
        try {
            e = zzfyxVar instanceof zzfzq ? ((zzfzq) zzfyxVar).a() : null;
            objZzp = e == null ? zzfyo.zzp(zzfyxVar) : null;
        } catch (Error e2) {
            e = e2;
        } catch (RuntimeException e3) {
            e = e3;
        } catch (ExecutionException e4) {
            Throwable cause = e4.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + zzfyxVar.getClass() + " threw " + e4.getClass() + " without a cause");
            }
            e = cause;
        }
        if (e == null) {
            zzd(objZzp);
            return;
        }
        if (!cls.isInstance(e)) {
            j(zzfyxVar);
            return;
        }
        try {
            Object objN = n(obj, e);
            this.E = null;
            this.F = null;
            o(objN);
        } catch (Throwable th) {
            try {
                if (th instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                zze(th);
            } finally {
                this.E = null;
                this.F = null;
            }
        }
    }
}
