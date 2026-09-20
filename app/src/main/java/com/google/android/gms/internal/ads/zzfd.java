package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfd implements zzeu {
    public zzfx b;
    public String c;
    public boolean f;
    public final zzfr a = new zzfr();
    public int d = 8000;
    public int e = 8000;

    public final zzfd zzb(boolean z) {
        this.f = true;
        return this;
    }

    public final zzfd zzc(int i) {
        this.d = i;
        return this;
    }

    public final zzfd zzd(int i) {
        this.e = i;
        return this;
    }

    public final zzfd zze(zzfx zzfxVar) {
        this.b = zzfxVar;
        return this;
    }

    public final zzfd zzf(String str) {
        this.c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeu
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzfi zza() {
        zzfi zzfiVar = new zzfi(this.c, this.d, this.e, this.f, this.a);
        zzfx zzfxVar = this.b;
        if (zzfxVar != null) {
            zzfiVar.zzf(zzfxVar);
        }
        return zzfiVar;
    }
}
