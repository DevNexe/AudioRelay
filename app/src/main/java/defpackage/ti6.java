package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcbk;
import com.google.android.gms.internal.ads.zzeum;
import com.google.android.gms.internal.ads.zzeun;
import com.google.android.gms.internal.ads.zzfyo;
import com.google.android.gms.internal.ads.zzfyx;
import defpackage.ti6;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ti6 implements zzeun {
    public final JSONObject a;

    public ti6(Context context) {
        this.a = zzcbk.zzc(context);
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 46;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        return zzfyo.zzi(new zzeum() { // from class: com.google.android.gms.internal.ads.zzewd
            @Override // com.google.android.gms.internal.ads.zzeum
            public final void zzf(Object obj) {
                ti6 ti6Var = this.zza;
                JSONObject jSONObject = (JSONObject) obj;
                ti6Var.getClass();
                try {
                    jSONObject.put("gms_sdk_env", ti6Var.a);
                } catch (JSONException unused) {
                    com.google.android.gms.ads.internal.util.zze.zza("Failed putting version constants.");
                }
            }
        });
    }
}
