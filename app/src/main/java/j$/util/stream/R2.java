package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
class R2 extends AbstractC1540e implements Consumer, Iterable {
    protected Object[] e = new Object[1 << 4];
    protected Object[][] f;

    R2() {
    }

    @Override // j$.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public void p(Object obj) {
        long length;
        int i = this.b;
        Object[] objArr = this.e;
        if (i == objArr.length) {
            if (this.f == null) {
                Object[][] objArr2 = new Object[8][];
                this.f = objArr2;
                this.d = new long[8];
                objArr2[0] = objArr;
            }
            int i2 = this.c;
            int i3 = i2 + 1;
            Object[][] objArr3 = this.f;
            if (i3 >= objArr3.length || objArr3[i3] == null) {
                if (i2 == 0) {
                    length = objArr.length;
                } else {
                    length = ((long) objArr3[i2].length) + this.d[i2];
                }
                r(length + 1);
            }
            this.b = 0;
            int i4 = this.c + 1;
            this.c = i4;
            this.e = this.f[i4];
        }
        Object[] objArr4 = this.e;
        int i5 = this.b;
        this.b = i5 + 1;
        objArr4[i5] = obj;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.AbstractC1540e
    public final void clear() {
        Object[][] objArr = this.f;
        if (objArr != null) {
            this.e = objArr[0];
            int i = 0;
            while (true) {
                Object[] objArr2 = this.e;
                if (i >= objArr2.length) {
                    break;
                }
                objArr2[i] = null;
                i++;
            }
            this.f = null;
            this.d = null;
        } else {
            for (int i2 = 0; i2 < this.b; i2++) {
                this.e[i2] = null;
            }
        }
        this.b = 0;
        this.c = 0;
    }

    public void forEach(Consumer consumer) {
        for (int i = 0; i < this.c; i++) {
            for (Object obj : this.f[i]) {
                consumer.p(obj);
            }
        }
        for (int i2 = 0; i2 < this.b; i2++) {
            consumer.p(this.e[i2]);
        }
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        forEach(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return j$.util.b0.i(spliterator());
    }

    protected final void r(long j) {
        long length;
        int i = this.c;
        if (i == 0) {
            length = this.e.length;
        } else {
            length = ((long) this.f[i].length) + this.d[i];
        }
        if (j <= length) {
            return;
        }
        if (this.f == null) {
            Object[][] objArr = new Object[8][];
            this.f = objArr;
            this.d = new long[8];
            objArr[0] = this.e;
        }
        while (true) {
            i++;
            if (j <= length) {
                return;
            }
            Object[][] objArr2 = this.f;
            if (i >= objArr2.length) {
                int length2 = objArr2.length * 2;
                this.f = (Object[][]) Arrays.copyOf(objArr2, length2);
                this.d = Arrays.copyOf(this.d, length2);
            }
            int iMin = this.a;
            if (i != 0 && i != 1) {
                iMin = Math.min((iMin + i) - 1, 30);
            }
            int i2 = 1 << iMin;
            Object[][] objArr3 = this.f;
            objArr3[i] = new Object[i2];
            long[] jArr = this.d;
            int i3 = i - 1;
            jArr[i] = jArr[i3] + ((long) objArr3[i3].length);
            length += (long) i2;
        }
    }

    @Override // java.lang.Iterable
    public Spliterator spliterator() {
        return new I2(this, 0, this.c, 0, this.b);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        forEach(new C1520a(8, arrayList));
        return "SpinedBuffer:" + arrayList.toString();
    }
}
