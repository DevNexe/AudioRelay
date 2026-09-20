package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.AdSDKNotificationListener;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdwx implements zzdhp, com.google.android.gms.ads.internal.client.zza, zzdds, zzddc {
    public final zzfcs A;
    public final zzefz B;
    public Boolean C;
    public final boolean D = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfR)).booleanValue();
    public final Context w;
    public final zzfec x;
    public final zzdxo y;
    public final zzfde z;

    public zzdwx(Context context, zzfec zzfecVar, zzdxo zzdxoVar, zzfde zzfdeVar, zzfcs zzfcsVar, zzefz zzefzVar) {
        this.w = context;
        this.x = zzfecVar;
        this.y = zzdxoVar;
        this.z = zzfdeVar;
        this.A = zzfcsVar;
        this.B = zzefzVar;
    }

    public final zzdxn a(String str) {
        zzdxn zzdxnVarZza = this.y.zza();
        zzfde zzfdeVar = this.z;
        zzdxnVarZza.zze(zzfdeVar.zzb.zzb);
        zzfcs zzfcsVar = this.A;
        zzdxnVarZza.zzd(zzfcsVar);
        zzdxnVarZza.zzb("action", str);
        if (!zzfcsVar.zzu.isEmpty()) {
            zzdxnVarZza.zzb("ancn", (String) zzfcsVar.zzu.get(0));
        }
        if (zzfcsVar.zzak) {
            zzdxnVarZza.zzb("device_connectivity", true != com.google.android.gms.ads.internal.zzt.zzp().zzv(this.w) ? "offline" : "online");
            zzdxnVarZza.zzb("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().b()));
            zzdxnVarZza.zzb("offline_ad", "1");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzga)).booleanValue()) {
            boolean z = zzf.zzd(zzfdeVar.zza.zza) != 1;
            zzdxnVarZza.zzb("scar", String.valueOf(z));
            if (z) {
                com.google.android.gms.ads.internal.client.zzl zzlVar = zzfdeVar.zza.zza.zzd;
                zzdxnVarZza.zzc("ragent", zzlVar.zzp);
                zzdxnVarZza.zzc("rtype", zzf.zza(zzf.zzb(zzlVar)));
            }
        }
        return zzdxnVarZza;
    }

    public final void b(zzdxn zzdxnVar) {
        if (!this.A.zzak) {
            zzdxnVar.zzg();
            return;
        }
        this.B.zzd(new zzegb(com.google.android.gms.ads.internal.zzt.zzB().b(), this.z.zzb.zzb.zzb, zzdxnVar.zzf(), 2));
    }

    public final boolean c() {
        if (this.C == null) {
            synchronized (this) {
                if (this.C == null) {
                    String str = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbm);
                    com.google.android.gms.ads.internal.zzt.zzq();
                    String strZzo = com.google.android.gms.ads.internal.util.zzs.zzo(this.w);
                    boolean zMatches = false;
                    if (str != null && strZzo != null) {
                        try {
                            zMatches = Pattern.matches(str, strZzo);
                        } catch (RuntimeException e) {
                            com.google.android.gms.ads.internal.zzt.zzp().zzt(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.C = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.C.booleanValue();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.A.zzak) {
            b(a("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (this.D) {
            zzdxn zzdxnVarA = a("ifts");
            zzdxnVarA.zzb("reason", "adapter");
            int i = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
                i = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            if (i >= 0) {
                zzdxnVarA.zzb("arec", String.valueOf(i));
            }
            String strZza = this.x.zza(str);
            if (strZza != null) {
                zzdxnVarA.zzb("areec", strZza);
            }
            zzdxnVarA.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    public final void zzb() {
        if (this.D) {
            zzdxn zzdxnVarA = a("ifts");
            zzdxnVarA.zzb("reason", "blocked");
            zzdxnVarA.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    public final void zzc(zzdmm zzdmmVar) {
        if (this.D) {
            zzdxn zzdxnVarA = a("ifts");
            zzdxnVarA.zzb("reason", "exception");
            if (!TextUtils.isEmpty(zzdmmVar.getMessage())) {
                zzdxnVarA.zzb("msg", zzdmmVar.getMessage());
            }
            zzdxnVarA.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhp
    public final void zzd() {
        if (c()) {
            a("adapter_shown").zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhp
    public final void zze() {
        if (c()) {
            a("adapter_impression").zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzl() {
        if (c() || this.A.zzak) {
            b(a(AdSDKNotificationListener.IMPRESSION_EVENT));
        }
    }
}
