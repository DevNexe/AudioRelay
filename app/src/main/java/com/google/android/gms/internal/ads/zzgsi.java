package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgsi extends zzgoj implements zzgpy {
    public zzgsi() {
        super(zzgtn.zzb);
    }

    public final zzgsi zza(Iterable iterable) {
        if (this.y) {
            c();
            this.y = false;
        }
        zzgtn.v((zzgtn) this.x, iterable);
        return this;
    }

    public final zzgsi zzb(Iterable iterable) {
        if (this.y) {
            c();
            this.y = false;
        }
        zzgtn.w((zzgtn) this.x, iterable);
        return this;
    }

    public final zzgsi zzc(zzgth zzgthVar) {
        if (this.y) {
            c();
            this.y = false;
        }
        zzgtn.q((zzgtn) this.x, zzgthVar);
        return this;
    }

    public final zzgsi zzd() {
        if (this.y) {
            c();
            this.y = false;
        }
        zzgtn.s((zzgtn) this.x);
        return this;
    }

    public final zzgsi zze(String str) {
        if (this.y) {
            c();
            this.y = false;
        }
        zzgtn.r((zzgtn) this.x, str);
        return this;
    }

    public final zzgsi zzf(zzgtj zzgtjVar) {
        if (this.y) {
            c();
            this.y = false;
        }
        zzgtn.u((zzgtn) this.x, zzgtjVar);
        return this;
    }

    public final zzgsi zzg(zzgsk zzgskVar) {
        if (this.y) {
            c();
            this.y = false;
        }
        zzgtn.p((zzgtn) this.x, zzgskVar);
        return this;
    }

    public final zzgsi zzh(String str) {
        if (this.y) {
            c();
            this.y = false;
        }
        zzgtn.o((zzgtn) this.x, str);
        return this;
    }

    public final zzgsi zzi(zzgtb zzgtbVar) {
        if (this.y) {
            c();
            this.y = false;
        }
        zzgtn.t((zzgtn) this.x, zzgtbVar);
        return this;
    }

    public final zzgsi zzj(String str) {
        if (this.y) {
            c();
            this.y = false;
        }
        zzgtn.n((zzgtn) this.x, str);
        return this;
    }

    public final String zzk() {
        return ((zzgtn) this.x).zzd();
    }

    public final String zzl() {
        return ((zzgtn) this.x).zze();
    }

    public final List zzm() {
        return Collections.unmodifiableList(((zzgtn) this.x).zzf());
    }

    public final zzgsi zzn(int i) {
        if (this.y) {
            c();
            this.y = false;
        }
        zzgtn.x((zzgtn) this.x, i);
        return this;
    }

    public /* synthetic */ zzgsi(int i) {
        super(zzgtn.zzb);
    }
}
