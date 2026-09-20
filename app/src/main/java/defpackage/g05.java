package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g05 extends cx1 implements j81<b43.QnHx, sd5> {
    public final /* synthetic */ long A;
    public final /* synthetic */ int B;
    public final /* synthetic */ y81<List<zz4>, g30, Integer, sd5> C;
    public final /* synthetic */ List<zz4> D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ List<b43> w;
    public final /* synthetic */ bw4 x;
    public final /* synthetic */ x81<g30, Integer, sd5> y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g05(ArrayList arrayList, bw4 bw4Var, x81 x81Var, int i, long j, int i2, y81 y81Var, ArrayList arrayList2, int i3, int i4) {
        super(1);
        this.w = arrayList;
        this.x = bw4Var;
        this.y = x81Var;
        this.z = i;
        this.A = j;
        this.B = i2;
        this.C = y81Var;
        this.D = arrayList2;
        this.E = i3;
        this.F = i4;
    }

    @Override // defpackage.j81
    public final sd5 invoke(b43.QnHx qnHx) {
        int i;
        b43.QnHx qnHx2 = qnHx;
        int i2 = 0;
        for (Object obj : this.w) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                ps0.j0();
                throw null;
            }
            b43.QnHx.f(qnHx2, (b43) obj, this.z * i2, 0);
            i2 = i3;
        }
        i05 i05Var = i05.Divider;
        x81<g30, Integer, sd5> x81Var = this.y;
        bw4 bw4Var = this.x;
        List<ob2> listF = bw4Var.F(i05Var, x81Var);
        long j = this.A;
        Iterator<T> it = listF.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            i = this.B;
            if (!zHasNext) {
                break;
            }
            b43 b43VarY = ((ob2) it.next()).y(g70.a(j, 0, 0, 0, 0, 11));
            b43.QnHx.f(qnHx2, b43VarY, 0, i - b43VarY.x);
        }
        Iterator<T> it2 = bw4Var.F(i05.Indicator, X.n(-1341594997, new f05(this.C, this.D, this.E), true)).iterator();
        while (it2.hasNext()) {
            b43.QnHx.f(qnHx2, ((ob2) it2.next()).y(g70.QnHx.c(this.F, i)), 0, 0);
        }
        return sd5.a;
    }
}
