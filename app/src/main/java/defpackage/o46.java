package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbiq;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class o46 extends zzbiq {
    public o46(String str, Float f) {
        super(1, str, f);
    }

    @Override // com.google.android.gms.internal.ads.zzbiq
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(zzn(), ((Float) zzm()).floatValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbiq
    public final /* bridge */ /* synthetic */ Object b(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(zzn(), ((Float) zzm()).floatValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbiq
    public final /* bridge */ /* synthetic */ Object zzb(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(zzn())) ? Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(zzn()))) : (Float) zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzbiq
    public final /* bridge */ /* synthetic */ void zzd(SharedPreferences.Editor editor, Object obj) {
        editor.putFloat(zzn(), ((Float) obj).floatValue());
    }
}
