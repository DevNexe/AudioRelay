package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbiq;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class p46 extends zzbiq {
    public p46(String str, String str2) {
        super(1, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbiq
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return jSONObject.optString(zzn(), (String) zzm());
    }

    @Override // com.google.android.gms.internal.ads.zzbiq
    public final /* bridge */ /* synthetic */ Object b(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(zzn(), (String) zzm());
    }

    @Override // com.google.android.gms.internal.ads.zzbiq
    public final /* bridge */ /* synthetic */ Object zzb(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(zzn())) ? bundle.getString("com.google.android.gms.ads.flag.".concat(zzn())) : (String) zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzbiq
    public final /* bridge */ /* synthetic */ void zzd(SharedPreferences.Editor editor, Object obj) {
        editor.putString(zzn(), (String) obj);
    }
}
