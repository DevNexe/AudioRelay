package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ui4 extends cx1 implements j81<Integer, sd5> {
    public final /* synthetic */ Z7jl w;
    public final /* synthetic */ yf x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui4(Z7jl z7jl, yf yfVar) {
        super(1);
        this.w = z7jl;
        this.x = yfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.j81
    public final sd5 invoke(Integer num) {
        Object next;
        Z7jl.CQf cQf;
        int iIntValue = num.intValue();
        Z7jl z7jl = this.w;
        int length = z7jl.length();
        List<Z7jl.CQf<? extends Object>> list = z7jl.z;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            Z7jl.CQf<? extends Object> cQf2 = list.get(i);
            Z7jl.CQf<? extends Object> cQf3 = cQf2;
            if ((cQf3.a instanceof String) && oOd.b(iIntValue, length, cQf3.b, cQf3.c)) {
                arrayList.add(cQf2);
            }
            i++;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            cQf = (Z7jl.CQf) next;
        } while (!(iIntValue >= cQf.b && iIntValue < cQf.c));
        Z7jl.CQf cQf4 = (Z7jl.CQf) next;
        if (cQf4 != null) {
            this.x.a((String) cQf4.a, "setup");
        }
        return sd5.a;
    }
}
