package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdua extends zzczc {
    public final Context i;
    public final WeakReference j;
    public final zzdmn k;
    public final zzdju l;
    public final zzddl m;
    public final zzdes n;
    public final zzczw o;
    public final zzcda p;
    public final zzfmq q;
    public final zzfdg r;
    public boolean s;

    public zzdua(zzczb zzczbVar, Context context, zzcmn zzcmnVar, zzdmn zzdmnVar, zzdju zzdjuVar, zzddl zzddlVar, zzdes zzdesVar, zzczw zzczwVar, zzfcs zzfcsVar, zzfmq zzfmqVar, zzfdg zzfdgVar) {
        super(zzczbVar);
        this.s = false;
        this.i = context;
        this.k = zzdmnVar;
        this.j = new WeakReference(zzcmnVar);
        this.l = zzdjuVar;
        this.m = zzddlVar;
        this.n = zzdesVar;
        this.o = zzczwVar;
        this.q = zzfmqVar;
        zzccc zzcccVar = zzfcsVar.zzm;
        this.p = new zzcda(zzcccVar != null ? zzcccVar.zza : "", zzcccVar != null ? zzcccVar.zzb : 1);
        this.r = zzfdgVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcmn zzcmnVar = (zzcmn) this.j.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfL)).booleanValue()) {
                if (!this.s && zzcmnVar != null) {
                    zzcha.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdtz
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

    public final Bundle zza() {
        return this.n.zzb();
    }

    public final zzccg zzc() {
        return this.p;
    }

    public final zzfdg zzd() {
        return this.r;
    }

    public final boolean zze() {
        return this.o.zzg();
    }

    public final boolean zzf() {
        return this.s;
    }

    public final boolean zzg() {
        zzcmn zzcmnVar = (zzcmn) this.j.get();
        return (zzcmnVar == null || zzcmnVar.zzaD()) ? false : true;
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
    public final boolean zzh(boolean z, Activity activity) {
        Context context;
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzay)).booleanValue();
        Context context2 = this.i;
        zzddl zzddlVar = this.m;
        if (zBooleanValue) {
            com.google.android.gms.ads.internal.zzt.zzq();
            if (com.google.android.gms.ads.internal.util.zzs.zzC(context2)) {
                zzcgn.zzj("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                zzddlVar.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzaz)).booleanValue()) {
                    this.q.zza(this.a.zzb.zzb.zzb);
                }
                return false;
            }
        }
        if (this.s) {
            zzcgn.zzj("The rewarded ad have been showed.");
            zzddlVar.zza(zzfem.zzd(10, null, null));
            return false;
        }
        this.s = true;
        zzdju zzdjuVar = this.l;
        zzdjuVar.zzb();
        if (activity == null) {
            context = activity;
            context = context2;
        }
        try {
            context = activity;
            this.k.zza(z, context, zzddlVar);
            zzdjuVar.zza();
            return true;
        } catch (zzdmm e) {
            zzddlVar.zzc(e);
            return false;
        }
    }
}
