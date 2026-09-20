package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfky implements zzfkw {
    public final zzfkw a;

    public zzfky(zzfkw zzfkwVar) {
        this.a = zzfkwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfkw
    public final JSONObject zza(View view) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfkw
    public final void zzb(View view, JSONObject jSONObject, zzfkv zzfkvVar, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        zzfko zzfkoVarZza = zzfko.zza();
        if (zzfkoVarZza != null) {
            Collection collectionZzb = zzfkoVarZza.zzb();
            int size = collectionZzb.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator it = collectionZzb.iterator();
            while (it.hasNext()) {
                View viewZzf = ((zzfkd) it.next()).zzf();
                if (viewZzf != null && viewZzf.isAttachedToWindow() && viewZzf.isShown()) {
                    View view2 = viewZzf;
                    while (true) {
                        if (view2 == null) {
                            View rootView = viewZzf.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float fZza = zzflh.zza(rootView);
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i = size2 - 1;
                                    if (zzflh.zza((View) arrayList.get(i)) <= fZza) {
                                        break;
                                    } else {
                                        size2 = i;
                                    }
                                }
                                arrayList.add(size2, rootView);
                                break;
                            }
                            break;
                        }
                        if (view2.getAlpha() == 0.0f) {
                            break;
                        }
                        Object parent = view2.getParent();
                        view2 = parent instanceof View ? (View) parent : null;
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i2 = 0; i2 < size3; i2++) {
            zzfkvVar.zza((View) arrayList.get(i2), this.a, jSONObject, z2);
        }
    }
}
