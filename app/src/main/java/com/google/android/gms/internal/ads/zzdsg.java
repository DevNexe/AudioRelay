package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdsg {
    public final zzfdn a;
    public final Executor b;
    public final zzduw c;
    public final zzdtr d;
    public final Context e;
    public final zzdxo f;
    public final zzfhz g;
    public final zzfju h;
    public final zzefz i;

    public zzdsg(zzfdn zzfdnVar, Executor executor, zzduw zzduwVar, Context context, zzdxo zzdxoVar, zzfhz zzfhzVar, zzfju zzfjuVar, zzefz zzefzVar, zzdtr zzdtrVar) {
        this.a = zzfdnVar;
        this.b = executor;
        this.c = zzduwVar;
        this.e = context;
        this.f = zzdxoVar;
        this.g = zzfhzVar;
        this.h = zzfjuVar;
        this.i = zzefzVar;
        this.d = zzdtrVar;
    }

    public static final void b(zzcmn zzcmnVar) {
        zzcmnVar.zzaf("/videoClicked", zzbpp.zzh);
        zzcmnVar.zzP().zzE(true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzcQ)).booleanValue()) {
            zzcmnVar.zzaf("/getNativeAdViewSignals", zzbpp.zzs);
        }
        zzcmnVar.zzaf("/getNativeClickMeta", zzbpp.zzt);
    }

    public final void a(zzcmn zzcmnVar) {
        b(zzcmnVar);
        zzcmnVar.zzaf("/video", zzbpp.zzl);
        zzcmnVar.zzaf("/videoMeta", zzbpp.zzm);
        zzcmnVar.zzaf("/precache", new zzcla());
        zzcmnVar.zzaf("/delayPageLoaded", zzbpp.zzp);
        zzcmnVar.zzaf("/instrument", zzbpp.zzn);
        zzcmnVar.zzaf("/log", zzbpp.zzg);
        zzcmnVar.zzaf("/click", zzbpp.zza(null));
        if (this.a.zzb != null) {
            zzcmnVar.zzP().zzC(true);
            zzcmnVar.zzaf("/open", new zzbqb(null, null, null, null, null));
        } else {
            zzcmnVar.zzP().zzC(false);
        }
        if (com.google.android.gms.ads.internal.zzt.zzo().zzu(zzcmnVar.getContext())) {
            zzcmnVar.zzaf("/logScionEvent", new zzbpw(zzcmnVar.getContext()));
        }
    }

    public final zzfyx zza(final JSONObject jSONObject) {
        zzfyx zzfyxVarZzi = zzfyo.zzi(null);
        zzfxv zzfxvVar = new zzfxv() { // from class: com.google.android.gms.internal.ads.zzdrw
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj) {
                zzdsg zzdsgVar = this.zza;
                zzdsgVar.getClass();
                zzcmn zzcmnVarZza = zzdsgVar.c.zza(com.google.android.gms.ads.internal.client.zzq.zzc(), null, null);
                final zzche zzcheVarZza = zzche.zza(zzcmnVarZza);
                zzdsgVar.a(zzcmnVarZza);
                zzcmnVarZza.zzP().zzF(new zzcnz() { // from class: com.google.android.gms.internal.ads.zzdry
                    @Override // com.google.android.gms.internal.ads.zzcnz
                    public final void zza() {
                        zzcheVarZza.zzb();
                    }
                });
                zzcmnVarZza.loadUrl((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzcP));
                return zzcheVarZza;
            }
        };
        Executor executor = this.b;
        return zzfyo.zzn(zzfyo.zzn(zzfyxVarZzi, zzfxvVar, executor), new zzfxv() { // from class: com.google.android.gms.internal.ads.zzdrx
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj) {
                final zzdsg zzdsgVar = this.zza;
                JSONObject jSONObject2 = jSONObject;
                final zzcmn zzcmnVar = (zzcmn) obj;
                zzdsgVar.getClass();
                final zzche zzcheVarZza = zzche.zza(zzcmnVar);
                if (zzdsgVar.a.zzb != null) {
                    zzcmnVar.zzai(zzcoc.zzd());
                } else {
                    zzcmnVar.zzai(zzcoc.zze());
                }
                zzcmnVar.zzP().zzz(new zzcny() { // from class: com.google.android.gms.internal.ads.zzdrv
                    @Override // com.google.android.gms.internal.ads.zzcny
                    public final void zza(boolean z) {
                        zzdsg zzdsgVar2 = zzdsgVar;
                        zzcmn zzcmnVar2 = zzcmnVar;
                        zzche zzcheVar = zzcheVarZza;
                        zzfdn zzfdnVar = zzdsgVar2.a;
                        if (zzfdnVar.zza != null && zzcmnVar2.zzs() != null) {
                            zzcmnVar2.zzs().zzs(zzfdnVar.zza);
                        }
                        zzcheVar.zzb();
                    }
                });
                zzcmnVar.zzl("google.afma.nativeAds.renderVideo", jSONObject2);
                return zzcheVarZza;
            }
        }, executor);
    }

    public final zzfyx zzb(final String str, final String str2, final zzfcs zzfcsVar, final zzfcv zzfcvVar, final com.google.android.gms.ads.internal.client.zzq zzqVar) {
        return zzfyo.zzn(zzfyo.zzi(null), new zzfxv() { // from class: com.google.android.gms.internal.ads.zzdrz
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj) {
                final zzdsg zzdsgVar = this.zza;
                com.google.android.gms.ads.internal.client.zzq zzqVar2 = zzqVar;
                zzfcs zzfcsVar2 = zzfcsVar;
                zzfcv zzfcvVar2 = zzfcvVar;
                String str3 = str;
                String str4 = str2;
                final zzcmn zzcmnVarZza = zzdsgVar.c.zza(zzqVar2, zzfcsVar2, zzfcvVar2);
                final zzche zzcheVarZza = zzche.zza(zzcmnVarZza);
                if (zzdsgVar.a.zzb != null) {
                    zzdsgVar.a(zzcmnVarZza);
                    zzcmnVarZza.zzai(zzcoc.zzd());
                } else {
                    zzdto zzdtoVarZzb = zzdsgVar.d.zzb();
                    zzcmnVarZza.zzP().zzL(zzdtoVarZzb, zzdtoVarZzb, zzdtoVarZzb, zzdtoVarZzb, zzdtoVarZzb, false, null, new com.google.android.gms.ads.internal.zzb(zzdsgVar.e, null, null), null, null, zzdsgVar.i, zzdsgVar.h, zzdsgVar.f, zzdsgVar.g, null, zzdtoVarZzb, null);
                    zzdsg.b(zzcmnVarZza);
                }
                zzcmnVarZza.zzP().zzz(new zzcny() { // from class: com.google.android.gms.internal.ads.zzdsa
                    @Override // com.google.android.gms.internal.ads.zzcny
                    public final void zza(boolean z) {
                        zzdsg zzdsgVar2 = zzdsgVar;
                        zzcmn zzcmnVar = zzcmnVarZza;
                        zzche zzcheVar = zzcheVarZza;
                        if (!z) {
                            zzdsgVar2.getClass();
                            zzcheVar.zze(new zzeka(1, "Html video Web View failed to load."));
                            return;
                        }
                        zzfdn zzfdnVar = zzdsgVar2.a;
                        if (zzfdnVar.zza != null && zzcmnVar.zzs() != null) {
                            zzcmnVar.zzs().zzs(zzfdnVar.zza);
                        }
                        zzcheVar.zzb();
                    }
                });
                zzcmnVarZza.zzad(str3, str4, null);
                return zzcheVarZza;
            }
        }, this.b);
    }
}
