package defpackage;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class wv4<T> implements List<T>, lv1 {
    public final wp4<T> w;
    public final int x;
    public int y;
    public int z;

    public static final class QnHx implements ListIterator<T>, jv1, Iterator {
        public final /* synthetic */ hl3 w;
        public final /* synthetic */ wv4<T> x;

        public QnHx(hl3 hl3Var, wv4<T> wv4Var) {
            this.w = hl3Var;
            this.x = wv4Var;
        }

        @Override // java.util.ListIterator
        public final void add(Object obj) {
            Object obj2 = xp4.a;
            throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
        }

        @Override // j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            return this.w.w < this.x.z - 1;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.w.w >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public final T next() {
            hl3 hl3Var = this.w;
            int i = hl3Var.w + 1;
            wv4<T> wv4Var = this.x;
            xp4.a(i, wv4Var.z);
            hl3Var.w = i;
            return wv4Var.get(i);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.w.w + 1;
        }

        @Override // java.util.ListIterator
        public final T previous() {
            hl3 hl3Var = this.w;
            int i = hl3Var.w;
            wv4<T> wv4Var = this.x;
            xp4.a(i, wv4Var.z);
            hl3Var.w = i - 1;
            return wv4Var.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.w.w;
        }

        @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
        public final void remove() {
            Object obj = xp4.a;
            throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
        }

        @Override // java.util.ListIterator
        public final void set(Object obj) {
            Object obj2 = xp4.a;
            throw new IllegalStateException("Cannot modify a state list through an iterator".toString());
        }
    }

    public wv4(wp4<T> wp4Var, int i, int i2) {
        this.w = wp4Var;
        this.x = i;
        this.y = wp4Var.c();
        this.z = i2 - i;
    }

    public final void a() {
        if (this.w.c() != this.y) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        a();
        int i = this.x + this.z;
        wp4<T> wp4Var = this.w;
        wp4Var.add(i, t);
        this.z++;
        this.y = wp4Var.c();
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        return addAll(this.z, collection);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0065 */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void clear() {
        /*
            r11 = this;
            int r0 = r11.z
            if (r0 <= 0) goto L76
            r11.a()
            wp4<T> r0 = r11.w
            int r1 = r11.x
            int r2 = r11.z
            int r2 = r2 + r1
            r0.getClass()
        L11:
            java.lang.Object r3 = defpackage.xp4.a
            monitor-enter(r3)
            wp4$QnHx r4 = r0.w     // Catch: java.lang.Throwable -> L73
            cp4 r5 = defpackage.ip4.h()     // Catch: java.lang.Throwable -> L73
            xs4 r4 = defpackage.ip4.g(r4, r5)     // Catch: java.lang.Throwable -> L73
            wp4$QnHx r4 = (wp4.QnHx) r4     // Catch: java.lang.Throwable -> L73
            int r5 = r4.d     // Catch: java.lang.Throwable -> L73
            o13<? extends T> r4 = r4.c     // Catch: java.lang.Throwable -> L73
            sd5 r6 = defpackage.sd5.a     // Catch: java.lang.Throwable -> L73
            monitor-exit(r3)
            u13 r6 = r4.builder()
            java.util.List r7 = r6.subList(r1, r2)
            r7.clear()
            o13 r6 = r6.c()
            boolean r4 = defpackage.ur1.a(r6, r4)
            r7 = 0
            if (r4 != 0) goto L68
            monitor-enter(r3)
            wp4$QnHx r4 = r0.w     // Catch: java.lang.Throwable -> L65
            java.lang.Object r8 = defpackage.ip4.c     // Catch: java.lang.Throwable -> L65
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L65
            cp4 r9 = defpackage.ip4.h()     // Catch: java.lang.Throwable -> L62
            xs4 r4 = defpackage.ip4.q(r4, r0, r9)     // Catch: java.lang.Throwable -> L62
            wp4$QnHx r4 = (wp4.QnHx) r4     // Catch: java.lang.Throwable -> L62
            int r10 = r4.d     // Catch: java.lang.Throwable -> L62
            if (r10 != r5) goto L59
            r4.c = r6     // Catch: java.lang.Throwable -> L62
            int r10 = r10 + 1
            r4.d = r10     // Catch: java.lang.Throwable -> L62
            r4 = 1
            goto L5a
        L59:
            r4 = 0
        L5a:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L65
            defpackage.ip4.k(r9, r0)     // Catch: java.lang.Throwable -> L65
            monitor-exit(r3)
            if (r4 == 0) goto L11
            goto L68
        L62:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L65
            throw r0     // Catch: java.lang.Throwable -> L65
        L65:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L68:
            r11.z = r7
            wp4<T> r0 = r11.w
            int r0 = r0.c()
            r11.y = r0
            goto L76
        L73:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wv4.clear():void");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        java.util.Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final T get(int i) {
        a();
        xp4.a(i, this.z);
        return this.w.get(this.x + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        a();
        int i = this.z;
        int i2 = this.x;
        java.util.Iterator<Integer> it = AY.V(i2, i + i2).iterator();
        while (it.hasNext()) {
            int iNextInt = ((lp1) it).nextInt();
            if (ur1.a(obj, this.w.get(iNextInt))) {
                return iNextInt - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.z == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        int i = this.z;
        int i2 = this.x;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (ur1.a(obj, this.w.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        java.util.Iterator<? extends Object> it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0063 */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean retainAll(java.util.Collection<? extends java.lang.Object> r14) {
        /*
            r13 = this;
            r13.a()
            wp4<T> r0 = r13.w
            int r1 = r13.x
            int r2 = r13.z
            int r2 = r2 + r1
            int r3 = r0.size()
        Le:
            java.lang.Object r4 = defpackage.xp4.a
            monitor-enter(r4)
            wp4$QnHx r5 = r0.w     // Catch: java.lang.Throwable -> L7e
            cp4 r6 = defpackage.ip4.h()     // Catch: java.lang.Throwable -> L7e
            xs4 r5 = defpackage.ip4.g(r5, r6)     // Catch: java.lang.Throwable -> L7e
            wp4$QnHx r5 = (wp4.QnHx) r5     // Catch: java.lang.Throwable -> L7e
            int r6 = r5.d     // Catch: java.lang.Throwable -> L7e
            o13<? extends T> r5 = r5.c     // Catch: java.lang.Throwable -> L7e
            sd5 r7 = defpackage.sd5.a     // Catch: java.lang.Throwable -> L7e
            monitor-exit(r4)
            u13 r7 = r5.builder()
            java.util.List r8 = r7.subList(r1, r2)
            r8.retainAll(r14)
            o13 r7 = r7.c()
            boolean r5 = defpackage.ur1.a(r7, r5)
            r8 = 0
            r9 = 1
            if (r5 != 0) goto L66
            monitor-enter(r4)
            wp4$QnHx r5 = r0.w     // Catch: java.lang.Throwable -> L63
            java.lang.Object r10 = defpackage.ip4.c     // Catch: java.lang.Throwable -> L63
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L63
            cp4 r11 = defpackage.ip4.h()     // Catch: java.lang.Throwable -> L60
            xs4 r5 = defpackage.ip4.q(r5, r0, r11)     // Catch: java.lang.Throwable -> L60
            wp4$QnHx r5 = (wp4.QnHx) r5     // Catch: java.lang.Throwable -> L60
            int r12 = r5.d     // Catch: java.lang.Throwable -> L60
            if (r12 != r6) goto L57
            r5.c = r7     // Catch: java.lang.Throwable -> L60
            int r12 = r12 + 1
            r5.d = r12     // Catch: java.lang.Throwable -> L60
            r5 = 1
            goto L58
        L57:
            r5 = 0
        L58:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L63
            defpackage.ip4.k(r11, r0)     // Catch: java.lang.Throwable -> L63
            monitor-exit(r4)
            if (r5 == 0) goto Le
            goto L66
        L60:
            r14 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L63
            throw r14     // Catch: java.lang.Throwable -> L63
        L63:
            r14 = move-exception
            monitor-exit(r4)
            throw r14
        L66:
            int r14 = r0.size()
            int r3 = r3 - r14
            if (r3 <= 0) goto L7a
            wp4<T> r14 = r13.w
            int r14 = r14.c()
            r13.y = r14
            int r14 = r13.z
            int r14 = r14 - r3
            r13.z = r14
        L7a:
            if (r3 <= 0) goto L7d
            r8 = 1
        L7d:
            return r8
        L7e:
            r14 = move-exception
            monitor-exit(r4)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wv4.retainAll(java.util.Collection):boolean");
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        xp4.a(i, this.z);
        a();
        int i2 = i + this.x;
        wp4<T> wp4Var = this.w;
        T t2 = wp4Var.set(i2, t);
        this.y = wp4Var.c();
        return t2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.z;
    }

    @Override // java.util.List
    public final List<T> subList(int i, int i2) {
        if (!((i >= 0 && i <= i2) && i2 <= this.z)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        a();
        int i3 = this.x;
        return new wv4(this.w, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AY.Q(this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) AY.R(this, tArr);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i) {
        a();
        hl3 hl3Var = new hl3();
        hl3Var.w = i - 1;
        return new QnHx(hl3Var, this);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends T> collection) {
        a();
        int i2 = i + this.x;
        wp4<T> wp4Var = this.w;
        boolean zAddAll = wp4Var.addAll(i2, collection);
        if (zAddAll) {
            this.z = collection.size() + this.z;
            this.y = wp4Var.c();
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final T remove(int i) {
        a();
        int i2 = this.x + i;
        wp4<T> wp4Var = this.w;
        T tRemove = wp4Var.remove(i2);
        this.z--;
        this.y = wp4Var.c();
        return tRemove;
    }

    @Override // java.util.List
    public final void add(int i, T t) {
        a();
        int i2 = this.x + i;
        wp4<T> wp4Var = this.w;
        wp4Var.add(i2, t);
        this.z++;
        this.y = wp4Var.c();
    }
}
