package defpackage;

import com.google.android.gms.internal.ads.zzgnf;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class dt6 extends et6 {
    public int w = 0;
    public final int x;
    public final /* synthetic */ zzgnf y;

    public dt6(zzgnf zzgnfVar) {
        this.y = zzgnfVar;
        this.x = zzgnfVar.zzd();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.w < this.x;
    }

    @Override // com.google.android.gms.internal.ads.zzgmz
    public final byte zza() {
        int i = this.w;
        if (i >= this.x) {
            throw new NoSuchElementException();
        }
        this.w = i + 1;
        return this.y.b(i);
    }
}
