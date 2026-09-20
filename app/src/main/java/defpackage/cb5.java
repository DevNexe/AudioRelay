package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class cb5<E> extends SjP<E> {
    public boolean A;
    public int y;
    public Object[] z;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public cb5(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.y = i3;
        Object[] objArr2 = new Object[i3];
        this.z = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.A = r5;
        objArr2[0] = objArr;
        b(i - r5, 1);
    }

    public final E a() {
        int i = this.w & 31;
        Object obj = this.z[this.y - 1];
        if (obj != null) {
            return (E) ((Object[]) obj)[i];
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
    }

    public final void b(int i, int i2) {
        int i3 = (this.y - i2) * 5;
        while (i2 < this.y) {
            Object[] objArr = this.z;
            Object obj = objArr[i2 - 1];
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            objArr[i2] = ((Object[]) obj)[(i >> i3) & 31];
            i3 -= 5;
            i2++;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public final E next() {
        int i;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E eA = a();
        int i2 = this.w + 1;
        this.w = i2;
        if (i2 == this.x) {
            this.A = true;
            return eA;
        }
        int i3 = 0;
        while (true) {
            i = this.w;
            if (((i >> i3) & 31) != 0) {
                break;
            }
            i3 += 5;
        }
        if (i3 > 0) {
            b(i, ((this.y - 1) - (i3 / 5)) + 1);
        }
        return eA;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        int i;
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.w--;
        int i2 = 0;
        if (this.A) {
            this.A = false;
            return a();
        }
        while (true) {
            i = this.w;
            if (((i >> i2) & 31) != 31) {
                break;
            }
            i2 += 5;
        }
        if (i2 > 0) {
            b(i, ((this.y - 1) - (i2 / 5)) + 1);
        }
        return a();
    }
}
