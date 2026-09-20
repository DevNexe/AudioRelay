package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbiq;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class n46 extends zzbiq {
    public n46(String str, Long l) {
        super(1, str, l);
    }

    @Override // com.google.android.gms.internal.ads.zzbiq
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(zzn(), ((Long) zzm()).longValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbiq
    public final /* bridge */ /* synthetic */ Object b(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(zzn(), ((Long) zzm()).longValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbiq
    public final /* bridge */ /* synthetic */ Object zzb(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(zzn())) ? Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(zzn()))) : (Long) zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzbiq
    public final /* bridge */ /* synthetic */ void zzd(SharedPreferences.Editor editor, Object obj) {
        editor.putLong(zzn(), ((Long) obj).longValue());
    }
}
