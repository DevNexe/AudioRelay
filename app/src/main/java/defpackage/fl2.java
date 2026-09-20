package defpackage;

import j$.util.function.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class fl2 extends dl2 implements Iterable<dl2>, jv1 {
    public static final /* synthetic */ int J = 0;
    public final wq4<dl2> F;
    public int G;
    public String H;
    public String I;

    public static final class QnHx implements Iterator<dl2>, jv1, j$.util.Iterator {
        public int w = -1;
        public boolean x;

        public QnHx() {
        }

        @Override // j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            j$.util.Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super dl2> consumer) {
            j$.util.Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            return this.w + 1 < fl2.this.F.k();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.x = true;
            wq4<dl2> wq4Var = fl2.this.F;
            int i = this.w + 1;
            this.w = i;
            return wq4Var.l(i);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            if (!this.x) {
                throw new IllegalStateException("You must call next() before you can remove an element".toString());
            }
            wq4<dl2> wq4Var = fl2.this.F;
            wq4Var.l(this.w).x = null;
            int i = this.w;
            Object[] objArr = wq4Var.y;
            Object obj = objArr[i];
            Object obj2 = wq4.A;
            if (obj != obj2) {
                objArr[i] = obj2;
                wq4Var.w = true;
            }
            this.w = i - 1;
            this.x = false;
        }
    }

    public fl2(zl2<? extends fl2> zl2Var) {
        super(zl2Var);
        this.F = new wq4<>();
    }

    @Override // defpackage.dl2
    public final dl2.CQf e(al2 al2Var) {
        dl2.CQf cQfE = super.e(al2Var);
        ArrayList arrayList = new ArrayList();
        QnHx qnHx = new QnHx();
        while (qnHx.hasNext()) {
            dl2.CQf cQfE2 = ((dl2) qnHx.next()).e(al2Var);
            if (cQfE2 != null) {
                arrayList.add(cQfE2);
            }
        }
        return (dl2.CQf) wu.P0(oV9.e0(new dl2.CQf[]{cQfE, (dl2.CQf) wu.P0(arrayList)}));
    }

    @Override // defpackage.dl2
    public final boolean equals(Object obj) {
        wq4<dl2> wq4Var;
        if (obj == null || !(obj instanceof fl2)) {
            return false;
        }
        wq4<dl2> wq4Var2 = this.F;
        List listM0 = na4.M0(ba4.F0(new xq4(wq4Var2)));
        fl2 fl2Var = (fl2) obj;
        int i = 0;
        while (true) {
            wq4Var = fl2Var.F;
            if (!(i < wq4Var.k())) {
                break;
            }
            listM0.remove(wq4Var.l(i));
            i++;
        }
        return super.equals(obj) && wq4Var2.k() == wq4Var.k() && this.G == fl2Var.G && listM0.isEmpty();
    }

    public final dl2 g(int i, boolean z) {
        fl2 fl2Var;
        dl2 dl2Var = (dl2) this.F.i(i, null);
        if (dl2Var != null) {
            return dl2Var;
        }
        if (!z || (fl2Var = this.x) == null) {
            return null;
        }
        return fl2Var.g(i, true);
    }

    public final dl2 h(String str, boolean z) {
        fl2 fl2Var;
        dl2 dl2Var = (dl2) this.F.i("android-app://androidx.navigation/".concat(str).hashCode(), null);
        if (dl2Var != null) {
            return dl2Var;
        }
        if (!z || (fl2Var = this.x) == null) {
            return null;
        }
        if (str == null || iv4.s(str)) {
            return null;
        }
        return fl2Var.h(str, true);
    }

    @Override // defpackage.dl2
    public final int hashCode() {
        int iA = this.G;
        wq4<dl2> wq4Var = this.F;
        int iK = wq4Var.k();
        for (int i = 0; i < iK; i++) {
            if (wq4Var.w) {
                wq4Var.h();
            }
            iA = Xs.a(iA, 31, wq4Var.x[i], 31) + wq4Var.l(i).hashCode();
        }
        return iA;
    }

    @Override // java.lang.Iterable
    public final Iterator<dl2> iterator() {
        return new QnHx();
    }

    @Override // defpackage.dl2
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        String str = this.I;
        dl2 dl2VarH = !(str == null || iv4.s(str)) ? h(str, true) : null;
        if (dl2VarH == null) {
            dl2VarH = g(this.G, true);
        }
        sb.append(" startDestination=");
        if (dl2VarH == null) {
            String str2 = this.I;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = this.H;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(this.G));
                }
            }
        } else {
            sb.append("{");
            sb.append(dl2VarH.toString());
            sb.append("}");
        }
        return sb.toString();
    }
}
