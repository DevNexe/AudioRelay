package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import defpackage.qc0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class FJCM extends qc {
    public static TimeInterpolator s;
    public final ArrayList<RecyclerView.qc> h = new ArrayList<>();
    public final ArrayList<RecyclerView.qc> i = new ArrayList<>();
    public final ArrayList<CQf> j = new ArrayList<>();
    public final ArrayList<QnHx> k = new ArrayList<>();
    public final ArrayList<ArrayList<RecyclerView.qc>> l = new ArrayList<>();
    public final ArrayList<ArrayList<CQf>> m = new ArrayList<>();
    public final ArrayList<ArrayList<QnHx>> n = new ArrayList<>();
    public final ArrayList<RecyclerView.qc> o = new ArrayList<>();
    public final ArrayList<RecyclerView.qc> p = new ArrayList<>();
    public final ArrayList<RecyclerView.qc> q = new ArrayList<>();
    public final ArrayList<RecyclerView.qc> r = new ArrayList<>();

    public static class CQf {
        public final RecyclerView.qc a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        public CQf(RecyclerView.qc qcVar, int i, int i2, int i3, int i4) {
            this.a = qcVar;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    public static class QnHx {
        public RecyclerView.qc a;
        public RecyclerView.qc b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public QnHx(RecyclerView.qc qcVar, RecyclerView.qc qcVar2, int i, int i2, int i3, int i4) {
            this.a = qcVar;
            this.b = qcVar2;
            this.c = i;
            this.d = i2;
            this.e = i3;
            this.f = i4;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeInfo{oldHolder=");
            sb.append(this.a);
            sb.append(", newHolder=");
            sb.append(this.b);
            sb.append(", fromX=");
            sb.append(this.c);
            sb.append(", fromY=");
            sb.append(this.d);
            sb.append(", toX=");
            sb.append(this.e);
            sb.append(", toY=");
            return qc0.a(sb, this.f, '}');
        }
    }

    public static void h(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((RecyclerView.qc) arrayList.get(size)).a.animate().cancel();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.byN
    public final void d(RecyclerView.qc qcVar) {
        View view = qcVar.a;
        view.animate().cancel();
        ArrayList<CQf> arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (arrayList.get(size).a == qcVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(qcVar);
                arrayList.remove(size);
            }
        }
        j(qcVar, this.k);
        if (this.h.remove(qcVar)) {
            view.setAlpha(1.0f);
            c(qcVar);
        }
        if (this.i.remove(qcVar)) {
            view.setAlpha(1.0f);
            c(qcVar);
        }
        ArrayList<ArrayList<QnHx>> arrayList2 = this.n;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList<QnHx> arrayList3 = arrayList2.get(size2);
            j(qcVar, arrayList3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList<ArrayList<CQf>> arrayList4 = this.m;
        int size3 = arrayList4.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList<CQf> arrayList5 = arrayList4.get(size3);
            int size4 = arrayList5.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                if (arrayList5.get(size4).a == qcVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(qcVar);
                    arrayList5.remove(size4);
                    if (!arrayList5.isEmpty()) {
                        break;
                    }
                    arrayList4.remove(size3);
                    break;
                }
            }
        }
        ArrayList<ArrayList<RecyclerView.qc>> arrayList6 = this.l;
        int size5 = arrayList6.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                this.q.remove(qcVar);
                this.o.remove(qcVar);
                this.r.remove(qcVar);
                this.p.remove(qcVar);
                i();
                return;
            }
            ArrayList<RecyclerView.qc> arrayList7 = arrayList6.get(size5);
            if (arrayList7.remove(qcVar)) {
                view.setAlpha(1.0f);
                c(qcVar);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.byN
    public final void e() {
        ArrayList<CQf> arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            CQf cQf = arrayList.get(size);
            View view = cQf.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(cQf.a);
            arrayList.remove(size);
        }
        ArrayList<RecyclerView.qc> arrayList2 = this.h;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            c(arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList<RecyclerView.qc> arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.qc qcVar = arrayList3.get(size3);
            qcVar.a.setAlpha(1.0f);
            c(qcVar);
            arrayList3.remove(size3);
        }
        ArrayList<QnHx> arrayList4 = this.k;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            QnHx qnHx = arrayList4.get(size4);
            RecyclerView.qc qcVar2 = qnHx.a;
            if (qcVar2 != null) {
                k(qnHx, qcVar2);
            }
            RecyclerView.qc qcVar3 = qnHx.b;
            if (qcVar3 != null) {
                k(qnHx, qcVar3);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList<ArrayList<CQf>> arrayList5 = this.m;
            int size5 = arrayList5.size();
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                ArrayList<CQf> arrayList6 = arrayList5.get(size5);
                int size6 = arrayList6.size();
                while (true) {
                    size6--;
                    if (size6 >= 0) {
                        CQf cQf2 = arrayList6.get(size6);
                        View view2 = cQf2.a.a;
                        view2.setTranslationY(0.0f);
                        view2.setTranslationX(0.0f);
                        c(cQf2.a);
                        arrayList6.remove(size6);
                        if (arrayList6.isEmpty()) {
                            arrayList5.remove(arrayList6);
                        }
                    }
                }
            }
            ArrayList<ArrayList<RecyclerView.qc>> arrayList7 = this.l;
            int size7 = arrayList7.size();
            while (true) {
                size7--;
                if (size7 < 0) {
                    break;
                }
                ArrayList<RecyclerView.qc> arrayList8 = arrayList7.get(size7);
                int size8 = arrayList8.size();
                while (true) {
                    size8--;
                    if (size8 >= 0) {
                        RecyclerView.qc qcVar4 = arrayList8.get(size8);
                        qcVar4.a.setAlpha(1.0f);
                        c(qcVar4);
                        arrayList8.remove(size8);
                        if (arrayList8.isEmpty()) {
                            arrayList7.remove(arrayList8);
                        }
                    }
                }
            }
            ArrayList<ArrayList<QnHx>> arrayList9 = this.n;
            int size9 = arrayList9.size();
            while (true) {
                size9--;
                if (size9 < 0) {
                    break;
                }
                ArrayList<QnHx> arrayList10 = arrayList9.get(size9);
                int size10 = arrayList10.size();
                while (true) {
                    size10--;
                    if (size10 >= 0) {
                        QnHx qnHx2 = arrayList10.get(size10);
                        RecyclerView.qc qcVar5 = qnHx2.a;
                        if (qcVar5 != null) {
                            k(qnHx2, qcVar5);
                        }
                        RecyclerView.qc qcVar6 = qnHx2.b;
                        if (qcVar6 != null) {
                            k(qnHx2, qcVar6);
                        }
                        if (arrayList10.isEmpty()) {
                            arrayList9.remove(arrayList10);
                        }
                    }
                }
            }
            h(this.q);
            h(this.p);
            h(this.o);
            h(this.r);
            ArrayList<RecyclerView.byN.QnHx> arrayList11 = this.b;
            int size11 = arrayList11.size();
            for (int i = 0; i < size11; i++) {
                arrayList11.get(i).a();
            }
            arrayList11.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.byN
    public final boolean f() {
        return (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.qc
    public final boolean g(RecyclerView.qc qcVar, int i, int i2, int i3, int i4) {
        View view = qcVar.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) qcVar.a.getTranslationY());
        l(qcVar);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            c(qcVar);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.j.add(new CQf(qcVar, translationX, translationY, i3, i4));
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList<RecyclerView.byN.QnHx> arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).a();
        }
        arrayList.clear();
    }

    public final void j(RecyclerView.qc qcVar, ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            QnHx qnHx = (QnHx) arrayList.get(size);
            if (k(qnHx, qcVar) && qnHx.a == null && qnHx.b == null) {
                arrayList.remove(qnHx);
            }
        }
    }

    public final boolean k(QnHx qnHx, RecyclerView.qc qcVar) {
        if (qnHx.b == qcVar) {
            qnHx.b = null;
        } else {
            if (qnHx.a != qcVar) {
                return false;
            }
            qnHx.a = null;
        }
        qcVar.a.setAlpha(1.0f);
        View view = qcVar.a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c(qcVar);
        return true;
    }

    public final void l(RecyclerView.qc qcVar) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        qcVar.a.animate().setInterpolator(s);
        d(qcVar);
    }
}
