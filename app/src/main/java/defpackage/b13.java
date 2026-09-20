package defpackage;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public class b13<K, V, T> extends z03<K, V, T> {
    public K A;
    public boolean B;
    public int C;
    public final a13<K, V> z;

    public b13(a13<K, V> a13Var, eb5<K, V, T>[] eb5VarArr) {
        super(a13Var.y, eb5VarArr);
        this.z = a13Var;
        this.C = a13Var.A;
    }

    public final void c(int i, db5<?, ?> db5Var, K k, int i2) {
        int i3 = i2 * 5;
        eb5<K, V, T>[] eb5VarArr = this.w;
        if (i3 <= 30) {
            int i4 = 1 << ((i >> i3) & 31);
            if (db5Var.h(i4)) {
                eb5VarArr[i2].a(Integer.bitCount(db5Var.a) * 2, db5Var.f(i4), db5Var.d);
                this.x = i2;
                return;
            }
            int iT = db5Var.t(i4);
            db5<?, ?> db5VarS = db5Var.s(iT);
            eb5VarArr[i2].a(Integer.bitCount(db5Var.a) * 2, iT, db5Var.d);
            c(i, db5VarS, k, i2 + 1);
            return;
        }
        eb5<K, V, T> eb5Var = eb5VarArr[i2];
        Object[] objArr = db5Var.d;
        eb5Var.a(objArr.length, 0, objArr);
        while (true) {
            eb5<K, V, T> eb5Var2 = eb5VarArr[i2];
            if (ur1.a(eb5Var2.w[eb5Var2.y], k)) {
                this.x = i2;
                return;
            } else {
                eb5VarArr[i2].y += 2;
            }
        }
    }

    @Override // defpackage.z03, java.util.Iterator, j$.util.Iterator
    public final T next() {
        if (this.z.A != this.C) {
            throw new ConcurrentModificationException();
        }
        if (!this.y) {
            throw new NoSuchElementException();
        }
        eb5<K, V, T> eb5Var = this.w[this.x];
        this.A = (K) eb5Var.w[eb5Var.y];
        this.B = true;
        return (T) super.next();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.z03, java.util.Iterator, j$.util.Iterator
    public final void remove() {
        if (!this.B) {
            throw new IllegalStateException();
        }
        boolean z = this.y;
        a13<K, V> a13Var = this.z;
        if (!z) {
            K k = this.A;
            sb5.c(a13Var);
            a13Var.remove(k);
        } else {
            if (!z) {
                throw new NoSuchElementException();
            }
            eb5<K, V, T> eb5Var = this.w[this.x];
            Object obj = eb5Var.w[eb5Var.y];
            K k2 = this.A;
            sb5.c(a13Var);
            a13Var.remove(k2);
            c(obj != null ? obj.hashCode() : 0, a13Var.y, obj, 0);
        }
        this.A = null;
        this.B = false;
        this.C = a13Var.A;
    }
}
