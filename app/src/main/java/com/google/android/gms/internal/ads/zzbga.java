package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbga extends zzgoj implements zzgpy {
    public zzbga() {
        super(zzbgb.zzb);
    }

    public final zzbex zza() {
        return ((zzbgb) this.x).zza();
    }

    public final zzbft zzb() {
        return ((zzbgb) this.x).zzc();
    }

    public final zzbga zzc(Iterable iterable) {
        if (this.y) {
            c();
            this.y = false;
        }
        zzbgb.o((zzbgb) this.x, iterable);
        return this;
    }

    public final zzbga zzd() {
        if (this.y) {
            c();
            this.y = false;
        }
        zzbgb.p((zzbgb) this.x);
        return this;
    }

    public final zzbga zze(zzbew zzbewVar) {
        if (this.y) {
            c();
            this.y = false;
        }
        zzbgb.r((zzbgb) this.x, (zzbex) zzbewVar.zzal());
        return this;
    }

    public final zzbga zzf(zzbfg zzbfgVar) {
        if (this.y) {
            c();
            this.y = false;
        }
        zzbgb.u((zzbgb) this.x, zzbfgVar);
        return this;
    }

    public final zzbga zzg(zzbfs zzbfsVar) {
        if (this.y) {
            c();
            this.y = false;
        }
        zzbgb.q((zzbgb) this.x, (zzbft) zzbfsVar.zzal());
        return this;
    }

    public final zzbga zzh(String str) {
        if (this.y) {
            c();
            this.y = false;
        }
        zzbgb.n((zzbgb) this.x, str);
        return this;
    }

    public final zzbga zzi(zzbgz zzbgzVar) {
        if (this.y) {
            c();
            this.y = false;
        }
        zzbgb.s((zzbgb) this.x, zzbgzVar);
        return this;
    }

    public final zzbga zzj(zzbig zzbigVar) {
        if (this.y) {
            c();
            this.y = false;
        }
        zzbgb.t((zzbgb) this.x, zzbigVar);
        return this;
    }

    public final String zzk() {
        return ((zzbgb) this.x).zzf();
    }

    public /* synthetic */ zzbga(int i) {
        super(zzbgb.zzb);
    }
}
