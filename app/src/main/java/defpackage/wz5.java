package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class wz5 implements Iterator {
    public int w = 0;
    public final /* synthetic */ f06 x;

    public wz5(f06 f06Var) {
        this.x = f06Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.w < this.x.w.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.w;
        f06 f06Var = this.x;
        if (i >= f06Var.w.length()) {
            throw new NoSuchElementException();
        }
        this.w = i + 1;
        return new f06(String.valueOf(f06Var.w.charAt(i)));
    }
}
