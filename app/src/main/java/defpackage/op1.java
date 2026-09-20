package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class op1 extends lp1 {
    public final int w;
    public final int x;
    public boolean y;
    public int z;

    public op1(int i, int i2, int i3) {
        this.w = i3;
        this.x = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.y = z;
        this.z = z ? i : i2;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.y;
    }

    @Override // defpackage.lp1
    public final int nextInt() {
        int i = this.z;
        if (i != this.x) {
            this.z = this.w + i;
        } else {
            if (!this.y) {
                throw new NoSuchElementException();
            }
            this.y = false;
        }
        return i;
    }
}
