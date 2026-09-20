package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.AdSDKNotificationListener;
import com.google.android.gms.ads.MobileAds;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeed implements zzdhp, com.google.android.gms.ads.internal.client.zza, zzdds, zzddc {
    public final zzefz A;
    public Boolean B;
    public final boolean C = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfR)).booleanValue();
    public final zzfhz D;
    public final String E;
    public final Context w;
    public final zzfec x;
    public final zzfde y;
    public final zzfcs z;

    public zzeed(Context context, zzfec zzfecVar, zzfde zzfdeVar, zzfcs zzfcsVar, zzefz zzefzVar, zzfhz zzfhzVar, String str) {
        this.w = context;
        this.x = zzfecVar;
        this.y = zzfdeVar;
        this.z = zzfcsVar;
        this.A = zzefzVar;
        this.D = zzfhzVar;
        this.E = str;
    }

    public final zzfhy a(String str) {
        zzfhy zzfhyVarZzb = zzfhy.zzb(str);
        zzfhyVarZzb.zzh(this.y, null);
        zzfcs zzfcsVar = this.z;
        zzfhyVarZzb.zzf(zzfcsVar);
        zzfhyVarZzb.zza("request_id", this.E);
        if (!zzfcsVar.zzu.isEmpty()) {
            zzfhyVarZzb.zza("ancn", (String) zzfcsVar.zzu.get(0));
        }
        if (zzfcsVar.zzak) {
            zzfhyVarZzb.zza("device_connectivity", true != com.google.android.gms.ads.internal.zzt.zzp().zzv(this.w) ? "offline" : "online");
            zzfhyVarZzb.zza("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().b()));
            zzfhyVarZzb.zza("offline_ad", "1");
        }
        return zzfhyVarZzb;
    }

    public final void b(zzfhy zzfhyVar) {
        boolean z = this.z.zzak;
        zzfhz zzfhzVar = this.D;
        if (!z) {
            zzfhzVar.zzb(zzfhyVar);
            return;
        }
        this.A.zzd(new zzegb(com.google.android.gms.ads.internal.zzt.zzB().b(), this.y.zzb.zzb.zzb, zzfhzVar.zza(zzfhyVar), 2));
    }

    public final boolean c() {
        if (this.B == null) {
            synchronized (this) {
                if (this.B == null) {
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
                    this.B = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.B.booleanValue();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.z.zzak) {
            b(a("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (this.C) {
            int i = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
                i = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            String strZza = this.x.zza(str);
            zzfhy zzfhyVarA = a("ifts");
            zzfhyVarA.zza("reason", "adapter");
            if (i >= 0) {
                zzfhyVarA.zza("arec", String.valueOf(i));
            }
            if (strZza != null) {
                zzfhyVarA.zza("areec", strZza);
            }
            this.D.zzb(zzfhyVarA);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    public final void zzb() {
        if (this.C) {
            zzfhy zzfhyVarA = a("ifts");
            zzfhyVarA.zza("reason", "blocked");
            this.D.zzb(zzfhyVarA);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    public final void zzc(zzdmm zzdmmVar) {
        if (this.C) {
            zzfhy zzfhyVarA = a("ifts");
            zzfhyVarA.zza("reason", "exception");
            if (!TextUtils.isEmpty(zzdmmVar.getMessage())) {
                zzfhyVarA.zza("msg", zzdmmVar.getMessage());
            }
            this.D.zzb(zzfhyVarA);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhp
    public final void zzd() {
        if (c()) {
            this.D.zzb(a("adapter_shown"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhp
    public final void zze() {
        if (c()) {
            this.D.zzb(a("adapter_impression"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzl() {
        if (c() || this.z.zzak) {
            b(a(AdSDKNotificationListener.IMPRESSION_EVENT));
        }
    }
}
