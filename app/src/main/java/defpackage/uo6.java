package defpackage;

import com.google.android.gms.internal.ads.zzfwu;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class uo6 extends zzfwu {
    public boolean w;
    public final /* synthetic */ Object x;

    public uo6(Object obj) {
        this.x = obj;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return !this.w;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (this.w) {
            throw new NoSuchElementException();
        }
        this.w = true;
        return this.x;
    }
}
