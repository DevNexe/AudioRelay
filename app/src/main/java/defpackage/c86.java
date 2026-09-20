package defpackage;

import android.content.SharedPreferences;
import com.google.android.gms.internal.ads.zzcev;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class c86 implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final String a;
    public final /* synthetic */ d86 b;

    public c86(d86 d86Var, String str) {
        this.b = d86Var;
        this.a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.b) {
            for (zzcev zzcevVar : this.b.b) {
                String str2 = this.a;
                d86 d86Var = zzcevVar.zza;
                Map map = zzcevVar.zzb;
                d86Var.getClass();
                if (map.containsKey(str2) && ((Set) map.get(str2)).contains(str)) {
                    d86Var.d.zze();
                }
            }
        }
    }
}
