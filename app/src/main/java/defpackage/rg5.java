package defpackage;

import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class rg5 extends tg5 implements Iterable<tg5>, jv1 {
    public final float A;
    public final float B;
    public final float C;
    public final float D;
    public final List<uz2> E;
    public final List<tg5> F;
    public final String w;
    public final float x;
    public final float y;
    public final float z;

    public static final class QnHx implements Iterator<tg5>, jv1, j$.util.Iterator {
        public final Iterator<tg5> w;

        public QnHx(rg5 rg5Var) {
            this.w = rg5Var.F.iterator();
        }

        @Override // j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super tg5> consumer) {
            j$.util.Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            return this.w.hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            return this.w.next();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public rg5(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List<? extends uz2> list, List<? extends tg5> list2) {
        this.w = str;
        this.x = f;
        this.y = f2;
        this.z = f3;
        this.A = f4;
        this.B = f5;
        this.C = f6;
        this.D = f7;
        this.E = list;
        this.F = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof rg5)) {
            return false;
        }
        rg5 rg5Var = (rg5) obj;
        if (!ur1.a(this.w, rg5Var.w)) {
            return false;
        }
        if (!(this.x == rg5Var.x)) {
            return false;
        }
        if (!(this.y == rg5Var.y)) {
            return false;
        }
        if (!(this.z == rg5Var.z)) {
            return false;
        }
        if (!(this.A == rg5Var.A)) {
            return false;
        }
        if (!(this.B == rg5Var.B)) {
            return false;
        }
        if (this.C == rg5Var.C) {
            return ((this.D > rg5Var.D ? 1 : (this.D == rg5Var.D ? 0 : -1)) == 0) && ur1.a(this.E, rg5Var.E) && ur1.a(this.F, rg5Var.F);
        }
        return false;
    }

    public final int hashCode() {
        return this.F.hashCode() + qg5.a(this.E, ry0.b(this.D, ry0.b(this.C, ry0.b(this.B, ry0.b(this.A, ry0.b(this.z, ry0.b(this.y, ry0.b(this.x, this.w.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Override // java.lang.Iterable
    public final Iterator<tg5> iterator() {
        return new QnHx(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public rg5() {
        cs0 cs0Var = cs0.w;
        int i = sg5.a;
        this("", 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, cs0Var, cs0Var);
    }
}
