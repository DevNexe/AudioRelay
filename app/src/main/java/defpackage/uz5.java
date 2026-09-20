package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class uz5 implements Iterator {
    public int w = 0;
    public final /* synthetic */ f06 x;

    public uz5(f06 f06Var) {
        this.x = f06Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.w < this.x.w.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.w;
        if (i >= this.x.w.length()) {
            throw new NoSuchElementException();
        }
        this.w = i + 1;
        return new f06(String.valueOf(i));
    }
}
