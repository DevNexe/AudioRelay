package defpackage;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class ia5 extends u95 {
    public int V;
    public ArrayList<u95> T = new ArrayList<>();
    public boolean U = true;
    public boolean W = false;
    public int X = 0;

    public static class CQf extends ga5 {
        public final ia5 w;

        public CQf(ia5 ia5Var) {
            this.w = ia5Var;
        }

        @Override // u95.LPt8Fixed
        public final void a(u95 u95Var) {
            ia5 ia5Var = this.w;
            int i = ia5Var.V - 1;
            ia5Var.V = i;
            if (i == 0) {
                ia5Var.W = false;
                ia5Var.r();
            }
            u95Var.E(this);
        }

        @Override // defpackage.ga5, u95.LPt8Fixed
        public final void c(u95 u95Var) {
            ia5 ia5Var = this.w;
            if (ia5Var.W) {
                return;
            }
            ia5Var.O();
            ia5Var.W = true;
        }
    }

    public class QnHx extends ga5 {
        public final /* synthetic */ u95 w;

        public QnHx(u95 u95Var) {
            this.w = u95Var;
        }

        @Override // u95.LPt8Fixed
        public final void a(u95 u95Var) {
            this.w.H();
            u95Var.E(this);
        }
    }

    @Override // defpackage.u95
    public final void D(View view) {
        super.D(view);
        int size = this.T.size();
        for (int i = 0; i < size; i++) {
            this.T.get(i).D(view);
        }
    }

    @Override // defpackage.u95
    public final void E(u95.LPt8Fixed lPt8) {
        super.E(lPt8);
    }

    @Override // defpackage.u95
    public final void F(View view) {
        for (int i = 0; i < this.T.size(); i++) {
            this.T.get(i).F(view);
        }
        this.B.remove(view);
    }

    @Override // defpackage.u95
    public final void G(ViewGroup viewGroup) {
        super.G(viewGroup);
        int size = this.T.size();
        for (int i = 0; i < size; i++) {
            this.T.get(i).G(viewGroup);
        }
    }

    @Override // defpackage.u95
    public final void H() {
        if (this.T.isEmpty()) {
            O();
            r();
            return;
        }
        CQf cQf = new CQf(this);
        Iterator<u95> it = this.T.iterator();
        while (it.hasNext()) {
            it.next().a(cQf);
        }
        this.V = this.T.size();
        if (this.U) {
            Iterator<u95> it2 = this.T.iterator();
            while (it2.hasNext()) {
                it2.next().H();
            }
            return;
        }
        for (int i = 1; i < this.T.size(); i++) {
            this.T.get(i - 1).a(new QnHx(this.T.get(i)));
        }
        u95 u95Var = this.T.get(0);
        if (u95Var != null) {
            u95Var.H();
        }
    }

    @Override // defpackage.u95
    public final void I(long j) {
        ArrayList<u95> arrayList;
        this.y = j;
        if (j < 0 || (arrayList = this.T) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.T.get(i).I(j);
        }
    }

    @Override // defpackage.u95
    public final void J(u95.F1 f1) {
        this.O = f1;
        this.X |= 8;
        int size = this.T.size();
        for (int i = 0; i < size; i++) {
            this.T.get(i).J(f1);
        }
    }

    @Override // defpackage.u95
    public final void K(TimeInterpolator timeInterpolator) {
        this.X |= 1;
        ArrayList<u95> arrayList = this.T;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.T.get(i).K(timeInterpolator);
            }
        }
        this.z = timeInterpolator;
    }

    @Override // defpackage.u95
    public final void L(B8C b8c) {
        super.L(b8c);
        this.X |= 4;
        if (this.T != null) {
            for (int i = 0; i < this.T.size(); i++) {
                this.T.get(i).L(b8c);
            }
        }
    }

    @Override // defpackage.u95
    public final void M() {
        this.X |= 2;
        int size = this.T.size();
        for (int i = 0; i < size; i++) {
            this.T.get(i).M();
        }
    }

    @Override // defpackage.u95
    public final void N(long j) {
        this.x = j;
    }

    @Override // defpackage.u95
    public final String P(String str) {
        String strP = super.P(str);
        for (int i = 0; i < this.T.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strP);
            sb.append("\n");
            sb.append(this.T.get(i).P(str + "  "));
            strP = sb.toString();
        }
        return strP;
    }

    public final void Q(u95 u95Var) {
        this.T.add(u95Var);
        u95Var.E = this;
        long j = this.y;
        if (j >= 0) {
            u95Var.I(j);
        }
        if ((this.X & 1) != 0) {
            u95Var.K(this.z);
        }
        if ((this.X & 2) != 0) {
            u95Var.M();
        }
        if ((this.X & 4) != 0) {
            u95Var.L(this.P);
        }
        if ((this.X & 8) != 0) {
            u95Var.J(this.O);
        }
    }

    @Override // defpackage.u95
    public final void a(u95.LPt8Fixed lPt8) {
        super.a(lPt8);
    }

    @Override // defpackage.u95
    public final void c(View view) {
        for (int i = 0; i < this.T.size(); i++) {
            this.T.get(i).c(view);
        }
        this.B.add(view);
    }

    @Override // defpackage.u95
    public final void cancel() {
        super.cancel();
        int size = this.T.size();
        for (int i = 0; i < size; i++) {
            this.T.get(i).cancel();
        }
    }

    @Override // defpackage.u95
    public final void h(la5 la5Var) {
        View view = la5Var.b;
        if (B(view)) {
            for (u95 u95Var : this.T) {
                if (u95Var.B(view)) {
                    u95Var.h(la5Var);
                    la5Var.c.add(u95Var);
                }
            }
        }
    }

    @Override // defpackage.u95
    public final void j(la5 la5Var) {
        int size = this.T.size();
        for (int i = 0; i < size; i++) {
            this.T.get(i).j(la5Var);
        }
    }

    @Override // defpackage.u95
    public final void k(la5 la5Var) {
        View view = la5Var.b;
        if (B(view)) {
            for (u95 u95Var : this.T) {
                if (u95Var.B(view)) {
                    u95Var.k(la5Var);
                    la5Var.c.add(u95Var);
                }
            }
        }
    }

    @Override // defpackage.u95
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final u95 clone() {
        ia5 ia5Var = (ia5) super.clone();
        ia5Var.T = new ArrayList<>();
        int size = this.T.size();
        for (int i = 0; i < size; i++) {
            u95 u95VarClone = this.T.get(i).clone();
            ia5Var.T.add(u95VarClone);
            u95VarClone.E = ia5Var;
        }
        return ia5Var;
    }

    @Override // defpackage.u95
    public final void q(ViewGroup viewGroup, ma5 ma5Var, ma5 ma5Var2, ArrayList<la5> arrayList, ArrayList<la5> arrayList2) {
        long j = this.x;
        int size = this.T.size();
        for (int i = 0; i < size; i++) {
            u95 u95Var = this.T.get(i);
            if (j > 0 && (this.U || i == 0)) {
                long j2 = u95Var.x;
                if (j2 > 0) {
                    u95Var.N(j2 + j);
                } else {
                    u95Var.N(j);
                }
            }
            u95Var.q(viewGroup, ma5Var, ma5Var2, arrayList, arrayList2);
        }
    }
}
