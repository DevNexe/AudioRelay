package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfko {
    public static final zzfko c = new zzfko();
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();

    public static zzfko zza() {
        return c;
    }

    public final Collection zzb() {
        return Collections.unmodifiableCollection(this.b);
    }

    public final Collection zzc() {
        return Collections.unmodifiableCollection(this.a);
    }

    public final void zzd(zzfkd zzfkdVar) {
        this.a.add(zzfkdVar);
    }

    public final void zze(zzfkd zzfkdVar) {
        boolean zZzg = zzg();
        this.a.remove(zzfkdVar);
        this.b.remove(zzfkdVar);
        if (!zZzg || zzg()) {
            return;
        }
        zzfku.zzb().zzf();
    }

    public final void zzf(zzfkd zzfkdVar) {
        boolean zZzg = zzg();
        this.b.add(zzfkdVar);
        if (zZzg) {
            return;
        }
        zzfku.zzb().zze();
    }

    public final boolean zzg() {
        return this.b.size() > 0;
    }
}
