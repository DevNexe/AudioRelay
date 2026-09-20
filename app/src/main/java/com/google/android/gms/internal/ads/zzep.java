package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzep implements zzev {
    public final boolean a;
    public final ArrayList b = new ArrayList(1);
    public int c;
    public zzfa d;

    public zzep(boolean z) {
        this.a = z;
    }

    public final void a() {
        zzfa zzfaVar = this.d;
        int i = zzel.zza;
        for (int i2 = 0; i2 < this.c; i2++) {
            ((zzfx) this.b.get(i2)).zzb(this, zzfaVar, this.a);
        }
        this.d = null;
    }

    public final void b(zzfa zzfaVar) {
        for (int i = 0; i < this.c; i++) {
            ((zzfx) this.b.get(i)).zzc(this, zzfaVar, this.a);
        }
    }

    public final void c(zzfa zzfaVar) {
        this.d = zzfaVar;
        for (int i = 0; i < this.c; i++) {
            ((zzfx) this.b.get(i)).zzd(this, zzfaVar, this.a);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzev, com.google.android.gms.internal.ads.zzfs
    public /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final void zzf(zzfx zzfxVar) {
        zzfxVar.getClass();
        ArrayList arrayList = this.b;
        if (arrayList.contains(zzfxVar)) {
            return;
        }
        arrayList.add(zzfxVar);
        this.c++;
    }

    public final void zzg(int i) {
        zzfa zzfaVar = this.d;
        int i2 = zzel.zza;
        for (int i3 = 0; i3 < this.c; i3++) {
            ((zzfx) this.b.get(i3)).zza(this, zzfaVar, this.a, i);
        }
    }
}
