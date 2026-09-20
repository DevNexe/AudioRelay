package defpackage;

import android.view.ViewGroup;
import androidx.compose.ui.platform.YKK;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class gz1 {
    public final yy1 a;
    public l40 b;
    public cw4 c;
    public int d;
    public int j;
    public int k;
    public final LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final CQf g = new CQf();
    public final LinkedHashMap h = new LinkedHashMap();
    public final cw4.QnHx i = new cw4.QnHx(0);
    public final String l = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing,, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    public final class CQf implements bw4 {
        public jy1 w = jy1.Rtl;
        public float x;
        public float y;

        public CQf() {
        }

        @Override // defpackage.bw4
        public final List<ob2> F(Object obj, x81<? super g30, ? super Integer, sd5> x81Var) {
            gz1 gz1Var = gz1.this;
            gz1Var.b();
            yy1 yy1Var = gz1Var.a;
            int i = yy1Var.E;
            if (!(i == 1 || i == 2)) {
                throw new IllegalStateException("subcompose can only be used inside the measure or layout blocks".toString());
            }
            LinkedHashMap linkedHashMap = gz1Var.f;
            Object objD = linkedHashMap.get(obj);
            if (objD == null) {
                objD = (yy1) gz1Var.h.remove(obj);
                if (objD != null) {
                    int i2 = gz1Var.k;
                    if (!(i2 > 0)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    gz1Var.k = i2 - 1;
                } else {
                    objD = gz1Var.d(obj);
                    if (objD == null) {
                        int i3 = gz1Var.d;
                        yy1 yy1Var2 = new yy1(true);
                        yy1Var.G = true;
                        yy1Var.z(i3, yy1Var2);
                        yy1Var.G = false;
                        objD = yy1Var2;
                    }
                }
                linkedHashMap.put(obj, objD);
            }
            yy1 yy1Var3 = (yy1) objD;
            int iIndexOf = ((ui2.QnHx) yy1Var.r()).indexOf(yy1Var3);
            int i4 = gz1Var.d;
            if (iIndexOf < i4) {
                throw new IllegalArgumentException("Key " + obj + " was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            if (i4 != iIndexOf) {
                yy1Var.G = true;
                yy1Var.I(iIndexOf, i4, 1);
                yy1Var.G = false;
            }
            gz1Var.d++;
            gz1Var.c(yy1Var3, obj, x81Var);
            return yy1Var3.q();
        }

        @Override // defpackage.vb2
        public final sb2 K(int i, int i2, Map map, j81 j81Var) {
            return new ub2(i, i2, this, map, j81Var);
        }

        @Override // defpackage.ij0
        public final float Q(float f) {
            return f / getDensity();
        }

        @Override // defpackage.ij0
        public final float U() {
            return this.y;
        }

        @Override // defpackage.ij0
        public final float b0(float f) {
            return getDensity() * f;
        }

        @Override // defpackage.ij0
        public final float getDensity() {
            return this.x;
        }

        @Override // defpackage.rr1
        public final jy1 getLayoutDirection() {
            return this.w;
        }

        @Override // defpackage.ij0
        public final float j(int i) {
            return i / getDensity();
        }

        @Override // defpackage.ij0
        public final /* synthetic */ int p0(float f) {
            return hj0.a(f, this);
        }

        @Override // defpackage.ij0
        public final /* synthetic */ long v(long j) {
            return hj0.c(j, this);
        }

        @Override // defpackage.ij0
        public final /* synthetic */ long v0(long j) {
            return hj0.e(j, this);
        }

        @Override // defpackage.ij0
        public final /* synthetic */ float x0(long j) {
            return hj0.d(j, this);
        }
    }

    public static final class QnHx {
        public Object a;
        public x81<? super g30, ? super Integer, sd5> b;
        public k40 c;
        public boolean d;
        public final kz2 e;

        public QnHx() {
            throw null;
        }

        public QnHx(Object obj, sz szVar) {
            this.a = obj;
            this.b = szVar;
            this.c = null;
            this.e = ps0.R(Boolean.TRUE);
        }
    }

    public gz1(yy1 yy1Var, cw4 cw4Var) {
        this.a = yy1Var;
        this.c = cw4Var;
    }

    public final void a(int i) {
        this.j = 0;
        yy1 yy1Var = this.a;
        int i2 = (((ui2.QnHx) yy1Var.r()).w.y - this.k) - 1;
        if (i <= i2) {
            cw4.QnHx qnHx = this.i;
            qnHx.clear();
            LinkedHashMap linkedHashMap = this.e;
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    qnHx.w.add(((QnHx) linkedHashMap.get((yy1) ((ui2.QnHx) yy1Var.r()).get(i3))).a);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.c.a(qnHx);
            while (i2 >= i) {
                yy1 yy1Var2 = (yy1) ((ui2.QnHx) yy1Var.r()).get(i2);
                QnHx qnHx2 = (QnHx) linkedHashMap.get(yy1Var2);
                Object obj = qnHx2.a;
                if (qnHx.contains(obj)) {
                    yy1Var2.U = 3;
                    this.j++;
                    qnHx2.e.setValue(Boolean.FALSE);
                } else {
                    yy1Var.G = true;
                    linkedHashMap.remove(yy1Var2);
                    k40 k40Var = qnHx2.c;
                    if (k40Var != null) {
                        k40Var.a();
                    }
                    yy1Var.M(i2, 1);
                    yy1Var.G = false;
                }
                this.f.remove(obj);
                i2--;
            }
        }
        b();
    }

    public final void b() {
        LinkedHashMap linkedHashMap = this.e;
        int size = linkedHashMap.size();
        yy1 yy1Var = this.a;
        if (!(size == ((ui2.QnHx) yy1Var.r()).w.y)) {
            StringBuilder sb = new StringBuilder("Inconsistency between the count of nodes tracked by the state (");
            sb.append(linkedHashMap.size());
            sb.append(") and the children count on the SubcomposeLayout (");
            throw new IllegalArgumentException(ex0.c(sb, ((ui2.QnHx) yy1Var.r()).w.y, "). Are you trying to use the state of the disposed SubcomposeLayout?").toString());
        }
        if (!((((ui2.QnHx) yy1Var.r()).w.y - this.j) - this.k >= 0)) {
            throw new IllegalArgumentException(("Incorrect state. Total children " + ((ui2.QnHx) yy1Var.r()).w.y + ". Reusable children " + this.j + ". Precomposed children " + this.k).toString());
        }
        LinkedHashMap linkedHashMap2 = this.h;
        if (linkedHashMap2.size() == this.k) {
            return;
        }
        throw new IllegalArgumentException(("Incorrect state. Precomposed children " + this.k + ". Map size " + linkedHashMap2.size()).toString());
    }

    public final void c(yy1 yy1Var, Object obj, x81<? super g30, ? super Integer, sd5> x81Var) {
        LinkedHashMap linkedHashMap = this.e;
        Object qnHx = linkedHashMap.get(yy1Var);
        if (qnHx == null) {
            qnHx = new QnHx(obj, k20.a);
            linkedHashMap.put(yy1Var, qnHx);
        }
        QnHx qnHx2 = (QnHx) qnHx;
        k40 k40Var = qnHx2.c;
        boolean zO = k40Var != null ? k40Var.o() : true;
        if (qnHx2.b != x81Var || zO || qnHx2.d) {
            qnHx2.b = x81Var;
            cp4 cp4VarF = ip4.f((cp4) ip4.b.h(), null, false);
            try {
                cp4 cp4VarI = cp4VarF.i();
                try {
                    yy1 yy1Var2 = this.a;
                    yy1Var2.G = true;
                    x81<? super g30, ? super Integer, sd5> x81Var2 = qnHx2.b;
                    k40 n40Var = qnHx2.c;
                    l40 l40Var = this.b;
                    if (l40Var == null) {
                        throw new IllegalStateException("parent composition reference not set".toString());
                    }
                    sz szVarN = X.n(-34810602, new jz1(qnHx2, x81Var2), true);
                    if (n40Var == null || n40Var.e()) {
                        ViewGroup.LayoutParams layoutParams = YKK.a;
                        id5 id5Var = new id5(yy1Var);
                        Object obj2 = o40.a;
                        n40Var = new n40(l40Var, id5Var);
                    }
                    n40Var.p(szVarN);
                    qnHx2.c = n40Var;
                    yy1Var2.G = false;
                    sd5 sd5Var = sd5.a;
                    cp4.o(cp4VarI);
                    cp4VarF.c();
                    qnHx2.d = false;
                } catch (Throwable th) {
                    cp4.o(cp4VarI);
                    throw th;
                }
            } catch (Throwable th2) {
                cp4VarF.c();
                throw th2;
            }
        }
    }

    public final yy1 d(Object obj) {
        int i;
        boolean z;
        yy1 yy1Var = null;
        if (this.j == 0) {
            return null;
        }
        int i2 = ((ui2.QnHx) this.a.r()).w.y - this.k;
        int i3 = i2 - this.j;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            if (i5 < i3) {
                i = -1;
                break;
            }
            if (ur1.a(((QnHx) this.e.get((yy1) ((ui2.QnHx) this.a.r()).get(i5))).a, obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (true) {
                if (i4 < i3) {
                    i5 = i4;
                    break;
                }
                QnHx qnHx = (QnHx) this.e.get((yy1) ((ui2.QnHx) this.a.r()).get(i4));
                if (this.c.b(obj, qnHx.a)) {
                    qnHx.a = obj;
                    i5 = i4;
                    i = i5;
                    break;
                }
                i4--;
            }
        }
        if (i != -1) {
            if (i5 != i3) {
                yy1 yy1Var2 = this.a;
                yy1Var2.G = true;
                yy1Var2.I(i5, i3, 1);
                yy1Var2.G = false;
            }
            this.j--;
            yy1Var = (yy1) ((ui2.QnHx) this.a.r()).get(i3);
            ((QnHx) this.e.get(yy1Var)).e.setValue(Boolean.TRUE);
            synchronized (ip4.c) {
                Set<ws4> set = ip4.i.get().g;
                z = set != null && (set.isEmpty() ^ true);
            }
            if (z) {
                ip4.a();
            }
        }
        return yy1Var;
    }
}
