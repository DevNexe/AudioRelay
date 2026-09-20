package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdsf {
    public final Executor a;
    public final zzcvs b;
    public final zzdkg c;

    public zzdsf(Executor executor, zzcvs zzcvsVar, zzdkg zzdkgVar) {
        this.a = executor;
        this.c = zzdkgVar;
        this.b = zzcvsVar;
    }

    public final void zza(final zzcmn zzcmnVar) {
        if (zzcmnVar == null) {
            return;
        }
        View viewZzH = zzcmnVar.zzH();
        zzdkg zzdkgVar = this.c;
        zzdkgVar.zza(viewZzH);
        zzbbm zzbbmVar = new zzbbm() { // from class: com.google.android.gms.internal.ads.zzdsb
            @Override // com.google.android.gms.internal.ads.zzbbm
            public final void zzc(zzbbl zzbblVar) {
                zzcoa zzcoaVarZzP = zzcmnVar.zzP();
                Rect rect = zzbblVar.zzd;
                zzcoaVarZzP.zzo(rect.left, rect.top, false);
            }
        };
        Executor executor = this.a;
        zzdkgVar.zzj(zzbbmVar, executor);
        zzdkgVar.zzj(new zzbbm() { // from class: com.google.android.gms.internal.ads.zzdsc
            @Override // com.google.android.gms.internal.ads.zzbbm
            public final void zzc(zzbbl zzbblVar) {
                zzcmn zzcmnVar2 = zzcmnVar;
                HashMap map = new HashMap();
                map.put("isVisible", true != zzbblVar.zzj ? "0" : "1");
                zzcmnVar2.zzd("onAdVisibilityChanged", map);
            }
        }, executor);
        zzcvs zzcvsVar = this.b;
        zzdkgVar.zzj(zzcvsVar, executor);
        zzcvsVar.zzf(zzcmnVar);
        zzcmnVar.zzaf("/trackActiveViewUnit", new zzbpq() { // from class: com.google.android.gms.internal.ads.zzdsd
            @Override // com.google.android.gms.internal.ads.zzbpq
            public final void zza(Object obj, Map map) {
                this.zza.b.zzb();
            }
        });
        zzcmnVar.zzaf("/untrackActiveViewUnit", new zzbpq() { // from class: com.google.android.gms.internal.ads.zzdse
            @Override // com.google.android.gms.internal.ads.zzbpq
            public final void zza(Object obj, Map map) {
                this.zza.b.zza();
            }
        });
    }
}
