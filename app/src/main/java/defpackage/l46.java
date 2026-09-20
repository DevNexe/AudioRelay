package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbiq;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class l46 extends zzbiq {
    public l46(int i, String str, Boolean bool) {
        super(i, str, bool);
    }

    @Override // com.google.android.gms.internal.ads.zzbiq
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(zzn(), ((Boolean) zzm()).booleanValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbiq
    public final /* bridge */ /* synthetic */ Object b(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(zzn(), ((Boolean) zzm()).booleanValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbiq
    public final /* bridge */ /* synthetic */ Object zzb(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(zzn())) ? Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(zzn()))) : (Boolean) zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzbiq
    public final /* bridge */ /* synthetic */ void zzd(SharedPreferences.Editor editor, Object obj) {
        editor.putBoolean(zzn(), ((Boolean) obj).booleanValue());
    }
}
