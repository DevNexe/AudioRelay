package defpackage;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class w13<T> extends SjP<T> {
    public cb5<? extends T> A;
    public int B;
    public final u13<T> y;
    public int z;

    public w13(u13<T> u13Var, int i) {
        super(i, u13Var.a());
        this.y = u13Var;
        this.z = u13Var.f();
        this.B = -1;
        b();
    }

    public final void a() {
        if (this.z != this.y.f()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // defpackage.SjP, java.util.ListIterator
    public final void add(T t) {
        a();
        int i = this.w;
        u13<T> u13Var = this.y;
        u13Var.add(i, t);
        this.w++;
        this.x = u13Var.a();
        this.z = u13Var.f();
        this.B = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void b() {
        u13<T> u13Var = this.y;
        Object[] objArr = u13Var.B;
        if (objArr == null) {
            this.A = null;
            return;
        }
        int iA = (u13Var.a() - 1) & (-32);
        int i = this.w;
        if (i > iA) {
            i = iA;
        }
        int i2 = (u13Var.z / 5) + 1;
        cb5<? extends T> cb5Var = this.A;
        if (cb5Var == null) {
            this.A = new cb5<>(objArr, i, iA, i2);
            return;
        }
        cb5Var.w = i;
        cb5Var.x = iA;
        cb5Var.y = i2;
        if (cb5Var.z.length < i2) {
            cb5Var.z = new Object[i2];
        }
        cb5Var.z[0] = objArr;
        ?? r6 = i == iA ? 1 : 0;
        cb5Var.A = r6;
        cb5Var.b(i - r6, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public final T next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.w;
        this.B = i;
        cb5<? extends T> cb5Var = this.A;
        u13<T> u13Var = this.y;
        if (cb5Var == null) {
            Object[] objArr = u13Var.C;
            this.w = i + 1;
            return (T) objArr[i];
        }
        if (cb5Var.hasNext()) {
            this.w++;
            return cb5Var.next();
        }
        Object[] objArr2 = u13Var.C;
        int i2 = this.w;
        this.w = i2 + 1;
        return (T) objArr2[i2 - cb5Var.x];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.w;
        int i2 = i - 1;
        this.B = i2;
        cb5<? extends T> cb5Var = this.A;
        u13<T> u13Var = this.y;
        if (cb5Var == null) {
            Object[] objArr = u13Var.C;
            this.w = i2;
            return (T) objArr[i2];
        }
        int i3 = cb5Var.x;
        if (i <= i3) {
            this.w = i2;
            return cb5Var.previous();
        }
        Object[] objArr2 = u13Var.C;
        this.w = i2;
        return (T) objArr2[i2 - i3];
    }

    @Override // defpackage.SjP, java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public final void remove() {
        a();
        int i = this.B;
        if (i == -1) {
            throw new IllegalStateException();
        }
        u13<T> u13Var = this.y;
        u13Var.b(i);
        int i2 = this.B;
        if (i2 < this.w) {
            this.w = i2;
        }
        this.x = u13Var.a();
        this.z = u13Var.f();
        this.B = -1;
        b();
    }

    @Override // defpackage.SjP, java.util.ListIterator
    public final void set(T t) {
        a();
        int i = this.B;
        if (i == -1) {
            throw new IllegalStateException();
        }
        u13<T> u13Var = this.y;
        u13Var.set(i, t);
        this.z = u13Var.f();
        b();
    }
}
