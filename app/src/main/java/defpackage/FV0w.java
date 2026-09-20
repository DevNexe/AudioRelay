package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FV0w implements rb2 {
    public static final FV0w a = new FV0w();

    public static final class QnHx extends cx1 implements j81<b43.QnHx, sd5> {
        public final /* synthetic */ List<b43> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(ArrayList arrayList) {
            super(1);
            this.w = arrayList;
        }

        @Override // defpackage.j81
        public final sd5 invoke(b43.QnHx qnHx) {
            b43.QnHx qnHx2 = qnHx;
            List<b43> list = this.w;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                b43.QnHx.f(qnHx2, list.get(i), 0, 0);
            }
            return sd5.a;
        }
    }

    @Override // defpackage.rb2
    public final sb2 a(vb2 vb2Var, List<? extends ob2> list, long j) {
        Object obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(list.get(i).y(j));
        }
        int i2 = 1;
        Object obj2 = null;
        if (!arrayList.isEmpty()) {
            obj = arrayList.get(0);
            int i3 = ((b43) obj).w;
            int iJ = ps0.J(arrayList);
            if (1 <= iJ) {
                int i4 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i4);
                    int i5 = ((b43) obj3).w;
                    if (i3 < i5) {
                        obj = obj3;
                        i3 = i5;
                    }
                    if (i4 == iJ) {
                        break;
                    }
                    i4++;
                }
            }
        } else {
            obj = null;
        }
        b43 b43Var = (b43) obj;
        int iJ2 = b43Var != null ? b43Var.w : g70.j(j);
        if (!arrayList.isEmpty()) {
            Object obj4 = arrayList.get(0);
            int i6 = ((b43) obj4).x;
            int iJ3 = ps0.J(arrayList);
            if (1 <= iJ3) {
                while (true) {
                    Object obj5 = arrayList.get(i2);
                    int i7 = ((b43) obj5).x;
                    if (i6 < i7) {
                        obj4 = obj5;
                        i6 = i7;
                    }
                    if (i2 == iJ3) {
                        break;
                    }
                    i2++;
                }
            }
            obj2 = obj4;
        }
        b43 b43Var2 = (b43) obj2;
        return vb2Var.K(iJ2, b43Var2 != null ? b43Var2.x : g70.i(j), ds0.w, new QnHx(arrayList));
    }

    @Override // defpackage.rb2
    public final /* synthetic */ int b(yy1.byN byn, List list, int i) {
        return qb2.c(this, byn, list, i);
    }

    @Override // defpackage.rb2
    public final /* synthetic */ int c(yy1.byN byn, List list, int i) {
        return qb2.d(this, byn, list, i);
    }

    @Override // defpackage.rb2
    public final /* synthetic */ int d(yy1.byN byn, List list, int i) {
        return qb2.b(this, byn, list, i);
    }

    @Override // defpackage.rb2
    public final /* synthetic */ int e(yy1.byN byn, List list, int i) {
        return qb2.a(this, byn, list, i);
    }
}
