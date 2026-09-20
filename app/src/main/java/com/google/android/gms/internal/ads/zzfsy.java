package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzfsy extends zzfwu {

    @CheckForNull
    public Object w;
    public int x = 2;

    @CheckForNull
    public abstract Object a();

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        zzfsf.zzh(this.x != 4);
        int i = this.x;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            return true;
        }
        if (i2 != 2) {
            this.x = 4;
            this.w = a();
            if (this.x != 3) {
                this.x = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.x = 2;
        Object obj = this.w;
        this.w = null;
        return obj;
    }
}
