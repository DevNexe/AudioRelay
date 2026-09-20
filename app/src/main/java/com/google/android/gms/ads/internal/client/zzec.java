package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.zzbrr;
import com.google.android.gms.internal.ads.zzbru;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zzec extends zzbrr {
    public final /* synthetic */ zzed w;

    @Override // com.google.android.gms.internal.ads.zzbrs
    public final void zzb(List list) {
        int i;
        ArrayList arrayList;
        synchronized (this.w.a) {
            zzed zzedVar = this.w;
            zzedVar.c = false;
            zzedVar.d = true;
            arrayList = new ArrayList(this.w.b);
            this.w.b.clear();
        }
        zzbru zzbruVarA = zzed.a(list);
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((OnInitializationCompleteListener) arrayList.get(i)).onInitializationComplete(zzbruVarA);
        }
    }
}
