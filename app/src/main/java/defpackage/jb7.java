package defpackage;

import com.google.android.gms.internal.ads.zzdd;
import com.google.android.gms.internal.ads.zzvy;
import com.google.android.gms.internal.ads.zzvz;

/* JADX INFO: loaded from: classes3.dex */
public final class jb7 implements zzvz {
    public long a;
    public long b;
    public zzvy c;
    public jb7 d;

    public jb7(long j) {
        zzdd.zzf(this.c == null);
        this.a = j;
        this.b = j + 65536;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final zzvy zzc() {
        zzvy zzvyVar = this.c;
        zzvyVar.getClass();
        return zzvyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final zzvz zzd() {
        jb7 jb7Var = this.d;
        if (jb7Var == null || jb7Var.c == null) {
            return null;
        }
        return jb7Var;
    }
}
