package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbiq;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class m46 extends zzbiq {
    public m46(String str, Integer num) {
        super(1, str, num);
    }

    @Override // com.google.android.gms.internal.ads.zzbiq
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(zzn(), ((Integer) zzm()).intValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbiq
    public final /* bridge */ /* synthetic */ Object b(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(zzn(), ((Integer) zzm()).intValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbiq
    public final /* bridge */ /* synthetic */ Object zzb(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(zzn())) ? Integer.valueOf(bundle.getInt("com.google.android.gms.ads.flag.".concat(zzn()))) : (Integer) zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzbiq
    public final /* bridge */ /* synthetic */ void zzd(SharedPreferences.Editor editor, Object obj) {
        editor.putInt(zzn(), ((Integer) obj).intValue());
    }
}
