package j$.util.stream;

import j$.util.AbstractC1514m;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
final class s3 extends t3 implements Spliterator {
    s3(Spliterator spliterator, long j, long j2) {
        super(spliterator, j, j2, 0L, Math.min(spliterator.estimateSize(), j2));
    }

    private s3(Spliterator spliterator, long j, long j2, long j3, long j4) {
        super(spliterator, j, j2, j3, j4);
    }

    @Override // j$.util.Spliterator
    public final boolean a(Consumer consumer) {
        long j;
        consumer.getClass();
        long j2 = this.e;
        long j3 = this.a;
        if (j3 >= j2) {
            return false;
        }
        while (true) {
            j = this.d;
            if (j3 <= j) {
                break;
            }
            this.c.a(new S1(7));
            this.d++;
        }
        if (j >= this.e) {
            return false;
        }
        this.d = j + 1;
        return this.c.a(consumer);
    }

    @Override // j$.util.stream.t3
    protected final Spliterator f(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new s3(spliterator, j, j2, j3, j4);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        long j = this.e;
        long j2 = this.a;
        if (j2 >= j) {
            return;
        }
        long j3 = this.d;
        if (j3 >= j) {
            return;
        }
        if (j3 >= j2 && this.c.estimateSize() + j3 <= this.b) {
            this.c.forEachRemaining(consumer);
            this.d = this.e;
            return;
        }
        while (j2 > this.d) {
            this.c.a(new S1(6));
            this.d++;
        }
        while (this.d < this.e) {
            this.c.a(consumer);
            this.d++;
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
}
