package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class XsuS implements rb2 {
    public final zdtF a;

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
                b43.QnHx.c(qnHx2, list.get(i), 0, 0);
            }
            return sd5.a;
        }
    }

    public XsuS(zdtF zdtf) {
        this.a = zdtf;
    }

    @Override // defpackage.rb2
    public final sb2 a(vb2 vb2Var, List<? extends ob2> list, long j) {
        Object obj;
        List<? extends ob2> list2 = list;
        ArrayList arrayList = new ArrayList(mu.w0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ob2) it.next()).y(j));
        }
        int i = 1;
        Object obj2 = null;
        if (!arrayList.isEmpty()) {
            obj = arrayList.get(0);
            int i2 = ((b43) obj).w;
            int iJ = ps0.J(arrayList);
            if (1 <= iJ) {
                int i3 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i3);
                    int i4 = ((b43) obj3).w;
                    if (i2 < i4) {
                        obj = obj3;
                        i2 = i4;
                    }
                    if (i3 == iJ) {
                        break;
                    }
                    i3++;
                }
            }
        } else {
            obj = null;
        }
        b43 b43Var = (b43) obj;
        int i5 = b43Var != null ? b43Var.w : 0;
        if (!arrayList.isEmpty()) {
            obj2 = arrayList.get(0);
            int i6 = ((b43) obj2).x;
            int iJ2 = ps0.J(arrayList);
            if (1 <= iJ2) {
                while (true) {
                    Object obj4 = arrayList.get(i);
                    int i7 = ((b43) obj4).x;
                    if (i6 < i7) {
                        obj2 = obj4;
                        i6 = i7;
                    }
                    if (i == iJ2) {
                        break;
                    }
                    i++;
                }
            }
        }
        b43 b43Var2 = (b43) obj2;
        int i8 = b43Var2 != null ? b43Var2.x : 0;
        this.a.a.setValue(new sp1(C0239D.e(i5, i8)));
        return vb2Var.K(i5, i8, ds0.w, new QnHx(arrayList));
    }

    @Override // defpackage.rb2
    public final int b(yy1.byN byn, List list, int i) {
        Integer num;
        I i2 = new I(i);
        Iterator it = list.iterator();
        if (it.hasNext()) {
            Integer numInvoke = i2.invoke(it.next());
            while (it.hasNext()) {
                Integer numInvoke2 = i2.invoke(it.next());
                if (numInvoke.compareTo(numInvoke2) < 0) {
                    numInvoke = numInvoke2;
                }
            }
            num = numInvoke;
        } else {
            num = null;
        }
        Integer num2 = num;
        if (num2 != null) {
            return num2.intValue();
        }
        return 0;
    }

    @Override // defpackage.rb2
    public final int c(yy1.byN byn, List list, int i) {
        Integer num;
        pCZ pcz = new pCZ(i);
        Iterator it = list.iterator();
        if (it.hasNext()) {
            Integer numInvoke = pcz.invoke(it.next());
            while (it.hasNext()) {
                Integer numInvoke2 = pcz.invoke(it.next());
                if (numInvoke.compareTo(numInvoke2) < 0) {
                    numInvoke = numInvoke2;
                }
            }
            num = numInvoke;
        } else {
            num = null;
        }
        Integer num2 = num;
        if (num2 != null) {
            return num2.intValue();
        }
        return 0;
    }

    @Override // defpackage.rb2
    public final int d(yy1.byN byn, List list, int i) {
        Integer num;
        bH bHVar = new bH(i);
        Iterator it = list.iterator();
        if (it.hasNext()) {
            Integer numInvoke = bHVar.invoke(it.next());
            while (it.hasNext()) {
                Integer numInvoke2 = bHVar.invoke(it.next());
                if (numInvoke.compareTo(numInvoke2) < 0) {
                    numInvoke = numInvoke2;
                }
            }
            num = numInvoke;
        } else {
            num = null;
        }
        Integer num2 = num;
        if (num2 != null) {
            return num2.intValue();
        }
        return 0;
    }

    @Override // defpackage.rb2
    public final int e(yy1.byN byn, List list, int i) {
        Integer num;
        Dtr dtr = new Dtr(i);
        Iterator it = list.iterator();
        if (it.hasNext()) {
            Integer numInvoke = dtr.invoke(it.next());
            while (it.hasNext()) {
                Integer numInvoke2 = dtr.invoke(it.next());
                if (numInvoke.compareTo(numInvoke2) < 0) {
                    numInvoke = numInvoke2;
                }
            }
            num = numInvoke;
        } else {
            num = null;
        }
        Integer num2 = num;
        if (num2 != null) {
            return num2.intValue();
        }
        return 0;
    }
}
