package defpackage;

import com.google.android.gms.internal.ads.zzbqd;
import com.google.android.gms.internal.ads.zzbtu;
import com.google.android.gms.internal.ads.zzchf;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class f66 implements zzbqd {
    public final zzchf a;

    public f66(zzchf zzchfVar) {
        this.a = zzchfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final void zza(String str) {
        zzchf zzchfVar = this.a;
        try {
            if (str == null) {
                zzchfVar.zze(new zzbtu());
            } else {
                zzchfVar.zze(new zzbtu(str));
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final void zzb(JSONObject jSONObject) {
        zzchf zzchfVar = this.a;
        try {
            zzchfVar.zzd(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            zzchfVar.zze(e);
        }
    }
}
