package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdle extends zzczc {
    public final Context i;
    public final WeakReference j;
    public final zzdju k;
    public final zzdmn l;
    public final zzczw m;
    public final zzfmq n;
    public final zzddl o;
    public boolean p;

    public zzdle(zzczb zzczbVar, Context context, @Nullable zzcmn zzcmnVar, zzdju zzdjuVar, zzdmn zzdmnVar, zzczw zzczwVar, zzfmq zzfmqVar, zzddl zzddlVar) {
        super(zzczbVar);
        this.p = false;
        this.i = context;
        this.j = new WeakReference(zzcmnVar);
        this.k = zzdjuVar;
        this.l = zzdmnVar;
        this.m = zzczwVar;
        this.n = zzfmqVar;
        this.o = zzddlVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcmn zzcmnVar = (zzcmn) this.j.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfL)).booleanValue()) {
                if (!this.p && zzcmnVar != null) {
                    zzcha.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdld
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcmnVar.destroy();
                        }
                    });
                }
            } else if (zzcmnVar != null) {
                zzcmnVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final boolean zza() {
        return this.m.zzg();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0051  */
    /* JADX WARN: Code duplicated, block: B:14:0x0064 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0066  */
    /* JADX WARN: Code duplicated, block: B:9:0x004d  */
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
    public final boolean zzc(boolean z, @Nullable Activity activity) {
        Context context;
        zzdju zzdjuVar = this.k;
        zzdjuVar.zzb();
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzay)).booleanValue();
        Context context2 = this.i;
        zzddl zzddlVar = this.o;
        if (zBooleanValue) {
            com.google.android.gms.ads.internal.zzt.zzq();
            if (com.google.android.gms.ads.internal.util.zzs.zzC(context2)) {
                zzcgn.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                zzddlVar.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzaz)).booleanValue()) {
                    this.n.zza(this.a.zzb.zzb.zzb);
                }
            } else {
                if (this.p) {
                    zzcgn.zzj("The interstitial ad has been showed.");
                    zzddlVar.zza(zzfem.zzd(10, null, null));
                }
                context = activity;
                if (!this.p) {
                    if (activity == null) {
                        context = context2;
                    }
                    try {
                        this.l.zza(z, context, zzddlVar);
                        zzdjuVar.zza();
                        this.p = true;
                        return true;
                    } catch (zzdmm e) {
                        zzddlVar.zzc(e);
                    }
                }
            }
        } else {
            if (this.p) {
                zzcgn.zzj("The interstitial ad has been showed.");
                zzddlVar.zza(zzfem.zzd(10, null, null));
            }
            context = activity;
            if (!this.p) {
                if (activity == null) {
                    context = context2;
                }
                this.l.zza(z, context, zzddlVar);
                zzdjuVar.zza();
                this.p = true;
                return true;
            }
        }
        return false;
    }
}
