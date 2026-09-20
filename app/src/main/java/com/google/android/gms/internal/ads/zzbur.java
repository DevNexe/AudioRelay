package com.google.android.gms.internal.ads;

import com.google.ads.mediation.facebook.FacebookAdapter;
import defpackage.f66;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbur implements zzfxv {
    public final zzbtx a;
    public final zzbty b;
    public final zzfyx c;

    public zzbur(zzfyx zzfyxVar, zzbty zzbtyVar, zzbtx zzbtxVar) {
        this.c = zzfyxVar;
        this.b = zzbtyVar;
        this.a = zzbtxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxv
    public final zzfyx zza(Object obj) {
        return zzb(obj);
    }

    public final zzfyx zzb(final Object obj) {
        return zzfyo.zzn(this.c, new zzfxv() { // from class: com.google.android.gms.internal.ads.zzbup
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj2) throws JSONException {
                zzbur zzburVar = this.zza;
                Object obj3 = obj;
                zzburVar.getClass();
                zzchf zzchfVar = new zzchf();
                com.google.android.gms.ads.internal.zzt.zzq();
                String string = UUID.randomUUID().toString();
                zzbpp.zzo.zzc(string, new f66(zzchfVar));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(FacebookAdapter.KEY_ID, string);
                jSONObject.put("args", (JSONObject) obj3);
                ((zzbts) obj2).zzl("google.afma.activeView.handleUpdate", jSONObject);
                return zzchfVar;
            }
        }, zzcha.zzf);
    }
}
