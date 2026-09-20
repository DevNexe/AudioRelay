package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.zzcdu;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class d86 {
    public final HashMap a = new HashMap();
    public final ArrayList b = new ArrayList();
    public final Context c;
    public final zzcdu d;

    public d86(Context context, zzcdu zzcduVar) {
        this.c = context;
        this.d = zzcduVar;
    }

    public final synchronized void a(String str) {
        if (this.a.containsKey(str)) {
            return;
        }
        SharedPreferences defaultSharedPreferences = "__default__".equals(str) ? PreferenceManager.getDefaultSharedPreferences(this.c) : this.c.getSharedPreferences(str, 0);
        c86 c86Var = new c86(this, str);
        this.a.put(str, c86Var);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(c86Var);
    }
}
