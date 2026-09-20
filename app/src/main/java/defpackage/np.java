package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class np extends jp {
    public final int w;
    public final int x;
    public boolean y;
    public int z;

    public np(char c, char c2, int i) {
        this.w = i;
        this.x = c2;
        boolean z = true;
        if (i <= 0 ? ur1.b(c, c2) < 0 : ur1.b(c, c2) > 0) {
            z = false;
        }
        this.y = z;
        this.z = z ? c : c2;
    }

    @Override // defpackage.jp
    public final char a() {
        int i = this.z;
        if (i != this.x) {
            this.z = this.w + i;
        } else {
            if (!this.y) {
                throw new NoSuchElementException();
            }
            this.y = false;
        }
        return (char) i;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.y;
    }
}
