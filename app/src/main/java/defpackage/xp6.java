package defpackage;

import com.google.android.gms.internal.ads.MZ;
import com.google.android.gms.internal.ads.ct;
import com.google.android.gms.internal.ads.zzfsf;
import com.google.android.gms.internal.ads.zzfuq;
import com.google.android.gms.internal.ads.zzfuv;
import com.google.android.gms.internal.ads.zzfwu;
import com.google.android.gms.internal.ads.zzfyo;
import com.google.android.gms.internal.ads.zzfyx;
import defpackage.xp6;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xp6 extends ct {
    public static final Logger K = Logger.getLogger(xp6.class.getName());

    @CheckForNull
    public zzfuq H;
    public final boolean I;
    public final boolean J;

    public xp6(zzfuv zzfuvVar, boolean z, boolean z2) {
        super(zzfuvVar.size());
        this.H = zzfuvVar;
        this.I = z;
        this.J = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzfxf
    @CheckForNull
    public final String d() {
        zzfuq zzfuqVar = this.H;
        if (zzfuqVar == null) {
            return super.d();
        }
        zzfuqVar.toString();
        return "futures=".concat(zzfuqVar.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzfxf
    public final void e() {
        zzfuq zzfuqVar = this.H;
        t(1);
        if (isCancelled() && (zzfuqVar != null)) {
            Object obj = this.w;
            boolean z = (obj instanceof MZ) && ((MZ) obj).a;
            zzfwu it = zzfuqVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(z);
            }
        }
    }

    public final void n(@CheckForNull zzfuq zzfuqVar) {
        int iT0 = ct.F.T0(this);
        int i = 0;
        zzfsf.zzi(iT0 >= 0, "Less than 0 remaining futures");
        if (iT0 == 0) {
            if (zzfuqVar != null) {
                zzfwu it = zzfuqVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        try {
                            q(i, zzfyo.zzp(future));
                        } catch (Error e) {
                            e = e;
                            o(e);
                        } catch (RuntimeException e2) {
                            e = e2;
                            o(e);
                        } catch (ExecutionException e3) {
                            o(e3.getCause());
                        }
                    }
                    i++;
                }
            }
            this.D = null;
            r();
            t(2);
        }
    }

    public final void o(Throwable th) {
        boolean z;
        th.getClass();
        if (this.I && !zze(th)) {
            Set<Throwable> set = this.D;
            if (set == null) {
                Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                p(setNewSetFromMap);
                ct.F.U0(this, setNewSetFromMap);
                set = this.D;
                set.getClass();
            }
            Throwable cause = th;
            while (true) {
                if (cause == null) {
                    z = true;
                    break;
                } else {
                    if (!set.add(cause)) {
                        z = false;
                        break;
                    }
                    cause = cause.getCause();
                }
            }
            if (z) {
                K.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
                return;
            }
        }
        boolean z2 = th instanceof Error;
        if (z2) {
            K.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != z2 ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
        }
    }

    public final void p(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable thA = a();
        thA.getClass();
        while (thA != null && set.add(thA)) {
            thA = thA.getCause();
        }
    }

    public abstract void q(int i, Object obj);

    public abstract void r();

    public final void s() {
        zzfuq zzfuqVar = this.H;
        zzfuqVar.getClass();
        if (zzfuqVar.isEmpty()) {
            r();
            return;
        }
        fq6 fq6Var = fq6.INSTANCE;
        if (!this.I) {
            final zzfuq zzfuqVar2 = this.J ? this.H : null;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzfxn
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.n(zzfuqVar2);
                }
            };
            zzfwu it = this.H.iterator();
            while (it.hasNext()) {
                ((zzfyx) it.next()).zzc(runnable, fq6Var);
            }
            return;
        }
        zzfwu it2 = this.H.iterator();
        final int i = 0;
        while (it2.hasNext()) {
            final zzfyx zzfyxVar = (zzfyx) it2.next();
            zzfyxVar.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfxm
                @Override // java.lang.Runnable
                public final void run() {
                    xp6 xp6Var = this.zza;
                    zzfyx zzfyxVar2 = zzfyxVar;
                    int i2 = i;
                    xp6Var.getClass();
                    try {
                        if (zzfyxVar2.isCancelled()) {
                            xp6Var.H = null;
                            xp6Var.cancel(false);
                        } else {
                            try {
                                xp6Var.q(i2, zzfyo.zzp(zzfyxVar2));
                            } catch (Error e) {
                                e = e;
                                xp6Var.o(e);
                            } catch (RuntimeException e2) {
                                e = e2;
                                xp6Var.o(e);
                            } catch (ExecutionException e3) {
                                xp6Var.o(e3.getCause());
                            }
                        }
                        xp6Var.n(null);
                    } catch (Throwable th) {
                        xp6Var.n(null);
                        throw th;
                    }
                }
            }, fq6Var);
            i++;
        }
    }

    public void t(int i) {
        this.H = null;
    }
}
