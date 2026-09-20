package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class yp4<K, V> implements Map<K, V>, ws4, mv1 {
    public QnHx w = new QnHx(y03.y);
    public final lp4 x = new lp4(this);
    public final mp4 y = new mp4(this);
    public final op4 z = new op4(this);

    public static final class QnHx<K, V> extends xs4 {
        public p13<K, ? extends V> c;
        public int d;

        public QnHx(p13<K, ? extends V> p13Var) {
            this.c = p13Var;
        }

        @Override // defpackage.xs4
        public final void a(xs4 xs4Var) {
            QnHx qnHx = (QnHx) xs4Var;
            synchronized (zp4.a) {
                this.c = qnHx.c;
                this.d = qnHx.d;
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

    @Override // defpackage.ws4
    public final /* synthetic */ xs4 b(xs4 xs4Var, xs4 xs4Var2, xs4 xs4Var3) {
        return null;
    }

    public final QnHx<K, V> c() {
        return (QnHx) ip4.n(this.w, this, ip4.h());
    }

    @Override // java.util.Map
    public final void clear() {
        cp4 cp4VarH;
        QnHx qnHx = (QnHx) ip4.g(this.w, ip4.h());
        y03 y03Var = y03.y;
        if (y03Var != qnHx.c) {
            synchronized (zp4.a) {
                QnHx qnHx2 = this.w;
                synchronized (ip4.c) {
                    cp4VarH = ip4.h();
                    QnHx qnHx3 = (QnHx) ip4.q(qnHx2, this, cp4VarH);
                    qnHx3.c = y03Var;
                    qnHx3.d++;
                }
                ip4.k(cp4VarH, this);
            }
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return c().c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return c().c.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return this.x;
    }

    @Override // defpackage.ws4
    public final void f(xs4 xs4Var) {
        this.w = (QnHx) xs4Var;
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        return c().c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return c().c.isEmpty();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return this.y;
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        p13<K, ? extends V> p13Var;
        int i;
        V v2;
        cp4 cp4VarH;
        boolean z;
        do {
            Object obj = zp4.a;
            synchronized (obj) {
                QnHx qnHx = (QnHx) ip4.g(this.w, ip4.h());
                p13Var = qnHx.c;
                i = qnHx.d;
                sd5 sd5Var = sd5.a;
            }
            a13 a13VarBuilder = p13Var.builder();
            v2 = (V) a13VarBuilder.put(k, v);
            y03<K, V> y03VarA = a13VarBuilder.a();
            if (ur1.a(y03VarA, p13Var)) {
                break;
            }
            synchronized (obj) {
                QnHx qnHx2 = this.w;
                synchronized (ip4.c) {
                    cp4VarH = ip4.h();
                    QnHx qnHx3 = (QnHx) ip4.q(qnHx2, this, cp4VarH);
                    int i2 = qnHx3.d;
                    if (i2 == i) {
                        qnHx3.c = y03VarA;
                        qnHx3.d = i2 + 1;
                        z = true;
                    } else {
                        z = false;
                    }
                }
                ip4.k(cp4VarH, this);
            }
        } while (!z);
        return v2;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x004f */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void putAll(java.util.Map<? extends K, ? extends V> r8) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = defpackage.zp4.a
            monitor-enter(r0)
            yp4$QnHx r1 = r7.w     // Catch: java.lang.Throwable -> L53
            cp4 r2 = defpackage.ip4.h()     // Catch: java.lang.Throwable -> L53
            xs4 r1 = defpackage.ip4.g(r1, r2)     // Catch: java.lang.Throwable -> L53
            yp4$QnHx r1 = (yp4.QnHx) r1     // Catch: java.lang.Throwable -> L53
            p13<K, ? extends V> r2 = r1.c     // Catch: java.lang.Throwable -> L53
            int r1 = r1.d     // Catch: java.lang.Throwable -> L53
            sd5 r3 = defpackage.sd5.a     // Catch: java.lang.Throwable -> L53
            monitor-exit(r0)
            a13 r3 = r2.builder()
            r3.putAll(r8)
            y03 r3 = r3.a()
            boolean r2 = defpackage.ur1.a(r3, r2)
            if (r2 != 0) goto L52
            monitor-enter(r0)
            yp4$QnHx r2 = r7.w     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r4 = defpackage.ip4.c     // Catch: java.lang.Throwable -> L4f
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L4f
            cp4 r5 = defpackage.ip4.h()     // Catch: java.lang.Throwable -> L4c
            xs4 r2 = defpackage.ip4.q(r2, r7, r5)     // Catch: java.lang.Throwable -> L4c
            yp4$QnHx r2 = (yp4.QnHx) r2     // Catch: java.lang.Throwable -> L4c
            int r6 = r2.d     // Catch: java.lang.Throwable -> L4c
            if (r6 != r1) goto L43
            r2.c = r3     // Catch: java.lang.Throwable -> L4c
            int r6 = r6 + 1
            r2.d = r6     // Catch: java.lang.Throwable -> L4c
            r1 = 1
            goto L44
        L43:
            r1 = 0
        L44:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4f
            defpackage.ip4.k(r5, r7)     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r0)
            if (r1 == 0) goto L0
            goto L52
        L4c:
            r8 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4f
            throw r8     // Catch: java.lang.Throwable -> L4f
        L4f:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        L52:
            return
        L53:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yp4.putAll(java.util.Map):void");
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        p13<K, ? extends V> p13Var;
        int i;
        V v;
        cp4 cp4VarH;
        boolean z;
        do {
            Object obj2 = zp4.a;
            synchronized (obj2) {
                QnHx qnHx = (QnHx) ip4.g(this.w, ip4.h());
                p13Var = qnHx.c;
                i = qnHx.d;
                sd5 sd5Var = sd5.a;
            }
            a13 a13VarBuilder = p13Var.builder();
            v = (V) a13VarBuilder.remove(obj);
            y03<K, V> y03VarA = a13VarBuilder.a();
            if (ur1.a(y03VarA, p13Var)) {
                break;
            }
            synchronized (obj2) {
                QnHx qnHx2 = this.w;
                synchronized (ip4.c) {
                    cp4VarH = ip4.h();
                    QnHx qnHx3 = (QnHx) ip4.q(qnHx2, this, cp4VarH);
                    int i2 = qnHx3.d;
                    if (i2 == i) {
                        qnHx3.c = y03VarA;
                        qnHx3.d = i2 + 1;
                        z = true;
                    } else {
                        z = false;
                    }
                }
                ip4.k(cp4VarH, this);
            }
        } while (!z);
        return v;
    }

    @Override // java.util.Map
    public final int size() {
        return c().c.size();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return this.z;
    }
}
