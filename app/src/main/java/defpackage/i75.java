package defpackage;

import defpackage.j75;
import java.lang.Comparable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class i75<T extends j75 & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;
    public T[] a;

    public final void a(hu0.F1 f1) {
        f1.c((hu0.LPt8Fixed) this);
        T[] tArr = this.a;
        if (tArr == null) {
            tArr = (T[]) new j75[4];
            this.a = tArr;
        } else if (this._size >= tArr.length) {
            tArr = (T[]) ((j75[]) Arrays.copyOf(tArr, this._size * 2));
            this.a = tArr;
        }
        int i = this._size;
        this._size = i + 1;
        tArr[i] = f1;
        f1.x = i;
        while (i > 0) {
            T[] tArr2 = this.a;
            int i2 = (i - 1) / 2;
            if (((Comparable) tArr2[i2]).compareTo(tArr2[i]) <= 0) {
                return;
            }
            e(i, i2);
            i = i2;
        }
    }

    public final boolean b() {
        return this._size == 0;
    }

    public final T c(int i) {
        T[] tArr = this.a;
        this._size--;
        if (i < this._size) {
            e(i, this._size);
            int i2 = (i - 1) / 2;
            if (i <= 0 || ((Comparable) tArr[i]).compareTo(tArr[i2]) >= 0) {
                while (true) {
                    int i3 = (i * 2) + 1;
                    if (i3 >= this._size) {
                        break;
                    }
                    T[] tArr2 = this.a;
                    int i4 = i3 + 1;
                    if (i4 < this._size && ((Comparable) tArr2[i4]).compareTo(tArr2[i3]) < 0) {
                        i3 = i4;
                    }
                    if (((Comparable) tArr2[i]).compareTo(tArr2[i3]) <= 0) {
                        break;
                    }
                    e(i, i3);
                    i = i3;
                }
            } else {
                e(i, i2);
                while (i2 > 0) {
                    T[] tArr3 = this.a;
                    int i5 = (i2 - 1) / 2;
                    if (((Comparable) tArr3[i5]).compareTo(tArr3[i2]) <= 0) {
                        break;
                    }
                    e(i2, i5);
                    i2 = i5;
                }
            }
        }
        T t = tArr[this._size];
        t.c(null);
        t.setIndex(-1);
        tArr[this._size] = null;
        return t;
    }

    public final T d() {
        T t;
        synchronized (this) {
            t = this._size > 0 ? (T) c(0) : null;
        }
        return t;
    }

    public final void e(int i, int i2) {
        T[] tArr = this.a;
        T t = tArr[i2];
        T t2 = tArr[i];
        tArr[i] = t;
        tArr[i2] = t2;
        t.setIndex(i);
        t2.setIndex(i2);
    }
}
