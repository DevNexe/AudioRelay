package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nonnull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbzw {

    @Nonnull
    public View a;
    public final HashMap b = new HashMap();

    public final zzbzw zzb(View view) {
        this.a = view;
        return this;
    }

    public final zzbzw zzc(Map map) {
        HashMap map2 = this.b;
        map2.clear();
        for (Map.Entry entry : map.entrySet()) {
            View view = (View) entry.getValue();
            if (view != null) {
                map2.put((String) entry.getKey(), new WeakReference(view));
            }
        }
        return this;
    }
}
