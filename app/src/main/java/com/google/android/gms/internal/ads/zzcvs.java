package com.google.android.gms.internal.ads;

import defpackage.ft;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcvs implements zzbbm {
    public boolean A = false;
    public boolean B = false;
    public final zzcvh C = new zzcvh();
    public zzcmn w;
    public final Executor x;
    public final zzcve y;
    public final ft z;

    public zzcvs(Executor executor, zzcve zzcveVar, ft ftVar) {
        this.x = executor;
        this.y = zzcveVar;
        this.z = ftVar;
    }

    public final void a() {
        try {
            final JSONObject jSONObjectZzb = this.y.zzb(this.C);
            if (this.w != null) {
                this.x.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcvr
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcvs zzcvsVar = this.zza;
                        zzcvsVar.w.zzl("AFMA_updateActiveView", jSONObjectZzb);
                    }
                });
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed to call video active view js", e);
        }
    }

    public final void zza() {
        this.A = false;
    }

    public final void zzb() {
        this.A = true;
        a();
    }

    @Override // com.google.android.gms.internal.ads.zzbbm
    public final void zzc(zzbbl zzbblVar) {
        boolean z = this.B ? false : zzbblVar.zzj;
        zzcvh zzcvhVar = this.C;
        zzcvhVar.zza = z;
        zzcvhVar.zzd = this.z.c();
        zzcvhVar.zzf = zzbblVar;
        if (this.A) {
            a();
        }
    }

    public final void zze(boolean z) {
        this.B = z;
    }

    public final void zzf(zzcmn zzcmnVar) {
        this.w = zzcmnVar;
    }
}
