package j$.util.stream;

import j$.util.AbstractC1514m;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
final class I2 implements Spliterator {
    int a;
    final int b;
    int c;
    final int d;
    Object[] e;
    final /* synthetic */ R2 f;

    I2(R2 r2, int i, int i2, int i3, int i4) {
        this.f = r2;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        Object[][] objArr = r2.f;
        this.e = objArr == null ? r2.e : objArr[i];
    }

    @Override // j$.util.Spliterator
    public final boolean a(Consumer consumer) {
        consumer.getClass();
        int i = this.a;
        int i2 = this.b;
        if (i >= i2 && (i != i2 || this.c >= this.d)) {
            return false;
        }
        Object[] objArr = this.e;
        int i3 = this.c;
        this.c = i3 + 1;
        consumer.p(objArr[i3]);
        if (this.c == this.e.length) {
            this.c = 0;
            int i4 = this.a + 1;
            this.a = i4;
            Object[][] objArr2 = this.f.f;
            if (objArr2 != null && i4 <= i2) {
                this.e = objArr2[i4];
            }
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i = this.a;
        int i2 = this.d;
        int i3 = this.b;
        if (i == i3) {
            return ((long) i2) - ((long) this.c);
        }
        long[] jArr = this.f.d;
        return ((jArr[i3] + ((long) i2)) - jArr[i]) - ((long) this.c);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        R2 r2;
        consumer.getClass();
        int i = this.a;
        int i2 = this.d;
        int i3 = this.b;
        if (i < i3 || (i == i3 && this.c < i2)) {
            int i4 = this.c;
            while (true) {
                r2 = this.f;
                if (i >= i3) {
                    break;
                }
                Object[] objArr = r2.f[i];
                while (i4 < objArr.length) {
                    consumer.p(objArr[i4]);
                    i4++;
                }
                i++;
                i4 = 0;
            }
            Object[] objArr2 = this.a == i3 ? this.e : r2.f[i3];
            while (i4 < i2) {
                consumer.p(objArr2[i4]);
                i4++;
            }
            this.a = i3;
            this.c = i2;
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC1514m.i(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC1514m.k(this, i);
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i = this.a;
        int i2 = this.b;
        if (i < i2) {
            int i3 = i2 - 1;
            int i4 = this.c;
            R2 r2 = this.f;
            I2 i5 = new I2(r2, i, i3, i4, r2.f[i3].length);
            this.a = i2;
            this.c = 0;
            this.e = r2.f[i2];
            return i5;
        }
        if (i != i2) {
            return null;
        }
        int i6 = this.c;
        int i7 = (this.d - i6) / 2;
        if (i7 == 0) {
            return null;
        }
        Spliterator spliteratorM = j$.util.b0.m(this.e, i6, i6 + i7);
        this.c += i7;
        return spliteratorM;
    }
}
