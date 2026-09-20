package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcks implements Iterable {
    public final ArrayList w = new ArrayList();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.w.iterator();
    }

    public final void zzb(zzckr zzckrVar) {
        this.w.add(zzckrVar);
    }

    public final void zzc(zzckr zzckrVar) {
        this.w.remove(zzckrVar);
    }

    public final boolean zzd(zzciw zzciwVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            zzckr zzckrVar = (zzckr) it.next();
            if (zzckrVar.b == zzciwVar) {
                arrayList.add(zzckrVar);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((zzckr) it2.next()).c.zzb();
        }
        return true;
    }
}
