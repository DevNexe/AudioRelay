package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcwt extends zzczc {
    public final zzcmn i;
    public final int j;
    public final Context k;
    public final zzcwb l;
    public final zzdmn m;
    public final zzdju n;
    public final zzddl o;
    public final boolean p;
    public boolean q;

    public zzcwt(zzczb zzczbVar, Context context, zzcmn zzcmnVar, int i, zzcwb zzcwbVar, zzdmn zzdmnVar, zzdju zzdjuVar, zzddl zzddlVar) {
        super(zzczbVar);
        this.q = false;
        this.i = zzcmnVar;
        this.k = context;
        this.j = i;
        this.l = zzcwbVar;
        this.m = zzdmnVar;
        this.n = zzdjuVar;
        this.o = zzddlVar;
        this.p = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzeq)).booleanValue();
    }

    @Override // com.google.android.gms.internal.ads.zzczc
    public final void zzV() {
        super.zzV();
        zzcmn zzcmnVar = this.i;
        if (zzcmnVar != null) {
            zzcmnVar.destroy();
        }
    }

    public final int zza() {
        return this.j;
    }

    public final void zzc(zzbcz zzbczVar) {
        zzcmn zzcmnVar = this.i;
        if (zzcmnVar != null) {
            zzcmnVar.zzaj(zzbczVar);
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
    public final void zzd(Activity activity, zzbdm zzbdmVar, boolean z) {
        Context context = activity;
        if (activity == null) {
            context = this.k;
        }
        zzdju zzdjuVar = this.n;
        boolean z2 = this.p;
        if (z2) {
            zzdjuVar.zzb();
        }
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzay)).booleanValue();
        zzddl zzddlVar = this.o;
        if (zBooleanValue) {
            com.google.android.gms.ads.internal.zzt.zzq();
            if (com.google.android.gms.ads.internal.util.zzs.zzC(context)) {
                zzcgn.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                zzddlVar.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzaz)).booleanValue()) {
                    new zzfmq(context.getApplicationContext(), com.google.android.gms.ads.internal.zzt.zzu().zzb()).zza(this.a.zzb.zzb.zzb);
                    return;
                }
                return;
            }
        }
        if (this.q) {
            zzcgn.zzj("App open interstitial ad is already visible.");
            zzddlVar.zza(zzfem.zzd(10, null, null));
        }
        if (this.q) {
            return;
        }
        try {
            this.m.zza(z, context, zzddlVar);
            if (z2) {
                zzdjuVar.zza();
            }
            this.q = true;
        } catch (zzdmm e) {
            zzddlVar.zzc(e);
        }
    }

    public final void zze(long j, int i) {
        this.l.zza(j, i);
    }
}
