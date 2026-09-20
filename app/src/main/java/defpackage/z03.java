package defpackage;

import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class z03<K, V, T> implements Iterator<T>, jv1, j$.util.Iterator {
    public final eb5<K, V, T>[] w;
    public int x;
    public boolean y = true;

    public z03(db5<K, V> db5Var, eb5<K, V, T>[] eb5VarArr) {
        this.w = eb5VarArr;
        eb5VarArr[0].a(Integer.bitCount(db5Var.a) * 2, 0, db5Var.d);
        this.x = 0;
        a();
    }

    public final void a() {
        int i = this.x;
        eb5<K, V, T>[] eb5VarArr = this.w;
        eb5<K, V, T> eb5Var = eb5VarArr[i];
        if (eb5Var.y < eb5Var.x) {
            return;
        }
        while (-1 < i) {
            int iB = b(i);
            if (iB == -1) {
                eb5<K, V, T> eb5Var2 = eb5VarArr[i];
                int i2 = eb5Var2.y;
                Object[] objArr = eb5Var2.w;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    eb5Var2.y = i2 + 1;
                    iB = b(i);
                }
            }
            if (iB != -1) {
                this.x = iB;
                return;
            }
            if (i > 0) {
                eb5<K, V, T> eb5Var3 = eb5VarArr[i - 1];
                int i3 = eb5Var3.y;
                int length2 = eb5Var3.w.length;
                eb5Var3.y = i3 + 1;
            }
            eb5VarArr[i].a(0, 0, db5.e.d);
            i--;
        }
        this.y = false;
    }

    public final int b(int i) {
        eb5<K, V, T>[] eb5VarArr = this.w;
        eb5<K, V, T> eb5Var = eb5VarArr[i];
        int i2 = eb5Var.y;
        if (i2 < eb5Var.x) {
            return i;
        }
        Object[] objArr = eb5Var.w;
        if (!(i2 < objArr.length)) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        }
        db5 db5Var = (db5) obj;
        if (i == 6) {
            eb5<K, V, T> eb5Var2 = eb5VarArr[i + 1];
            Object[] objArr2 = db5Var.d;
            eb5Var2.a(objArr2.length, 0, objArr2);
        } else {
            eb5VarArr[i + 1].a(Integer.bitCount(db5Var.a) * 2, 0, db5Var.d);
        }
        return b(i + 1);
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        j$.util.Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.y;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public T next() {
        if (!this.y) {
            throw new NoSuchElementException();
        }
        T next = this.w[this.x].next();
        a();
        return next;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
