package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import defpackage.qa3;
import defpackage.t56;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzbsu implements zzbsm, zzbsk {
    public final zzcmn w;

    /* JADX WARN: Multi-variable type inference failed */
    public zzbsu(Context context, zzcgt zzcgtVar, zzapb zzapbVar, com.google.android.gms.ads.internal.zza zzaVar) throws zzcmy {
        com.google.android.gms.ads.internal.zzt.zzA();
        zzcmn zzcmnVarZza = zzcmz.zza(context, zzcoc.zza(), "", false, false, null, null, zzcgtVar, null, null, null, zzbel.zza(), null, null);
        this.w = zzcmnVarZza;
        ((View) zzcmnVarZza).setWillNotDraw(true);
    }

    public static final void a(Runnable runnable) {
        com.google.android.gms.ads.internal.client.zzaw.zzb();
        if (zzcgg.zzt()) {
            runnable.run();
        } else {
            com.google.android.gms.ads.internal.util.zzs.zza.post(runnable);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final void zza(final String str) {
        a(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbsp
            @Override // java.lang.Runnable
            public final void run() {
                zzbsu zzbsuVar = this.zza;
                zzbsuVar.w.zza(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final /* synthetic */ void zzb(String str, String str2) {
        zzbsj.zzc(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final void zzc() {
        this.w.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzbsi
    public final /* synthetic */ void zzd(String str, Map map) {
        zzbsj.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbsi
    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzbsj.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final void zzf(final String str) {
        a(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbsq
            @Override // java.lang.Runnable
            public final void run() {
                zzbsu zzbsuVar = this.zza;
                zzbsuVar.w.loadData(str, "text/html", "UTF-8");
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final void zzg(final String str) {
        a(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbss
            @Override // java.lang.Runnable
            public final void run() {
                zzbsu zzbsuVar = this.zza;
                zzbsuVar.w.loadUrl(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final void zzh(String str) {
        final String str2 = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        a(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbsr
            @Override // java.lang.Runnable
            public final void run() {
                zzbsu zzbsuVar = this.zza;
                zzbsuVar.w.loadData(str2, "text/html", "UTF-8");
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final boolean zzi() {
        return this.w.zzaB();
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final zzbtt zzj() {
        return new zzbtt(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final void zzk(final zzbta zzbtaVar) {
        final byte[] bArr = null;
        this.w.zzP().zzF(new zzcnz(bArr) { // from class: com.google.android.gms.internal.ads.zzbsn
            @Override // com.google.android.gms.internal.ads.zzcnz
            public final void zza() {
                zzbta zzbtaVar2 = this.zza;
                final zzbtr zzbtrVar = zzbtaVar2.zza;
                final zzbtq zzbtqVar = zzbtaVar2.zzb;
                final zzbsm zzbsmVar = zzbtaVar2.zzc;
                com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbsz
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbtr zzbtrVar2 = zzbtrVar;
                        zzbtq zzbtqVar2 = zzbtqVar;
                        final zzbsm zzbsmVar2 = zzbsmVar;
                        synchronized (zzbtrVar2.a) {
                            if (zzbtqVar2.zze() != -1 && zzbtqVar2.zze() != 1) {
                                zzbtqVar2.zzg();
                                zzcha.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbtb
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        zzbsmVar2.zzc();
                                    }
                                });
                                com.google.android.gms.ads.internal.util.zze.zza("Could not receive loaded message in a timely manner. Rejecting.");
                            }
                        }
                    }
                }, 10000L);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        zzbsj.zzd(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbts
    public final void zzq(String str, zzbpq zzbpqVar) {
        this.w.zzaf(str, new t56(this, zzbpqVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbts
    public final void zzr(String str, final zzbpq zzbpqVar) {
        this.w.zzax(str, new qa3() { // from class: com.google.android.gms.internal.ads.zzbso
            @Override // defpackage.qa3
            public final boolean apply(Object obj) {
                zzbpq zzbpqVar2 = (zzbpq) obj;
                return (zzbpqVar2 instanceof t56) && ((t56) zzbpqVar2).a.equals(zzbpqVar);
            }
        });
    }
}
