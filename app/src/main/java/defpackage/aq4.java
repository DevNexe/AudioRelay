package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class aq4 {
    public final j81<h81<sd5>, sd5> a;
    public final CQf b = new CQf();
    public final F1 c = new F1();
    public final ui2<QnHx<?>> d = new ui2<>(new QnHx[16]);
    public bp4 e;
    public boolean f;
    public QnHx<?> g;

    public static final class CQf extends cx1 implements x81<Set<? extends Object>, cp4, sd5> {
        public CQf() {
            super(2);
        }

        @Override // defpackage.x81
        public final sd5 invoke(Set<? extends Object> set, cp4 cp4Var) {
            int i;
            Set<? extends Object> set2 = set;
            aq4 aq4Var = aq4.this;
            synchronized (aq4Var.d) {
                ui2<QnHx<?>> ui2Var = aq4Var.d;
                int i2 = ui2Var.y;
                i = 0;
                if (i2 > 0) {
                    QnHx<?>[] qnHxArr = ui2Var.w;
                    int i3 = 0;
                    do {
                        QnHx<?> qnHx = qnHxArr[i];
                        HashSet<Object> hashSet = qnHx.c;
                        xh1<?> xh1Var = qnHx.b;
                        Iterator<? extends Object> it = set2.iterator();
                        while (it.hasNext()) {
                            int iB = xh1Var.b(it.next());
                            if (iB >= 0) {
                                Iterator<?> it2 = xh1Var.e(iB).iterator();
                                while (true) {
                                    wh1.QnHx qnHx2 = (wh1.QnHx) it2;
                                    if (qnHx2.hasNext()) {
                                        hashSet.add(qnHx2.next());
                                        i3 = 1;
                                    }
                                }
                            }
                        }
                        i++;
                    } while (i < i2);
                    i = i3;
                }
                sd5 sd5Var = sd5.a;
            }
            if (i != 0) {
                aq4 aq4Var2 = aq4.this;
                aq4Var2.a.invoke(new bq4(aq4Var2));
            }
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements j81<Object, sd5> {
        public F1() {
            super(1);
        }

        @Override // defpackage.j81
        public final sd5 invoke(Object obj) {
            aq4 aq4Var = aq4.this;
            if (!aq4Var.f) {
                synchronized (aq4Var.d) {
                    QnHx<?> qnHx = aq4Var.g;
                    qnHx.b.a(obj, qnHx.d);
                    sd5 sd5Var = sd5.a;
                }
            }
            return sd5.a;
        }
    }

    public static final class QnHx<T> {
        public final j81<T, sd5> a;
        public final xh1<T> b = new xh1<>();
        public final HashSet<Object> c = new HashSet<>();
        public T d;

        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(j81<? super T, sd5> j81Var) {
            this.a = j81Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public aq4(j81<? super h81<sd5>, sd5> j81Var) {
        this.a = j81Var;
    }

    public final void a() {
        synchronized (this.d) {
            ui2<QnHx<?>> ui2Var = this.d;
            int i = ui2Var.y;
            if (i > 0) {
                QnHx<?>[] qnHxArr = ui2Var.w;
                int i2 = 0;
                do {
                    xh1<?> xh1Var = qnHxArr[i2].b;
                    int length = xh1Var.c.length;
                    for (int i3 = 0; i3 < length; i3++) {
                        wh1<?> wh1Var = xh1Var.c[i3];
                        if (wh1Var != null) {
                            wh1Var.clear();
                        }
                        xh1Var.a[i3] = i3;
                        xh1Var.b[i3] = null;
                    }
                    xh1Var.d = 0;
                    i2++;
                } while (i2 < i);
            }
            sd5 sd5Var = sd5.a;
        }
    }

    public final <T> void b(T t, j81<? super T, sd5> j81Var, h81<sd5> h81Var) {
        int i;
        QnHx<?> qnHx;
        QnHx<?> qnHx2 = this.g;
        boolean z = this.f;
        synchronized (this.d) {
            ui2<QnHx<?>> ui2Var = this.d;
            int i2 = ui2Var.y;
            if (i2 <= 0) {
                i = -1;
                break;
            }
            QnHx<?>[] qnHxArr = ui2Var.w;
            i = 0;
            while (true) {
                if (qnHxArr[i].a == j81Var) {
                    break;
                }
                i++;
                if (i >= i2) {
                    i = -1;
                    break;
                }
            }
            if (i == -1) {
                qnHx = new QnHx<>(j81Var);
                ui2Var.b(qnHx);
            } else {
                qnHx = ui2Var.w[i];
            }
            qnHx.b.d(t);
        }
        T t2 = qnHx.d;
        qnHx.d = t;
        this.g = qnHx;
        this.f = false;
        cp4.QnHx.a(this.c, h81Var);
        this.g = qnHx2;
        qnHx.d = t2;
        this.f = z;
    }

    public final void c() {
        CQf cQf = this.b;
        ip4.e(ip4.a);
        synchronized (ip4.c) {
            ip4.g.add(cQf);
        }
        this.e = new bp4(cQf);
    }
}
