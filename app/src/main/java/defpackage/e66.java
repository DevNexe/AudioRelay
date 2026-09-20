package defpackage;

import com.google.android.gms.internal.ads.zzbqd;
import com.google.android.gms.internal.ads.zzbtl;
import com.google.android.gms.internal.ads.zzbtu;
import com.google.android.gms.internal.ads.zzbuj;
import com.google.android.gms.internal.ads.zzchf;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class e66 implements zzbqd {
    public final zzbtl a;
    public final zzchf b;
    public final /* synthetic */ zzbuj c;

    public e66(zzbtl zzbtlVar, zzbuj zzbujVar, zzchf zzchfVar) {
        this.c = zzbujVar;
        this.a = zzbtlVar;
        this.b = zzchfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final void zza(String str) {
        zzchf zzchfVar = this.b;
        zzbtl zzbtlVar = this.a;
        try {
            if (str == null) {
                zzchfVar.zze(new zzbtu());
            } else {
                zzchfVar.zze(new zzbtu(str));
            }
            zzbtlVar.zzb();
        } catch (IllegalStateException unused) {
        } finally {
            zzbtlVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqd
    public final void zzb(JSONObject jSONObject) {
        zzchf zzchfVar = this.b;
        zzbtl zzbtlVar = this.a;
        try {
            zzchfVar.zzd(this.c.a.zza(jSONObject));
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            zzchfVar.zze(e);
        } finally {
            zzbtlVar.zzb();
        }
    }
}
