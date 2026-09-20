package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class wp4<T> implements List<T>, ws4, lv1 {
    public QnHx w = new QnHx(on4.x);

    public static final class CQf extends cx1 implements j81<List<T>, Boolean> {
        public final /* synthetic */ int w;
        public final /* synthetic */ Collection<T> x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(int i, Collection<? extends T> collection) {
            super(1);
            this.w = i;
            this.x = collection;
        }

        @Override // defpackage.j81
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(((List) obj).addAll(this.w, this.x));
        }
    }

    public static final class F1 extends cx1 implements j81<List<T>, Boolean> {
        public final /* synthetic */ Collection<T> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public F1(Collection<? extends T> collection) {
            super(1);
            this.w = collection;
        }

        @Override // defpackage.j81
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(((List) obj).retainAll(this.w));
        }
    }

    public static final class QnHx<T> extends xs4 {
        public o13<? extends T> c;
        public int d;

        public QnHx(o13<? extends T> o13Var) {
            this.c = o13Var;
        }

        @Override // defpackage.xs4
        public final void a(xs4 xs4Var) {
            synchronized (xp4.a) {
                this.c = ((QnHx) xs4Var).c;
                this.d = ((QnHx) xs4Var).d;
                sd5 sd5Var = sd5.a;
            }
        }

        @Override // defpackage.xs4
        public final xs4 b() {
            return new QnHx(this.c);
        }
    }

    @Override // defpackage.ws4
    public final xs4 a() {
        return this.w;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x004a */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean add(T r10) {
        /*
            r9 = this;
        L0:
            java.lang.Object r0 = defpackage.xp4.a
            monitor-enter(r0)
            wp4$QnHx r1 = r9.w     // Catch: java.lang.Throwable -> L4d
            cp4 r2 = defpackage.ip4.h()     // Catch: java.lang.Throwable -> L4d
            xs4 r1 = defpackage.ip4.g(r1, r2)     // Catch: java.lang.Throwable -> L4d
            wp4$QnHx r1 = (wp4.QnHx) r1     // Catch: java.lang.Throwable -> L4d
            int r2 = r1.d     // Catch: java.lang.Throwable -> L4d
            o13<? extends T> r1 = r1.c     // Catch: java.lang.Throwable -> L4d
            sd5 r3 = defpackage.sd5.a     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r0)
            o13 r3 = r1.add(r10)
            boolean r1 = defpackage.ur1.a(r3, r1)
            r4 = 0
            if (r1 == 0) goto L22
            goto L46
        L22:
            monitor-enter(r0)
            wp4$QnHx r1 = r9.w     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r5 = defpackage.ip4.c     // Catch: java.lang.Throwable -> L4a
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L4a
            cp4 r6 = defpackage.ip4.h()     // Catch: java.lang.Throwable -> L47
            xs4 r1 = defpackage.ip4.q(r1, r9, r6)     // Catch: java.lang.Throwable -> L47
            wp4$QnHx r1 = (wp4.QnHx) r1     // Catch: java.lang.Throwable -> L47
            int r7 = r1.d     // Catch: java.lang.Throwable -> L47
            r8 = 1
            if (r7 != r2) goto L3e
            r1.c = r3     // Catch: java.lang.Throwable -> L47
            int r7 = r7 + 1
            r1.d = r7     // Catch: java.lang.Throwable -> L47
            r4 = 1
        L3e:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4a
            defpackage.ip4.k(r6, r9)     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r0)
            if (r4 == 0) goto L0
            r4 = 1
        L46:
            return r4
        L47:
            r10 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4a
            throw r10     // Catch: java.lang.Throwable -> L4a
        L4a:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        L4d:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wp4.add(java.lang.Object):boolean");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends T> collection) {
        return g(new CQf(i, collection));
    }

    @Override // defpackage.ws4
    public final /* synthetic */ xs4 b(xs4 xs4Var, xs4 xs4Var2, xs4 xs4Var3) {
        return null;
    }

    public final int c() {
        return ((QnHx) ip4.g(this.w, ip4.h())).d;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        cp4 cp4VarH;
        synchronized (xp4.a) {
            QnHx qnHx = this.w;
            synchronized (ip4.c) {
                cp4VarH = ip4.h();
                QnHx qnHx2 = (QnHx) ip4.q(qnHx, this, cp4VarH);
                qnHx2.c = on4.x;
                qnHx2.d++;
            }
            ip4.k(cp4VarH, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return e().c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        return e().c.containsAll(collection);
    }

    public final QnHx<T> e() {
        return (QnHx) ip4.n(this.w, this, ip4.h());
    }

    @Override // defpackage.ws4
    public final void f(xs4 xs4Var) {
        xs4Var.b = this.w;
        this.w = (QnHx) xs4Var;
    }

    public final boolean g(j81<? super List<T>, Boolean> j81Var) {
        int i;
        o13<? extends T> o13Var;
        Boolean boolInvoke;
        cp4 cp4VarH;
        boolean z;
        do {
            Object obj = xp4.a;
            synchronized (obj) {
                QnHx qnHx = (QnHx) ip4.g(this.w, ip4.h());
                i = qnHx.d;
                o13Var = qnHx.c;
                sd5 sd5Var = sd5.a;
            }
            u13 u13VarBuilder = o13Var.builder();
            boolInvoke = j81Var.invoke(u13VarBuilder);
            o13<? extends T> o13VarC = u13VarBuilder.c();
            if (ur1.a(o13VarC, o13Var)) {
                break;
            }
            synchronized (obj) {
                QnHx qnHx2 = this.w;
                synchronized (ip4.c) {
                    cp4VarH = ip4.h();
                    QnHx qnHx3 = (QnHx) ip4.q(qnHx2, this, cp4VarH);
                    int i2 = qnHx3.d;
                    if (i2 == i) {
                        qnHx3.c = o13VarC;
                        qnHx3.d = i2 + 1;
                        z = true;
                    } else {
                        z = false;
                    }
                }
                ip4.k(cp4VarH, this);
            }
        } while (!z);
        return boolInvoke.booleanValue();
    }

    @Override // java.util.List
    public final T get(int i) {
        return e().c.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return e().c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return e().c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return e().c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return new ps4(this, 0);
    }

    @Override // java.util.List
    public final T remove(int i) {
        int i2;
        o13<? extends T> o13Var;
        cp4 cp4VarH;
        boolean z;
        T t = get(i);
        do {
            Object obj = xp4.a;
            synchronized (obj) {
                QnHx qnHx = (QnHx) ip4.g(this.w, ip4.h());
                i2 = qnHx.d;
                o13Var = qnHx.c;
                sd5 sd5Var = sd5.a;
            }
            o13<? extends T> o13VarK = o13Var.k(i);
            if (ur1.a(o13VarK, o13Var)) {
                break;
            }
            synchronized (obj) {
                QnHx qnHx2 = this.w;
                synchronized (ip4.c) {
                    cp4VarH = ip4.h();
                    QnHx qnHx3 = (QnHx) ip4.q(qnHx2, this, cp4VarH);
                    int i3 = qnHx3.d;
                    if (i3 == i2) {
                        qnHx3.c = o13VarK;
                        qnHx3.d = i3 + 1;
                        z = true;
                    } else {
                        z = false;
                    }
                }
                ip4.k(cp4VarH, this);
            }
        } while (!z);
        return t;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x004a */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean removeAll(java.util.Collection<? extends java.lang.Object> r10) {
        /*
            r9 = this;
        L0:
            java.lang.Object r0 = defpackage.xp4.a
            monitor-enter(r0)
            wp4$QnHx r1 = r9.w     // Catch: java.lang.Throwable -> L4d
            cp4 r2 = defpackage.ip4.h()     // Catch: java.lang.Throwable -> L4d
            xs4 r1 = defpackage.ip4.g(r1, r2)     // Catch: java.lang.Throwable -> L4d
            wp4$QnHx r1 = (wp4.QnHx) r1     // Catch: java.lang.Throwable -> L4d
            int r2 = r1.d     // Catch: java.lang.Throwable -> L4d
            o13<? extends T> r1 = r1.c     // Catch: java.lang.Throwable -> L4d
            sd5 r3 = defpackage.sd5.a     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r0)
            o13 r3 = r1.removeAll(r10)
            boolean r1 = defpackage.ur1.a(r3, r1)
            r4 = 0
            if (r1 == 0) goto L22
            goto L46
        L22:
            monitor-enter(r0)
            wp4$QnHx r1 = r9.w     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r5 = defpackage.ip4.c     // Catch: java.lang.Throwable -> L4a
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L4a
            cp4 r6 = defpackage.ip4.h()     // Catch: java.lang.Throwable -> L47
            xs4 r1 = defpackage.ip4.q(r1, r9, r6)     // Catch: java.lang.Throwable -> L47
            wp4$QnHx r1 = (wp4.QnHx) r1     // Catch: java.lang.Throwable -> L47
            int r7 = r1.d     // Catch: java.lang.Throwable -> L47
            r8 = 1
            if (r7 != r2) goto L3e
            r1.c = r3     // Catch: java.lang.Throwable -> L47
            int r7 = r7 + 1
            r1.d = r7     // Catch: java.lang.Throwable -> L47
            r4 = 1
        L3e:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4a
            defpackage.ip4.k(r6, r9)     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r0)
            if (r4 == 0) goto L0
            r4 = 1
        L46:
            return r4
        L47:
            r10 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4a
            throw r10     // Catch: java.lang.Throwable -> L4a
        L4a:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        L4d:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wp4.removeAll(java.util.Collection):boolean");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        return g(new F1(collection));
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        int i2;
        o13<? extends T> o13Var;
        cp4 cp4VarH;
        boolean z;
        T t2 = get(i);
        do {
            Object obj = xp4.a;
            synchronized (obj) {
                QnHx qnHx = (QnHx) ip4.g(this.w, ip4.h());
                i2 = qnHx.d;
                o13Var = qnHx.c;
                sd5 sd5Var = sd5.a;
            }
            o13<? extends T> o13Var2 = o13Var.set(i, t);
            if (ur1.a(o13Var2, o13Var)) {
                break;
            }
            synchronized (obj) {
                QnHx qnHx2 = this.w;
                synchronized (ip4.c) {
                    cp4VarH = ip4.h();
                    QnHx qnHx3 = (QnHx) ip4.q(qnHx2, this, cp4VarH);
                    int i3 = qnHx3.d;
                    if (i3 == i2) {
                        qnHx3.c = o13Var2;
                        qnHx3.d = i3 + 1;
                        z = true;
                    } else {
                        z = false;
                    }
                }
                ip4.k(cp4VarH, this);
            }
        } while (!z);
        return t2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return e().c.size();
    }

    @Override // java.util.List
    public final List<T> subList(int i, int i2) {
        if ((i >= 0 && i <= i2) && i2 <= size()) {
            return new wv4(this, i, i2);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AY.Q(this);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) AY.R(this, tArr);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x004a */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean addAll(java.util.Collection<? extends T> r10) {
        /*
            r9 = this;
        L0:
            java.lang.Object r0 = defpackage.xp4.a
            monitor-enter(r0)
            wp4$QnHx r1 = r9.w     // Catch: java.lang.Throwable -> L4d
            cp4 r2 = defpackage.ip4.h()     // Catch: java.lang.Throwable -> L4d
            xs4 r1 = defpackage.ip4.g(r1, r2)     // Catch: java.lang.Throwable -> L4d
            wp4$QnHx r1 = (wp4.QnHx) r1     // Catch: java.lang.Throwable -> L4d
            int r2 = r1.d     // Catch: java.lang.Throwable -> L4d
            o13<? extends T> r1 = r1.c     // Catch: java.lang.Throwable -> L4d
            sd5 r3 = defpackage.sd5.a     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r0)
            o13 r3 = r1.addAll(r10)
            boolean r1 = defpackage.ur1.a(r3, r1)
            r4 = 0
            if (r1 == 0) goto L22
            goto L46
        L22:
            monitor-enter(r0)
            wp4$QnHx r1 = r9.w     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r5 = defpackage.ip4.c     // Catch: java.lang.Throwable -> L4a
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L4a
            cp4 r6 = defpackage.ip4.h()     // Catch: java.lang.Throwable -> L47
            xs4 r1 = defpackage.ip4.q(r1, r9, r6)     // Catch: java.lang.Throwable -> L47
            wp4$QnHx r1 = (wp4.QnHx) r1     // Catch: java.lang.Throwable -> L47
            int r7 = r1.d     // Catch: java.lang.Throwable -> L47
            r8 = 1
            if (r7 != r2) goto L3e
            r1.c = r3     // Catch: java.lang.Throwable -> L47
            int r7 = r7 + 1
            r1.d = r7     // Catch: java.lang.Throwable -> L47
            r4 = 1
        L3e:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4a
            defpackage.ip4.k(r6, r9)     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r0)
            if (r4 == 0) goto L0
            r4 = 1
        L46:
            return r4
        L47:
            r10 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4a
            throw r10     // Catch: java.lang.Throwable -> L4a
        L4a:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        L4d:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wp4.addAll(java.util.Collection):boolean");
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new ps4(this, i);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0049 */
    @Override // java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void add(int r8, T r9) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = defpackage.xp4.a
            monitor-enter(r0)
            wp4$QnHx r1 = r7.w     // Catch: java.lang.Throwable -> L4c
            cp4 r2 = defpackage.ip4.h()     // Catch: java.lang.Throwable -> L4c
            xs4 r1 = defpackage.ip4.g(r1, r2)     // Catch: java.lang.Throwable -> L4c
            wp4$QnHx r1 = (wp4.QnHx) r1     // Catch: java.lang.Throwable -> L4c
            int r2 = r1.d     // Catch: java.lang.Throwable -> L4c
            o13<? extends T> r1 = r1.c     // Catch: java.lang.Throwable -> L4c
            sd5 r3 = defpackage.sd5.a     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r0)
            o13 r3 = r1.add(r8, r9)
            boolean r1 = defpackage.ur1.a(r3, r1)
            if (r1 == 0) goto L21
            goto L45
        L21:
            monitor-enter(r0)
            wp4$QnHx r1 = r7.w     // Catch: java.lang.Throwable -> L49
            java.lang.Object r4 = defpackage.ip4.c     // Catch: java.lang.Throwable -> L49
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L49
            cp4 r5 = defpackage.ip4.h()     // Catch: java.lang.Throwable -> L46
            xs4 r1 = defpackage.ip4.q(r1, r7, r5)     // Catch: java.lang.Throwable -> L46
            wp4$QnHx r1 = (wp4.QnHx) r1     // Catch: java.lang.Throwable -> L46
            int r6 = r1.d     // Catch: java.lang.Throwable -> L46
            if (r6 != r2) goto L3d
            r1.c = r3     // Catch: java.lang.Throwable -> L46
            int r6 = r6 + 1
            r1.d = r6     // Catch: java.lang.Throwable -> L46
            r1 = 1
            goto L3e
        L3d:
            r1 = 0
        L3e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L49
            defpackage.ip4.k(r5, r7)     // Catch: java.lang.Throwable -> L49
            monitor-exit(r0)
            if (r1 == 0) goto L0
        L45:
            return
        L46:
            r8 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L49
            throw r8     // Catch: java.lang.Throwable -> L49
        L49:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        L4c:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wp4.add(int, java.lang.Object):void");
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x004a */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean remove(java.lang.Object r10) {
        /*
            r9 = this;
        L0:
            java.lang.Object r0 = defpackage.xp4.a
            monitor-enter(r0)
            wp4$QnHx r1 = r9.w     // Catch: java.lang.Throwable -> L4d
            cp4 r2 = defpackage.ip4.h()     // Catch: java.lang.Throwable -> L4d
            xs4 r1 = defpackage.ip4.g(r1, r2)     // Catch: java.lang.Throwable -> L4d
            wp4$QnHx r1 = (wp4.QnHx) r1     // Catch: java.lang.Throwable -> L4d
            int r2 = r1.d     // Catch: java.lang.Throwable -> L4d
            o13<? extends T> r1 = r1.c     // Catch: java.lang.Throwable -> L4d
            sd5 r3 = defpackage.sd5.a     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r0)
            o13 r3 = r1.remove(r10)
            boolean r1 = defpackage.ur1.a(r3, r1)
            r4 = 0
            if (r1 == 0) goto L22
            goto L46
        L22:
            monitor-enter(r0)
            wp4$QnHx r1 = r9.w     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r5 = defpackage.ip4.c     // Catch: java.lang.Throwable -> L4a
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L4a
            cp4 r6 = defpackage.ip4.h()     // Catch: java.lang.Throwable -> L47
            xs4 r1 = defpackage.ip4.q(r1, r9, r6)     // Catch: java.lang.Throwable -> L47
            wp4$QnHx r1 = (wp4.QnHx) r1     // Catch: java.lang.Throwable -> L47
            int r7 = r1.d     // Catch: java.lang.Throwable -> L47
            r8 = 1
            if (r7 != r2) goto L3e
            r1.c = r3     // Catch: java.lang.Throwable -> L47
            int r7 = r7 + 1
            r1.d = r7     // Catch: java.lang.Throwable -> L47
            r4 = 1
        L3e:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4a
            defpackage.ip4.k(r6, r9)     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r0)
            if (r4 == 0) goto L0
            r4 = 1
        L46:
            return r4
        L47:
            r10 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4a
            throw r10     // Catch: java.lang.Throwable -> L4a
        L4a:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        L4d:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wp4.remove(java.lang.Object):boolean");
    }
}
