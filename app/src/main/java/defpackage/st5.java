package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class st5 implements Iterator {
    public int w = 0;
    public final /* synthetic */ hu5 x;

    public st5(hu5 hu5Var) {
        this.x = hu5Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.w < this.x.d();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.w;
        hu5 hu5Var = this.x;
        if (i >= hu5Var.d()) {
            throw new NoSuchElementException(GM.a("Out of bounds index: ", this.w));
        }
        int i2 = this.w;
        this.w = i2 + 1;
        return hu5Var.e(i2);
    }
}
