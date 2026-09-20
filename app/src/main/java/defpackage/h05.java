package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h05 extends cx1 implements x81<bw4, g70, sb2> {
    public final /* synthetic */ x81<g30, Integer, sd5> w;
    public final /* synthetic */ x81<g30, Integer, sd5> x;
    public final /* synthetic */ y81<List<zz4>, g30, Integer, sd5> y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h05(int i, x81 x81Var, x81 x81Var2, y81 y81Var) {
        super(2);
        this.w = x81Var;
        this.x = x81Var2;
        this.y = y81Var;
        this.z = i;
    }

    @Override // defpackage.x81
    public final sb2 invoke(bw4 bw4Var, g70 g70Var) {
        Object obj;
        bw4 bw4Var2 = bw4Var;
        long j = g70Var.a;
        int iH = g70.h(j);
        List<ob2> listF = bw4Var2.F(i05.Tabs, this.w);
        int size = listF.size();
        int i = iH / size;
        List<ob2> list = listF;
        ArrayList arrayList = new ArrayList(mu.w0(list, 10));
        for (Iterator it = list.iterator(); it.hasNext(); it = it) {
            arrayList.add(((ob2) it.next()).y(g70.a(j, i, i, 0, 0, 12)));
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            Object next = it2.next();
            if (it2.hasNext()) {
                int i2 = ((b43) next).x;
                do {
                    Object next2 = it2.next();
                    int i3 = ((b43) next2).x;
                    if (i2 < i3) {
                        next = next2;
                        i2 = i3;
                    }
                } while (it2.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        b43 b43Var = (b43) obj;
        int i4 = b43Var != null ? b43Var.x : 0;
        ArrayList arrayList2 = new ArrayList(size);
        for (int i5 = 0; i5 < size; i5++) {
            arrayList2.add(new zz4(bw4Var2.j(i) * i5, bw4Var2.j(i)));
        }
        int i6 = i4;
        return bw4Var2.K(iH, i6, ds0.w, new g05(arrayList, bw4Var2, this.x, i, j, i6, this.y, arrayList2, this.z, iH));
    }
}
