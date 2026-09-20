package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class lc {
    public static final QnHx a = new QnHx();
    public static final Dt<lc> b = new Dt<>("BodyProgress");

    public static final class QnHx implements kf1<sd5, lc> {
        @Override // defpackage.kf1
        public final void a(lc lcVar, ue1 ue1Var) throws as1 {
            a43 a43Var;
            ta2 ta2Var;
            ta2 ta2Var2 = new ta2("ObservableContent");
            ta2 ta2Var3 = pg1.i;
            pg1 pg1Var = ue1Var.A;
            if (!pg1Var.e(ta2Var2)) {
                int iC = pg1Var.c(ta2Var3);
                if (iC == -1) {
                    throw new as1("Phase " + ta2Var3 + " was not registered for this pipeline");
                }
                int i = iC + 1;
                ArrayList arrayList = pg1Var.a;
                int iJ = ps0.J(arrayList);
                if (i <= iJ) {
                    while (true) {
                        Object obj = arrayList.get(i);
                        e23 e23Var = obj instanceof e23 ? (e23) obj : null;
                        if (e23Var != null && (a43Var = e23Var.b) != null) {
                            a43.QnHx qnHx = a43Var instanceof a43.QnHx ? (a43.QnHx) a43Var : null;
                            if (qnHx != null && (ta2Var = qnHx.a) != null && ur1.a(ta2Var, ta2Var3)) {
                                iC = i;
                            }
                            if (i == iJ) {
                                break;
                            } else {
                                i++;
                            }
                        } else {
                            break;
                        }
                    }
                }
                arrayList.add(iC + 1, new e23(ta2Var2, new a43.QnHx()));
            }
            pg1Var.f(ta2Var2, new mc(null));
            ue1Var.D.f(bg1.h, new nc(null));
        }

        @Override // defpackage.kf1
        public final lc b(j81<? super sd5, sd5> j81Var) {
            return new lc();
        }

        @Override // defpackage.kf1
        public final Dt<lc> getKey() {
            return lc.b;
        }
    }
}
