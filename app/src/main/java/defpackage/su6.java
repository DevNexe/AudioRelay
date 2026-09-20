package defpackage;

import com.google.android.gms.internal.ads.zzgmz;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class su6 extends et6 {
    public final uu6 w;
    public zzgmz x = a();

    public su6(vu6 vu6Var) {
        this.w = new uu6(vu6Var);
    }

    public final zzgmz a() {
        uu6 uu6Var = this.w;
        if (uu6Var.hasNext()) {
            return uu6Var.a().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.x != null;
    }

    @Override // com.google.android.gms.internal.ads.zzgmz
    public final byte zza() {
        zzgmz zzgmzVar = this.x;
        if (zzgmzVar == null) {
            throw new NoSuchElementException();
        }
        byte bZza = zzgmzVar.zza();
        if (!this.x.hasNext()) {
            this.x = a();
        }
        return bZza;
    }
}
