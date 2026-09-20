package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
final class C3 extends X2 {
    C3(AbstractC1616w0 abstractC1616w0, Spliterator spliterator, boolean z) {
        super(abstractC1616w0, spliterator, z);
    }

    C3(AbstractC1616w0 abstractC1616w0, C1520a c1520a, boolean z) {
        super(abstractC1616w0, c1520a, z);
    }

    @Override // j$.util.Spliterator
    public final boolean a(Consumer consumer) {
        Object obj;
        consumer.getClass();
        boolean zF = f();
        if (zF) {
            R2 r2 = (R2) this.h;
            long j = this.g;
            if (r2.c != 0) {
                if (j >= r2.count()) {
                    throw new IndexOutOfBoundsException(Long.toString(j));
                }
                for (int i = 0; i <= r2.c; i++) {
                    long j2 = r2.d[i];
                    Object[] objArr = r2.f[i];
                    if (j < ((long) objArr.length) + j2) {
                        obj = objArr[(int) (j - j2)];
                    }
                }
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
            if (j >= r2.b) {
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
            obj = r2.e[(int) j];
            consumer.p(obj);
        }
        return zF;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.h != null || this.i) {
            while (a(consumer)) {
            }
            return;
        }
        consumer.getClass();
        h();
        B3 b3 = new B3(consumer, 1);
        this.b.w1(this.d, b3);
        this.i = true;
    }

    @Override // j$.util.stream.X2
    final void i() {
        R2 r2 = new R2();
        this.h = r2;
        this.e = this.b.x1(new B3(r2, 0));
        this.f = new C1520a(7, this);
    }

    @Override // j$.util.stream.X2
    final X2 k(Spliterator spliterator) {
        return new C3(this.b, spliterator, this.a);
    }
}
