package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import com.google.ads.mediation.facebook.FacebookAdapter;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdpz {
    public final zzduw a;
    public final zzdtl b;
    public final zzcvs c;
    public final zzdow d;

    public zzdpz(zzduw zzduwVar, zzdtl zzdtlVar, zzcvs zzcvsVar, zzdow zzdowVar) {
        this.a = zzduwVar;
        this.b = zzdtlVar;
        this.c = zzcvsVar;
        this.d = zzdowVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zza() {
        zzcmn zzcmnVarZza = this.a.zza(com.google.android.gms.ads.internal.client.zzq.zzc(), null, null);
        ((View) zzcmnVarZza).setVisibility(8);
        zzcmnVarZza.zzaf("/sendMessageToSdk", new zzbpq() { // from class: com.google.android.gms.internal.ads.zzdpt
            @Override // com.google.android.gms.internal.ads.zzbpq
            public final void zza(Object obj, Map map) {
                this.zza.b.zzg("sendMessageToNativeJs", map);
            }
        });
        zzcmnVarZza.zzaf("/adMuted", new zzbpq() { // from class: com.google.android.gms.internal.ads.zzdpu
            @Override // com.google.android.gms.internal.ads.zzbpq
            public final void zza(Object obj, Map map) {
                this.zza.d.zzf();
            }
        });
        WeakReference weakReference = new WeakReference(zzcmnVarZza);
        zzbpq zzbpqVar = new zzbpq() { // from class: com.google.android.gms.internal.ads.zzdpv
            @Override // com.google.android.gms.internal.ads.zzbpq
            public final void zza(Object obj, final Map map) {
                final zzdpz zzdpzVar = this.zza;
                zzcmn zzcmnVar = (zzcmn) obj;
                zzcmnVar.zzP().zzz(new zzcny() { // from class: com.google.android.gms.internal.ads.zzdpy
                    @Override // com.google.android.gms.internal.ads.zzcny
                    public final void zza(boolean z) {
                        zzdpz zzdpzVar2 = zzdpzVar;
                        Map map2 = map;
                        zzdpzVar2.getClass();
                        HashMap map3 = new HashMap();
                        map3.put("messageType", "htmlLoaded");
                        map3.put(FacebookAdapter.KEY_ID, (String) map2.get(FacebookAdapter.KEY_ID));
                        zzdpzVar2.b.zzg("sendMessageToNativeJs", map3);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzcmnVar.loadData(str, "text/html", "UTF-8");
                } else {
                    zzcmnVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        };
        zzdtl zzdtlVar = this.b;
        zzdtlVar.zzj(weakReference, "/loadHtml", zzbpqVar);
        zzdtlVar.zzj(new WeakReference(zzcmnVarZza), "/showOverlay", new zzbpq() { // from class: com.google.android.gms.internal.ads.zzdpw
            @Override // com.google.android.gms.internal.ads.zzbpq
            public final void zza(Object obj, Map map) {
                zzdpz zzdpzVar = this.zza;
                zzdpzVar.getClass();
                zzcgn.zzi("Showing native ads overlay.");
                ((zzcmn) obj).zzH().setVisibility(0);
                zzdpzVar.c.zze(true);
            }
        });
        zzdtlVar.zzj(new WeakReference(zzcmnVarZza), "/hideOverlay", new zzbpq() { // from class: com.google.android.gms.internal.ads.zzdpx
            @Override // com.google.android.gms.internal.ads.zzbpq
            public final void zza(Object obj, Map map) {
                zzdpz zzdpzVar = this.zza;
                zzdpzVar.getClass();
                zzcgn.zzi("Hiding native ads overlay.");
                ((zzcmn) obj).zzH().setVisibility(8);
                zzdpzVar.c.zze(false);
            }
        });
        return (View) zzcmnVarZza;
    }
}
