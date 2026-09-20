package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbcf;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzfph;
import java.util.ArrayList;
import java.util.Iterator;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class p36 implements Application.ActivityLifecycleCallbacks {
    public cz5 D;
    public long F;
    public Activity w;
    public Application x;
    public final Object y = new Object();
    public boolean z = true;
    public boolean A = false;

    @GuardedBy("lock")
    public final ArrayList B = new ArrayList();

    @GuardedBy("lock")
    public final ArrayList C = new ArrayList();
    public boolean E = false;

    public final void a(Activity activity) {
        synchronized (this.y) {
            if (!activity.getClass().getName().startsWith(MobileAds.ERROR_DOMAIN)) {
                this.w = activity;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.y) {
            try {
                Activity activity2 = this.w;
                if (activity2 != null) {
                    if (activity2.equals(activity)) {
                        this.w = null;
                    }
                    Iterator it = this.C.iterator();
                    while (it.hasNext()) {
                        try {
                            if (((zzbct) it.next()).zza()) {
                                it.remove();
                            }
                        } catch (Exception e) {
                            zzt.zzp().zzt(e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                            zzcgn.zzh("", e);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(activity);
        synchronized (this.y) {
            Iterator it = this.C.iterator();
            while (it.hasNext()) {
                try {
                    ((zzbct) it.next()).zzb();
                } catch (Exception e) {
                    zzt.zzp().zzt(e, "AppActivityTracker.ActivityListener.onActivityPaused");
                    zzcgn.zzh("", e);
                }
            }
        }
        this.A = true;
        cz5 cz5Var = this.D;
        if (cz5Var != null) {
            zzs.zza.removeCallbacks(cz5Var);
        }
        zzfph zzfphVar = zzs.zza;
        cz5 cz5Var2 = new cz5(this, 4);
        this.D = cz5Var2;
        zzfphVar.postDelayed(cz5Var2, this.F);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(activity);
        this.A = false;
        boolean z = !this.z;
        this.z = true;
        cz5 cz5Var = this.D;
        if (cz5Var != null) {
            zzs.zza.removeCallbacks(cz5Var);
        }
        synchronized (this.y) {
            Iterator it = this.C.iterator();
            while (it.hasNext()) {
                try {
                    ((zzbct) it.next()).zzc();
                } catch (Exception e) {
                    zzt.zzp().zzt(e, "AppActivityTracker.ActivityListener.onActivityResumed");
                    zzcgn.zzh("", e);
                }
            }
            if (z) {
                Iterator it2 = this.B.iterator();
                while (it2.hasNext()) {
                    try {
                        ((zzbcf) it2.next()).zza(true);
                    } catch (Exception e2) {
                        zzcgn.zzh("", e2);
                    }
                }
            } else {
                zzcgn.zze("App is still foreground.");
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
