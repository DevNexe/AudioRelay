package defpackage;

import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbb;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzaai;
import com.google.android.gms.internal.ads.zzaam;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbts;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbty;
import com.google.android.gms.internal.ads.zzchj;
import com.google.android.gms.internal.ads.zzcmn;
import com.google.android.gms.internal.ads.zzedu;
import com.google.android.gms.internal.ads.zzfon;
import com.google.android.gms.internal.ads.zzfss;
import com.google.android.gms.internal.ads.zzfyk;
import com.google.android.gms.internal.ads.zzgoq;
import com.google.android.gms.internal.ads.zzgot;
import com.google.android.gms.internal.ads.zzss;
import com.google.android.gms.internal.ads.zzzi;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class fj6 implements zzfyk, zzgoq, zzchj, zzbb, zzbty, zzgot, zzfon, dn6, zzss, zzzi {
    public final /* synthetic */ int w;

    public fj6() {
        this.w = 10;
    }

    @Override // defpackage.dn6
    public final /* synthetic */ Iterator a(zzfss zzfssVar, CharSequence charSequence) {
        return new an6(zzfssVar, charSequence);
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final void zzB() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final void zzL(zzaai zzaaiVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzchj
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zze.zza("Ending javascript session.");
        ((zzbtt) ((zzbts) obj)).zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbty
    public final /* bridge */ /* synthetic */ JSONObject zzb(Object obj) throws JSONException {
        zzedu zzeduVar = (zzedu) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) zzay.zzc().zzb(zzbiy.zzhS)).booleanValue()) {
            jSONObject2.put("ad_request_url", zzeduVar.zzd.zze());
            jSONObject2.put("ad_request_post_body", zzeduVar.zzd.zzd());
        }
        jSONObject2.put("base_url", zzeduVar.zzd.zzb());
        jSONObject2.put("signals", zzeduVar.zzc);
        jSONObject3.put("body", zzeduVar.zzb.zzc);
        jSONObject3.put("headers", zzaw.zzb().zzi(zzeduVar.zzb.zzb));
        jSONObject3.put("response_code", zzeduVar.zzb.zza);
        jSONObject3.put("latency", zzeduVar.zzb.zzd);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzeduVar.zzd.zzg());
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final zzaam zzv(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ fj6(int i) {
        this.w = i;
    }

    public /* synthetic */ fj6(int i, int i2) {
        this.w = i;
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final void zza(Throwable th) {
        switch (this.w) {
            case 0:
                zze.zza("Notification of cache hit failed.");
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    /* JADX INFO: renamed from: zzb, reason: collision with other method in class */
    public final /* synthetic */ void mo32zzb(Object obj) {
        switch (this.w) {
            case 0:
                zze.zza("Notification of cache hit successful.");
                break;
            default:
                ((zzcmn) obj).destroy();
                break;
        }
    }
}
